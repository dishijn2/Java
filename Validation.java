import java.util.*;
class MyException extends Exception {
    MyException(String s){
	    super(s);
    }
}
class Validation {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Registration number");
		String regno = sc.nextLine();
		System.out.println("Enter the Phone number");
		String phone = sc.nextLine();
		int len1 = regno.length();
		int len2 = phone.length();
		try {
		if(len1!=9){  
			throw new IllegalArgumentException("Register number should be of 9 Characters");
		}
		if(len2!=10){  
			throw new IllegalArgumentException("Phone number should be 10 digit number");
		}
		for(int i=0;i<len2;i++){
			if(!(Character.isDigit(phone.charAt(i)))){
				throw new NumberFormatException("Phone number should contains only digits");
			}
		}
		for(int j=0;j<len1;j++){
			if(!(Character.isDigit(regno.charAt(j)) ||  Character.isLetter(regno.charAt(j))) ){
				throw new MyException("Special characters are not allowed");
			}
		}
		} catch(Exception m){System.out.println("Exception occured: "+m);}  
	}
}
