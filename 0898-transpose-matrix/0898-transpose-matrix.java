class Solution {
    public int[][] transpose(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] transpose = new int[n][m];
        for (int i = 0; i < n; i++) { //cols
            for (int j = 0; j < m; j++) { //rows
                transpose[i][j]= arr[j][i];
            }
        }
        return transpose;
    }
}