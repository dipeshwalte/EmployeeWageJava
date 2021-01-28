public class EmployeeWage{
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_DAY_HOUR = 8;
	static final int PART_TIME_HOUR = 8;
	static final int WAGES_FOR_MONTH = 0;
	static final int WORKING_DAYS_PER_MONTH = 20;
	public static void main(String[] args)
	{
	System.out.println("Welcome to employee wage computation!");
	
	for(int i=0;i<WORKING_DAYS_PER_MONTH;i++)
		{
		int dailyWage = 0;
		int attendance = (int)Math.floor((Math.random()*10)%2);
		switch(attendance){
			case 1:
					System.out.println("Employee Present");
					dailyWage=(WAGE_PER_HOUR*FULL_DAY_HOUR);
					WAGES_FOR_MONTH=WAGES_FOR_MONTH + dailyWage;
					System.out.println("Daily Wage: "+dailyWage);
					int partTime = (int)Math.floor((Math.random()*10)%2);
					if(partTime==1)
						{
						System.out.println("Employee Performed Parttime");
						int partTimeWage = (PART_TIME_HOUR*WAGE_PER_HOUR);
						dailyWage=dailyWage+partTimeWage;
						WAGES_FOR_MONTH= WAGES_FOR_MONTH + partTimeWage;
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
	System.out.println("Wages for the Month: "+WAGES_FOR_MONTH);
	}
}
