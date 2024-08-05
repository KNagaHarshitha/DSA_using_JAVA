import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Sorting ob = new Sorting();
        
        int arr[] = {47, -12, 0, 56, 3, 4};
        // mergeSortInPlace(arr,0,arr.length-1);

        int low = 0;
        int high = arr.length-1;
        quickSort(arr,low,high);
        System.out.println("Array after sorted  "+Arrays.toString(arr));
        sc.close();
    }

static int[] mergeSort(int[] arr){
    if(arr.length == 1) return arr;
    int mid = arr.length/2;
    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
    return merge(left, right);
}
public static int[] merge(int[] first,int[] second){
    int[] mix = new int[first.length + second.length];
    int i = 0, j = 0, k = 0;
    while(i < first.length && j < second.length){
        if(first[i] < second[j]){
            mix[k] = first[i];
            i++;
        }else{
            mix[k] = second[j];
            j++;
        }
        k++;
    }
    while(i<first.length){
        mix[k]=first[i];
        i++;
        k++;
    }
    while(j<second.length){
        mix[k]=second[j];
        j++;
        k++;
    }
    return mix;

}


static void mergeSortInPlace(int[] arr,int s,int e){
    if(e-s==1)
    {
        return;
    } 
    int mid = (s+e)/2;
    mergeSortInPlace(arr, s, mid);
    mergeSortInPlace(arr, mid, e);
    mergeInPlace(arr,s,mid,e);
}
public static void mergeInPlace(int arr[], int s,int mid,int e){
    int[] mix = new int[e-s];
    int i = s;
    int  j = mid;
    int  k = 0;
    while(i < mid && j < e){
        if(arr[i] < arr[j]){
            mix[k] = arr[i];
            i++;
        }else{
            mix[k] = arr[j];
            j++;
        }
        k++;
    }
    while(i<mid){
        mix[k]=arr[i];
        i++;
        k++;
    }
    while(j<e){
        mix[k]=arr[j];
        j++;
        k++;
    }
    for(int l = 0;l<mix.length;l++){
        arr[s+l]= mix[l];
    }

}

//Quicksort
static void quickSort(int[] arr, int low, int upp) {
    if (low < upp) {
        int loc = partition(arr, low, upp);
        quickSort(arr, low, loc - 1);
        quickSort(arr, loc + 1, upp);
    }
}

static int partition(int arr[], int low, int upp) {
    int pivot = arr[low];
    int start = low;
    int end = upp;

    while (start < end) {
        while (start < arr.length && arr[start] <= pivot) {
            start++;
        }
        while (arr[end] > pivot) {
            end--;
        }

        if (start < end) {
            swap(arr, start, end);
        }
    }
    swap(arr, low, end);
    return end;
}

static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}






}

