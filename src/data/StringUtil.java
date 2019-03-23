package data;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 *
 * @author Essn
 */
public class StringUtil {
    public static byte[] string2UnicodeBytes(String s) {
        try {
            return s.getBytes("UTF-16LE");
        } catch (UnsupportedEncodingException e) {

        }
        return null;
    }

    public static int hash(String s, int base) {
        int h = 7, l = s.length();
        for (int i = 0; i < l; i++) {
            h = (h * 31 + s.charAt(i)) % base;
        }
        return h;
    }

    public static String bytesCStringW(byte [] raw)
    {
        ByteBuffer buffer = ByteBuffer.wrap(raw);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        return BufferUtil.getCStringW(buffer);
    }

    public static byte[] stringToByteC(String s)
    {
        byte []raw = new byte[s.length()*2+2];
        ByteBuffer buffer = ByteBuffer.wrap(raw);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        BufferUtil.putCStringW(buffer, s);
        return raw;
    }

}
