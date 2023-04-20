class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int a = 0;
        int b = 0;

        if (arr1.length < arr2.length) {
            return -1;
        } else if (arr1.length > arr2.length) {
            return 1;
        } else {
            for (int i = 0; i < arr2.length; i++) {
                a += arr1[i];
                b += arr2[i];
            }
            return Integer.compare(a, b);
        }
    }
}