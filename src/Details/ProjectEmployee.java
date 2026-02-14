package Details;
import java.util.*;
public class ProjectEmployee {
	private String projectName;
	private String projectRole;
	private int perf[];
	Scanner sc= new Scanner(System.in);
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		System.out.println("Project Name Updated");
		this.projectName = projectName;
	}
	public String getProjectRole() {
		
		return projectRole;
	}
	public void setProjectRole(String projectRole) {
		System.out.println("Project Role Updated");
		this.projectRole = projectRole;
	}
	public int[] getPerf() {
		return perf;
	}
	public void setPerf(int[] perf) {
		this.perf = perf;
	}
	public ProjectEmployee(String projectName, String projectRole,int perf[]) {
		
		this.projectName = projectName;
		
		this.projectRole = projectRole;
		
		this.perf = perf;
		System.out.println("Profile Created SucessFully");
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
	public void displayDetails() {
		System.out.println("Employye Details\nProject Name: "+projectName+"\nProject Role: "+projectRole+"\nPerformance Scores: "+Arrays.toString(perf));
	}
}

