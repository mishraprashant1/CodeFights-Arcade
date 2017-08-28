/*

Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

*/

int commonCharacterCount(String s1, String s2) {
    ArrayList a=new ArrayList(s1.length());
    for(int i=0;i<s1.length();i++){
        a.add(s1.charAt(i));
    }
    System.out.println("String 1 : "+s1+" String 2 : "+s2);
    System.out.println(a);
    int count=0;
    System.out.println("Length s1 : "+s1.length()+" s2 : "+s1.length());
    for(int i=0;i<s2.length();i++){
        char c=s2.charAt(i);
        System.out.println("Proccessing : "+c);
        if(a.contains(c)){
            System.out.println("removing :  "+c);
            a.remove((Object)c);
            count++;
            System.out.println(a+" Count : "+count);
        }
    }
    return count;
}
