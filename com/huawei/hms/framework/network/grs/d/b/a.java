package com.huawei.hms.framework.network.grs.d.b;

import android.content.Context;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLSocketFactory;
import vigqyno.C0201;

public class a {
    public static SSLSocketFactory a(Context context) {
        try {
            return c.a(context, C0201.m82(10583));
        } catch (IOException e) {
            throw new AssertionError(e);
        } catch (CertificateException e2) {
            throw new AssertionError(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError(e3);
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (KeyStoreException e5) {
            throw new AssertionError(e5);
        } catch (KeyManagementException e6) {
            throw new AssertionError(e6);
        }
    }
}
