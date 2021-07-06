package com.xxxx.sort;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr={5,2,3,4,1};
        int[] arrAfterSorted= insertionSort3(arr);
        System.out.println(Arrays.toString(arrAfterSorted));
        bubbleList(arr);
        System.out.println(" ");
        bubbleList(arrAfterSorted);
    }
    public static int[] bubbleSort(int[] arr ){
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
               if(arr[j]>arr[j+1]) {
                   int temp;
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
            }
        }
        return arr;
    }
    public static void bubbleList(int[] arr){
        System.out.print("[");
        for(int k=0;k<arr.length;k++){
            if(k==arr.length-1){
                System.out.print(arr[k]+"]");
            }else{
                System.out.print(arr[k]+",");
            }
        }
    }
    public static int[] insertionSort3(int[] arr){
//        无序的下标范围[1~len-1]
        for (int i = 1; i < arr.length; i++) {
//            待插入数据
            int temp = arr[i];
            int j = 0;
            for (j = i-1; j >=0; j--) {
//                找到位置
                if(temp<arr[j]){
//                    后移
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=temp;
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
