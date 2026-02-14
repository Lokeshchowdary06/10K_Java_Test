package Details;

public class Employee {
		private String employeeName;
		private int employeeID;
		private String department;
		Employee(String employeeName,int employeeID,String department)
		{
			
			this.employeeName = employeeName;
			
			this.employeeID = employeeID;
			
			this.department = department;

		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public int getEmployeeID() {
			return employeeID;
		}
		public void setEmployeeID(int employeeID) {
			this.employeeID = employeeID;
		}
		public String getdepartment() {
			return department;
		}
		public void setdepartment(String department) {
			this.department = department;
		}
		public void displayDetails() {
			System.out.println("Employye Details\nName: "+employeeName+"\nEmployee ID: "+employeeID+"\nDepartment: "+department);
		}
		
	
}

