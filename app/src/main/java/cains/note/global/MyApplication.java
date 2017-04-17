package cains.note.global;

import android.app.Application;

public class MyApplication extends Application
{
	// 程序退出标记
	private static boolean isProgramExit = false;

	public void setExit(boolean exit)
	{
		isProgramExit = exit;
	}

	public boolean isExit()
	{
		return isProgramExit;
	}
}
