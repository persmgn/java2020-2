package lesson2;

public class LifeCycleTest /*extends java.lang.Object*/ {
	public static final int		x = 10;			// static final <primitive type or String> = const;
												// 'ConstValue'  x = 10
	public static final double	y = Math.random();	// 'Code'
	
	//	public static void <clinit>(){
	//		
	//
	//		y = Math.random();
	//
	//		System.err.println("Before static");
	//		System.err.println("skdfjklsdjfkljsdklfjsd");
	//	}
	
	static {
		System.err.println("Before static");
	}
	
	static {
		System.err.println("skdfjklsdjfkljsdklfjsd");
	}
	
	public int		a = 100;
	public double	b = Math.random();
	
	// public void <init>() {	// Конструктор класса
	//		a = 100;
	//		b = Math.random();
	//		System.err.println("assa !!!!!! "+a+" "+b);
	// }			
	
	{
		System.err.println("assa !!!!!! "+a+" "+b);
	}
	
	public LifeCycleTest() {
		//		super();
		//		a = 100;
		//		b = Math.random();
		//		System.err.println("assa !!!!!! "+a+" "+b);
		instancePrint();
	}
	
	public LifeCycleTest(int xxxxxxxx) {
		//		super();
		//		a = 100;
		//		b = Math.random();
		//		System.err.println("assa !!!!!! "+a+" "+b);
		
		a = xxxxxxxx;
	}
	
	public static void staticPrint() {
		System.err.println("LifeCycle static call "+x/*+" "+a*/);
	}
	
	public void instancePrint(/*LifeCycleTest this*/) {
		System.err.println("LifeCycle instance call "+x+" "+/*this.*/a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world "+x+" "+y);
		
		LifeCycleTest	lt = new LifeCycleTest();	// место для a, b	new <init>();
		
		System.err.println("A="+lt.a);
		lt.staticPrint();	// LifeCycleTest.staticPrint();
		lt.instancePrint();	// instancePrint(lt); 
		
		
		lt = null;
	}

}
