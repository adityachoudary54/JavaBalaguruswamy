/**
 * recursion
 */
import java.util.Scanner;
public class recursion {
    static int fact(int n){
        if (n==0 ||n==1){
            return 1;
        }
        else{
            return fact(n-1)*n;
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(fact(scan.nextInt()));
        scan.close();
    }
}