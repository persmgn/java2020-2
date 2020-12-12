package lesson2;

public abstract class InterfaceTest {

	public void print() {
		System.err.println("Print");
	}
	
	public void print1() {
		// .dfl;sdfi;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTest	it = new ChildInterfaceTest();
		TotalInterface	mi = new ChildInterfaceTest();
		
		it.print();
		mi.print();		// invokeinterface
	}
}

interface MyInterface {	// No VMT!!!
	/*public static final*/ int	x = 10;
	/*public static final*/ double	y = Math.random();
	
//	static {
//		
//	}
	
	static void abcde() {	// Java >= 1.8
		////dfksdl;fkl;sdkfksdfl;
	}
	
	/*public abstract*/ void print();
	
	private void zzz() {	// Java > 9
		// ....
	}
	
	void q();
}

interface MyInterface2 {
	void test();
	void q();
}

interface TotalInterface extends MyInterface, MyInterface2 {  // MyInterface U MyInterface2
	// void print()
	// void test()
	// void q()
	default void abc() {
		System.err.println("dklfjsdklfjklj");
	}
}



class ChildInterfaceTest extends InterfaceTest implements TotalInterface {
	public void abc() {	
		System.err.println("dklfjsdklfjklj");
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
//
//	@Override
//	public void print() {
//		System.err.println("Print child");
//	}

	@Override
	public void q() {
		// TODO Auto-generated method stub
		
	}
}
