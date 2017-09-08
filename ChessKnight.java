/*

Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.

The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.

*/

int chessKnight(String cell) {

    char c[]="abcdefgh".toCharArray();
    int b1[]={1,2,3,4,5,6,7,8};
    
    char g=cell.charAt(0);
    int h=Integer.parseInt(cell.charAt(1)+"");
    
    int a=0,b=h-1,count=0;
    for(int i=0;i<8;i++){
        if(c[i]==g){
            a=i;
            break;
        }
        //if(b1[i]==h)
        //    b=i;
    }
    System.out.println(a+" "+b);
    int i1=a-2,j1=b-1;
    int i2=a-1,j2=b-2;
    int i3=a+2,j3=b-1;
    int i4=a+1,j4=b-2;
    int i5=a-2,j5=b+1;
    int i6=a-1,j6=b+2;
    int i7=a+1,j7=b+2;
    int i8=a+2,j8=b+1;
    if(i1>=0&&j1>=0&&i1<8&&j1<8)
        count++;
    if(i2>=0&&j2>=0&&i2<8&&j2<8)
        count++;
    if(i3>=0&&j3>=0&&i3<8&&j3<8)
        count++;
    if(i4>=0&&j4>=0&&i4<8&&j4<8)
        count++;
    if(i5>=0&&j5>=0&&i5<8&&j5<8)
        count++;
    if(i6>=0&&j6>=0&&i6<8&&j6<8)
        count++;
    if(i7>=0&&j7>=0&&i7<8&&j7<8)
        count++;
    if(i8>=0&&j8>=0&&i8<8&&j8<8)
        count++;
    return count;
}
