package Arrays;

public class SearchElement {
    static  boolean search(int[]arr, int target){
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found=true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        boolean found = search(arr, 5);
        if(found){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
    }
}
