package com.facebook.imageutils;

import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* compiled from: WebpUtil */
public class f {
    private static boolean a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (str.charAt(i) != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static int b(InputStream inputStream) throws IOException {
        return ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    private static byte c(InputStream inputStream) throws IOException {
        return (byte) (inputStream.read() & 255);
    }

    private static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append((char) b);
        }
        return sb.toString();
    }

    private static int e(InputStream inputStream) throws IOException {
        return ((((byte) inputStream.read()) << 24) & -16777216) | ((((byte) inputStream.read()) << 16) & 16711680) | ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    private static short f(InputStream inputStream) throws IOException {
        return (short) (inputStream.read() & 255);
    }

    public static Pair<Integer, Integer> g(InputStream inputStream) {
        byte[] bArr = new byte[4];
        try {
            inputStream.read(bArr);
            if (!a(bArr, C0201.m82(10527))) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return null;
            }
            e(inputStream);
            inputStream.read(bArr);
            if (!a(bArr, C0201.m82(10528))) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return null;
            }
            inputStream.read(bArr);
            String d = d(bArr);
            if (C0201.m82(10529).equals(d)) {
                Pair<Integer, Integer> h = h(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                return h;
            } else if (C0201.m82(10530).equals(d)) {
                Pair<Integer, Integer> i = i(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return i;
            } else if (C0201.m82(10531).equals(d)) {
                Pair<Integer, Integer> j = j(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                return j;
            } else {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                return null;
            }
        } catch (IOException e7) {
            e7.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            throw th;
        }
    }

    private static Pair<Integer, Integer> h(InputStream inputStream) throws IOException {
        inputStream.skip(7);
        short f = f(inputStream);
        short f2 = f(inputStream);
        short f3 = f(inputStream);
        if (f == 157 && f2 == 1 && f3 == 42) {
            return new Pair<>(Integer.valueOf(b(inputStream)), Integer.valueOf(b(inputStream)));
        }
        return null;
    }

    private static Pair<Integer, Integer> i(InputStream inputStream) throws IOException {
        e(inputStream);
        if (c(inputStream) != 47) {
            return null;
        }
        int read = ((byte) inputStream.read()) & 255;
        return new Pair<>(Integer.valueOf(((((byte) inputStream.read()) & 255) | ((read & 63) << 8)) + 1), Integer.valueOf(((((((byte) inputStream.read()) & 255) & 15) << 10) | ((((byte) inputStream.read()) & 255) << 2) | ((read & 192) >> 6)) + 1));
    }

    private static Pair<Integer, Integer> j(InputStream inputStream) throws IOException {
        inputStream.skip(8);
        return new Pair<>(Integer.valueOf(k(inputStream) + 1), Integer.valueOf(k(inputStream) + 1));
    }

    private static int k(InputStream inputStream) throws IOException {
        byte c = c(inputStream);
        return ((c(inputStream) << 16) & 16711680) | ((c(inputStream) << 8) & 65280) | (c & 255);
    }
}
