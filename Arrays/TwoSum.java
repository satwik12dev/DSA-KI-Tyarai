package Arrays;

public class TwoSum {
    static boolean twosum(int[] arr, int target){
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    found = true;
                }
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,-3};
        int target = 0;
        System.out.println(twosum(arr,target));
    }
}
