public class SumOfAllSubStrings {
    public static void main(String[] args) {
        SumOfAllSubStrings whiteBoard = new SumOfAllSubStrings();
        int[] array = {1, 3, 4, 5};

        System.out.println(whiteBoard.sum(array));
    }

    //Less efficient way of completing problem.
//    public int sum(int[] array) {
//        int num = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i; j < array.length; j++) {
//                for (int k = i; k <= j; k++) {
//                    num += array[k];
//                }
//            }
//        }
//
//        return num;
//    }

    public int sum(int[] array) {
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            num += array[i] * (i + 1) * (array.length - i);
        }

        return num;
    }
}
