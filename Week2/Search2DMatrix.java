public class Search2DMatrix{
    public boolean searchMatrix(int[][] matrix, int target) {
        //brute force
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //Binary Search
        int rows=matrix.length;
        int col=matrix[0].length-1;
        int i=0;
        while(i<rows && col>-1){
            if(matrix[i][col]==target) return true;
            else if(target>matrix[i][col]) i++;
            else col--;
        }
        return false;
    }
}