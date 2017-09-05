/*

Given array of integers, remove each kth element from it.

Example

For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].

*/

int[] extractEachKth(int[] inputArray, int k) {
    ArrayList<Integer> arr=new ArrayList();
    for(int i=1;i<=inputArray.length;i++)
        if(!(i%k==0))
            arr.add(inputArray[i-1]);
    int res[]=new int[arr.size()];
    for(int i=0;i<arr.size();i++)
        res[i]=arr.get(i);
    return res;
}
