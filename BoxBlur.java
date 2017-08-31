/*

Last night you had to study, but decided to party instead. Now there is a black and white photo of you that is about to go viral. You cannot let this ruin your reputation, so you want to apply box blur algorithm to the photo to hide its content.

The algorithm works as follows: each pixel x in the resulting image has a value equal to the average value of the input image pixels' values from the 3 × 3 square with the center at x. All pixels at the edges are cropped.

As pixel's value is an integer, all fractions should be rounded down.

Example

For

image = [[1, 1, 1], 
         [1, 7, 1], 
         [1, 1, 1]]
the output should be boxBlur(image) = [[1]].

In the given example all boundary pixels were cropped, and the value of the pixel in the middle was obtained as (1 + 1 + 1 + 1 + 7 + 1 + 1 + 1 + 1) / 9 = 15 / 9 = ~rounded down~ = 1.

*/

int[][] boxBlur(int[][] image) {
    int res[][]=new int[image.length-2][image[0].length-2];
    int p=0,q=0;
    int sum=0;
    return res;*/
    for(int i=0;i<=image.length-3;i++){
        for(int j=2;j<image[0].length;j++){
            sum=image[i][j]+image[i][j-1]+image[i][j-2]+image[i+1][j]+image[i+1][j-1]+image[i+1][j-2]+image[i+2][j]+image[i+2][j-1]+image[i+2][j-2];
            res[p][q]=(int)sum/9;
            q++;
        }
        q=0;
        p++;
    }
    return res;
}
