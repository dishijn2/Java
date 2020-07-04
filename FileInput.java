import java.io.*;
import java.util.Scanner;
public class FileInput {
	public static void main(String a[]) throws IOException, FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("17BCB0055.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println("objects are written in file");
		Loan lobj;
		while(fis.available()>0){
			lobj = (Loan)ois.readObject();
			lobj.display();
		}
		ois.close();
		fis.close();
	}
}