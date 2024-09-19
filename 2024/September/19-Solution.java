class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String[] str2=str.split("\\.");
        Collections.reverse(Arrays.asList(str2));
        return String.join(".",str2);
    }
}