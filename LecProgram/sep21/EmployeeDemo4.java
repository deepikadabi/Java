class Employee{
	private int empId;
	private String empName;
	Employee(int empId){		
		this(100,"ABC");
		System.out.println("no arg");
	}
	Employee(int empId,String empName){
		
		this.empId = empId;
		this.empName = empName;
		System.out.println("param arg");
	}
	void show(){
		System.out.println(empId+" "+empName);
	}
}
class EmployeeDemo4{
	public static void main(String args[]){
		
		Employee e = new Employee(123);
		//e.show();
		
	}
}