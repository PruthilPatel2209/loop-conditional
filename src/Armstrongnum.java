import java.util.Scanner;

public class Armstrongnum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 100; i <100;i++){

            if(IsArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean IsArmstrong(int n){

        int copy = n;
        int k = 0;
        while(n > 0){

            int rem = n%10;
            k = k+(rem*rem*rem);

            n = n/10;

        }

        return (k == copy);
    }
}
