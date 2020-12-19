package lesson3;

import java.util.Arrays;

@MyAnnotation(value="ura!!!!")
public class SpecialClassesTest {
	public static int	a = 20;
	
	@MyAnnotation(value="ura!!!!")
	public int	y;
	
	public void print() {
		final int			value = 10;
		
		MyInterface			mi = new MyInterface(/*value*/) {	// this.new SpecialClassesTest$1(value)
			// SpecialClassesTest	this$0;
			// int					val$value;
			int		localX = 20;
			
			{
				System.err.println("COnstructor call");
			}
			
			@Override
			public void print() {
				System.err.println("URA!!!!!! "+a+", y="+/*this$0.*/y+", value="+value/*val$value*/);
			}
		};
		mi.print();

		Class				miCl = mi.getClass();
		System.err.println("Name="+miCl.getName());
		System.err.println("Canonical name="+miCl.getCanonicalName());
		
		System.err.println("Constructors: "+Arrays.toString(miCl.getDeclaredConstructors()));
		System.err.println("Fields: "+Arrays.toString(miCl.getDeclaredFields()));
	}
	
	public class NestedClass {	
		// SpecialClassesTest	this$0;
		public static final int	abcde = 10;	// ConstValue
		
		public int	x;
		
		public NestedClass(/*SpecialClassesTest arg*/) {
			// this$0 = arg;
			System.err.println("X="+x+", Y="+/*this$0.*/y);
			print();
		}
	}
	
	protected static class NestedStaticClass {	
		public int	x;
		
		static {
		}
		
		public NestedStaticClass() {
			System.err.println("X="+x+", A="+a);
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world");
		Class	nc = NestedClass.class;
		
		System.err.println("Name="+nc.getName());
		System.err.println("Canonical name="+nc.getCanonicalName());

		System.err.println("Constructors: "+Arrays.toString(nc.getConstructors()));
		System.err.println("Fields: "+Arrays.toString(nc.getDeclaredFields()));
		
		SpecialClassesTest	parent = new SpecialClassesTest();
		NestedClass			nested = parent.new NestedClass();	// new NestedClass(parent)

		Class	nsc = NestedStaticClass.class;
		System.err.println("Name="+nsc.getName());
		System.err.println("Canonical name="+nsc.getCanonicalName());

		System.err.println("Constructors: "+Arrays.toString(nsc.getConstructors()));
		System.err.println("Fields: "+Arrays.toString(nsc.getDeclaredFields()));
		
		NestedStaticClass	nestedStatic = new NestedStaticClass();

		parent.print();
		
		DaysOfWeek dow = DaysOfWeek.FRIDAY;
		
		if (dow == DaysOfWeek.MONDAY) {
			// ...
		}
		else {
			// ...
		}
		switch (dow) {		// switch (dow.ordinal())
			case FRIDAY:	// case 5 - FRIDAY.ordinal()
				break;
			case MONDAY:	// case 1 - MONDAY.ordinal()
				break;
			case SATURDAY:
				break;
			case SUNDAY:
				break;
			case THURSDAY:
				break;
			case TUESDAY:
				break;
			case WEDNESDAY:	// case 3 - WEDNESDAY.ordinal()
				break;
			default:
				throw new UnsupportedOperationException("Enum ["+dow.getClass()+"] item ["+dow+"] is not supported yet");
		}
		Class	cl = SpecialClassesTest.class;
		Enum	e = dow;
		
		System.err.println("Methods: "+Arrays.toString(cl.getDeclaredMethods()));
		
		MyAnnotation	ann = (MyAnnotation)cl.getAnnotation(MyAnnotation.class);
		System.err.println("Annotation: "+ann.value());
		System.err.println("Annotation: "+ann.count());
		
	}
}

interface MyInterface {
	void print();
}

class MyClass implements MyInterface {
	@Override
	public void print() {
		System.err.println("");
	}
}

/*final class*/ enum DaysOfWeek /*extends java.lang.Enum*/{
/*public static final */	SUNDAY(true) /* = new DaysOfWeek("SUNDAY",0)*/,  
	MONDAY(false)  /* = new DaysOfWeek("MONDAY",1)*/,
	TUESDAY(false),
	WEDNESDAY(false),
	THURSDAY(false),
	FRIDAY(false),
	SATURDAY(true)  /* = new DaysOfWeek("SATURDAY",6)*/;
	
	private final boolean celebrated;
	
	private DaysOfWeek(boolean celebrated) {
		this.celebrated = celebrated;
	}
	
	public boolean isCelebrated() {
		return celebrated;
	}
}
