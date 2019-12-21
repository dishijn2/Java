import java.util.*;
class Accounting {
	String accountno;
	String name;
	String acctype;
	float balance;
	float minbal;
	Scanner sc = new Scanner(System.in);
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account no.: ");
		accountno = sc.nextLine();
		System.out.println("Enter the Name: ");
		name = sc.nextLine();
		System.out.println("Enter the Account Type: ");
		acctype = sc.nextLine();
		System.out.println("Enter the Available balance: ");
		balance = sc.nextFloat();
		System.out.println("Enter the Minimum balance: ");
		minbal = sc.nextFloat();
	}
	void display(){
		System.out.println("Account Number: " + accountno);
		System.out.println("Name of the person: " + name);
		System.out.println("Account Type: " + acctype);
		System.out.println("Available balance: " + balance);
		System.out.println("Minimum balance: " + minbal );
	}
	void deposit(){
		Scanner sc = new Scanner(System.in);
		float amount;
		System.out.println("Enter the deposit amount: ");
		amount = sc.nextFloat();
		balance = balance+amount;
	}
	void withdraw(){
		Scanner sc = new Scanner(System.in);
		float amount;
		System.out.println("Enter the amount to be withdrawn: ");
		amount = sc.nextFloat();
		if(balance>=amount){
			balance=balance-amount;
		}
		else {
			System.out.println("Cannot Withdraw money..less balance");
		}
	}
	void showbalance(){
		System.out.println("Available balance: " + balance);
	}
}

class AccountingDemo{
	public static void main(String args[]){
	Accounting A = new Accounting();
	A.input();
	A.display();
	A.deposit();
	A.withdraw();
	A.showbalance();
	Accounting B = new Accounting();
	B.input();
	B.display();
	B.deposit();
	B.withdraw();
	B.showbalance();
	Accounting C = new Accounting();
	C.input();
	C.display();
	C.deposit();
	C.withdraw();
	C.showbalance();
	}
}
