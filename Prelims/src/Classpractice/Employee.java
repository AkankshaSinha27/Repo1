package Classpractice;

public class Employee implements Leave,Salary{
	

	@Override
	public void empSalary() {
		// TODO Auto-generated method stub
		System.out.println("Employee salary is credited");
	}

	@Override
	public void bankDetails() {
		// TODO Auto-generated method stub
		System.out.println("Bank details are here");
	}

	@Override
	public void numberOfLeaves() {
		// TODO Auto-generated method stub
		System.out.println("Number of leaves taken by employee");
	}
	
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		
		e1.empSalary();
	
		
	}

}
