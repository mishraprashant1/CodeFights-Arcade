/*

Check if all digits of the given integer are even.

Example

For n = 248622, the output should be
evenDigitsOnly(n) = true;
For n = 642386, the output should be
evenDigitsOnly(n) = false.

*/

boolean evenDigitsOnly(int n) {
    String s=n+"";
    for(int i=0;i<s.length();i++){
        if(Integer.parseInt(s.charAt(i)+"")%2!=0)
            return false;
    }
    return true;
}
