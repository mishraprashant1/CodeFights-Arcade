/*

An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.

IPv4 addresses are represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots, e.g., 172.16.254.1.

Given a string, find out if it satisfies the IPv4 address naming rules.

Example

For inputString = "172.16.254.1", the output should be
isIPv4Address(inputString) = true;

For inputString = "172.316.254.1", the output should be
isIPv4Address(inputString) = false.

316 is not in range [0, 255].

For inputString = ".254.255.0", the output should be
isIPv4Address(inputString) = false.

There is no first number.

*/

boolean isIPv4Address(String inputString) {
    return Pattern.matches("([1][0-9][0-9][.]|[2][5][0-5][.]|[2][0-4][0-9][.]|[0-9][0-9][.]|[0-9][.]){3}([1][0-9][0-9]|[2][5][0-5]|[2][0-4][0-9]|[0-9][0-9]|[0-9])",inputString);
}

boolean isIPv4Address(String inputString) {
    StringTokenizer st=new StringTokenizer(inputString,".");
    int temp=0;
    int count=0;
    int dot=0;
    for(int i=0;i<inputString.length();i++){
        char c=inputString.charAt(i);
        if(c=='.')
            dot++;
    }
    if(dot>3)
        return false;
    while(st.hasMoreTokens()){
        try{
            temp=Integer.parseInt(st.nextToken().toString());
        }
        catch(Exception e){
            return false;
        }
        count++;
        if(temp<0||temp>255)
            return false;
    }
    if(count==4){
        return true;
    }
    else{
        return false;
    }
}
