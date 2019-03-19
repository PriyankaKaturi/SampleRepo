/**
 * This program is used to estimate the cost of house construction based on various materials
 * @author Priyanka
 *
 */
public class CostEstimation {
	/**
	 * find cost
	 * @param materialType
	 * @param areaOfHouse
	 * @param isAutomated
	 * @return
	 */
	public double findcost(int materialType,double areaOfHouse,boolean isAutomated)
	{
		int cost=0;
		if(materialType==0)
			cost=1200;
		else if(materialType==1)
			cost=1500;
		else if(materialType==2 && isAutomated)
			cost=2500;
		else
			cost=1800;
		return areaOfHouse*cost;
		
	}

}
