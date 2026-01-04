import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        // Order Agnostic Binary Search -> Compare first and the last element of the Array to find out the order of the Array
        
        int[] arr={1,2,-1,-2,-1,3,7,8,8,8,2378};
        arr=new int[]{3,3,3,3,3,3,3,3,3,3,3,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target=2;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target) {
        int start=0,end=arr.length-1;
        while (start<=end) {
            int mid=start + (end-start)/2;
            if (target == arr[mid]){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
       return -1;
    }
    static boolean binarySearchReturningBoolean(int[] arr, int target) {
        int start=0,end=arr.length-1;
        while (start<=end) {
            int mid=start + (end-start)/2;
            if (arr[mid]==target){
                return true;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
       return false;
    }
}