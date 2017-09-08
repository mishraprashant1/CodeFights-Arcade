/*

Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.

Example

For n = 152, the output should be
deleteDigit(n) = 52;
For n = 1001, the output should be
deleteDigit(n) = 101.

*/

int deleteDigit(int n) {
    int max=0;
    String str=n+"";
    StringBuilder stb;
    for(int i=0;i<str.length();i++){
        stb=new StringBuilder(n+"");
        stb.deleteCharAt(i);
        int temp=Integer.parseInt(stb.toString());
        if(temp>max)
            max=temp;
    }
    return max;
}
