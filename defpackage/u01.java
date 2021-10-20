package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import vigqyno.C0201;

/* renamed from: u01  reason: default package */
public final class u01 {
    private static final Logger a = Logger.getLogger(u01.class.getName());

    private u01() {
    }

    public static void a(@NullableDecl InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    a.logp(Level.WARNING, C0201.m82(20523), C0201.m82(20524), C0201.m82(20525), (Throwable) e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }
}
