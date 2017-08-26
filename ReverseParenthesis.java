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
            /*res=res+mid;
            mid="";
            flag=(!flag);
            depth--;
            continue;*/
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
            //res=res+temp;
            //mid=temp+mid;
            if(depth>=0){
                mid[depth]=mid[depth]+temp;
            }
            else{
                res=res+temp;
            }
        }
        else{
            //mid[depth]=temp+mid[depth];
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
