import java.util.*;
public class ProjectEmployee {
	private String projectName;
	private String projectRole;
	private int perf[]= new int[3];
	Scanner sc= new Scanner(System.in);
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
	public ProjectEmployee(String projectName, String projectRole,int perf[]) {
		System.out.println("Enter Project Name: ");
		this.projectName = projectName;
		System.out.println("Enter Project Role: ");
		this.projectRole = projectRole;
		System.out.println("Enter 3 Months Performance Score");
		for(int i=0;i<3;i++)
		{
			perf[i]=sc.nextInt();
		}
		System.out.println("Profile Created SucessFully");
	}
}
