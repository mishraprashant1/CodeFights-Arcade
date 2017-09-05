/*

A string is said to be beautiful if b occurs in it no more times than a; c occurs in it no more times than b; etc.

Given a string, check whether it is beautiful.

Example

For inputString = "bbbaacdafe", the output should be
isBeautifulString(inputString) = true;
For inputString = "aabbb", the output should be
isBeautifulString(inputString) = false;
For inputString = "bbc", the output should be
isBeautifulString(inputString) = false.

*/

boolean isBeautifulString(String inputString) {

    HashMap<Character,Integer> map=new HashMap<>();
    map.put('a',0);map.put('b',0);map.put('c',0);map.put('d',0);map.put('e',0);map.put('f',0);map.put('g',0);map.put('h',0);
    map.put('i',0);map.put('j',0);map.put('j',0);map.put('l',0);map.put('m',0);map.put('n',0);map.put('o',0);map.put('p',0);
    map.put('q',0);map.put('r',0);map.put('s',0);map.put('t',0);map.put('u',0);map.put('v',0);map.put('w',0);map.put('x',0);
    map.put('y',0);map.put('z',0);
    for(int i=0;i<inputString.length();i++){
        if(map.containsKey(inputString.charAt(i)))
            map.put(inputString.charAt(i),map.get(inputString.charAt(i))+1);
        else
            map.put(inputString.charAt(i),1);
    }
    System.out.println(map);
    Set<Character> set=map.keySet();
    TreeSet<Character> tree=new TreeSet<>(set);
    ArrayList<Character> arr=new ArrayList<>(tree);
    for(int i=0;i<arr.size()-1;i++){
        int a=map.get(arr.get(i));
        int b=map.get(arr.get(i+1));
        if(a<b)
            return false;
    }
    return true;
}
