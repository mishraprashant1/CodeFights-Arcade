/*

Given a string, replace each its character by the next one in the English alphabet ( z  would be replaced by  a ).

Example

For  inputString = "crazy" , the output should be
 alphabeticShift(inputString) = "dsbaz" .

*/

String alphabeticShift(String inputString) {
    char[] alphabets="abcdefghijklmnopqrstuvwxyz".toCharArray();
    String res="";
    for(int i=0;i<inputString.length();i++){
        int n=Character.getNumericValue(inputString.charAt(i))-9;
        System.out.println("character : "+inputString.charAt(i)+" position : "+n);
        if(n<=25){
            res=res+alphabets[n];
        }else{
            res=res+alphabets[0];
        }
    }
    return res;
}
