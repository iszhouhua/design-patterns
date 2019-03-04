package decorator.io;

import java.io.*;

/**
 * 大写转小写的装饰类
 */
public class LowerCaseInputStream extends FilterInputStream {

    /**
     * 调用父类的构造方法
     * @param in 输入流
     */
	public LowerCaseInputStream(InputStream in) {
		super(in);
	}

    /**
     * 重写read方法，用于读取单个字节
     * @return 字节的(0-255)内的字节值
     * @throws IOException
     */
	@Override
	public int read() throws IOException {
	    //调用父类的read()方法
		int c = super.read();
		//进行大小写转换
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}

    /**
     * 重写read方法，用于读取byte数组
     * @return 长度
     * @throws IOException
     */
	@Override
	public int read(byte[] b, int offset, int len) throws IOException {
        //调用父类的read(byte b[], int off, int len)方法
		int result = super.read(b, offset, len);
		//循环进行大小写转换
		for (int i = offset; i < offset+result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
}
