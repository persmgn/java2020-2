package lesson2;

public class ChildLifeCycle extends LifeCycleTest {
	public static int x = 20;
	public static double yyy = Math.random();
	
	static {
		System.err.println("Child static");
	}

	public double 	a = Math.random();
	public int		t = 150; 

	public ChildLifeCycle() {
		// super();
		// a = Math.random();
		// t = 150;
		System.err.println("sdklfjsjklj");
	}
	
	public ChildLifeCycle(int x) {
		super(x);
		// super();
		// a = Math.random();
		// t = 150;
	}
	
	public static void staticPrint(int z) {	// место для локальных перем, место для стека вычислений
		System.err.println("ChildLifeCycle static call "+x/*+" "+a*/+" "+z);
	}
	
	@Override
	public void instancePrint(/*ChildLifeCycle this*/) {
		super.instancePrint();
		System.err.println("ChildLifeCycle instance call "+x+" "+/*this.*/a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world "+LifeCycleTest.x);
		
		LifeCycleTest	clt = new ChildLifeCycle();	// ChildLifeCycle.a, ChildLifeCycle.t, LifeCycleTest.a, LifeCycleTest.b
		
		staticPrint(123);		// LifeCycle.staticPrint();
		clt.instancePrint();	// instancePrint(clt);
		
		clt = null;
		
		//	Команда				this		VMT
		//	invokestatic		-			-
		//	invokevirtual		+			+
		//	invokespecial		+			-
		//	invokeinterface		+			+
	}
}
