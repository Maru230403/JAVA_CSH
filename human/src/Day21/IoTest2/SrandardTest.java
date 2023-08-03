package Day21.IoTest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SrandardTest {
	public static void main(String[] args) {
		String msg = null;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		System.out.println("exit: Ctrl + Z");
		try {
			msg = in.readLine();
			while( msg != null) {
				System.out.println("읽기 : " + msg);
				msg = in.readLine();
			}
			in.close();
			ir.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
