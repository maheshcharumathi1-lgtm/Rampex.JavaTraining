package Day_22.Classwork;

import java.util.Arrays;
public class SelectionSort {
        public static void main(String [] args){
            int [] arr={1,3,6,2,4,3,9,8,7,7};
            selectionSort(arr);

        }
        public static void selectionSort(int [] arr){
            int count=0;
            for(int i=0;i<arr.length-1;i++){
                int minIdx=i;
                for(int j=0;j<arr.length;j++){
                    if(arr[j]>arr[minIdx]){
                        minIdx=j;
                    }
                }
                int temp=arr[minIdx];
                arr[minIdx]=arr[i];
                arr[i]=temp;
            }
            System.out.println(Arrays.toString(arr));
        }
}
