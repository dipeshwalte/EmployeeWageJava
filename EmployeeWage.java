public class EmployeeWage{
	public static void main(String[] args)
	{
	System.out.println("Welcome to employee wage computation!");
	int attendance = (int)Math.floor((Math.random()*10)%2);
	int WAGE_PER_HOUR = 20;
	int FULL_DAY_HOUR = 8;
	int EMP_PRESENT = 1;
	if(attendance==EMP_PRESENT){
		System.out.println("Employee Present");
		System.out.println("Daily Wage ="+(WAGE_PER_HOUR*FULL_DAY_HOUR));
		}
	else{
		System.out.println("Employee Absent");
		System.out.println("Daily Wage = 0");
		}
	}
}
