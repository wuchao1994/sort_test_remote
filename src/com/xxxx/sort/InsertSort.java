package com.xxxx.sort;
import java.util.Arrays;
public class InsertSort {
    public static void main(String[] args) {
        int[] arr={5,2,3,4,1};
        int[] arrAfterSorted=insertSort(arr);
        System.out.println(Arrays.toString(arrAfterSorted));
    }
    public static int[] insertSort(int[] arr){
        int temp=0;
        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            int j;
            for( j=i-1;j>=0;j--){
               if(temp<arr[j]){
                   arr[j+1]=arr[j];
               }else {break;}
            }
            arr[j+1]=temp;
        }
        return arr;
    }
}
