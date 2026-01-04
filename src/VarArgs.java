import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println("Hoo");

        // var1(1,2,3,4,5,6,7,7);
        // int[] a={1,2,3,4,56,7};
        // var2(new int[]{1,2,3}, new int[]{4,5}, new int[]{7,8,9},a);
        var3();

    }
    static void var1(int ...v){
        System.out.println("Here");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
        System.out.println("o");
    }
    static void var2(int[] ...v){
        System.out.println("Here");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i][i]);
        }
        System.out.println("o");
    }
    static void var3(){
        int[][] arr={
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int[] sample : arr) {
            System.out.println(Arrays.toString(sample));
        }
    }
}