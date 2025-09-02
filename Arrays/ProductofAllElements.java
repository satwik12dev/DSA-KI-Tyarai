package Arrays;

public class ProductofAllElements {
    static void product(int[] arr){
        int pro = 1;
        for(int i=0;i<arr.length;i++){
            pro *= arr[i];
        }
        System.out.println("Product of all the elements in array is:"+pro);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        product(arr);
    }
}
