/**
 * This program is used to calculate simple interest and compound interest
 * @author Priyanka
 *
 */
public class scinterest {
	/**
	 * simple interest
	 * @param principle
	 * @param rateOfInterest
	 * @param timePeriod
	 * @return
	 */

	public double simpleInterest(float principle,float rateOfInterest,float timePeriod)
	{
		return (principle*timePeriod*rateOfInterest);
	}
	/**
	 * compound interest
	 * @param principle
	 * @param rateOfInterest
	 * @param timePeriod
	 * @return
	 */
	public double compoundInterest(float principle,float rateOfInterest,float timePeriod)
	{
		return principle*(Math.pow((1+rateOfInterest/100), timePeriod));
	}
}
