package Day21.IoTest2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SystemInOut {
	public static void main(String[] args) {
		InputStream is = System.in;
		OutputStream os = System.out;
		try {
		char ch = (char)is.read();
		os.write(ch);
		os.flush();
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
}
