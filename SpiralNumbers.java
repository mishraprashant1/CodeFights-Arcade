/*

Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.

Example

For n = 3, the output should be

spiralNumbers(n) = [[1, 2, 3],
                    [8, 9, 4],
                    [7, 6, 5]]

*/

int[][] spiralNumbers(int n) {

    int res[][]=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            res[i][j]=0;
        }
    }
    boolean flag=true;
    int i=0,j=-1;
    for(int l=1;l<=n*n;l++){
        if( flag && j+1<n && res[i][j+1]==0){
            res[i][j+1]=l;
            j+=1;
            continue;
        }
        else if( flag && i+1<n && res[i+1][j]==0){
            res[i+1][j]=l;
            i+=1;
            continue;
        }
        flag=false;
        if( !flag && j-1>=0 && res[i][j-1]==0){
            res[i][j-1]=l;
            j-=1;
            continue;
        }
        else if( !flag && i-1>=0 && res[i-1][j]==0){
            res[i-1][j]=l;
            i-=1;
            continue;
        }
        flag=true;
        res[i][j+1]=l;
        j+=1;
    }
    return res;
}
