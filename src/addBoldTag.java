import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String addBoldTag(String s, List<String> words) {
        final int n = s.length();
        StringBuilder sb = new StringBuilder();
        // bold[i] := true if s[i] should be bolded
        boolean[] bold = new boolean[n];

        int boldEnd = -1; // s[i:boldEnd] should be bolded
        for (int i = 0; i < n; ++i) {
            for (final String word : words)
                if (s.substring(i).startsWith(word))
                    boldEnd = Math.max(boldEnd, i + word.length());
            bold[i] = boldEnd > i;
        }

        // Construct the string with bold tags
        int i = 0;
        while (i < n)
            if (bold[i]) {
                int j = i;
                while (j < n && bold[j])
                    ++j;
                // s[i..j) should be bolded
                sb.append("<b>").append(s.substring(i, j)).append("</b>");
                i = j;
            } else {
                sb.append(s.charAt(i++));
            }

        return sb.toString();
    }

    public static void main(String[] args) {
        String test_one = "abcdef";
        String test_second = "yxz123";
        String test_three = "abcxyz123";
        // String[] list = new ArrayList<String>().toArray(new String[0]);

        List<String> words = new ArrayList<String>();

        // Adding elements in the List
        words.add("abc123");
        words.add("123");
        words.add("a");
        words.add("1");
        words.add("c");

        // Adding elements to the list.
        // Adding elements in the List

        System.out.println(addBoldTag(test_one, words));
        System.out.println(addBoldTag(test_second, words));
        System.out.println(addBoldTag(test_three, words));

    }

}
