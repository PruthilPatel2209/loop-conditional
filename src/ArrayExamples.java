import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //int[] arr = new int[4];

//        for (int i = 0; i < 4; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i : arr){
//            System.out.print(i + " ");
//        }
//        System.out.println(Arrays.toString(arr));
//
//        ArrayList<Integer> list = new ArrayList<>(4);
//
//        list.add(12);
//        list.add(1);
//        list.add(11);
//        list.add(3);
//        list.add(24);
//        list.add(25);
//
//        System.out.println(list);
//
        int[] exarr = {1,2,3,5,6,7,0,8};
        System.out.println(Arrays.toString(exarr));

        swap(exarr, 5,7);
        System.out.println(Arrays.toString(exarr));

        System.out.println("Maximum Element : " + FindMax(exarr));

        int[] array = ReverseArray(exarr);
        System.out.println(Arrays.toString(array));
    }

    static void swap(int[] arr, int i,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int FindMax(int arr[]){

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int[] ReverseArray(int[] arr){


        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            if(low == high){

            }else {
                swap(arr,low,high);
            }
            low++;
            high--;
        }
        return arr;
    }
}
