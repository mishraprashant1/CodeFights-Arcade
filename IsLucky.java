/*

Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.


*/

boolean isLucky(int n) {
    String s=n+"";
    int half=s.length()/2;
    int h1=0,h2=0;
    char c;
    int temp;
    for(int i=0;i<s.length();i++){
        if(i<half){
            c=s.charAt(i);
            temp=Integer.parseInt(c+"");
            h1=h1+temp;
        }
        else{
            c=s.charAt(i);
            temp=Integer.parseInt(c+"");
            h2=h2+temp;
        }
    }
    if(h1==h2){
        return true;
    }
    else {
        return false;
    }
}
