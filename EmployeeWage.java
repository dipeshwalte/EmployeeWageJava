public class EmployeeWage{
	public static void main(String[] args)
	{
	System.out.println("Welcome to employee wage computation!");
	int Attendance = (int)Math.floor((Math.random()*10)%2);
	if(Attendance==1){
		System.out.println("Employee Present");
		}
	else{
		System.out.println("Employee Absent");
		}
	}
}
