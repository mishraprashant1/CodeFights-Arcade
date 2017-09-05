/*

Given a string, find the number of different characters in it.

Example

For s = "cabca", the output should be
differentSymbolsNaive(s) = 3.

There are 3 different characters a, b and c.

*/

int differentSymbolsNaive(String s) {
    ArrayList arr=new ArrayList();
    for(int i=0;i<s.length();i++)
        if(!(arr.contains(s.charAt(i))))
            arr.add(s.charAt(i));
    return arr.size();
}
