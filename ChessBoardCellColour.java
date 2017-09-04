/*

Given two cells on the standard chess board, determine whether they have the same color or not.

Example

For cell1 = "A1" and cell2 = "C3", the output should be
chessBoardCellColor(cell1, cell2) = true.

*/

boolean chessBoardCellColor(String cell1, String cell2) {
    int a1=Integer.parseInt(cell1.charAt(1)+"");
    int b1=Integer.parseInt(cell2.charAt(1)+"");
    char a2=cell1.charAt(0);
    char b2=cell2.charAt(0);
    
    return color(a1,a2)==color(b1,b2);
}
char color(int a,char b){
    if(b=='A'||b=='C'||b=='E'||b=='G'){
        if(a%2==0)
            return 'w';
        else
            return 'b';
    }
    else{
        if(a%2==0)
            return 'b';
        else
            return 'w';
    }
}
