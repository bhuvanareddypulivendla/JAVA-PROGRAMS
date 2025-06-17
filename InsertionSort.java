import java.util.*;
import java.io.*;

public class InsertionSort{
    public static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>0&&arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        
        
    }
        public static void printArray(int[] arr){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] +" ");
            }
        }
        public static void main(String[] args){
            int[] arr={10,20,60,40,90,30};
            System.out.println("Before Insertion Sort:");
            printArray(arr);
            insertionSort(arr);
            System.out.println();
            System.out.println("After Insertion Sort:");
            printArray(arr);
        }
}
