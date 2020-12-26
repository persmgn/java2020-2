package lesson4;

import java.io.IOException;
import java.util.Arrays;

public class ExecutionTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		System.in;
//		System.out;
//		System.err;
		// java -Dkey=abcderfgjdfkj lesson4.ExecutionTest vassya petis 
		System.err.println("PATH="+System.getenv("path"));
		System.err.println("Parameters="+Arrays.toString(args));
		System.err.println("Key="+System.getProperty("key"));

		int[]	x = {0,1,2,3}, y = {4,5,6,7};
		
		System.err.println("Before: "+Arrays.toString(y));
		System.arraycopy(x, 0, y, 2, 2);
		System.err.println("After: "+Arrays.toString(y));
		
		System.currentTimeMillis();	// 01.01.1970
		System.nanoTime();
		
		System.gc();

		Runtime	rt = Runtime.getRuntime();
		
		rt.addShutdownHook(new Thread(()->{System.err.println("HOOK");}));
		Process	p = rt.exec("cmd -c \"dir\"");
		
		byte[]	content = new byte[1024];
		int		len = p.getInputStream().read(content);
		
		System.err.println("Result: ");
		System.err.write(content,0,len);
		System.err.flush();
		
//		Thread.sleep(10000);
		rt.halt(0);	// kill -9 pid
		rt.exit(0);	// kill pid
		System.exit(0);
	}

}
