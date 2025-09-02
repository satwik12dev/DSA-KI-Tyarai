package Arrays;

public class PrintSumofElements {
    static void printsum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.print("Sum of all the element in array is:"+sum);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        printsum(arr);
    }
}
