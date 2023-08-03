package Day21.IoTest2;

import java.io.*;
public class BufferedStreamTest  {
	private static long end;

	public static void main(String[] args) throws Exception{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0; end = 0;
		
		fis = new FileInputStream("D:\\work\\새 폴더\\....jpg");
		fos = new FileOutputStream("D:\\temp\\...1.jpg");
		start = System.currentTimeMillis();
		while((data = fis.read())!= -1) {
			fos.write(data);
		}
		fos.flush();
		fis.close();
		fos.close();
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때: " + (end-start) + "ms");
		fis = new FileInputStream("D:\\work\\새 폴더\\....jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("D:\\temp\\...2.jpg");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data = bis.read())!= -1) {
			bos.write(data);
		}
	}
}
