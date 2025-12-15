import java.util.Scanner;

public class alphabetcasecheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char c = sc.next().trim().charAt(0);

        if(c >= 97 & c<=122){
            System.out.println("Lower case");
        }else if(c >= 65 & c<=90){
            System.out.println("Upper Case");
        }else{
            System.out.println("Error");
        }

    }
}
