package Day21.IoTest2;

import java.io.*;

public class ImageCopy2 {
	public static void main(String[] args) {
		try {
			File file = new File("D:\\work\\새 폴더\\....jpg");
			FileInputStream in = new FileInputStream(file);
			FileOutputStream out = new FileOutputStream("D:\\work\\새 폴더\\....jpg");
			int data;
			System.out.println("파일 크기는:" + file.length());
			
			long begin = System.currentTimeMillis();
			
			byte[] buffer = new byte[1024*8*1024];
			//byte[] buffer = new byte[1024*8];
			
			while (true) {
				int count = in.read(buffer); // 버퍼에 읽어들인 문자개수
				if(count ==-1)	//버퍼의 마지막에 도달했는지 체크
					break;
				out.write(buffer, 0, count);
			}
			in.close();
			out.close();
			System.out.println("이미지를 복사했습니다.");
			
			long end = System.currentTimeMillis();
			System.out.println("복사 시간은 : " + (end-begin) + "ms입니다.");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
