package data;

import java.nio.ByteBuffer;

/**
 *
 * @author Essn
 */
public class BufferUtil {
    public static String getCString(ByteBuffer s, int length) {
        String ret = "";
        int finished = 0;
        for (int i = 0; i < length; i++) {
            int t = (s.get() + 256) % 256;
            if (t == 0) finished = 1;
            if (finished == 0) {
                ret += (char) t;
            }
        }
        return ret;
    }


    public static String getCString(ByteBuffer s) {
        String ret = "";
        int finished = 0;
        while (finished == 0) {
            int t = (s.get() + 256) % 256;
            if (t == 0) finished = 1;
            if (finished == 0) {
                ret += (char) t;
            }
        }
        return ret;
    }


    public static String getCStringW(ByteBuffer s) {
        String res = "";
        int finished = 0;
        while (finished == 0) {
            short t = s.getShort();

            if (t == 0) finished = 1;
            if (finished == 0) {
                res += (char) t;
            }
        }
        return res;
    }

    public static String getCStringW(ByteBuffer s, int length) {
        String res = "";
        int finished = 0;
        for (int i = 0; i < length / 2; i++) {

            short t = s.getShort();


            if (t == 0) finished = 1;
            if (finished == 0) {
                res += (char) t;

            }

        }
        return res;
    }


    public static void putCString(ByteBuffer bf, String s, int length) {
        int t = s.length();
        byte b;
        int t2;
        for (int i = 0; i < length; i++) {
            if (i < t) {
                t2 = s.charAt(i) & 255;
                if (t2 > 127) t2 -= 256;
                b = (byte) t2;

            } else {
                b = 0;
            }
            bf.put(b);
        }
    }

    public static void putCString(ByteBuffer bf, String s) {
        putCString(bf, s, s.length() + 1);
    }

    public static void putCStringW(ByteBuffer bf, String s, int length) {
        byte[] temp = StringUtil.string2UnicodeBytes(s);
        int l = temp.length;
        for (int i = 0; i < length; i++) {
            if (i < l) {
                bf.put(temp[i]);
            } else {
                bf.put((byte) 0);
            }
        }
    }

    public static void putCStringW(ByteBuffer bf, String s) {
        putCStringW(bf, s, s.length() * 2 + 2);
    }


    public static byte[] reduce(byte[] buff, int newlength) {
        byte[] ret = new byte[newlength];
        int i;
        for (i = 0; i < newlength; i++) ret[i] = buff[i];
        return ret;
    }

    public static String byte2String(byte [] data){
        String res = "";
        for (int i = 0; i< data.length; ++i)
            res+=data[i]+".";
        return res;
    }

}
