import java.util.*;
class StudentDetails {
	String regno;
	String name;
	float a[]=new float[4];
	String result;
	Scanner sc = new Scanner(System.in);
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Register number.: ");
		regno = sc.nextLine();
		System.out.println("Enter the Name of the Student: ");
		name = sc.nextLine();
		System.out.println("Enter the marks in four courses ");
		for(int i=0;i<4;i++){
			a[i] = sc.nextFloat();
		}
	}
	void display(){
		System.out.println("Register Number: " + regno);
		System.out.println("Name of the Student: " + name);
		for(int i=0;i<4;i++){
			System.out.println("Marks in course " + (i+1) + ":" + a[i]);
		}
	}
	void showresult(){
		int res = 1;
		for(int i=0;i<4;i++){
			if(a[i]>49){
				res*=1;
			}
			else {
				res*=0;
			}
		}
		if(res==1){
			result = "PASS";
		}
		else {
			result = "FAIL";
		}
		System.out.println("Result is- " + result);
	}
}
class StudentDetailsDemo{
	public static void main(String[] args){
	StudentDetails A1 = new StudentDetails();
	A1.input();
	A1.display();
	A1.showresult();
	StudentDetails A2 = new StudentDetails();
	A2.input();
	A2.display();
	A2.showresult();
	StudentDetails A3 = new StudentDetails();
	A3.input();
	A3.display();
	A3.showresult();
	}
}
