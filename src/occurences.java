import java.util.Scanner;

public class occurences {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int use = sc.nextInt();
        int count = 0;
        int i = 1;

        while (k > 0) {
            int digit = k % 10;

            if (digit == use) {
                count++;
            }

            k = k / 10;
        }

        System.out.println(count);
    }
}
