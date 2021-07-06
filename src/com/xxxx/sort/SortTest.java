package com.xxxx.sort;
import java.util.Arrays;
public class SortTest {
    public static void main(String[] args){
        int[] arr=new int[]{4,7,8,10,3,6,1};
//        Sort.bubbleSort(arr);
//        Sort.selectSort(arr);
        Sort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Sort.halfPercentSearch(arr,10));
    }
}
