package lesson3;

import java.lang.reflect.Field;

public class ChildObjectTest extends ObjectTest {
	static int	c = 10;
	
	public int	y;
	public int 	z;

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Object	cot = new ChildObjectTest();
		Class	cC = cot.getClass();	// ChildObjectTest.class;
		
		Field	abcdeField = cC.getSuperclass().getDeclaredField("abcde");

		abcdeField.setAccessible(true);
		System.err.println("Value="+abcdeField.get(cot));
		
	}
}
