import java.util.Scanner;

public class Searchin_MountainArray {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] mountain = {1,2,3,4,5,3,1};
        int start =0;
        int end = FindPeak(mountain);

        int ans = binarySearchAsc(mountain, start,end, 3);
        System.out.println(ans);
    }

    static int FindPeak(int[] arr){

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = (left + right) / 2;

            if (arr[mid] < arr[mid + 1]) {

                left = mid + 1;
            } else {

                right = mid;
            }
        }
        return left;
    }

    static int binarySearchAsc(int[] arr, int low, int high, int target) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = arr[mid];

            if (val == target) return mid;
            else if (val < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    static int binarySearchDesc(int[] arr, int low, int high, int target) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = arr[mid];

            if (val == target) return mid;
            else if (val > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

}
