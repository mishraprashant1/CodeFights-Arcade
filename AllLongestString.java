/*

Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

*/

String[] allLongestStrings(String[] arr) {
    int max=0;
    String res[]=new String[arr.length];
    ArrayList a=new ArrayList();
    int size=arr.length;
    for(int i=0;i<size;i++){
        if(arr[i].length()>max){
            max=arr[i].length();
        }
    }
    //int k=0;
    for(int i=0;i<size;i++){
        if(arr[i].length()==max){
            a.add(arr[i]);
            //res[k]=arr[i];
            //k++;
        }
    }
    System.out.println(a);
    res=(String [])a.toArray(new String[0]);
    //String abc[]={"acb","jhsd"};
    return res;
}
