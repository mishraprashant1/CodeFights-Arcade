/*

Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
palindromeRearranging(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.

*/

boolean palindromeRearranging(String inputString) {
    HashMap<Character,Integer> map=new HashMap();
    int k=0;
    for(int i=0;i<inputString.length();i++){
        char c=inputString.charAt(i);
        if(map.containsKey(c)){
            map.put(c,map.get(c)+1);
        }
        else{
            map.put(c,1);
        }
    }
    int fault=0;
    Set s=map.keySet();
    Iterator itr=s.iterator();
    while(itr.hasNext()){
        int temp=map.get(itr.next());
        if(temp%2!=0){
            fault++;
        }
        if(fault>1){
            return false;
        }
    }
    return true;
}
