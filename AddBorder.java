/*

Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]

*/

String[] addBorder(String[] picture) {
    int n=picture.length;
    int s=picture[0].length()+2;
    String res[]=new String[n+2];
    String temp="";
    for(int i=0;i<s;i++){
        temp+='*';
    }
    res[0]=temp;
    for(int i=0;i<n;i++){
        res[i+1]='*'+picture[i]+'*';
    }
    res[n+1]=temp;
    return res;
    
}
