package Day_22.Classwork;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String [] args){
        int [] arr={1,3,6,2,4,3,9,8,7,7};
        bubbleSort(arr);

    }
    public static void bubbleSort(int [] arr){
        int count=0;
        int temp=0;
        int swapCount=0;
        for(int i=0;i<arr.length-1;i++){
//            for(int j=0;j<arr.length-1;j++){
                for(int j=0;j<arr.length-1-i;j++){
                    count ++;
                    if(arr[j]>arr[j+1]){
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        swapCount ++;
                    }
                }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count + " checks");
        System.out.println(swapCount + " swap");

    }
}
