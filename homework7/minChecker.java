public class minChecker {

	// Find the smallest value of the 3 integers
	// One value has to be less than 10
	// if no value is less than 10, return -1, indicating an error

	public static int minValue(int x, int y, int z){
		int min = -1;

		if (( x < 10) || (y < 10) || (z < 10)) {
			if (x < y) {
				min = x;
			} 
			else {
				min	= y;
			}

			if (z < min) {
				min = z;
			}
		}
		return min;
	}

}
