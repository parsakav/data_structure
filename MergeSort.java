package main.java;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int n[]={4,3,2,1,0,-1,10};
        mergeSort(n,0,n.length-1);
        System.out.println(Arrays.toString(n));
    }


    public static void mergeSort(int n[],int f,int l){
        if(f>=l){
            return;
        }
        int mid= (f+l)/2;
        mergeSort(n,f,mid);
        mergeSort(n,mid+1,l);
        merge(n,f,mid,l);
    }

    private static void merge(int[] n, int f, int mid, int l) {

        int sizeOfArr1=mid-f+1;
        int sizeOfArr2=l-mid;
int arr1[]= new int[sizeOfArr1];
int arr2[]= new int[sizeOfArr2];
        for(int i=0;i<sizeOfArr1;i++){

            arr1[i]=n[f+i];
        }
        for(int i=0;i<sizeOfArr2;i++){

            arr2[i]=n[mid+1+i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int i=0;
        int j=0;
        int k=f;
        while(i<sizeOfArr1 && j<sizeOfArr2){
            if(arr1[i]<arr2[j]){
                n[k]=arr1[i];
                ++i;
            } else {
                n[k]=arr2[j];
            ++j;
            }
            k++;

        }
        while(i<sizeOfArr1){
            n[k]=arr1[i];
            i++;
            ++k;
        }
        while(j<sizeOfArr2){
            n[k]=arr2[j];
            j++;
            ++k;
        }
    }
}
