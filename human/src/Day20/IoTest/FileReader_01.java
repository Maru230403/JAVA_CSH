package Day20.IoTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_01 {
	public static void main(String[] args) {
		FileReader in = null;	//객체이기에 null 사용 
		int n = 0;
		try {
			in = new FileReader("c:\\windows\\system.ini");
			while((n = in.read())!= -1){
				System.out.print((char)n);
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로에 파일이 없음." + e.getMessage());
		} catch (IOException e) {
			System.out.println("파일 입력 오류: " + e.getMessage());
		}
	}

}
