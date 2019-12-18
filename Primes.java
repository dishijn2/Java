import java.util.*;
class Primes {
    public void countPrimes(int n) {
        
        int count=0;
        int[] arr = new int[n];
        Arrays.fill(arr,1);
        
        for(int i=2;i<n;i++){
            for(int j=2; i*j < n;j++){
                arr[i*j] = 0;
            }
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i] == 1){
				System.out.println(i);
                count++;
            }
        }
        System.out.println("Count of Primes numbers is: " + count);
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Primes p = new Primes();
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		p.countPrimes(n);
	}
}
