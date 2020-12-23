public class EmployeeWage{
	public static void main(String[] args)
	{
	System.out.println("Welcome to employee wage computation!");
	int wagePerHour = 20;
	int fullDayHour = 8;
	int partTimeHour = 8;
	int wagesForMonth = 0;
	int workingDaysPerMonth = 20;
	int workingHours = 0;
	int workingDays = 0;
	while(workingDays<20 && workingHours<100)
		{
		int attendance = (int)Math.floor((Math.random()*10)%2);
		int dailyWage = 0;
		switch(attendance){
			case 1:
					System.out.println("Employee Present");
					dailyWage=(wagePerHour*fullDayHour);
					wagesForMonth=wagesForMonth + dailyWage;
					workingHours+=fullDayHour;
					if(workingHours>100)
						{
						continue;
						}
					System.out.println("Daily Wage: "+dailyWage);
					int partTime = (int)Math.floor((Math.random()*10)%2);
					if(partTime==1)
						{
						System.out.println("Employee Performed Parttime");
						int partTimeWage = (partTimeHour*wagePerHour);
						workingHours+=fullDayHour;
						dailyWage=dailyWage+partTimeWage;
						wagesForMonth= wagesForMonth + partTimeWage;
						System.out.println("New Daily Wage: "+dailyWage);
						}
					workingDays+=1;
			break;
			case 0:
					System.out.println("Employee Absent");
					System.out.println("Daily Wage: "+dailyWage);
			break;
			default:
					System.out.println("Something Went Wrong");
			break;
			}//end Switch
		}//end For
	System.out.println("Working Hours: "+workingHours);
	System.out.println("Wordingdays: "+workingDays);
	System.out.println("Wages for the Month: "+wagesForMonth);
	}
}
