package com.xxxx.sort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class SelectSort {
    public static void main(String[] args) {
        int[]array=new int[]{1,2,3,4};
        int[] arrrrrr={12,34,45};
        int[] aeeee=new int[3];
        String k="abdv";
        int[] arr = {7, 5, 3, 9, 10, 2};
        int[] afterSort = selectSort(arr);
        System.out.println(Arrays.toString(afterSort));
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            Integer a=arr[i];
            arrayList.add(a);
        }
       Iterator<Integer> iter=arrayList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+" ");
        }
    }
    public static int[] selectSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            int index = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[index]) {
                    index = j;
                }
            }
            temp = arr[index];
            arr[index] = arr[arr.length - i-1];
            arr[arr.length - i-1] = temp;
        }
        return arr;
    }
}
