package com.xxxx.sort;

public class Sort {
    public static int[] bubbleSort(int[] arr){
//        数组比较length-1趟，每趟选出一个最大值
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                int temp;
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static int[] selectSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int index_max = 0;
            for(int j=0;j<arr.length-i;j++){
//              选择首个元素为最大值，每个元素与最大值相比较记录最大值的索引
                if (arr[j] > arr[index_max]) {
                index_max=j;
                }
            }
            int temp;
            temp=arr[index_max];
            arr[index_max]=arr[arr.length-i-1];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }
    public static int[] insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
//            将一个无序的数组（从arr[i]~arr[arr.length-1]）内元素
//            从后往前插入一个有序的数组内（起始为一个元素arr[0]，则其本身为有序数组，
//            后续有序数组范围为arr[0]~arr[i-1]）
           int temp=arr[i];
            for(int j=i-1;j>=0;j--){
                if(temp<arr[j]){
                    arr[j+1]=arr[j];
                    arr[j]=temp;
//                    如果temp比很多有序序列数小，则arr[j]会进场被arr[j-1]的值覆盖，
//                    因此arr[j]=temp;反复传值不如打破循环后再传temp值给最终的arr[j];
                }else {break;}
            }
//            arr[j+1]=temp;改进版
        }
        return arr;
    }
    public static int halfPercentSearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int middle=(start+end)/2;
            if(target==arr[middle]){
                return middle;
            }else if(target<arr[middle]){
                end=middle-1;
            }else {
                start=middle+1;
            }
        }
        return -1;
    }
}
