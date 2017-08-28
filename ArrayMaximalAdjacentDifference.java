/*

Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Example

For inputArray = [2, 4, 1, 0], the output should be
arrayMaximalAdjacentDifference(inputArray) = 3.

*/

int arrayMaximalAdjacentDifference(int[] inputArray) {
    int res=0;
    int temp=0;
    for(int i=0;i<inputArray.length-1;i++){
        temp=inputArray[i]>inputArray[i+1]?inputArray[i]-inputArray[i+1]:inputArray[i+1]-inputArray[i];
        if(temp>res)
            res=temp;
    }
    return res;
}
