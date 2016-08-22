package football.util;


import java.util.ArrayList;
import java.util.List;

public class StrUtil {

	
	public static boolean isBlank(String str)
	{
		if(str == null || "".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	
	public static String implode(String separator, String... array) {
		if(array==null){ return ""; }
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			if (array[i].matches(" *"))
				continue;
			builder.append(array[i]);
			if (i < array.length - 1) {
				builder.append(separator);
			}
		}
		return builder.toString();
	}
	
	
	public static List<String> explode(String separator, String str) {
		if(str == null) return null;
		List<String> list = new ArrayList<String>();
		boolean notfinish = true;
		while(notfinish){
			if(str.indexOf(separator) == -1){
				notfinish = false;
				if(isBlank(str)){
					break;
				}else{
					list.add(str.trim());
					break;
				}
			}
			String ss = str.substring(0, str.indexOf(separator));
//			System.out.println("ss : " + ss);
			str = str.substring(str.indexOf(separator)+1);
//			System.out.println("remain str : \n" + str);
			list.add(ss);
		}
		return list;
	}
	
	public static boolean isNumeric(String data) {
		String	numStr = "0123456789";
		if (data == null) {
			return false;
		}

		if (data.length() == 0) {
			return false;
		}

		for (int i = 0; i < data.length(); i++) {
			int index = numStr.indexOf(data.charAt(i));
			if (index == -1) {
				return false;
			}
		}
		return true;
	}

	
	
}
