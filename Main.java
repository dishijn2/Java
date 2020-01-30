import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int size1 = s1.length();
        int size2 = s2.length();
        if(size1 != size2){
            System.out.println("Not anagram");
        }
        else {
            char ch1[] = s1.toCharArray();
            char ch2[] = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)==true){
                System.out.println("anagram");
            }
            else
                System.out.println("not");
        }
    }
}