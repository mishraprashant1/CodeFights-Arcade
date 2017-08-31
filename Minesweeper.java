/*

In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a Minesweeper game setup.

Example

For

matrix = [[true, false, false],
          [false, true, false],
          [false, false, false]]
the output should be

minesweeper(matrix) = [[1, 2, 1],
                       [2, 1, 1],
                       [1, 1, 1]]     

*/

int[][] minesweeper(boolean[][] matrix) {
    int res[][]=new int[matrix.length][matrix[0].length];
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            int sum=0;
            try{
                if(matrix[i-1][j-1]){
                    sum+=1;
                }
            }
            catch(Exception e){}
            try{
                if(matrix[i-1][j]){
                    sum+=1;
                }
            }
            catch(Exception e){}
            try{
                if(matrix[i-1][j+1]){
                    sum+=1;
                }
            }
            catch(Exception e){}
            try{
                if(matrix[i][j-1]){
                    sum+=1;
                }
            }
            catch(Exception e){}
            /*try{
                if(matrix[i][j]){
                    sum+=1;
                }
            }
            catch(Exception e){}*/
            try{
                if(matrix[i][j+1]){
                    sum+=1;
                }
            }
            catch(Exception e){}
            try{
                if(matrix[i+1][j-1]){
                    sum+=1;
                }
            }
            catch(Exception e){}
            try{
                if(matrix[i+1][j]){
                    sum+=1;
                }
            }
            catch(Exception e){}
            try{
                if(matrix[i+1][j+1]){
                    sum+=1;
                }
            }
            catch(Exception e){}
            res[i][j]=sum;
        }
    }
    return res;
}
