/**
 * This program is used to calculate addition , multiplication, division operations
 * @author Priyanka
 *
 */
public class Arithmetic {
	/**
	 * addition operation
	 * @param num1
	 * @param num2
	 * @return addition of two numbers
	 */
	
	public int addition(int num1,int num2)
	{
		return (num1+num2);
	}
	/**
	 * multiplication operation
	 * @param num1
	 * @param num2
	 * @return multiplication of two numbers
	 */
	public int multiplication(int num1,int num2)
	{
		return (num1*num2);
	}
	/**
	 * division operation
	 * @param num1
	 * @param num2
	 * @return division of two numbers
	 */
	public int division(int num1,int num2)
	{
		try {
		return (num1/num2);
		}
		catch(Exception e)
		{
			return Integer.parseInt(e.getMessage());
		}
	}

}
