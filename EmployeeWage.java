public class EmployeeWage{
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_DAY_HOUR = 8;
	static final int PART_TIME_HOUR = 4;
	static final int EMP_FULL_TIME = 1;
	static final int EMP_PART_TIME = 2;
	static final int MAX_WORKING_DAYS=20;
	static final int MAX_WORKING_HOURS=100;
	public static void main(String[] args)
	{
	System.out.println("Welcome to employee wage computation!");
	int workingHours = 0;
	int workingDays = 0;
	int wagesPerMonth=0;
	while(MAX_WORKING_DAYS<20 && MAX_WORKING_HOURS<100)
		{
		int attendance = (int)Math.floor((Math.random()*10)%3);
		switch(attendance){
			case EMP_FULL_TIME:
					System.out.println("Employee Present");
					wagesPerMonth=wagesPerMonth + (WAGE_PER_HOUR*FULL_DAY_HOUR);
					workingDays+=1;
					workingHours+=FULL_DAY_HOUR;
			break;
			case EMP_PART_TIME:
					System.out.println("Employee Performed Parttime");
					dailyWage=dailyWage+partTimeWage;
					wagesPerMonth= wagesPerMonth + (PART_TIME_HOUR*WAGE_PER_HOUR);
					workingDays+=1;
					workingHours+=PART_TIME_HOUR;
			break;
			default:
					System.out.println("Employee Absent");
			break;
			}//end Switch
		}//end For
	System.out.println("Wages for the Month: "+WAGES_FOR_MONTH);
	}
}
