public class EmployeeWage{
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_DAY_HOUR = 8;
	static final int PART_TIME_HOUR = 4;
	static final int WAGES_FOR_MONTH = 0;
	static final int WORKING_DAYS_PER_MONTH = 20;
	static final int EMP_FULL_TIME = 1;
	static final int EMP_PART_TIME = 2;
	public static void main(String[] args)
	{
	System.out.println("Welcome to employee wage computation!");
	
	for(int i=0;i<WORKING_DAYS_PER_MONTH;i++)
		{
		int dailyWage = 0;
		int attendance = (int)Math.floor((Math.random()*10)%3);
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
		}//end For
	System.out.println("Wages for the Month: "+WAGES_FOR_MONTH);
	}
}
