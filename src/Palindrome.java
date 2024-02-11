public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }

        long reserved = 0;
        long temp = x;

        while (temp != 0){
            int digit = (int) (temp % 10);
            reserved = reserved * 10 + digit;
            temp /= 10;
        }

        return (reserved == x);

    }

    public static void main(String[] args){
        Palindrome test = new Palindrome();
        int x = 121;
        int y = -121;
        System.out.println(test.isPalindrome(x));
        System.out.println(test.isPalindrome(y));

    }
}
