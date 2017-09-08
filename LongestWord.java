/*

Define a word as a sequence of consecutive English letters. Find the longest word from the given string.

Example

For text = "Ready, steady, go!", the output should be
longestWord(text) = "steady".

*/

String longestWord(String text) {
    String res="";
    String temp="";
    for(int i=0;i<text.length();i++){
        if(Pattern.matches("[A-Za-z]",text.charAt(i)+""))
            temp=temp+text.charAt(i);
        else{
            if(res.length()<=temp.length())
                res=temp;
            temp="";
        }
    }
    if(res.length()<=temp.length())
        res=temp;
    return res;
}
