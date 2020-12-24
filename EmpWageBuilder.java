public class EmpWageBuilder{
	int fullDayHour = 8;
	int partTimeHour = 8;
	int wagePerHour;
	int maxWorkingDays;
	int maxWorkingHours;
	int wagesForMonth;
public EmpWageBuilder(int companyWagePerHour,int companyMaxWorkingDays,int companyMaxWorkingHours)
	{
	wagePerHour = companyWagePerHour;
	maxWorkingDays = companyMaxWorkingDays;
	maxWorkingHours = companyMaxWorkingHours;
	}
private int computeDailyEmployeeWage(int wagePerHour)
	{
		return wagePerHour*fullDayHour;
	}
private int computePartTimeEmployeeWage(int wagePerHour)
	{
		return partTimeHour*wagePerHour;
	}
public void computeWagesForMonth()
	{
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
	}
public void printWages(String companyName)
	{
	System.out.println("Montly Wages for "+companyName+" "+wagesForMonth);
	}
public static void main(String[] args)
	{
	System.out.println("Welcome to employee wage computation!");
	System.out.println("Computing Wages for BridgeLabz:");
	EmpWageBuilder bridgeLabz = new EmpWageBuilder(30,30,100);
	bridgeLabz.computeWagesForMonth();
	bridgeLabz.printWages("BridgeLabz");
	System.out.println("Computing Wages for TCS:");
	EmpWageBuilder tcs = new EmpWageBuilder(50,30,100);
	tcs.computeWagesForMonth();
	tcs.printWages("TCS");
	System.out.println("Computing Wages for Microsoft:");
	EmpWageBuilder microsoft = new EmpWageBuilder(100,30,100);
	microsoft.computeWagesForMonth();
	microsoft.printWages("Microsoft");
	}
}
