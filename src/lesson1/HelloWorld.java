package lesson1;

//import java.lang.*;
//import lesson1.*;

public class HelloWorld /*extends java.lang.Object*/ {

	// public
	// protected
	// ------
	// private
	
	static int x;
	static Object	value; 
	// primitive (build-in)
	//	- integers
	//		- byte		(signed char)	-128..127
	//		- short		(signed short)	-32768..32767
	//		- int		(signed int)	-2^31..2^31
	//		- long		(signed long)	-2^63..2^63
	//		- char		(unsigned short)-0..65535
	//	- reals		(IEEE754)
	//		- float		(float)			10^-38..10^38, 6 digits
	//		- double	(double)		10^-306..10^306, 15 digits
	//	- boolean	
	// referenced
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world!");
		
		byte	b1 = 10, b2 = 20, b3 = (byte)(b1 + b2);
		
		System.err.println("b1+b2="+(b1+b2));
		System.err.println("b1-b2="+(b1-b2));
		System.err.println("b1*b2="+(b1*b2));
		System.err.println("b1/b2="+(b1/b2));
		System.err.println("b1%b2="+(b1%b2));
		
		System.err.println("b1|b2="+(b1|b2));
		System.err.println("b1&b2="+(b1&b2));
		System.err.println("b1^b2="+(b1^b2));
		System.err.println("~b1="+(~b1));
		
//		b1 = -10;
		System.err.println("b1<<1="+(b1<<1));
		System.err.println("b1>>1="+(b1>>1));
		System.err.println("b1>>>1="+(b1>>>1));

		System.err.println("b1==b2 "+(b1==b2));
		System.err.println("b1!=b2 "+(b1!=b2));
		System.err.println("b1>b2 "+(b1>b2));
		System.err.println("b1>=b2 "+(b1>=b2));
		System.err.println("b1<b2 "+(b1<b2));
		System.err.println("b1<=b2 "+(b1<=b2));

		float	f1 = 10, f2 = 20, f3 = b1 + b2;
	
		System.err.println("f1+f2="+(f1+f2));
		System.err.println("f1-f2="+(f1-f2));
		System.err.println("f1*f2="+(f1*f2));
		System.err.println("f1/f2="+(f1/f2));
		System.err.println("f1%f2="+(f1%f2));

		System.err.println("f1==f2 "+(f1==f2));
		System.err.println("f1!=f2 "+(f1!=f2));
		System.err.println("f1>f2 "+(f1>f2));
		System.err.println("f1>=f2 "+(f1>=f2));
		System.err.println("f1<f2 "+(f1<f2));
		System.err.println("f1<=f2 "+(f1<=f2));

		int		x1 = 10, x2 = 0xCcA0, x3 = 0b1001, x4 = 077, x5 = 1_0_00_10_0;
		long	x6 = 1234567890123456L;
		
		float	fc1 = 0.35F, fc2 = 1.25e-10F, fc3 = 12.3_45e1_5F;
		
		char	c1 = 10, c2 = '\r', c3 = '\012', c4 = '\uaa22';
	
	}
}

