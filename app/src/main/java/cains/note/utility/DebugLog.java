package cains.note.utility;

import android.util.Log;

public final class DebugLog
{
	private DebugLog()
	{
	}
	
	public static void e(Exception ex)
	{
		StringBuffer sb = new StringBuffer();
		sb.append(ex.getMessage() + "\r\n");
		StackTraceElement[] elements = ex.getStackTrace();
		for (StackTraceElement element : elements)
		{
			sb.append(element.toString() + "\r\n");
		}
		Log.e("CAIN_EXCEPTION", sb.toString());
	}
}
