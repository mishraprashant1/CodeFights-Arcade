/*

Given the positions of a white bishop and a black pawn on the standard chess board, determine whether the bishop can capture the pawn in one move.

*/

boolean bishopAndPawn(String bishop, String pawn) {
    char b1=bishop.charAt(0);
    char p1=pawn.charAt(0);
    int b2=Integer.parseInt(bishop.charAt(1)+"");
    int p2=Integer.parseInt(pawn.charAt(1)+"");
    if(b1==p1 || b2==p2)
        return false;
    int ac=(b1+"").compareTo(p1+"");
    if(ac<0)
        ac=-ac;
    String access;
    if(b2>p2)
        access=p1+""+(b2-ac);
    else
        access=p1+""+(b2+ac);
    if(access.equals(pawn))
        return true;
    else
        return false;
}
