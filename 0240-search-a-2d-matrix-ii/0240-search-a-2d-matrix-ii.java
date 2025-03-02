class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
     int m =arr.length, n = arr[0].length;   
     //time limit exceeded
     //no of iterations/rounds=m*n
    //  for(int i=0;i<m;i++){
    //     for(int j=0;j<n;j++){
    //             if(arr[i][j]==target) return true;
    //     }
    //  }return false;
    int i=0,j=n-1;
    while(i<m && j>=0){
        if (arr[i][j]==target) return true;
        else if(arr[i][j]>target){ //go to left
            j--;
            } 
            else{ //go down
            i++;
            }
    }
    return false;
}
}