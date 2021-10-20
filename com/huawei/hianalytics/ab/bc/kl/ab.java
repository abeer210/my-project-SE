package com.huawei.hianalytics.ab.bc.kl;

public class ab {
    private byte[] ab = null;
    private int bc = 0;

    public ab(int i) {
        this.ab = new byte[i];
    }

    public void ab(byte[] bArr, int i) {
        if (i > 0) {
            byte[] bArr2 = this.ab;
            int length = bArr2.length;
            int i2 = this.bc;
            if (length - i2 >= i) {
                System.arraycopy(bArr, 0, bArr2, i2, i);
            } else {
                byte[] bArr3 = new byte[((bArr2.length + i) << 1)];
                System.arraycopy(bArr2, 0, bArr3, 0, i2);
                System.arraycopy(bArr, 0, bArr3, this.bc, i);
                this.ab = bArr3;
            }
            this.bc += i;
        }
    }

    public byte[] ab() {
        int i = this.bc;
        if (i <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.ab, 0, bArr, 0, i);
        return bArr;
    }

    public int bc() {
        return this.bc;
    }
}
