// https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1857096194/

public class RotatedBinarySearch {
    static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};

        System.out.println(searchinginrotated(arr,0));

    }
    static int searchinginrotated(int[] arr,int target){

        int pivot = FindPivot(arr);
        int ans = -1;
        // if pivot is -1 array is not rotated
        if (pivot == -1) {

            ans = binarySearch(arr,target,0,arr.length-1);
            return ans;
        }
        else {

            ans = binarySearch(arr,target,0,pivot);
            if(ans != -1){
                return ans;
            }else {
                ans = binarySearch(arr,target,pivot+1, arr.length-1);
                return ans;
            }
        }

    }

    static int binarySearch(int[] arr, int target, int low,int high){

        while(low<=high){

            int mid = low + (high-low)/2;
            int val = arr[mid];

            if(val == target){
                return mid;
            }else if(val > target){
                high = mid-1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
    static int FindPivot(int[] arr){

        int low = 0;
        int high = arr.length-1;

        while(low <= high){

            int mid = low + (high-low)/2;
            // 4 cases are required

            if(mid < high && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > low && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[low]){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
