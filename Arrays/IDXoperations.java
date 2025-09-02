package Arrays;

public class IDXoperations {
    static void index(int[] arr){
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]*2+" ");
            }
            else {
                System.out.print(arr[i]+10+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        index(arr);
    }
}
