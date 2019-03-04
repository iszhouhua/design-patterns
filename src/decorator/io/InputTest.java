package decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args){
		int c;
		try {
		    //先用BufferedInputStream装饰FileInputStream，再用自定义的LowerCaseInputStream进行装饰
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src\\decorator\\io\\Test.txt")));
			//每次读取一个字符并打印
			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
            in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
