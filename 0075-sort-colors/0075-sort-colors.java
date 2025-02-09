class Solution {

    public void swap(int[] arr, int mid, int low){  // swap function to reduce the space complexity
        int temp= arr[mid];
        arr[mid]= arr[low];
        arr[low]= temp;

    }
    public void sortColors(int[] arr) {
        int n = arr.length;
        //3 pointer approach --> low, mid,
        // one pass solution
        // dutch flag algorithm
        int mid =0, high=n-1, low=0;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++; mid++;
            }
            else if(arr[mid]==1) mid++;
            else { //arr[mid]==2;
                    swap(arr,mid,high);
                    high--;
            }
        }
        
    }
}