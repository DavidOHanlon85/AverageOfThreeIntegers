/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise11_AverageOfThreeInts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		double average = averageOfThreeIntegers(3, 5, 3);
		
		System.out.printf("The average of the three integers is %.2f to two decimal places.", average);

	}

	/**
	 * This method returns the average of three integers as a double
	 * 
	 * @param a - Input a
	 * @param b - Input b
	 * @param c - Input c
	 * @return - Average as a double
	 */

	public static double averageOfThreeIntegers(int a, int b, int c) {

		int total = a + b + c;
		double average = total / 3.0;
		return average;

	}
}
