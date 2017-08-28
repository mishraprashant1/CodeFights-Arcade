/*
Are Similar
Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

Given two arrays a and b, check whether they are similar.

Example

For a = [1, 2, 3] and b = [1, 2, 3], the output should be
areSimilar(a, b) = true.

The arrays are equal, no need to swap any elements.

For a = [1, 2, 3] and b = [2, 1, 3], the output should be
areSimilar(a, b) = true.

We can obtain b from a by swapping 2 and 1 in b.

For a = [1, 2, 2] and b = [2, 1, 1], the output should be
areSimilar(a, b) = false.

Any swap of any two elements either in a or in b won't make a and b equal.

*/
boolean areSimilar(int[] a, int[] b) {
    int fault=0;
    int final_count=0;
    int[] index=new int[3];
    int k=0;
    for(int i=0;i<a.length;i++){
        if(a[i]!=b[i]){
            fault++;
            index[k]=i;
            k++;
            if(fault>2){
                return false;
            }
            if(fault==2){
                boolean b1=checkValidity(a,b,index);
                if(b1==false){
                    return false;
                }
            }
        }
    }
    return true;
}
boolean checkValidity(int a[],int b[],int index[]){
    int x1=a[index[0]];
    int x2=b[index[0]];
    int y1=a[index[1]];
    int y2=b[index[1]];
    
    return x1==y2&&x2==y1;
}
