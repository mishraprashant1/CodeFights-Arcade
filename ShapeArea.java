/*

Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side.

*/

int shapeArea(int n) {

    int area=0;
    for (int i=0;i<(n*2)-1;i++){
        if(i%2==0){
            area=area+n;
        }else{
            area=area+n-1;
        }
    }
    return area;
}
