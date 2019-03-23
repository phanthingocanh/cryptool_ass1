package data;

import java.lang.reflect.Array;

/**
 *
 * @author Essn
 */
public class ArrayUtil {
    public static boolean[] allocBoolean(int length, boolean value) {
        boolean[] res = new boolean[length];
        setAll(res, value);
        return res;
    }

    public static boolean and(boolean[] arr) {
        for (boolean v : arr)
            if (!v) return false;
        return true;
    }

    public static boolean or(boolean[] arr) {
        for (boolean v : arr)
            if (v) return true;
        return false;
    }

    public static boolean[] not(boolean[] arr) {
        boolean[] res = new boolean[arr.length];
        for (int i = 0; i < arr.length; ++i)
            res[i] = !arr[i];
        return res;
    }

    public static boolean xor(boolean[] arr) {
        boolean res = false;
        for (boolean v : arr)
            res ^= v;
        return res;
    }

    public static void setAll(boolean[] arr, boolean value) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = value;
    }

    public static int find(Object[] arr, Object value) {
        for (int i = 0; i < arr.length; ++i)
            if (arr[i].equals(value)) return i;
        return -1;
    }

    public static int count(boolean[] arr, boolean value) {
        int res = 0;
        for (boolean v : arr)
            if (v == value) ++res;
        return res;
    }

    public static <E> E[] allocArray(Class<E> clazz, int size) {
        @SuppressWarnings("unchecked")
        E[] arr = (E[]) Array.newInstance(clazz, size);

        return arr;
    }


    public static String[] allocString(int length, String defaultValue) {
        String[] res = new String[length];
        for (int i = 0; i < length; ++i)
            res[i] = defaultValue;
        return res;
    }

    public static <T> T[] resizeArray(Class<T> clazz, T[] source, int size) {
        @SuppressWarnings("unchecked")
        T[] res = allocArray(clazz, size);
        System.arraycopy(source, 0, res, 0, Math.min(source.length, size));
        return res;
    }

    public static <T> String[] map2String(T[] arr) {
        String[] res = new String[arr.length];
        for (int i = 0; i < res.length; ++i)
            res[i] = arr[i].toString();
        return res;
    }

    public static <T> T[] combile(Class<T> clazz, T[]... arrs) {
        int l = 0;
        for (T[] v : arrs)
            l += v.length;
        @SuppressWarnings("unchecked")
        T[] res = allocArray(clazz, l);
        int ofs = 0;
        for (T[] v : arrs) {
            System.arraycopy(v, 0, res, ofs, v.length);
            ofs += v.length;
        }
        return res;
    }

    final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
    public static String bytes2Hex(byte [] data)
    {
        String res = "";
        for (int i = 0; i< data.length; ++i)
        {
            if (i >0) res+=" ";
            int v = data[i] & 0xFF;
            res += hexArray[v >>> 4];
            res += hexArray[v & 0x0F];
        }
        return res;
    }

    public static boolean equalArray(byte []a, byte [] b)
    {
        if (a.length!= b.length) return false;
        for (int i = 0; i< a.length;++i)
            if (a[i]!= b[i]) return  false;
        return true;
    }


}
