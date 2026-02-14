package Details;

import java.util.*;

public class CompanyEmployee {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String employeeName=sc.nextLine();
		System.out.println("Enter Employee ID: ");
		int employeeID=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Employee department: ");
		String department=sc.nextLine();
		Employee e= new Employee(employeeName, employeeID, department);
		System.out.println("Enter Project Name: ");
		String projectName=sc.nextLine();
		System.out.println("Enter Project Role: ");
		String projectRole=sc.nextLine();
		System.out.println("Enter 3 Months Performance Score");
		int perf[]= new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Month "+(i+1+": "));
			perf[i]=sc.nextInt();
		}
		sc.nextLine();
		ProjectEmployee pe = new ProjectEmployee(projectName, projectRole, perf);
		System.out.println("hello");
		while(true)
	
		{
			System.out.println("-----Menu----\n1.UPDATE PROJECT ROLE\n2.UPDATE PROJECT NAME\n3.VIEW EMPLOYEE PROFILE\n4.VIEW AVERAGE PERFORMANCE\n5.EXIT");
			int option = sc.nextInt();
			sc.nextLine();
			switch(option){
			case 1:{
				System.out.println("Enter New Project Role: ");
				String role=sc.nextLine()
;				pe.setProjectRole(role); break;}
			case 2:{
				System.out.println("Enter New Project Name: ");
				String newname=sc.nextLine();
				pe.setProjectName(newname); break;}
			case 3:{
				e.displayDetails();
				pe.displayDetails();
				break;
			}
			case 4:pe.averageperf(); break;
			case 5:{sc.close();
			System.exit(0);
			}
			
			}
		}
	}

}
