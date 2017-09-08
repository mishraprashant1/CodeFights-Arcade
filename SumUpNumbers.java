/*

CodeMaster has just returned from shopping. He scanned the check of the items he bought and gave the resulting string to Ratiorg to figure out the total number of purchased items. Since Ratiorg is a bot he is definitely going to automate it, so he needs a program that sums up all the numbers which appear in the given input.

Help Ratiorg by writing a function that returns the sum of numbers that appear in the given inputString.

Example

For inputString = "2 apples, 12 oranges", the output should be
sumUpNumbers(inputString) = 14.

*/

int sumUpNumbers(String inputString) {

    int res=0;
    String temp="";
    for(int i=0;i<inputString.length();i++){
        if(Pattern.matches("[0-9]",inputString.charAt(i)+"")){
            temp=temp+inputString.charAt(i);
        }
        else{
            if(temp.length()>0)
                res+=Integer.parseInt(temp);
            temp="";
        }
    }
    if(temp.length()>0)
        res+=Integer.parseInt(temp);
    return res;
}
