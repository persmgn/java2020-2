package lesson4;

import java.util.Arrays;

public class LambdaTest {

	public void aaaaaaa(/*this*/) {
		
	}
	
	public void myCall() {
		MyInterface	mi = this::aaaaaaa;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		call(new MyInterface() {
			@Override
			public void print() {
				System.err.println("Ura!!!!!");
			}
		});
		final int w = 100;
		call(()->{System.err.println("Usklsdflksdfl;kl;sdfk");});
		call((x)->{System.err.println("Param="+x); return w;});
		call(LambdaTest::lambda$0);
		MyInterface	mi = LambdaTest::aaa;
		
		Class	cl = LambdaTest.class;
		
		System.err.println("Methods: "+Arrays.toString(cl.getDeclaredMethods()));
	}

	public static void call(MyInterface item) {
		item.print();
	}

	public static void call(MyInterfaceWithParameters item) {
		item.print(100);
	}
	
	private static void lambda$0() {
		System.err.println("Usklsdflksdfl;kl;sdfk");
	}
	
	public static void aaa() {
		
	}
}

@FunctionalInterface
interface MyInterface {	// typedef void (*print)() 
	void print();
	default void abcde() {}
}

@FunctionalInterface
interface MyInterfaceWithParameters {	// typedef void (*print)(int x) 
	int print(int x);
	default void abcde() {}
}
