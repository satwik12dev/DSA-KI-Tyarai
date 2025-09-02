package Arrays;

public class PrintNegativeNumbers {
    static void printnegatives(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }else{
                continue;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1,5,-3,9,-6};
        printnegatives(arr);
    }

}
