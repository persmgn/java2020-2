package lesson1;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	x[] = new int[10], y[] = new int[] {1,2,7,-22,41};
		
		for (int index = 0; index < x.length; index++) {
			x[index] = index;
		}
		
		for (int item : x) {
			System.err.println("Content="+item);
		}
		
		int	z[][] = new int[][] {
						new int[] {1,2,5},
						null,
						new int[] {-1}
					};
		int	zz[][] = new int[10][];

		for (int[] item : z) {
			if (item != null) {
				for (int val : item) {
					System.err.println("Content: "+val);
				}
			}
			else {
				System.err.println("NULL!!!!!!!");
			}
		}
		
		int	a[] = new int[] {10,20,30}, b[] = a.clone();
		
		System.err.println("A[0]="+a[0]);
		b[0]=100;
		System.err.println("A[0]="+a[0]);
		
		int	c[][] = new int[][] {new int[] {1,2,3}, new int[] {4,5,6}},
			d[][] = c.clone();
		
		System.err.println("C[0][0]="+c[0][0]);
		d[0][0]=100;
		System.err.println("C[0][0]="+c[0][0]);
		
	}

}
