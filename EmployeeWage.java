public class EmployeeWage{
	int fullDayHour = 8;
	int partTimeHour = 8;
private int computeDailyEmployeeWage(int wagePerHour)
	{
		return wagePerHour*fullDayHour;
	}
private int computePartTimeEmployeeWage(int wagePerHour)
	{
		return partTimeHour*wagePerHour;
	}
public void computeWagesForMonth(int wagePerHour,int maxWorkingDays,int maxWorkingHours)
	{
	int wagesForMonth = 0;
	int workingHours = 0;
	int workingDays = 0;
	while(workingDays<maxWorkingDays && workingHours<maxWorkingHours)
		{
		int attendance = (int)Math.floor((Math.random()*10)%2);
		int dailyWage = 0;
		switch(attendance){
			case 1:
					dailyWage=computeDailyEmployeeWage(wagePerHour);
					wagesForMonth=wagesForMonth + dailyWage;
					workingHours+=fullDayHour;
					if(workingHours>100)
						{
						continue;
						}
					int partTime = (int)Math.floor((Math.random()*10)%2);
					if(partTime==1)
						{
						int partTimeWage = computePartTimeEmployeeWage(wagePerHour);
						workingHours+=fullDayHour;
						wagesForMonth= wagesForMonth + partTimeWage;
						dailyWage=partTimeWage+dailyWage;
						}
					workingDays+=1;
			break;
			case 0:
			break;
			default:
					System.out.println("Something Went Wrong");
			break;
			}//end Switch
		}//end For
	System.out.println("Wages for the Month: "+wagesForMonth);
	}
public static void main(String[] args)
	{
	System.out.println("Welcome to employee wage computation!");
	EmployeeWage wageGenerator = new EmployeeWage();
	System.out.println("Computing Wages for BridgeLabz:");
	wageGenerator.computeWagesForMonth(30,30,100);
	System.out.println("Computing Wages for TCS:");
	wageGenerator.computeWagesForMonth(50,20,100);
	System.out.println("Computing Wages for Microsoft:");
	wageGenerator.computeWagesForMonth(100,20,100);
	}
}
