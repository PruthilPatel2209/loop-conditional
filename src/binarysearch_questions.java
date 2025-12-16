import java.util.Arrays;
import java.util.Scanner;

public class binarysearch_questions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int[] arr = {1,2,4,6,9,10,14,18,23};
//
//        int ceil = sc.nextInt();
//        int low = 0;
//        int high = arr.length-1;
//        int ans = 0;
//        while(low <= high){
//
//            int mid = (low+high)/2;
//
//            if(arr[mid] < ceil){
//                low = mid+1;
//            }
//            if(arr[mid] >=ceil){
//                ans = arr[mid];
//                high = mid-1;
//            }
//
//        }
//
//        System.out.println("Ceiling of Number : " + ans);

        int[] arr = {5,7,7,8,8,10};
        int t = 8;
        int[] ans = searchRange(arr, t);

        System.out.println(Arrays.toString(ans));
    }

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public char nextGreatestLetter(char[] letters, char target) {

        int low = 0;
        int high = letters.length-1;
        int ans = 0;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(letters[mid] > target){

                ans = mid;
                high = mid-1;
            }else{

                low = mid+1;
            }
        }
        return letters[ans];
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);

        return ans;
    }

    public static int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                high = mid - 1;   // move left
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                low = mid + 1;    // move right
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
}
