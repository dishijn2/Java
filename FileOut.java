import java.io.*;;
import java.util.Scanner;
public class FileOut {
	public static void main(String args[]) throws IOException, FileNotFoundException, ClassNotFoundException{
		FileOutputStream fos = new FileOutputStream("17BCB0055.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of objects: " );
		n=sc.nextInt();
		Loan L[] = new Loan[n];
		System.out.println("Enter " + n + " Objects");
		for(i =0;i<n;i++){
			L[i] = new Loan();
			L[i].input();
			oos.writeObject(L[i]);
		}
		System.out.println("Objects are written into the file" );
		oos.close();
		fos.close();
	}
}