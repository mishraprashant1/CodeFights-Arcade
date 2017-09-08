/*

You have a string s that consists of English letters, punctuation marks, whitespace characters, and brackets. It is guaranteed that the parentheses in s form a regular bracket sequence.
Your task is to reverse the strings contained in each pair of matching parentheses, starting from the innermost pair. The results string should not contain any parentheses.
Example
For string s = "a(bc)de", the output should be
reverseParentheses(s) = "acbde".

*/

String reverseParentheses(String s) {
    String res="";
    boolean flag=false;
    String mid[]=new String[1024];
    int depth=-1;
    for(int i=0;i<s.length();i++){
        char temp=s.charAt(i);
        if(temp=='('){
            flag=(!flag);
            depth++;
            mid[depth]="";
            continue;
        }
        else if(temp==')'){
            if(flag==true){
                if(depth>0)
                    mid[depth-1]=mid[depth-1]+mid[depth];
                else
                    res=res+mid[depth];
                mid[depth]="";
            }else{
                if(depth>0)
                    mid[depth-1]=mid[depth]+mid[depth-1];
                else
                    res=mid[depth]+res;
                mid[depth]="";
            }
            flag=(!flag);
            depth--;
            continue;
        }
        if(flag==false){
            if(depth>=0){
                mid[depth]=mid[depth]+temp;
            }
            else{
                res=res+temp;
            }
        }
        else{
            if(depth>=0){
                mid[depth]=temp+mid[depth];
            }
            else{
                res=temp+res;
            }
        }
    }
    return res;
}
