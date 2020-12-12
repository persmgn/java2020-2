package lesson1;

public class Exercises {
	public static int[]	x = /*new int[]*/{10, 33, -2, 7, 11};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	max = x[0];
		
		for (int value : x) {
			if (value > max) {
				max = value;
			}
		}
		System.err.println("Max="+max);

		int	found = 0;
		
		for (int place = 0; place < x.length; place++) {
			if (x[place] > max) {
				max = x[place];
				found = place;
			}
		}
		System.err.println("Max="+max+", found="+found);
	}

}
