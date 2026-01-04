import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList_Sample {
    public static void main(String[] args) {
        //Syntax
        // ArrayList<Integer> s1=new ArrayList<>(10);
        // s1.add(15);
        // s1.add(15);
        // s1.add(152);
        // s1.add(152);
        // s1.add(153);
        // s1.add(155);
        // s1.add(15);
        // s1.add(15);
        // s1.add(15);
        // s1.add(15);
        // s1.set(0,32);
        // System.out.println(s1);
        // System.out.println(s1.get(0));
        // System.out.println(s1.contains(34));
        // System.out.println(s1.remove(3));
        // System.out.println(s1);
        System.out.println("Mehran");

        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        // arrayList();
        // swap(arr);

        int start=0;
        int end=arr.length-1;

        while (start<end) {
            swapUsingTwoPointerMethod(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }
    static void arrayList(){
        Scanner obj=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        
        System.out.println(list);
        
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        System.out.println(list);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                list.get(i).add(obj.nextInt());
            }
            
        }
        
        System.out.println(list);
        obj.close();
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
    static void swap(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    System.out.println(Arrays.toString(arr));
    }
    static void swapUsingTwoPointerMethod(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
