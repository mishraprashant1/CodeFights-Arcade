/*

Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees.

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].



*/

int[] sortByHeight(int[] arr) {
    ArrayList a=new ArrayList();
    for(int i=0;i<arr.length;i++){
        if(arr[i]==-1){
            continue;
        }
        else{
            a.add(arr[i]);
        }
    }
    TreeSet t=new TreeSet(a);
    ArrayList list=new ArrayList(t);
    Iterator i1=list.iterator();
    for(int i=0;i<arr.length;i++){
        if(arr[i]==-1){
            continue;
        }
        else{
            arr[i]=(Integer)i1.next();
        }
    }
    return arr;
}
