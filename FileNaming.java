/*

You are given an array of desired filenames in the order of their creation. Since two files cannot have equal names, the one which comes later will have an addition to its name in a form of (k), where k is the smallest positive integer such that the obtained name is not used yet.

Return an array of names that will be given to the files.

Example

For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be
fileNaming(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"].

*/

String[] fileNaming(String[] names) {
    String res[]=new String[names.length];
    HashMap<String,Integer> map=new HashMap<>();
    for(int i=0;i<names.length;i++)
        if(map.containsKey(names[i]))
            map.put(names[i],map.get(names[i])+1);
        else
            map.put(names[i],1);
    Set<String> unique=map.keySet();
    HashMap<String,Integer> count=new HashMap<>();
    Iterator itr=unique.iterator();
    while(itr.hasNext()){
        count.put((String)itr.next(),1);
    }
    ArrayList<String> arr=new ArrayList<>();
    for(int i=0;i<names.length;i++){
        if(!arr.contains(names[i])){
            res[i]=names[i];
            arr.add(names[i]);
            map.put(names[i],1);
        }
        else{
            
            res[i]=names[i]+"("+count.get(names[i])+")";
            while(arr.contains(res[i])){
                count.put(names[i],count.get(names[i])+1);
                res[i]=names[i]+"("+count.get(names[i])+")";
            }
            count.put(names[i],count.get(names[i])+1);
            arr.add(res[i]);
            map.put(names[i],count.get(names[i])+1);
        }
    }
    
    return res;
}
