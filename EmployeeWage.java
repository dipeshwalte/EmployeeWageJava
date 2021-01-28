public class EmployeeWage{
	public static void main(String[] args)
	{
	System.out.println("Welcome to employee wage computation!");
	int attendance = (int)Math.floor((Math.random()*10)%2);
	int wagePerHour = 20;
	int fullDayHour = 8;
	int partTimeHour = 8;
	int dailyWage = 0;
	switch(attendance){
		case EMP_FULL_TIME:
				System.out.println("Employee Present");
				dailyWage=(WAGE_PER_HOUR*FULL_DAY_HOUR);
				WAGES_FOR_MONTH=WAGES_FOR_MONTH + dailyWage;
				System.out.println("Daily Wage: "+dailyWage);
		        break;
		case EMP_PART_TIME:
				System.out.println("Employee Performed Parttime");
				int partTimeWage = (PART_TIME_HOUR*WAGE_PER_HOUR);
				dailyWage=dailyWage+partTimeWage;
				WAGES_FOR_MONTH= WAGES_FOR_MONTH + partTimeWage;
				System.out.println("New Daily Wage: "+dailyWage);
			break;
		default:
				System.out.println("Employee Absent");
				System.out.println("Daily Wage: "+dailyWage);
			break;
		}//end Switch
	}
}
