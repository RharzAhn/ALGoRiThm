import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);								// sort = 배열 정렬
        System.out.print(arr[0] + " " + arr[N - 1]);	// 정렬 후 [0] 자리엔 제일 낮은 값이
    }													// 들어오기에 최소값
}														// 배열은 0번부터기 때문에 N이 5이면
														// *[0,1,2,3,4] 이기에 최대값은 N - 1