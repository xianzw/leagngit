package test;

/**
 * 给你一个字符串，要求循环左移n位
 * @author xianz
 *
 */
public class Youyi {
	 public static void main(String[] args) {
		String b = to_char("abcdefg");
		System.out.println(b);
		int i=3;
		String c = to_char(b.substring(0, b.length()-i));
		System.out.println(c);
		String d = to_char(b.substring(b.length()-i));
		System.out.println(d);
		b=c+d;
		System.out.println(b);
		
		
	 }
	 
	 public static String to_char(String a) {
			char[] aa = a.toCharArray();
			for (int i = 0; i < aa.length/2; i++) {
				char temp = aa[i];  
		        aa[i] = aa[aa.length - 1 - i];  
		        aa[aa.length - 1 - i] = temp; 
			}
			return String.valueOf(aa);
	}
}
