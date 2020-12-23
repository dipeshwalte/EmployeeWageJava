public class EmployeeWage{
	public static void main(String[] args)
	{
	System.out.println("Welcome to employee wage computation!");
	int wagePerHour = 20;
	int fullDayHour = 8;
	int partTimeHour = 8;
	int wagesForMonth = 0;
	int workingDaysPerMonth = 20;
	for(int i=0;i<20;i++)
		{
		int dailyWage = 0;
		int attendance = (int)Math.floor((Math.random()*10)%2);
		switch(attendance){
			case 1:
					System.out.println("Employee Present");
					dailyWage=(wagePerHour*fullDayHour);
					wagesForMonth=wagesForMonth + dailyWage;
					System.out.println("Daily Wage: "+dailyWage);
					int partTime = (int)Math.floor((Math.random()*10)%2);
					if(partTime==1)
						{
						System.out.println("Employee Performed Parttime");
						int partTimeWage = (partTimeHour*wagePerHour);
						dailyWage=dailyWage+partTimeWage;
						wagesForMonth= wagesForMonth + partTimeWage;
						System.out.println("New Daily Wage: "+dailyWage);
						}
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
	System.out.println("Wages for the Month: "+wagesForMonth);
	}
}
