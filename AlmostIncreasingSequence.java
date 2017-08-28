/*

Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Example

For sequence = [1, 3, 2, 1], the output should be
almostIncreasingSequence(sequence) = false;

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
almostIncreasingSequence(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

*/

boolean almostIncreasingSequence(int[] arr) {
    int c=0;
    int k=0;
    if(arr.length==0){
        return false;
    }
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]<arr[i+1] && k<2){
            c=i;
            continue;
        }
        else if(arr[i]>arr[i+1] && i==0 && k<2){
            k=k+1;
        }
        else if(arr[i]>arr[arr.length-1] && i==arr.length-2 && k==0){
            k=k+1;
        }
        else if(arr[i]==arr[i+1] && k<2){
            k=k+1;
        }
        else if(arr[c]<arr[i+1] && k<2){
            k=k+1;
        }
        else if(i+2<arr.length && arr[i]<arr[i+2] && k<2){
            k=k+1;
        }
        else{
            return false;
        }
    }
    return true;
}
