Given a String str, reverse the string without reversing its individual words. Words are separated by dots.

**********************************************************************************************

class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String[] words =str.split("\\.");
        StringBuilder reversedString = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            reversedString.append(words[i]);
            if(i>0){
                reversedString.append(".");
            }
        }
        return reversedString.toString();
    }
}
