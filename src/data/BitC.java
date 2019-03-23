package data;

/**
 *
 * @author Essn
 */
public class BitC {
    private final byte[] raw = new byte[1];
    private FileC f;
    private int bit_id;
    private boolean readMode;
    byte [] buff = new byte[1048576];
    private long buffc;
    int buffP;
    int rm;

    public BitC(FileC f, boolean readMode) {
        this.f = f;
        this.readMode = readMode;
        raw[0] = 0;
        bit_id = 0;
        buffP = 0;
        buffc = 0;
        if (readMode)
        {
            rm = f.remain();
        }
    }

    public static BitC openToRead(String path) {
        FileC f = FileC.openToRead(path);
        if (f != null) return new BitC(f, true);
        return null;
    }

    public static BitC openToWrite(String path) {
        FileC f = FileC.openToWrite(path);
        if (f != null) return new BitC(f, false);
        return null;
    }


    public void close() {
        if (!readMode) {
            while (bit_id > 0)
                writeBit(false);
            if (buffP >0)
                f.write(buff, 0, buffP);
        }
        f.close();
    }

    private void writeBuff(byte x)
    {
        buff[buffP] = x;
        if (buffP ==1048575)
        {
            f.write(buff);
        }
        buffP = (buffP +1)%1048576;
    }
    public void writeBit(boolean b) {
        if (b)
        raw[0] |= 1 << bit_id;
        if (bit_id == 7) {
            writeBuff(raw[0]);
            raw[0] = 0;
            bit_id = 0;
        } else
            bit_id++;
    }

    private void readBuff(byte[]x1)
    {
        if (buffP == 0)
        {
            buffc = f.read(buff);
            rm = f.remain();

        }
        x1[0] = buff[buffP];
        buffP = (buffP+1)%1048576;
    }

    public boolean readBit() {
        boolean res = false;
        if (bit_id == 0) {
            readBuff(raw);}
            res = (raw[0] & (1 << bit_id)) != 0;
        bit_id = (bit_id + 1) % 8;
        return res;
    }

    private long byteRemain()
    {
        if (rm == -1) return -1;
        if (buffP == 0) return rm;
        return (buffc-buffP) + rm;
    }

    public long remain() {
        long r = byteRemain();
        if (r == -1) return -1;
        if (bit_id == 0) return r * 8;
        else
            return r * 8 + 8 - bit_id;
    }

    public void writeInt(int x)
    {
        for (int i = 0; i< 32;++i)
        {
            writeBit((x&(1<<i))!=0);
        }
    }

    public int readInt()
    {
        int res = 0;
        for (int i = 0; i< 32;++i)
        {
            if (readBit())
            res |= 1<<i;
        }
        return res;
    }

    public void forceWriteByte(byte [] data)
    {
        f.write(data);
    }

    public int forceReadByte(byte [] buff)
    {
        int read = f.read(buff);
        rm = f.remain();
        return read;
    }
}
