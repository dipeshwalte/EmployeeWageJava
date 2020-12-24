import java.util.ArrayList;
import java.util.Iterator;

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
int companyDailyWage;
public CompanyEmpWage(String companyCompanyName,int companyWagePerHour,int companyMaxWorkingDays,int companyMaxWorkingHours){
	companyName = companyCompanyName;
	wagePerHour = companyWagePerHour;
	maxWorkingDays = companyMaxWorkingDays;
	maxWorkingHours = companyMaxWorkingHours;
	EmpWageBuilder emp = new EmpWageBuilder(companyWagePerHour, companyMaxWorkingDays, companyMaxWorkingHours);
	companyMonthlyWage = emp.computeWagesForMonth();
	companyDailyWage = emp.computeDailyEmployeeWage(companyWagePerHour);
   }
}

public class EmpWageBuilder implements EmpWageBuilderInterface{
	   int wagePerHour;
	   int maxWorkingDays;
	   int maxWorkingHours;
	   int wagesForMonth;
	   ArrayList<CompanyEmpWage> cmpArr;
	public EmpWageBuilder(int companyWagePerHour,int companyMaxWorkingDays,int companyMaxWorkingHours) {
		wagePerHour = companyWagePerHour;
		maxWorkingDays = companyMaxWorkingDays;
		maxWorkingHours = companyMaxWorkingHours;
	}
	public EmpWageBuilder()
	{

	}
	public int computeDailyEmployeeWage(int wagePerHour)
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
		for (Iterator iterator = cmpArr.iterator(); iterator.hasNext();) {
			CompanyEmpWage companyEmpWage = (CompanyEmpWage) iterator.next();
			System.out.println("Monthly Wage for "+companyEmpWage.companyName+" is "+companyEmpWage.companyMonthlyWage);
			System.out.println("Daily Wage for "+companyEmpWage.companyName+" is "+companyEmpWage.companyDailyWage);
			}
	   }
	public void getMonthlyWageForCompany(String companyName)
	{
		for (Iterator iterator = cmpArr.iterator(); iterator.hasNext();) {
			CompanyEmpWage companyEmpWage = (CompanyEmpWage) iterator.next();
			if(companyEmpWage.companyName==companyName){
				System.out.println("Monthly Wage for queried company "+companyEmpWage.companyName+" is "+companyEmpWage.companyMonthlyWage);
			}
			}
	}
	public static void main(String[] args)
	   {
	   System.out.println("Welcome to employee wage computation!");
	   EmpWageBuilder wageBuilder = new EmpWageBuilder();
	   wageBuilder.cmpArr = new ArrayList<CompanyEmpWage>();
	   CompanyEmpWage obj1 = new CompanyEmpWage("BridgeLabz", 30, 30, 100);
	   wageBuilder.cmpArr.add(obj1);
	   CompanyEmpWage obj2 = new CompanyEmpWage("TCS", 50, 30, 100);
	   wageBuilder.cmpArr.add(obj2);
	   CompanyEmpWage obj3 = new CompanyEmpWage("Microsoft", 100, 30, 100);
	   wageBuilder.cmpArr.add(obj3);
	   wageBuilder.getMonthlyWageForCompany("TCS");
	   }
	}

