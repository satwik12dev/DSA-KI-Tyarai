package Arrays;

public class MinimumElement {
    static void min(int[] arr){
            int min=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] arr = {5,6,3,2,1,0};
        min(arr);
    }
}
