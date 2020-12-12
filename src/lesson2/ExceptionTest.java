package lesson2;

import java.io.IOException;

public class ExceptionTest {
	public static void error(int x) throws Exception, Throwable {
		switch (x) {
			case 0 : throw new RuntimeException("Runtime!!!!"); 
			case 1 : throw new Exception("Exception!!!!"); 
			case 2 : throw new Throwable("Thrwowable!!!!");
			default : return;
		}
	}

	public static void nestedError(int x) throws IOException {
		try{error(x);
		} catch (Exception exc) {
			System.err.println("NESTED EXCEPTION: "+exc.getMessage());
		} catch (Throwable exc) {
			throw new IOException(exc);
		} finally {
			System.err.println("NESTED FINAL");
		}
	}
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Throwable	t = new Throwable("error detected!");
		
		//	Throwable
		//		- Error (unchecked exceptions)
		//			-- ....
		//		- Exception
		//			-- ....
		//			-- RuntimeException (unchecked exceptions)
		//				--- ....
		//				--- ....
		
		for (int index = 0;  index <= 3; index++) {
			try {
				// טהואכüםאÿ ןנמדנאללא
				nestedError(index);
				System.err.println("Success!!");
			} catch (RuntimeException exc) {
				System.err.println("RUNTIME: "+exc.getMessage());
			} catch (Exception exc) {
				System.err.println("EXCEPTION: "+exc.getMessage());
				exc.printStackTrace();
			} catch (Throwable exc) {
				System.err.println("THROWABLE: "+exc.getMessage());
			} finally {
				System.err.println("FINAL");
			}
		}
	}
}
