package example.oop.inheritance;

class Company{
	void CompanyInfo() {
		System.out.println("Company Details");
	}
}
class Department extends Company{
	void DeptInfo() {
		System.out.println("Department Details");
	}
}
class Employee extends Department{
	void EmployeeInfo() {
		System.out.println("SAMREETHA");
	}
}
public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		Employee bd1=new Employee();
		bd1.CompanyInfo();
		bd1.DeptInfo();
		bd1.EmployeeInfo();
	}

}
