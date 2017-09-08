/*

Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.

Example

For product = 12, the output should be
digitsProduct(product) = 26;
For product = 19, the output should be
digitsProduct(product) = -1.

*/

int digitsProduct(int product) {
    if(product>0&&product<10)
        return product;
    if(product==0)
        return 10;
    String res="";
    boolean flag=false;
    System.out.println("Product : "+product);
    while(product!=1){
        System.out.println("Inside");
        for(int i=9;i>1;i--){
            System.out.println(i);
            if(product%i==0){
                System.out.println("Inside if");
                product=product/i;
                res=res+i;
                flag=true;
                break;
            }
        }
        if(flag)
            flag=false;
        else
            return -1;
    }
    System.out.println(res);
    if(res.length()==0)
        return -1;
    StringBuilder stb=new StringBuilder(res);
    stb.reverse();
    return Integer.parseInt(stb.toString());
}
