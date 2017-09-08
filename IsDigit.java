/*

Determine if the given character is a digit or not.

Example

For symbol = '0', the output should be
isDigit(symbol) = true;
For symbol = '-', the output should be
isDigit(symbol) = false.

*/

boolean isDigit(char symbol) {
    return Pattern.matches("[0-9]",symbol+"");
}
