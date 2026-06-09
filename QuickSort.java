public class QuickSort {
    public static int partition(int arr[],int low,int high){
         // Choose the last element as pivot
        int pivot=arr[high];
        // Index of smaller element
        int i =low-1;
        // Traverse the array and compare each element with pivot
        for(int j=low;j<high;j++){
            // If current element is smaller than pivot
            if(arr[j]<pivot){
                i++;
               // Swap arr[i] and arr[j]
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;//pivot index
    }
    public static void quickSort(int arr[],int low,int high ){
        if(low<high){
            int pidx=partition(arr,low,high);
            quickSort(arr, low,pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
    public static void main(String args []){
        int[] arr={6,3,9,5,2,10,8};
        int n= arr.length;

        quickSort(arr, 0,n-1);

        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        }
    
}
