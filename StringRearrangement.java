/*

Given an array of equal-length strings, check if it is possible to rearrange the strings in such a way that after the rearrangement the strings at consecutive positions would differ by exactly one character.

Example

For inputArray = ["aba", "bbb", "bab"], the output should be
stringsRearrangement(inputArray) = false;

All rearrangements don't satisfy the description condition.

For inputArray = ["ab", "bb", "aa"], the output should be
stringsRearrangement(inputArray) = true.

Strings can be rearranged in the following way: "aa", "ab", "bb".

*/

boolean stringsRearrangement(String[] inputArray) {
    String str="";
    for(int i=0;i<inputArray.length;i++){
        str=str+i;
    }
    Permute p=new Permute();
    return p.permute(str,0,inputArray.length-1,inputArray);
}
class Permute{
    private boolean permute(String str, int l, int r,String arr[])
    {
        if (l == r){
            for(int i=0;i<str.length()-1;i++){
                int a=Integer.parseInt(str.charAt(i)+"");
                int b=Integer.parseInt(str.charAt(i+1)+"");
                if(!difference(arr[a],arr[b])){
                    return false;
                }
            }
            return true;
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                boolean b=permute(str, l+1, r, arr);
                if(b){
                    return true;
                }
                str = swap(str,l,i);
            }
        }
        return false;
    }
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    boolean difference(String s1,String s2){
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count>1)
                    return false;
            }
        }
        if(count==0)
            return false;
        return true;
    }
 
}
