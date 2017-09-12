/*

Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with digits so that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid contains all of the digits from 1 to 9.

This algorithm should check if the given grid of numbers represents a correct solution to Sudoku.

Example

For the first example below, the output should be true. For the other grid, the output should be false: each of the nine 3 × 3 sub-grids should contain all of the digits from 1 to 9.

*/

boolean sudoku(int[][] grid) {
    int x[]={0,3,6};
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.println("Processing Grid : "+i+""+j);
            ArrayList<Integer> arr=new ArrayList<>();
            for(int k=x[i];k<(i+1)*3;k++){
                for(int l=x[j];l<(j+1)*3;l++){
                    if(!arr.contains(grid[k][l])){
                        arr.add(grid[k][l]);
                    }
                    else{
                        return false;
                    }
                }
            }
            System.out.println(arr);
        }
    }
    TreeSet tree;//=new TreeSet();
    for(int i=0;i<9;i++){
        tree=new TreeSet();
        for(int j=0;j<9;j++){
            tree.add(grid[i][j]);
        }
        if(tree.size()!=9)
            return false;
    }
    for(int i=0;i<9;i++){
        tree=new TreeSet();
        for(int j=0;j<9;j++){
            tree.add(grid[j][i]);
        }
        if(tree.size()!=9)
            return false;
    }
    return true;
}
