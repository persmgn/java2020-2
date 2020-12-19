package lesson3;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ObjectTest {
	static int	t = 5;
	
	public int	x;
	public int 	y;
	private int	abcde = -2;

	public static void staticPrint(int value) throws IOException {
		System.err.println("Static print "+value);
	}
	
	public void print(int value) throws IOException {
		System.err.println("Print "+value);
	}

//	public void m(long a, int[] x) {
//		
//	}
//	
	public void m(long a, int... x) {	// public void m(int[] x)
		
	}
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
		// TODO Auto-generated method stub
		Object	obj = new Object(), obj1 = 5.2/*new Double(5.2)*/;
		System.err.println("Content: "+new ObjectTest()/*.toString()*/);
		
		Double	d1 = 5.2, d2 = 10.3, d3 = d1 + d2 /* d3 = Double.valueOf(d1.doubleValue()+d2.doubleValue())*/;
		
		System.err.println("Value="+d1.doubleValue());

		ObjectTest	ot = new ObjectTest(); 
		Class		cl = ot.getClass();	// reflection
		
		// Primitive type    Referenced type
		//	byte				java.lang.Byte
		//	short				java.lang.Short
		//	int					java.lang.Integer
		//	long				java.lang.Long
		//	float				java.lang.Float
		//	double				java.lang.Double
		//	boolean				java.lang.Boolean
		//	char				java.lang.Character
		
		System.err.println("Name="+cl.getName());
		System.err.println("Canonical name="+cl.getCanonicalName());
		System.err.println("Short name="+cl.getSimpleName());
//		Class cInt = int.class;
		System.err.println("Is primitive="+cl.isPrimitive());
		
		System.err.println("Fields="+Arrays.toString(cl.getFields()));
		Field	fx = cl.getField("x");
		
		System.err.println("Field name="+fx.getName());
		System.err.println("Field type="+fx.getType());
		ot.x = 123;
		System.err.println("Field value="+fx.get(ot));
		fx.set(ot,456);
		System.err.println("New field value="+ot.x);

		Field	ft = cl.getDeclaredField("t");
		
		System.err.println("Field name="+ft.getName());
		System.err.println("Field type="+ft.getType());
		System.err.println("Field value="+ft.get(null));
		ft.set(null,456);
		System.err.println("New field value="+ot.t);
		
		System.err.println("Methods: "+Arrays.toString(cl.getMethods()));
		
		Method	m = cl.getMethod("print", int.class);
		
		System.err.println("Name="+m.getName());
		System.err.println("Returned type="+m.getReturnType());
		System.err.println("Parameters="+Arrays.toString(m.getParameters()));
		
		try{m.invoke(ot, 456789/*Integer.valueOf(456789)*/);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			System.err.println("Source:"+e.getTargetException());
		}

		Method	ms = cl.getMethod("staticPrint", int.class);
		
		System.err.println("Name="+ms.getName());
		System.err.println("Returned type="+ms.getReturnType());
		System.err.println("Parameters="+Arrays.toString(ms.getParameters()));
		
		try{ms.invoke(null, 124/*Integer.valueOf(124)*/);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			System.err.println("Source:"+e.getTargetException());
		}

		System.err.println("Constructors: "+Arrays.toString(cl.getConstructors()));
		
		Constructor	c = cl.getConstructor();

		ObjectTest	newOt = (ObjectTest)c.newInstance();
		
		System.err.println("New instance: "+newOt);
		
		ObjectTest	source = new ObjectTest(), target = new ObjectTest();
		
		source.x = 145;	
		source.y = 22;
		System.err.println("Source: "+source);
		System.err.println("Target: "+target);
		assign(source,target);
		System.err.println("Source: "+source);
		System.err.println("Target: "+target);

		NewTestClass	s = new NewTestClass(), t = new NewTestClass();
		
		s.a = 333;	
		s.b = 11;
		System.err.println("Source: "+s);
		System.err.println("Target: "+t);
		assign(s,t);
		System.err.println("Source: "+s);
		System.err.println("Target: "+t);
		
		int[]	x = new int[] {1,2,3};
		Class	xClass = x.getClass();
		
		System.err.println("-----------------------------------");
		System.err.println("Name="+xClass.getName());
		System.err.println("Canonical name="+xClass.getCanonicalName());
		System.err.println("Is array="+xClass.isArray());
		System.err.println("Components="+xClass.getComponentType());
		System.err.println("Components="+xClass.arrayType().getCanonicalName());
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectTest other = (ObjectTest) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ObjectTest [x=" + x + ", y=" + y + "]";
	}

	public static void assign(final Object source, final Object target) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO:
		//	assign all target fields from source
		Class	clSource = source.getClass(), clTarget = source.getClass();
		
		if (clSource != clTarget) {
			throw new IllegalArgumentException("Source class differ then target");
		}
		else {
			for (Field sourceField : clSource.getFields()) {
				Field	targetField = clTarget.getField(sourceField.getName());
				
				targetField.set(target, sourceField.get(source));
			}
		}
	}
	
}


class NewTestClass {
	public int a;
	public int b;
	
	@Override
	public String toString() {
		return "NewTestClass [a=" + a + ", b=" + b + "]";
	}
}
