package com.huawei.hms.maps.model;

import com.huawei.hms.maps.mco;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import vigqyno.C0201;

public abstract class UrlTileProvider implements TileProvider {
    private final int a;
    private final int b;

    public UrlTileProvider(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0089 A[SYNTHETIC, Splitter:B:35:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a3 A[SYNTHETIC, Splitter:B:40:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c0 A[SYNTHETIC, Splitter:B:48:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00da A[SYNTHETIC, Splitter:B:53:0x00da] */
    @Override // com.huawei.hms.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        Throwable th;
        String r0 = C0201.m82(4883);
        String r1 = C0201.m82(4884);
        String r2 = C0201.m82(4885);
        URL tileUrl = getTileUrl(i, i2, i3);
        if (tileUrl == null) {
            return TileProvider.NO_TILE;
        }
        try {
            inputStream = tileUrl.openStream();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    Tile tile = new Tile(this.b, this.a, byteArrayOutputStream.toByteArray());
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            mco.d(r2, r1 + e.getMessage());
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        mco.d(r2, r0 + e2.getMessage());
                    }
                    return tile;
                } catch (IOException unused) {
                    if (inputStream != null) {
                    }
                    if (byteArrayOutputStream != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                    }
                    if (byteArrayOutputStream != null) {
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                byteArrayOutputStream = null;
                if (inputStream != null) {
                }
                if (byteArrayOutputStream != null) {
                }
                return null;
            } catch (Throwable th3) {
                byteArrayOutputStream = null;
                th = th3;
                if (inputStream != null) {
                }
                if (byteArrayOutputStream != null) {
                }
                throw th;
            }
        } catch (IOException unused3) {
            inputStream = null;
            byteArrayOutputStream = null;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    mco.d(r2, r1 + e3.getMessage());
                }
            }
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e4) {
                    mco.d(r2, r0 + e4.getMessage());
                }
            }
            return null;
        } catch (Throwable th4) {
            byteArrayOutputStream = null;
            th = th4;
            inputStream = null;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    mco.d(r2, r1 + e5.getMessage());
                }
            }
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e6) {
                    mco.d(r2, r0 + e6.getMessage());
                }
            }
            throw th;
        }
    }

    public abstract URL getTileUrl(int i, int i2, int i3);
}
