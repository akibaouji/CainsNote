package cains.note.view;

import java.io.IOException;
import java.io.InputStream;

import cains.note.global.Constant;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.graphics.Canvas;
import android.graphics.Movie;

public class GifView extends ImageView
{
	private Movie gifMovie;
	private long startTime;
	private String mode = Constant.IMG_PATTERN_GIF;
	private static int INTERVAL_LEV = 2; //the smaller, the faster

	public GifView(Context context)
	{
		super(context);
		setWillNotDraw(false);
		invalidate();
	}

	public GifView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		setWillNotDraw(false);
		invalidate();
	}

	public void setMode(String mode)
	{
		this.mode = mode;
	}

	public void setSrc(String fileName)
	{
		if (this.mode.equals(Constant.IMG_PATTERN_PNG))
		{
			return;
		}

		InputStream is = null;
		try
		{
			AssetManager am = getResources().getAssets();
			is = am.open(fileName);
			gifMovie = Movie.decodeStream(is);
			invalidate();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (is != null)
			{
				try
				{
					is.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}


	@Override
	protected void onDraw(Canvas canvas)
	{
		if (this.mode.equals(Constant.IMG_PATTERN_PNG))
		{
			super.onDraw(canvas);
		}
		else
		{
			try
			{
				long now = android.os.SystemClock.uptimeMillis();
				if (startTime == 0)
				{
					startTime = now;
				}

				if (gifMovie != null)
				{
					int dur = gifMovie.duration();
					dur = dur * INTERVAL_LEV;
					if (dur == 0)
					{
						dur = 1000 * INTERVAL_LEV;
					}

					int relTime = (int)((now - startTime) % dur);
					gifMovie.setTime(relTime);
					gifMovie.draw(canvas, getWidth() - gifMovie.width(),
							getHeight() - gifMovie.height());
					invalidate();
				}
			}
			catch (Exception e)
			{
				super.onDraw(canvas); //Load the static PNG image instead when exception happens
			}
		}
	}
	
	
	/*	@Override
	public void onMeasure(int width, int height)
	{
		int parentWidth = MeasureSpec.getSize(width);
		int parentHeight = MeasureSpec.getSize(height);
		setMeasuredDimension(parentWidth, parentHeight);
	}*/

}
