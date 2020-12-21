public class EmployeeWage{
	public static void main(String[] args)
	{
	System.out.println("Welcome to employee wage computation!");
	int attendance = (int)Math.floor((Math.random()*10)%2);
	int wagePerHour = 20;
	int fullDayHour = 8;
	int partTimeHour = 8;
	int dailyWage = 0;
	if(attendance==1){
		System.out.println("Employee Present");
		dailyWage=(wagePerHour*fullDayHour);
		System.out.println("Daily Wage: "+dailyWage);
		int partTime = (int)Math.floor((Math.random()*10)%2);
		if(partTime==1)
			{
			System.out.println("Employee Performed Parttime");
			dailyWage=dailyWage+(partTimeHour*wagePerHour);
			System.out.println("New Wage: "+dailyWage);
			}
		}
	else{
		System.out.println("Employee Absent");
		System.out.println("Daily Wage: "+dailyWage);
		}
	}
}
