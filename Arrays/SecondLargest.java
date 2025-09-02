package Arrays;

import java.util.Arrays;

public class SecondLargest {
    static void secnondlargest(int[] arr){
        Arrays.sort(arr);
        int n= arr.length;
        int larget = arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i] != larget){
                System.out.println("Second Largest Element in array is:"+arr[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,7,8,9,9};
        secnondlargest(arr);

    }
}
