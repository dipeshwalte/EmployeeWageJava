public class EmployeeWage{
	public static void main(String[] args)
	{
	System.out.println("Welcome to employee wage computation!");
	int attendance = (int)Math.floor((Math.random()*10)%2);
	int wagePerHour = 20;
	int fullDayHour = 8;
	if(attendance==1){
		System.out.println("Employee Present");
		System.out.println("Daily Wage ="+(wagePerHour*fullDayHour));
		}
	else{
		System.out.println("Employee Absent");
		System.out.println("Daily Wage = 0");
		}
	}
}
