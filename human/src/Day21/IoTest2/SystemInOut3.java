package Day21.IoTest2;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class SystemInOut3 {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		PrintStream ps = System.out; // 콘솔로 문자열을 출력하기 위해서는 PrintStream 객체를 얻는다.
		
		byte[] datas = new byte[100];
		
		System.out.println("이름: ");
		int nameLen = is.read(datas);
		String name = new String(datas, 0, nameLen-2);
		
		System.out.println("하고 싶은말: ");
		int commLen = is.read(datas);
		String comment = new String(datas, 0, commLen-2);
		
		ps.println("입력한 이름: " + name);
		ps.println("입력한 하고 싶은말: " + comment);
		
		System.out.println("입력한 이름: " + name);
		System.out.println("입력한 하고 싶은말: " + comment);
	}

}
