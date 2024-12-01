import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());  // readLine() 을 사용할 경우 예외처리를
					    	  // 줘야 하지만 throws IOException 로 많이 대체합니다.
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                bw.write("*");		// System.out.print();
            }
            bw.newLine();		// System.out.println();
        }
        br.close();
        bw.flush();		// 버퍼에 남아있는 데이터를 모두 출력(정리)
        bw.close();		// 스트림을 닫아 메모리 확보
    }
}