import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Boolean flag = false;
		String str = sc.nextLine();
		int len=str.length();
		char[] ch = new char[len];
		if(len==9){
		for(int j=0;j<len;j++){
		    if(j==2 || j==3 || j==4){
		        if(Character.isLetter(str.charAt(j))) {
		            flag = true;
		        }
		        else {
		            flag = false;
		            break;
		        }
		    }
		    else if(j==0 || j==1){
		        if(Character.isDigit(str.charAt(j))){
		            flag = true;
		        }
		        else {
		            flag = false;;
		         }
		    }
		    else{
		        if(Character.isDigit(str.charAt(j))){
		            flag = true;
		        }
		        else {
		            flag = false;
		            break;
		        }   
		    }
		}
		}
		else{
		    flag=false;
		}
		if(flag==true)
		    System.out.println("Valid Register Number");
		else
		    System.out.println("Invalid Register Number");
	}
}
