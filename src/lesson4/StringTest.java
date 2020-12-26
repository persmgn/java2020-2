package lesson4;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String	s = "vassya";
		
		System.err.println("LEngth="+s.length());
		System.err.println("Item[0]="+s.charAt(0));	
		System.err.println("Index "+s.indexOf('s'));
		System.err.println("Last index "+s.lastIndexOf('s'));
		System.err.println("Index "+s.indexOf("ss"));
		System.err.println("Last index "+s.lastIndexOf("ss"));
		System.err.println("Index from "+s.indexOf('s',s.indexOf('s')+1));

		System.err.println("Substring "+s.substring(2,4));
		System.err.println("Substring <"+s.substring(2,2)+">");
		System.err.println("Substring "+s.substring(2));
		
		System.err.println("UpperCase "+s.toUpperCase());
		System.err.println("LowerCase "+s.toLowerCase());

		System.err.println("Replace "+s.replace("ss",""));
		System.err.println("Split "+Arrays.toString(s.split("s")));
	
		System.err.println("Equals: "+s.equals("petya"));
		System.err.println("Equals: "+s.equals("vassya"));
		System.err.println("Equals: "+s.equalsIgnoreCase("VaSsYA"));

		System.err.println("Compare: "+s.compareTo("petya"));
		System.err.println("Compare: "+s.compareToIgnoreCase("PeTyA"));
		
		System.err.println("Starts with: "+s.startsWith("va"));
		System.err.println("Ends with: "+s.endsWith("ya"));
		System.err.println("Contains: "+s.contains("ss"));
		
//		System.err.println("Contains: "+s.contains("ss"));
//		System.err.println(new StringBuilder().append("Contains: ").append(s.contains("ss")).toString());
		
		System.err.println("Equals: "+"petya".equals(s));

		StringBuilder	sb = new StringBuilder();
		
		String r = sb.append("x=").append(100).append(",y=").append(true).append(",Z=").append(3.5).toString();
		System.err.println("R="+r);
		
		sb.setLength(0);
		for (int index = 0; index < 10; index++) {
			sb.append("index=").append(index).append('\n');
		}
		System.err.println(sb/*.toString()*/);
		
		System.err.println("Equals: "+"vassya".equals(s));
		System.err.println("Equals: "+("vassya" == s));
		
		switch (s/*.hashCode()*/) {
			case "vasya"/*.hashCode()*/ :
				// if ("vasya".equals(s)) {
				// kdfkljgkljgjgj
				// }
				// else goto default;
			case "petya"/*.hashCode()*/ :
				// if ("petya".equals(s)) {
				// dfklgjdfklgj
				// }
				// else goto default;
			default :
				//
		}
		
		byte[]	b = s.getBytes("utf-8");
		String	ss = new String(b,"utf-8");
		
		char[]	content = s.toCharArray();
		String	ss1 = new String(content);
		
		char[]	forContent = new char[10];
		
		s.getChars(0,6,forContent,0);
		System.err.println("Result: "+Arrays.toString(forContent));
		
		// String	s = "abcdefg" -> "AbCdEfG"
		// 1). The worst (0%)
		String	source = "abcdefg", target = "";
		
		for (int index = 0; index < source.length(); index++) {
			if (index % 2 == 0) {
				target += source.substring(index,index+1).toUpperCase();
			}
			else {
				target += source.substring(index,index+1).toLowerCase();
			}
		}
		System.err.println("Target="+target);
		
		// 2). Good	(95%)
		StringBuilder	sb1 = new StringBuilder();
		
		for (int index = 0; index < source.length(); index++) {
			if (index % 2 == 0) {
				sb1.append(Character.toUpperCase(source.charAt(index)));
			}
			else {
				sb1.append(Character.toLowerCase(source.charAt(index)));
			}
		}
		System.err.println("Target="+sb1.toString());

		// 3). The best (5%)
		char[]		temp = source.toCharArray();
		
		for (int index = 0; index < temp.length; index++) {
			temp[index] = index % 2 == 0 ? Character.toUpperCase(temp[index]) : Character.toLowerCase(temp[index]);  
		}
		System.err.println("Target="+new String(temp));
	}
}
