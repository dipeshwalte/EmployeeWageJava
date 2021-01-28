public class EmployeeWage{
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_DAY_HOUR = 8;
	static final int PART_TIME_HOUR = 4;
	static final int EMP_FULL_TIME = 1;
	static final int EMP_PART_TIME = 2;
	public static void main(String[] args)
	{
	System.out.println("Welcome to employee wage computation!");
	int attendance = (int)Math.floor((Math.random()*10)%3);
	int dailyWage = 0;
	switch(attendance){
		case EMP_FULL_TIME:
				System.out.println("Employee Present");
				dailyWage=(WAGE_PER_HOUR*FULL_DAY_HOUR);
		        break;
		case EMP_PART_TIME:
				System.out.println("Employee Performed Parttime");
				dailyWage = (PART_TIME_HOUR*WAGE_PER_HOUR);
			break;
		default:
				System.out.println("Employee Absent");
			break;
		}//end Switch
	System.out.println("Daily Wage: "+dailyWage);
	}//end main
}//end Class
