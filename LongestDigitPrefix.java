/*

Given a string, output its longest prefix which contains only digits.

Example

For inputString="123aa1", the output should be
longestDigitsPrefix(inputString) = "123".

*/

String longestDigitsPrefix(String inputString) {
    ArrayList arr=new ArrayList(10);
    arr.add('0');arr.add('1');arr.add('2');arr.add('3');arr.add('4');
    arr.add('5');arr.add('6');arr.add('7');arr.add('8');arr.add('9');
    String temp="",res="";
    for(int i=0;i<inputString.length();i++){
        if(inputString.charAt(i)==' ')
            return "";
        if(arr.contains(inputString.charAt(i)))
            temp=temp+inputString.charAt(i);
        else{
            if(temp.length()>res.length())
                res=temp;
            temp="";
        }
    }
    System.out.println("Temp : "+temp + " Res : "+res);
    if(temp.length()>res.length())
                res=temp;
    return res;
}
