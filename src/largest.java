import java.util.Scanner;

public class largest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numbers(3) : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print("Largest : ");
        if(a>=b & a>=c){
            System.out.println(a);
        }else if(b>=a & b>=c){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
