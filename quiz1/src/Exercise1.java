public class Exercise1 {

    public static boolean CompareArrays(int[] T1, int[] T2) {
        if (T1 == null || T2 == null || T1.length != T2.length || T1.length == 0 || T2.length == 0) {
            System.out.println("Wrong input params");
            return false;
        }

        for (int i = 0; i < T1.length; i++) {
            if (T1[i] <= T2[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean CompareArraysRecursive(int[] T1, int[] T2, int idx, int len) {
        if (T1 == null || T2 == null || T1.length != T2.length || T1.length == 0 || T2.length == 0) {
            System.out.println("Wrong input params");
            return false;
        }

        if (idx == len) {
            return true;
        }

        if (T1[idx] <= T2[idx]) {
            return false;
        }

        return CompareArraysRecursive(T1, T2, idx + 1, len);
    }

    public static void main(String[] args) {
        int[] T1= {4, 5, 6, 7, 8};
        int[] T2 = {3, 4, 5, 6, 7};

        boolean resultFromCompareArrays = CompareArrays(T1, T2);
        if (resultFromCompareArrays) {
            System.out.println("T1 is always greater than T2");
        } else {
            System.out.println("T1 is not always greater than T2");
        }

        boolean resultFromCompareArraysRecursive = CompareArraysRecursive(T1, T2, 0, T1.length);
        if (resultFromCompareArraysRecursive) {
            System.out.println("T1 is always greater than T2 (Recursive)");
        } else {
            System.out.println("T1 is not always greater than T2 (Recursive)");
        }
    }
}
