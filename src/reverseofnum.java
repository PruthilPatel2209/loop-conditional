import java.util.Scanner;

public class reverseofnum {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int ans = 0;

        while(k > 0){

            int digit = k % 10;
            ans += digit;
            ans *=10;
            k = k / 10;
        }
        ans /= 10;
        System.out.println(ans);
    }
}
