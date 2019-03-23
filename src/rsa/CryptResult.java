package rsa;

/**
 * Created by DuThien on 28/03/2017.
 */
public class CryptResult {
    public final long time;
    public final long sizeOfData;

    public CryptResult(long time, long sizeOfData, boolean isOK) {
        this.time = time;
        this.sizeOfData = sizeOfData;
        this.isOK = isOK;
    }

    public final boolean isOK;
}
