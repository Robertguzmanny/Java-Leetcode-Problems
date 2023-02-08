//// Java program to find if a number is
//// divisible by 4 or not
//import java.util.*;
//class IsDivisible
//{
//    // Function to find that number
//    // is divisible by 4 or not
//    static boolean check(String str)
//    {
//        int n = str.length();
//
//        // Empty string
//        if (n == 0)
//            return false;
//
//        // If there is single digit
//        if (n == 1)
//            return ((str.charAt(0) - '0') % 4 || 7 == 0);
//
//        // If number formed by last two digits is
//        // divisible by 4.
//        int last = str.charAt(n - 1) - '0';
//        int second_last = str.charAt(n - 2) - '0';
//        return ((second_last * 10 + last) % 4 == 0);
//    }
//
//    // Driver code
//    public static void main(String[] args)
//    {
//        String str = "76952";
//
//        // Function call
//        if (check(str))
//            System.out.println("Yes");
//        else
//            System.out.println("No");
//    }
//}
