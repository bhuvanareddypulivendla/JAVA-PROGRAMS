import java.util.*;
import java.io.*;

public class BubbleSort{
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        boolean swapped;
        
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
            break;
            } 
        }
    }
        public static void printArray(int[] arr){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] +" ");
            }
        }
        public static void main(String[] args){
            int[] arr={10,20,60,40,90,30};
            System.out.println("Before Bubble Sort:");
            printArray(arr);
            bubbleSort(arr);
            System.out.println();
            System.out.println("After Bubble Sort:");
            printArray(arr);
        }
}