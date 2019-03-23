package data;


import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class FileC {
    public InputStream in = null;
    public OutputStream out = null;

    public static FileC openToRead(String path) {
        FileC res = new FileC();
        try {
            res.in = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            res = null;
        }
        return res;
    }

    public static FileC openToWrite(String path) {
        FileC res = new FileC();
        try {
            res.out = new FileOutputStream(path);
        } catch (FileNotFoundException e) {
            res = null;
        }
        return res;
    }

    public void close() {
        try {
            if (in != null) {

                in.close();

                in = null;
            }
            if (out != null) {
                out.close();
                out = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean write(byte[] data) {
        return write(data, 0, data.length);
    }

    public boolean write(byte[] data, int ofs, int size) {
        if (out == null) return false;
        try {
            out.write(data, ofs, size);
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public int read(byte[] buff) {
        return read(buff, 0, buff.length);
    }

    public int read(byte[] buff, int ofs, int size) {
        if (in == null) return -1;
        try {
            return in.read(buff, ofs, size); //Đọc size byte từ inputstream lưu vào mảng buff từ index ofs
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int readInt()
    {
        byte [] b = new byte[4];
        read(b);
        ByteBuffer buff = ByteBuffer.wrap(b);
        buff.order(ByteOrder.LITTLE_ENDIAN);
        return buff.getInt();
    }

    public void writeInt(int x)
    {
        byte [] b = new byte[4];
        ByteBuffer buff = ByteBuffer.wrap(b);
        buff.order(ByteOrder.LITTLE_ENDIAN);
        buff.position(0);
        buff.putInt(x);
        write(b);
    }

    public int remain() {
        if (in == null) return -1;
        try {
            return in.available();
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }


}