package cains.note.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class StringUtility
{
	private StringUtility()
	{
	}
	
	public static String replaceBlank(String str) 
	{
		String dest = "";
		if (str!=null) 
		{
			Pattern p = Pattern.compile("\\s*|\t|\r|\n");
			Matcher m = p.matcher(str);
			dest = m.replaceAll("");
		}
		return dest;
	}
	
	public static boolean isNullOrEmpty(String str)
	{
		if (str == null)
		{
			return true;
		}
		else
		{
			if (str.equals(""))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
}
