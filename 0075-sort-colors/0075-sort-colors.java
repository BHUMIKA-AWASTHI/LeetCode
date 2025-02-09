class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        //3 pointer approach --> low, mid,
        // one pass solution
        // dutch flag algorithm
        int mid =0, high=n-1, low=0;
        while(mid<=high){
            if(arr[mid]==0){
                int temp= arr[mid];
                arr[mid]= arr[low];
                arr[low]= temp;
                low++; mid++;
            }
            else if(arr[mid]==1) mid++;
            else { //arr[mid]==2;
                    int temp= arr[mid];
                    arr[mid]= arr[high];
                    arr[high]= temp;
                    high--;
            }
        }
        
    }
}