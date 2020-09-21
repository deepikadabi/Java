class Employee{
	private int empId;
	private String empName;
/*	Employee(){
		System.out.println("no arg");
		empId = 100;
		empName= "ABC";
	}
*/
	Employee(int empId,String empName){
		System.out.println("param cons");
		this.empId = empId;
		this.empName = empName;
	}

	void show(){
		System.out.println(empId+" "+empName);
	}
}
class EmployeeDemo2{
	public static void main(String args[]){
		Employee e = new Employee();
		e.show();
		Employee e1 = new Employee(101,"ram");
		e1.show();
	}
}