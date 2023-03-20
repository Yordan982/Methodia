package StringReverse;
public class StringReverse {
    public static void main(String[] args) {
    }
    public static String reverseString(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            start++;
            end--;
        }
        return new String(word);
    }
}