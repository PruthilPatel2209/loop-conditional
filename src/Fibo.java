import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibo {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int count = 2;
        int a = 0;
        int b = 1;

        while(count <=k){

            int temp = b;
            b = b+a;
            a = temp;
            count ++;
        }
        System.out.println("Fibo Number (k) :");
        System.out.print(b);
    }
}
