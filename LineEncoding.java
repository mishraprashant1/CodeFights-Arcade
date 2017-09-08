/*

Given a string, return its encoding defined as follows:

First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
for example, "aabbbc" is divided into ["aa", "bbb", "c"]
Next, each substring with length greater than one is replaced with a concatenation of its length and the repeating character
for example, substring "bbb" is replaced by "3b"
Finally, all the new strings are concatenated together in the same order and a new string is returned.
Example

For s = "aabbbc", the output should be
lineEncoding(s) = "2a3bc".

*/

String lineEncoding(String s) {
    char current=' ',old;
    int count=1;
    String res="";
    for(int i=0;i<s.length();i++){
        old=current;
        current=s.charAt(i);
        if(old==current)
            count++;
        else{
            if(old!=' '){
                if(count==1)
                    res=res+old;
                else
                    res=res+count+old;
            }    
            count=1;
        }
    }
    if(count==1)
        res=res+current;
    else
        res=res+count+current;
    return res;
}
