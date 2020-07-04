class ThreadA extends Thread{
    int count=0;
     public void run( ) {
        for(int i = 1; i < 2000; i++) {
            if(i%3==0 && i%4==0){
                count++;
            }
        }
        System.out.println("Count of numbers from 1-2000 divisible by 3 & 4: "+ count);
        System.out.println("ThreadA is over..");
     }
}

class ThreadB extends Thread {
    int c=0;
    public void run( ) {
       for(int j = 2000; j < 4000; j++) {
            if(j%3==0 && j%4==0){
                c++;
            }
        }
        System.out.println("Count of numbers from 2000-4000 divisible by 3 & 4: "+ c);
        System.out.println("ThreadB is over..");
	}
}
class ThreadC extends Thread{
    int co=0;
     public void run( ) {
         for(int k = 4000; k < 6000; k++) {
            if(k%3==0 && k%4==0){
                co++;
            }
        }
        System.out.println("Count of numbers from 4000-6000 divisible by 3 & 4: "+ co);
        System.out.println("ThreadC is over..");     }
}
class ThreadD extends Thread{
    int con=0;
     public void run( ) {
         for(int k = 6000; k < 8000; k++) {
            if(k%3==0 && k%4==0){
                con++;
            }
        }
        System.out.println("Count of numbers from 6000-8000 divisible by 3 & 4: "+ con);
        System.out.println("ThreadD is over..");
        }
}
class ThreadE extends Thread{
    int coun=0;
     public void run( ) {
         for(int k = 8000; k < 10000; k++) {
            if(k%3==0 && k%4==0){
                coun++;
            }
        }
        System.out.println("Count of numbers from 8000-10000 divisible by 3 & 4: "+ coun);
        System.out.println("ThreadE is over..");     }
}

public class Multithreading {
    public static void main(String args[]) {
         ThreadA a = new ThreadA();
         ThreadB b = new ThreadB();
         ThreadC c = new ThreadC();
         ThreadD d = new ThreadD();
         ThreadE e = new ThreadE();
         a.start();
         b.start();
         c.start();
         d.start();
         e.start();
    }
}