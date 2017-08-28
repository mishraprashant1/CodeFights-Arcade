/*

Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.

Example

For statues = [6, 2, 3, 8], the output should be
makeArrayConsecutive2(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.

*/

int makeArrayConsecutive2(int[] statues) {
    TreeSet t=new TreeSet(new mycomparator());
    for (int i=0;i<statues.length;i++){
        t.add(statues[i]);
    }
    ArrayList arr=new ArrayList(t);
    Integer i1,i2;
    int d=0;
    for (int i=0;i<arr.size()-1;i++){
        i1=(Integer)arr.get(i);
        i2=(Integer)arr.get(i+1);
        d=d+(i2-i1-1);
    }
    return d;
}
class mycomparator implements Comparator{
    public int compare(Object obj1,Object obj2){
        Integer i1=(Integer)obj1;
        Integer i2=(Integer)obj2;
        if(i1<=i2){
            return -1;
        }
        else{
            return 1;
        }
    }
}
