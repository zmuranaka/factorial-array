/*
 * File: FactorialArray.java
 * Zachary Muranaka
 * Stores the information about the factorial array
 */

public class FactorialArray
{
	// FactorialArray constructor
	public FactorialArray(int number)
	{
		sum[0] = 1; // Initializes the first digit as 1
		
		// The remaining numbers in the array are initialized as -1
		for(int i = 1; i < sum.length; i++)
			sum[i] = -1;
		
		index = 0; // Stores the index of the end digit of the sum
		
		// Calculates the factorial by muliplying by 2, 3 ... number
		for (int n = 2; n <= number; n++)
			multiply(n);
	}

	// Prints the array
	public void print()
	{
		// Prints in reverse order because the greatest digit is the last in the array
		for(int i = index; i >= 0; i--)
			System.out.print(sum[i]);
	}

	private int index;
	private int[] sum = new int[100000]; // The sum array can be up to 100000 digits long (essentially arbitrarily large)

	// Multiplies each digit in the array by the supplied multiplier
	private void multiply(int multiplier)
	{
		for(int j = 0; j <= index; j++)
			sum[j] *= multiplier;
		
		carry(); // Any digit that is 10 or over must be carried
	}

	// Performs a carry on the digits that have exceeded 9
	private void carry()
	{
		for(int j = 0; j <= index; j++)
		{
			if(sum[j] > 9)
			{
				// Checks if the next value in the array does not contain a valid digit
				if(sum[j + 1] == -1)
				{
					// Increases the index and stores the new value as 0
					index++;
					sum[index] = 0;
				}

				// Performs the carry (-10 to the current digit, +1 to the next digit)
				while(sum[j] > 9)
				{
					sum[j] -= 10;
					sum[j + 1] += 1;
				}
			}
		}
	}
}