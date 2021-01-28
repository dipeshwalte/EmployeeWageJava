public class EmployeeWage{
	public static void main(String[] args)
	{
	System.out.println("Welcome to employee wage computation!");
	int attendance = (int)Math.floor((Math.random()*10)%3);
	int WAGE_PER_HOUR = 20;
	int FULL_DAY_HOUR = 8;
	int EMP_PRESENT = 1;
	int EMP_PART_TIME = 2;
	int PART_TIME_HOUR = 4;
	int dailyWage = 0;
	if(attendance==EMP_PRESENT){
		System.out.println("Employee Present");
		dailyWage=(WAGE_PER_HOUR*FULL_DAY_HOUR);
		System.out.println("Daily Wage: "+dailyWage);
		}
	else if(attendance==EMP_PART_TIME){
		System.out.println("Employee Performed Parttime");
		dailyWage=dailyWage+(PART_TIME_HOUR*WAGE_PER_HOUR);
		System.out.println("New Wage: "+dailyWage);
		}
	else{
		System.out.println("Employee Absent");
		System.out.println("Daily Wage: "+dailyWage);
		}
	}
}
