package defpackage;

import android.util.Log;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.i;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import vigqyno.C0201;

/* renamed from: oj  reason: default package */
/* compiled from: ByteBufferEncoder */
public class oj implements d<ByteBuffer> {
    /* renamed from: c */
    public boolean a(ByteBuffer byteBuffer, File file, i iVar) {
        try {
            vo.e(byteBuffer, file);
            return true;
        } catch (IOException e) {
            String r4 = C0201.m82(35428);
            if (Log.isLoggable(r4, 3)) {
                Log.d(r4, C0201.m82(35429), e);
            }
            return false;
        }
    }
}
