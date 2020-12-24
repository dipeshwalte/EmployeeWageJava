interface EmpWageBuilderInterface{
	int fullDayHour = 8;
	int partTimeHour = 8;
	int computeWagesForMonth();
	void printWagesForCompanies();
}


class CompanyEmpWage{
String companyName;
int wagePerHour;
int maxWorkingDays;
int maxWorkingHours;
int companyMonthlyWage;
public CompanyEmpWage(String companyCompanyName,int companyWagePerHour,int companyMaxWorkingDays,int companyMaxWorkingHours){
	companyName = companyCompanyName;
	wagePerHour = companyWagePerHour;
	maxWorkingDays = companyMaxWorkingDays;
	maxWorkingHours = companyMaxWorkingHours;
	EmpWageBuilder emp = new EmpWageBuilder(companyWagePerHour, companyMaxWorkingDays, companyMaxWorkingHours);
	companyMonthlyWage = emp.computeWagesForMonth();
   }
}

public class EmpWageBuilder implements EmpWageBuilderInterface{
	   int fullDayHour = 8;
	   int partTimeHour = 8;
	   int wagePerHour;
	   int maxWorkingDays;
	   int maxWorkingHours;
	   int wagesForMonth;
	   CompanyEmpWage cmpArr[];
	public EmpWageBuilder(int companyWagePerHour,int companyMaxWorkingDays,int companyMaxWorkingHours) {
		wagePerHour = companyWagePerHour;
		maxWorkingDays = companyMaxWorkingDays;
		maxWorkingHours = companyMaxWorkingHours;
	}
	public EmpWageBuilder()
	{

	}
	private int computeDailyEmployeeWage(int wagePerHour)
	   {
	      return wagePerHour*fullDayHour;
	   }
	private int computePartTimeEmployeeWage(int wagePerHour)
	   {
	      return partTimeHour*wagePerHour;
	   }
	public int computeWagesForMonth()
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
	      }//end While
	   return wagesForMonth;
	   }
	public void printWagesForCompanies()
	   {
		for (int i = 0; i < cmpArr.length; i++) {
			System.out.println("Monthly Wage for "+cmpArr[i].companyName+" is "+cmpArr[i].companyMonthlyWage);
			}
	   }
	public static void main(String[] args)
	   {
	   System.out.println("Welcome to employee wage computation!");
	   EmpWageBuilder wageBuilder = new EmpWageBuilder();
	   wageBuilder.cmpArr = new CompanyEmpWage[3];
	   wageBuilder.cmpArr[0] = new CompanyEmpWage("BridgeLabz", 30, 30, 100);
	   wageBuilder.cmpArr[1] = new CompanyEmpWage("TCS", 50, 30, 100);
	   wageBuilder.cmpArr[2] = new CompanyEmpWage("Microsoft", 100, 30, 100);
	   wageBuilder.printWagesForCompanies();
	   }
	}
