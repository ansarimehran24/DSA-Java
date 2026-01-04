import java.util.Arrays;

public class LinerSearch {
    public static void main(String[] args) {
        int[][] arr={
            {1,12,5},
            {7,322},
            {3,5,3}
        };
        int target= 76;
        // Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(search("Mehran", 'k'));
        System.out.println(searchIn2DArray(arr,target));
        System.out.println(Arrays.toString(searchIn2DArrayReturningArray(arr, target)));
        System.out.println(maximumWealth(arr));
        
    }
    static boolean search(String name,char target){
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==target)
                return true;
        }
        return false;
        // Either way we can also make a String to character Array by name.toCharArray()
    }
    static String searchIn2DArray(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target)
                    return "Row "+(i+1)+" Column "+(j+1);
            }
        }
        return "Not found";
    }
    static int[] searchIn2DArrayReturningArray(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target)
                    return new int[]{i+1,j+1};
            }
        }
        // int a=0x800000000;
        return new int[]{-1,-1};
    }
    // {{1,2,3},{4,5,6},{4,5}}
    static int maximumWealth(int[][] accounts){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }
            if (sum>max){
                max=sum;
            }
        }
        return max;
    }
}
