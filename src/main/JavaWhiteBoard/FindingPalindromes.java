public class FindingPalindromes {
    public static void main(String[] args) {
        FindingPalindromes whiteBoard = new FindingPalindromes();
        String word = "racecar";

        System.out.println(whiteBoard.palindrome(word));
    }

    public boolean palindrome(String word) {
        String temp = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            char letter = word.charAt(i);
            temp += letter;
        }

        return temp.equals(word);
    }
}
