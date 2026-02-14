package Details;
import java.util.*;

public class ProjectEmployee extends Employee {
		private String projectName;
		private String projectRole;
		private int perf[];
		public ProjectEmployee(String employeeName,int employeeID,String department,String projectName, String projectRole,int perf[])
		{
			super(employeeName,employeeID,department);
			this.projectName = projectName;
			this.projectRole = projectRole;
			this.perf = perf;
			System.out.println("Profile Created SucessFully");
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public String getProjectRole() {
			return projectRole;
		}
		public void setProjectRole(String projectRole) {
			this.projectRole = projectRole;
		}
		public int[] getPerf() {
			return perf;
		}
		public void setPerf(int[] perf) {
			this.perf = perf;
		}
		public void EmpProfile()
		{
			System.out.println("Employye Details\nName: "+super.getEmployeeName()+"\nEmployee ID: "+super.getEmployeeID()+"\nDepartment: "+super.getDepartment()+"Employye Details\nProject Name: "+projectName+"\nProject Role: "+projectRole+"\nPerformance Scores: "+Arrays.toString(perf));
		}
		public void averageperf()
		{
			int sum=0;
			for(int num:perf)
			{
				sum+=num;
			}
			System.out.println("AVERAGE PERFORMANCE: "+(sum/3));
		}
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Employee Name: ");
			String employeeName=sc.nextLine();
			System.out.println("Enter Employee ID: ");
			int employeeID=Integer.parseInt(sc.nextLine());
			System.out.println("Enter Employee department: ");
			String department=sc.nextLine();
			System.out.println("Enter Project Name: ");
			String projectName=sc.nextLine();
			System.out.println("Enter Project Role: ");
			String projectRole=sc.nextLine();
			System.out.println("Enter 3 Months Performance Score");
			int perf[]= new int[3];
			for(int i=0;i<3;i++)
			{
				System.out.println("Month "+(i+1+": "));
				perf[i] = Integer.parseInt(sc.nextLine());
			}
			ProjectEmployee pe=new ProjectEmployee(employeeName, employeeID, department,projectName, projectRole, perf);
			while(true)
			{
				System.out.println("-----Menu----\n1.UPDATE PROJECT ROLE\n2.UPDATE PROJECT NAME\n3.VIEW EMPLOYEE PROFILE\n4.VIEW AVERAGE PERFORMANCE\n5.EXIT");
				int option = Integer.parseInt(sc.nextLine());
				switch(option)
				{
					case 1:{
							System.out.println("Enter New Project Role: ");
							projectRole=sc.nextLine();
							pe.setProjectRole(projectRole); break;
						}
					case 2:{
							System.out.println("Enter New Project Name: ");
							projectName=sc.nextLine();
							pe.setProjectName(projectName); break;
							}
					case 3:{
								pe.EmpProfile();
								break;
							}
					case 4:pe.averageperf(); break;
					case 5:{
								sc.close();
								System.exit(0);
							}

				}
				

			}
		}
}
