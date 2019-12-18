import java.util.*;
public class Student
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int m;
		float avg = 0;
		int sum = 0;
		int res=1;
		String result = "";
		int a[][] = new int[n][];
		for(int i=0;i<n;i++) {
		    System.out.println("Enter the value of registered courses for Student "+(i+1)+" ");
		    m = sc.nextInt();
		    a[i] = new int[m];
		}
		for(int i=0;i<a.length;i++) {
		    System.out.println("Enter the marks scored by each Student " + (i+1));
		    for(int j=0;j<a[i].length;j++){
		        a[i][j] = sc.nextInt();
		        sum = sum + a[i][j];
		        avg = sum/a[i].length;
		        if(a[i][j]<50)
		            res*=0;
		        else 
		            res*=1;
		    }
		    sum = 0;
		    if(res==0)
		        result= "Fail";
		    else
		        result="Pass";
		    res=1;
		    System.out.println("Average- " + avg);
		    System.out.println("Result- " + result);
		}
	}
}
