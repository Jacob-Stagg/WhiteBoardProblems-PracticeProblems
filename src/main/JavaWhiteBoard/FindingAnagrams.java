public class FindingAnagrams {
    public static void main(String[] args) {
        FindingAnagrams whiteBoard = new FindingAnagrams();
        String one = "stop";
        String two = "post";

        System.out.println(whiteBoard.anagram(one, two));
    }

    public String letterSort(String letters) {
        String temp;
        boolean sorted = false;

//This is a bubble sort.
        while(!sorted) {
            sorted = true;

            for(int i = 1; i < letters.length(); i++) {
//                if (letters[i] < letters[i - 1]) {
//                    temp = letters[i];
//                    letters[i] = letters[i - 1];
//                    letters[i - 1] = temp;
//                    sorted = false;
//                }
            }
        }

        return letters;
    }

    public boolean anagram(String one, String two) {
        String first = letterSort(one);
        String second = letterSort(two);

        return first.equals(second);
    }
}
