/*

Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.

*/

boolean checkPalindrome(String inputString) {
    int front=0,tail=inputString.length()-1;
    for(int i=0;i<inputString.length();i++){
        if(inputString.charAt(front)==inputString.charAt(tail)){
            front=front+1;
            tail=tail-1;
            continue;
        }
        else{
            return false;
        }
    }
        return true;
}
