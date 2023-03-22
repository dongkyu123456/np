package project.chap11;

import java.util.Arrays;

//p 418
public class J11_29 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4 };
        int[][] arr2D = { { 11, 12, 13 }, { 21, 22, 23 } };

        System.out.println("arr=" + Arrays.toString(arr));
        System.out.println("arr2D=" + Arrays.deepToString(arr2D));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7); // 추가된 배열에는 0을 반환한다
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // 지정범위의 끝은 표시하지 않는다
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

        System.out.println("arr2=" + Arrays.toString(arr2));
        System.out.println("arr3=" + Arrays.toString(arr3));
        System.out.println("arr4=" + Arrays.toString(arr4));
        System.out.println("arr5=" + Arrays.toString(arr5));
        System.out.println("arr6=" + Arrays.toString(arr6));

        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);
        System.out.println("arr7=" + Arrays.toString(arr7));

        Arrays.setAll(arr7, i -> (int) (Math.random() * 6) + 1); // 람다식
        System.out.println("arr7=" + Arrays.toString(arr7));

        for (int i : arr7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);
        }

        String[][] str2D = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };
        String[][] str2D2 = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };
        System.out.println(Arrays.equals(str2D, str2D2));
        System.out.println(Arrays.deepEquals(str2D, str2D2));

        char[] chArr = { 'A', 'D', 'C', 'B', 'E' };

        // 바이너리 서치(binary search)는 정렬된 배열에서 특정 값을 찾는 알고리즘입니다.
        // 이 알고리즘은 배열의 중간 값과 찾고자 하는 값의 크기를 비교하여 다음 탐색 위치를 결정하고, 이를 반복하여 값을 찾아냅니다.
        // 따라서 정렬을 하지 않으면 중간 값을 찾을 수 없어 제대로 사용할 수 없습니다.
        System.out.println("chArr=" + Arrays.toString(chArr));
        System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B'));
        System.out.println("sort할게요");
        Arrays.sort(chArr);
        System.out.println("chArr=" + Arrays.toString(chArr));
        System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B'));
    }
}
