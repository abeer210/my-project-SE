package com.rt2zz.reactnativecontacts;

import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.ContactsContract;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import vigqyno.C0201;

public class ContactsManager extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final String A = null;
    public static final String B = null;
    public static final String C = null;
    public static final String D = null;
    public static final String E = null;
    public static final String F = null;
    public static final String G = null;
    public static final String H = null;
    public static final String I = null;
    public static final String J = null;
    public static final String K = null;
    public static final String L = null;
    public static final String M = null;
    public static final String N = null;
    public static final String O = null;
    public static final String P = null;
    private static final String PERMISSION_AUTHORIZED = null;
    private static final String PERMISSION_DENIED = null;
    private static final String PERMISSION_READ_CONTACTS = null;
    private static final int PERMISSION_REQUEST_CODE = 0;
    public static final String Q = null;
    public static final String R = null;
    private static final int REQUEST_OPEN_CONTACT_FORM = 0;
    private static final int REQUEST_OPEN_EXISTING_CONTACT = 0;
    public static final String S = null;
    public static final String T = null;
    public static final String U = null;
    public static final String V = null;
    public static final String W = null;
    public static final String X = null;
    public static final String Y = null;
    public static final String Z = null;
    public static final String a = null;
    public static final String aA = null;
    public static final String aB = null;
    public static final String aC = null;
    public static final String aD = null;
    public static final String aE = null;
    public static final String aF = null;
    public static final String aG = null;
    public static final String aH = null;
    public static final String aI = null;
    public static final String aJ = null;
    public static final String aK = null;
    public static final String aL = null;
    public static final String aM = null;
    public static final String aN = null;
    public static final String aO = null;
    public static final String aP = null;
    public static final String aQ = null;
    public static final String aR = null;
    public static final String aS = null;
    public static final String aT = null;
    public static final String aU = null;
    public static final String aV = null;
    public static final String aW = null;
    public static final String aX = null;
    public static final String aY = null;
    public static final String aZ = null;
    public static final String aa = null;
    public static final String ab = null;
    public static final String ac = null;
    public static final String ad = null;
    public static final String ae = null;
    public static final String af = null;
    public static final String ag = null;
    public static final String ah = null;
    public static final String ai = null;
    public static final String aj = null;
    public static final String ak = null;
    public static final String al = null;
    public static final String am = null;
    public static final String an = null;
    public static final String ao = null;
    public static final String ap = null;
    public static final String aq = null;
    public static final String ar = null;
    public static final String as = null;
    public static final String at = null;
    public static final String au = null;
    public static final String av = null;
    public static final String aw = null;
    public static final String ax = null;
    public static final String ay = null;
    public static final String az = null;
    public static final String b = null;
    public static final String ba = null;
    public static final String bb = null;
    public static final String bc = null;
    public static final String bd = null;
    public static final String be = null;
    public static final String bf = null;
    public static final String bg = null;
    public static final String bh = null;
    public static final String bi = null;
    public static final String bj = null;
    public static final String bk = null;
    public static final String bl = null;
    public static final String bm = null;
    public static final String bn = null;
    public static final String bo = null;
    public static final String bp = null;
    public static final String bq = null;
    public static final String br = null;
    public static final String bs = null;
    public static final String bt = null;
    public static final String bu = null;
    public static final String bv = null;
    public static final String bw = null;
    public static final String bx = null;
    public static final String by = null;
    public static final String bz = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    private static Callback requestCallback;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    private static Callback updateContactCallback;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;

    /* access modifiers changed from: package-private */
    public class a extends AsyncTask<Void, Void, Void> {
        public final /* synthetic */ Callback a;

        public a(Callback callback) {
            this.a = callback;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            WritableArray d = new a(ContactsManager.this.getReactApplicationContext().getContentResolver()).d();
            this.a.invoke(null, d);
            return null;
        }
    }

    class b extends AsyncTask<Void, Void, Void> {
        public final /* synthetic */ Callback a;

        public b(Callback callback) {
            this.a = callback;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            Integer g = new a(ContactsManager.this.getReactApplicationContext().getContentResolver()).g();
            this.a.invoke(g);
            return null;
        }
    }

    class c extends AsyncTask<Void, Void, Void> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Callback b;

        public c(String str, Callback callback) {
            this.a = str;
            this.b = callback;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            WritableArray h = new a(ContactsManager.this.getReactApplicationContext().getContentResolver()).h(this.a);
            this.b.invoke(null, h);
            return null;
        }
    }

    class d extends AsyncTask<Void, Void, Void> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Callback b;

        public d(String str, Callback callback) {
            this.a = str;
            this.b = callback;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            WritableArray f = new a(ContactsManager.this.getReactApplicationContext().getContentResolver()).f(this.a);
            this.b.invoke(null, f);
            return null;
        }
    }

    class e extends AsyncTask<Void, Void, Void> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Callback b;

        public e(String str, Callback callback) {
            this.a = str;
            this.b = callback;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            WritableArray e = new a(ContactsManager.this.getReactApplicationContext().getContentResolver()).e(this.a);
            this.b.invoke(null, e);
            return null;
        }
    }

    class f extends AsyncTask<Void, Void, Void> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Callback b;

        public f(String str, Callback callback) {
            this.a = str;
            this.b = callback;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            String i = new a(ContactsManager.this.getReactApplicationContext().getContentResolver()).i(this.a);
            this.b.invoke(null, i);
            return null;
        }
    }

    class g extends AsyncTask<Void, Void, Void> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Callback b;

        public g(String str, Callback callback) {
            this.a = str;
            this.b = callback;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            WritableMap b2 = new a(ContactsManager.this.getReactApplicationContext().getContentResolver()).b(this.a);
            this.b.invoke(null, b2);
            return null;
        }
    }

    class h extends AsyncTask<Void, Void, Void> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Callback c;

        public h(String str, String str2, Callback callback) {
            this.a = str;
            this.b = str2;
            this.c = callback;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            Throwable th;
            FileNotFoundException e;
            FileOutputStream fileOutputStream;
            InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(ContactsManager.this.getReactApplicationContext().getContentResolver(), ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(this.a)));
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(this.b);
                try {
                    BitmapFactory.decodeStream(openContactPhotoInputStream).compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    this.c.invoke(null, Boolean.TRUE);
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    try {
                        this.c.invoke(e.toString());
                        fileOutputStream.close();
                        openContactPhotoInputStream.close();
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream;
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        throw th;
                    }
                }
            } catch (FileNotFoundException e5) {
                e = e5;
                fileOutputStream = null;
                this.c.invoke(e.toString());
                fileOutputStream.close();
                openContactPhotoInputStream.close();
                return null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2.close();
                throw th;
            }
            try {
                openContactPhotoInputStream.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            return null;
        }
    }

    static {
        C0201.m83(ContactsManager.class, 3);
    }

    public ContactsManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
    }

    private void getAllContacts(Callback callback) {
        new a(callback).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    private Bitmap getThumbnailBitmap(String str) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile != null) {
            return decodeFile;
        }
        try {
            InputStream open = getReactApplicationContext().getAssets().open(str);
            decodeFile = BitmapFactory.decodeStream(open);
            open.close();
            return decodeFile;
        } catch (IOException e2) {
            e2.printStackTrace();
            return decodeFile;
        }
    }

    private String getValueFromKey(ReadableMap readableMap, String str) {
        return readableMap.hasKey(str) ? readableMap.getString(str) : C0201.m82(1213);
    }

    private String isPermissionGranted() {
        return getReactApplicationContext().checkCallingOrSelfPermission(C0201.m82(1214)) == 0 ? C0201.m82(1215) : C0201.m82(1216);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    private int mapStringToEmailType(String str) {
        char c2;
        int hashCode = str.hashCode();
        if (hashCode != -1068855134) {
            if (hashCode != 3208415) {
                if (hashCode == 3655441 && str.equals(C0201.m82(1217))) {
                    c2 = 1;
                    if (c2 != 0) {
                        return 1;
                    }
                    if (c2 != 1) {
                        return c2 != 2 ? 0 : 4;
                    }
                    return 2;
                }
            } else if (str.equals(C0201.m82(1218))) {
                c2 = 0;
                if (c2 != 0) {
                }
            }
        } else if (str.equals(C0201.m82(1219))) {
            c2 = 2;
            if (c2 != 0) {
            }
        }
        c2 = 65535;
        if (c2 != 0) {
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private int mapStringToPhoneType(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1068855134:
                if (str.equals(C0201.m82(1228))) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -557528811:
                if (str.equals(C0201.m82(1227))) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -487750564:
                if (str.equals(C0201.m82(1226))) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -176627312:
                if (str.equals(C0201.m82(1225))) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 3208415:
                if (str.equals(C0201.m82(1224))) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3343801:
                if (str.equals(C0201.m82(1223))) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3655441:
                if (str.equals(C0201.m82(1222))) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 33287566:
                if (str.equals(C0201.m82(1221))) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 106426307:
                if (str.equals(C0201.m82(1220))) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return 1;
            case 1:
                return 3;
            case 2:
                return 2;
            case 3:
                return 12;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 18;
            case '\b':
                return 17;
            default:
                return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    private int mapStringToPostalAddressType(String str) {
        char c2;
        int hashCode = str.hashCode();
        if (hashCode != 3208415) {
            if (hashCode == 3655441 && str.equals(C0201.m82(1229))) {
                c2 = 1;
                if (c2 != 0) {
                    return c2 != 1 ? 0 : 2;
                }
                return 1;
            }
        } else if (str.equals(C0201.m82(1230))) {
            c2 = 0;
            if (c2 != 0) {
            }
        }
        c2 = 65535;
        if (c2 != 0) {
        }
    }

    public static void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        Callback callback = requestCallback;
        if (callback != null) {
            String r2 = C0201.m82(1231);
            if (i2 != 888) {
                callback.invoke(null, r2);
                return;
            }
            Hashtable hashtable = new Hashtable();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                hashtable.put(strArr[i3], Boolean.valueOf(iArr[i3] == 0));
            }
            String r9 = C0201.m82(1232);
            if (!hashtable.containsKey(r9) || !((Boolean) hashtable.get(r9)).booleanValue()) {
                requestCallback.invoke(null, r2);
            } else {
                requestCallback.invoke(null, C0201.m82(1233));
            }
            requestCallback = null;
        }
    }

    private void requestReadContactsPermission(Callback callback) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(null, C0201.m82(1234));
            return;
        }
        String isPermissionGranted = isPermissionGranted();
        String r6 = C0201.m82(1235);
        if (isPermissionGranted.equals(r6)) {
            callback.invoke(null, r6);
            return;
        }
        requestCallback = callback;
        androidx.core.app.a.o(currentActivity, new String[]{C0201.m82(1236)}, 888);
    }

    @ReactMethod
    public void addContact(ReadableMap readableMap, Callback callback) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer[] numArr;
        String[] strArr;
        int i2;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        int i3;
        int i4;
        String[] strArr5;
        Integer[] numArr2;
        int i5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        Integer[] numArr3;
        int i6;
        String str5;
        String[] strArr9;
        String[] strArr10;
        int i7;
        ContactsManager contactsManager;
        Callback callback2;
        Exception e2;
        if (readableMap == null) {
            callback.invoke(d);
            return;
        }
        String str6 = f;
        String string = readableMap.hasKey(str6) ? readableMap.getString(str6) : null;
        String str7 = ai;
        String string2 = readableMap.hasKey(str7) ? readableMap.getString(str7) : null;
        String str8 = aQ;
        String string3 = readableMap.hasKey(str8) ? readableMap.getString(str8) : null;
        String str9 = aN;
        String string4 = readableMap.hasKey(str9) ? readableMap.getString(str9) : null;
        String str10 = ae;
        String string5 = readableMap.hasKey(str10) ? readableMap.getString(str10) : null;
        String str11 = N;
        String string6 = readableMap.hasKey(str11) ? readableMap.getString(str11) : null;
        String str12 = k;
        String string7 = readableMap.hasKey(str12) ? readableMap.getString(str12) : null;
        String str13 = bj;
        String string8 = readableMap.hasKey(str13) ? readableMap.getString(str13) : null;
        String str14 = ah;
        String string9 = readableMap.hasKey(str14) ? readableMap.getString(str14) : null;
        String str15 = by;
        String string10 = readableMap.hasKey(str15) ? readableMap.getString(str15) : null;
        String str16 = aa;
        ReadableArray array = readableMap.hasKey(str16) ? readableMap.getArray(str16) : null;
        String str17 = bt;
        if (array != null) {
            int size = array.size();
            strArr2 = new String[size];
            str4 = string10;
            numArr = new Integer[size];
            str3 = string8;
            strArr = new String[size];
            str2 = string7;
            int i8 = 0;
            while (i8 < size) {
                strArr2[i8] = array.getMap(i8).getString(aW);
                String string11 = array.getMap(i8).getString(str17);
                numArr[i8] = Integer.valueOf(mapStringToPhoneType(string11));
                strArr[i8] = string11;
                i8++;
                size = size;
                string6 = string6;
            }
            str = string6;
            i2 = size;
        } else {
            str = string6;
            str2 = string7;
            str3 = string8;
            str4 = string10;
            strArr2 = null;
            i2 = 0;
            strArr = null;
            numArr = null;
        }
        ReadableArray array2 = readableMap.hasKey(aj) ? readableMap.getArray(P) : null;
        if (array2 != null) {
            int size2 = array2.size();
            strArr4 = new String[size2];
            strArr3 = strArr;
            int i9 = 0;
            while (i9 < size2) {
                strArr4[i9] = array2.getMap(i9).getString(x);
                i9++;
                size2 = size2;
                array2 = array2;
            }
            i3 = size2;
        } else {
            strArr3 = strArr;
            i3 = 0;
            strArr4 = null;
        }
        ReadableArray array3 = readableMap.hasKey(t) ? readableMap.getArray(o) : null;
        if (array3 != null) {
            int size3 = array3.size();
            strArr6 = strArr4;
            strArr8 = new String[size3];
            i5 = i3;
            numArr3 = new Integer[size3];
            numArr2 = numArr;
            strArr7 = new String[size3];
            strArr5 = strArr2;
            int i10 = 0;
            while (i10 < size3) {
                strArr8[i10] = array3.getMap(i10).getString(bf);
                String string12 = array3.getMap(i10).getString(str17);
                numArr3[i10] = Integer.valueOf(mapStringToEmailType(string12));
                strArr7[i10] = string12;
                i10++;
                size3 = size3;
                i2 = i2;
            }
            i4 = i2;
            i6 = size3;
        } else {
            strArr5 = strArr2;
            i4 = i2;
            i5 = i3;
            strArr6 = strArr4;
            numArr2 = numArr;
            i6 = 0;
            numArr3 = null;
            strArr8 = null;
            strArr7 = null;
        }
        ReadableArray array4 = readableMap.hasKey(n) ? readableMap.getArray(E) : null;
        if (array4 != null) {
            int size4 = array4.size();
            strArr9 = new String[size4];
            str5 = str17;
            strArr10 = new String[size4];
            int i11 = 0;
            while (i11 < size4) {
                strArr9[i11] = array4.getMap(i11).getString(c);
                strArr10[i11] = array4.getMap(i11).getString(r);
                i11++;
                size4 = size4;
            }
            i7 = size4;
        } else {
            str5 = str17;
            i7 = 0;
            strArr10 = null;
            strArr9 = null;
        }
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue(I, null).withValue(aI, null).build());
        ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        String str18 = bm;
        ContentProviderOperation.Builder withValueBackReference = newInsert.withValueBackReference(str18, 0);
        String str19 = ag;
        ContentProviderOperation.Builder withValue = withValueBackReference.withValue(str19, Z);
        String str20 = a;
        ContentProviderOperation.Builder withValue2 = withValue.withValue(str20, string);
        String str21 = bn;
        ContentProviderOperation.Builder withValue3 = withValue2.withValue(str21, string2);
        String str22 = aL;
        ContentProviderOperation.Builder withValue4 = withValue3.withValue(str22, string3);
        String str23 = aV;
        arrayList.add(withValue4.withValue(str23, string4).withValue(Y, string5).build());
        ContentProviderOperation.Builder withValue5 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(str18, 0).withValue(str19, T);
        String str24 = q;
        arrayList.add(withValue5.withValue(str24, string9).build());
        ContentProviderOperation.Builder withValue6 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(str18, 0).withValue(str19, be).withValue(str24, str).withValue(str23, str2).withValue(str21, str3);
        arrayList.add(withValue6.build());
        withValue6.withYieldAllowed(true);
        int i12 = 0;
        for (int i13 = i4; i12 < i13; i13 = i13) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(str18, 0).withValue(str19, g).withValue(str24, strArr5[i12]).withValue(str20, numArr2[i12]).withValue(str22, strArr3[i12]).build());
            i12++;
        }
        int i14 = 0;
        for (int i15 = i5; i14 < i15; i15 = i15) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(str18, 0).withValue(str19, F).withValue(str24, strArr6[i14]).build());
            i14++;
        }
        for (int i16 = 0; i16 < i6; i16++) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(str18, 0).withValue(str19, am).withValue(str24, strArr8[i16]).withValue(str20, numArr3[i16]).withValue(str22, strArr7[i16]).build());
        }
        if (str4 == null || str4.isEmpty()) {
            contactsManager = this;
        } else {
            contactsManager = this;
            Bitmap thumbnailBitmap = contactsManager.getThumbnailBitmap(str4);
            if (thumbnailBitmap != null) {
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(str18, 0).withValue(str19, bi).withValue(bv, contactsManager.toByteArray(thumbnailBitmap)).build());
            }
        }
        ReadableArray array5 = readableMap.hasKey(aK) ? readableMap.getArray(bz) : null;
        if (array5 != null) {
            int i17 = 0;
            while (i17 < array5.size()) {
                ReadableMap map = array5.getMap(i17);
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(str18, 0).withValue(str19, p).withValue(str20, Integer.valueOf(contactsManager.mapStringToPostalAddressType(map.getString(str5)))).withValue(str22, map.getString(str5)).withValue(str23, map.getString(C)).withValue(aU, map.getString(W)).withValue(av, map.getString(al)).withValue(aC, map.getString(aX)).withValue(ak, map.getString(aF)).build());
                i17++;
                contactsManager = this;
            }
        }
        for (int i18 = 0; i18 < i7; i18++) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(str18, 0).withValue(str19, V).withValue(str24, strArr9[i18]).withValue(str20, 1).withValue(str21, -1).withValue(bu, strArr10[i18]).build());
        }
        try {
            ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
            ContentProviderResult[] applyBatch = contentResolver.applyBatch(ay, arrayList);
            if (applyBatch != null && applyBatch.length > 0) {
                callback2 = callback;
                try {
                    callback2.invoke(null, new a(contentResolver).c(String.valueOf(ContentUris.parseId(applyBatch[0].uri))));
                } catch (Exception e3) {
                    e2 = e3;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            callback2 = callback;
            callback2.invoke(e2.toString());
        }
    }

    @ReactMethod
    public void checkPermission(Callback callback) {
        callback.invoke(null, isPermissionGranted());
    }

    @ReactMethod
    public void deleteContact(ReadableMap readableMap, Callback callback) {
        String r0 = C0201.m82(1237);
        String string = readableMap.hasKey(r0) ? readableMap.getString(r0) : null;
        try {
            if (getReactApplicationContext().getContentResolver().delete(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, string), null, null) > 0) {
                callback.invoke(null, string);
            } else {
                callback.invoke(null, null);
            }
        } catch (Exception e2) {
            callback.invoke(e2.toString(), null);
        }
    }

    @ReactMethod
    public void editExistingContact(ReadableMap readableMap, Callback callback) {
        Integer[] numArr;
        int i2;
        String r0 = C0201.m82(1238);
        String r1 = C0201.m82(1239);
        String[] strArr = null;
        try {
            Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, readableMap.hasKey(r1) ? readableMap.getString(r1) : null);
            ReadableArray array = readableMap.hasKey(r0) ? readableMap.getArray(r0) : null;
            if (array != null) {
                i2 = array.size();
                strArr = new String[i2];
                numArr = new Integer[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    strArr[i3] = array.getMap(i3).getString(C0201.m82(1240));
                    numArr[i3] = Integer.valueOf(mapStringToPhoneType(array.getMap(i3).getString(C0201.m82(1241))));
                }
            } else {
                numArr = null;
                i2 = 0;
            }
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            for (int i4 = 0; i4 < i2; i4++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0201.m82(1242), C0201.m82(1243));
                contentValues.put(C0201.m82(1244), numArr[i4]);
                contentValues.put(C0201.m82(1245), strArr[i4]);
                arrayList.add(contentValues);
            }
            Intent intent = new Intent(C0201.m82(1246));
            intent.setDataAndType(withAppendedPath, C0201.m82(1247));
            intent.putExtra(C0201.m82(1248), true);
            intent.putParcelableArrayListExtra(C0201.m82(1249), arrayList);
            updateContactCallback = callback;
            getReactApplicationContext().startActivityForResult(intent, 52942, Bundle.EMPTY);
        } catch (Exception e2) {
            callback.invoke(e2.toString());
        }
    }

    @ReactMethod
    public void getAll(Callback callback) {
        getAllContacts(callback);
    }

    @ReactMethod
    public void getAllWithoutPhotos(Callback callback) {
        getAllContacts(callback);
    }

    @ReactMethod
    public void getContactById(String str, Callback callback) {
        new g(str, callback).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getContactsByEmailAddress(String str, Callback callback) {
        new e(str, callback).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getContactsByPhoneNumber(String str, Callback callback) {
        new d(str, callback).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getContactsMatchingString(String str, Callback callback) {
        new c(str, callback).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getCount(Callback callback) {
        new b(callback).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(1250);
    }

    @ReactMethod
    public void getPhotoForId(String str, Callback callback) {
        new f(str, callback).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void iosEnableNotesUsage(boolean z2) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i2, int i3, Intent intent) {
        Callback callback;
        if ((i2 != 52941 && i2 != 52942) || (callback = updateContactCallback) == null) {
            return;
        }
        if (i3 != -1) {
            callback.invoke(null, null);
            updateContactCallback = null;
        } else if (intent == null) {
            callback.invoke(C0201.m82(1251), null);
            updateContactCallback = null;
        } else {
            try {
                Uri data = intent.getData();
                if (data == null) {
                    updateContactCallback.invoke(C0201.m82(1252), null);
                    updateContactCallback = null;
                    return;
                }
                updateContactCallback.invoke(null, new a(getReactApplicationContext().getContentResolver()).b(data.getLastPathSegment()));
                updateContactCallback = null;
            } catch (Exception e2) {
                updateContactCallback.invoke(e2.getMessage(), null);
            }
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void openContactForm(ReadableMap readableMap, Callback callback) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer[] numArr;
        String[] strArr;
        int i2;
        String[] strArr2;
        String[] strArr3;
        int i3;
        int i4;
        String[] strArr4;
        int i5;
        Integer[] numArr2;
        String[] strArr5;
        int i6;
        Integer[] numArr3;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i7;
        Integer[] numArr4;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        int i8;
        String[] strArr9;
        String[] strArr10;
        String[] strArr11;
        String[] strArr12;
        String[] strArr13;
        String[] strArr14;
        int i9;
        String r2 = C0201.m82(1253);
        String string = readableMap.hasKey(r2) ? readableMap.getString(r2) : null;
        String r3 = C0201.m82(1254);
        String string2 = readableMap.hasKey(r3) ? readableMap.getString(r3) : null;
        String r5 = C0201.m82(1255);
        String string3 = readableMap.hasKey(r5) ? readableMap.getString(r5) : null;
        String r6 = C0201.m82(1256);
        String string4 = readableMap.hasKey(r6) ? readableMap.getString(r6) : null;
        String r7 = C0201.m82(1257);
        String string5 = readableMap.hasKey(r7) ? readableMap.getString(r7) : null;
        String r8 = C0201.m82(1258);
        String string6 = readableMap.hasKey(r8) ? readableMap.getString(r8) : null;
        String r9 = C0201.m82(1259);
        String string7 = readableMap.hasKey(r9) ? readableMap.getString(r9) : null;
        String r10 = C0201.m82(1260);
        String string8 = readableMap.hasKey(r10) ? readableMap.getString(r10) : null;
        String r11 = C0201.m82(1261);
        String string9 = readableMap.hasKey(r11) ? readableMap.getString(r11) : null;
        String r12 = C0201.m82(1262);
        String string10 = readableMap.hasKey(r12) ? readableMap.getString(r12) : null;
        String r13 = C0201.m82(1263);
        String string11 = readableMap.hasKey(r13) ? readableMap.getString(r13) : null;
        String r14 = C0201.m82(1264);
        ReadableArray array = readableMap.hasKey(r14) ? readableMap.getArray(r14) : null;
        String r15 = C0201.m82(1265);
        if (array != null) {
            i2 = array.size();
            str4 = string3;
            strArr = new String[i2];
            str3 = string11;
            numArr = new Integer[i2];
            str2 = string10;
            int i10 = 0;
            while (i10 < i2) {
                strArr[i10] = array.getMap(i10).getString(C0201.m82(1266));
                numArr[i10] = Integer.valueOf(mapStringToPhoneType(array.getMap(i10).getString(r15)));
                i10++;
                i2 = i2;
                string9 = string9;
            }
            str = string9;
        } else {
            str4 = string3;
            str = string9;
            str2 = string10;
            str3 = string11;
            i2 = 0;
            strArr = null;
            numArr = null;
        }
        String r112 = C0201.m82(1267);
        ReadableArray array2 = readableMap.hasKey(r112) ? readableMap.getArray(r112) : null;
        if (array2 != null) {
            i3 = array2.size();
            strArr3 = new String[i3];
            strArr2 = strArr;
            int i11 = 0;
            while (i11 < i3) {
                strArr3[i11] = array2.getMap(i11).getString(C0201.m82(1268));
                i11++;
                i3 = i3;
                array2 = array2;
            }
        } else {
            strArr2 = strArr;
            i3 = 0;
            strArr3 = null;
        }
        ReadableArray array3 = readableMap.hasKey(C0201.m82(1269)) ? readableMap.getArray(C0201.m82(1270)) : null;
        if (array3 != null) {
            i6 = array3.size();
            numArr2 = numArr;
            strArr5 = new String[i6];
            i5 = i2;
            numArr3 = new Integer[i6];
            strArr4 = strArr3;
            int i12 = 0;
            while (i12 < i6) {
                strArr5[i12] = array3.getMap(i12).getString(C0201.m82(1271));
                numArr3[i12] = Integer.valueOf(mapStringToEmailType(array3.getMap(i12).getString(r15)));
                i12++;
                i6 = i6;
                i3 = i3;
            }
            i4 = i3;
        } else {
            i5 = i2;
            i4 = i3;
            numArr2 = numArr;
            strArr4 = strArr3;
            numArr3 = null;
            i6 = 0;
            strArr5 = null;
        }
        ReadableArray array4 = readableMap.hasKey(C0201.m82(1272)) ? readableMap.getArray(C0201.m82(1273)) : null;
        if (array4 != null) {
            i8 = array4.size();
            strArr7 = new String[i8];
            strArr6 = strArr5;
            strArr8 = new String[i8];
            numArr4 = numArr3;
            String[] strArr15 = new String[i8];
            i7 = i6;
            strArr9 = new String[i8];
            str10 = string8;
            strArr10 = new String[i8];
            str9 = string7;
            strArr11 = new String[i8];
            str8 = string6;
            strArr12 = new String[i8];
            str7 = string5;
            Integer[] numArr5 = new Integer[i8];
            str6 = string2;
            int i13 = 0;
            while (i13 < i8) {
                strArr7[i13] = array4.getMap(i13).getString(C0201.m82(1274));
                strArr8[i13] = array4.getMap(i13).getString(C0201.m82(1275));
                strArr15[i13] = array4.getMap(i13).getString(C0201.m82(1276));
                strArr9[i13] = array4.getMap(i13).getString(C0201.m82(1277));
                strArr10[i13] = array4.getMap(i13).getString(C0201.m82(1278));
                strArr11[i13] = array4.getMap(i13).getString(C0201.m82(1279));
                strArr12[i13] = array4.getMap(i13).getString(C0201.m82(1280));
                numArr5[i13] = Integer.valueOf(mapStringToPostalAddressType(array4.getMap(i13).getString(r15)));
                i13++;
                i8 = i8;
                string4 = string4;
            }
            str5 = string4;
        } else {
            str6 = string2;
            numArr4 = numArr3;
            str5 = string4;
            str7 = string5;
            str8 = string6;
            str9 = string7;
            str10 = string8;
            i7 = i6;
            strArr6 = strArr5;
            strArr12 = null;
            strArr11 = null;
            strArr10 = null;
            strArr9 = null;
            i8 = 0;
            strArr8 = null;
            strArr7 = null;
        }
        ReadableArray array5 = readableMap.hasKey(C0201.m82(1281)) ? readableMap.getArray(C0201.m82(1282)) : null;
        if (array5 != null) {
            i9 = array5.size();
            strArr14 = new String[i9];
            String[] strArr16 = new String[i9];
            for (int i14 = 0; i14 < i9; i14++) {
                strArr14[i14] = array5.getMap(i14).getString(C0201.m82(1283));
                strArr16[i14] = array5.getMap(i14).getString(C0201.m82(1284));
            }
            strArr13 = strArr16;
        } else {
            i9 = 0;
            strArr14 = null;
            strArr13 = null;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        ContentValues contentValues = new ContentValues();
        String r62 = C0201.m82(1285);
        contentValues.put(r62, C0201.m82(1286));
        String r72 = C0201.m82(1287);
        contentValues.put(r72, string);
        contentValues.put(C0201.m82(1288), str5);
        String r22 = C0201.m82(1289);
        contentValues.put(r22, str6);
        String r152 = C0201.m82(1290);
        contentValues.put(r152, str7);
        contentValues.put(C0201.m82(1291), str8);
        arrayList.add(contentValues);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(r62, C0201.m82(1292));
        String r4 = C0201.m82(1293);
        contentValues2.put(r4, str9);
        contentValues2.put(r152, str10);
        contentValues2.put(r22, str);
        arrayList.add(contentValues2);
        int i15 = 0;
        for (int i16 = i4; i15 < i16; i16 = i16) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put(r62, C0201.m82(1294));
            contentValues3.put(r4, strArr4[i15]);
            arrayList.add(contentValues3);
            i15++;
            r22 = r22;
        }
        int i17 = 0;
        for (int i18 = i7; i17 < i18; i18 = i18) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put(r62, C0201.m82(1295));
            contentValues4.put(r72, numArr4[i17]);
            contentValues4.put(r4, strArr6[i17]);
            arrayList.add(contentValues4);
            i17++;
        }
        int i19 = 0;
        for (int i20 = i5; i19 < i20; i20 = i20) {
            ContentValues contentValues5 = new ContentValues();
            contentValues5.put(r62, C0201.m82(1296));
            contentValues5.put(r72, numArr2[i19]);
            contentValues5.put(r4, strArr2[i19]);
            arrayList.add(contentValues5);
            i19++;
        }
        int i21 = 0;
        while (i21 < i8) {
            ContentValues contentValues6 = new ContentValues();
            contentValues6.put(r62, C0201.m82(1297));
            contentValues6.put(r152, strArr7[i21]);
            contentValues6.put(C0201.m82(1298), strArr8[i21]);
            contentValues6.put(C0201.m82(1299), strArr9[i21]);
            contentValues6.put(C0201.m82(1300), strArr11[i21]);
            contentValues6.put(C0201.m82(1301), strArr10[i21]);
            contentValues6.put(r4, strArr12[i21]);
            arrayList.add(contentValues6);
            i21++;
            i8 = i8;
        }
        for (int i22 = 0; i22 < i9; i22++) {
            ContentValues contentValues7 = new ContentValues();
            contentValues7.put(r62, C0201.m82(1302));
            contentValues7.put(r4, strArr14[i22]);
            contentValues7.put(r72, (Integer) 1);
            contentValues7.put(r22, (Integer) -1);
            contentValues7.put(C0201.m82(1303), strArr13[i22]);
            arrayList.add(contentValues7);
        }
        if (str2 != null) {
            ContentValues contentValues8 = new ContentValues();
            contentValues8.put(r62, C0201.m82(1304));
            contentValues8.put(r4, str2);
            arrayList.add(contentValues8);
        }
        if (str3 != null && !str3.isEmpty()) {
            Bitmap thumbnailBitmap = getThumbnailBitmap(str3);
            if (thumbnailBitmap != null) {
                ContentValues contentValues9 = new ContentValues();
                contentValues9.put(C0201.m82(1305), (Integer) 0);
                contentValues9.put(C0201.m82(1306), (Integer) 1);
                contentValues9.put(C0201.m82(1307), toByteArray(thumbnailBitmap));
                contentValues9.put(r62, C0201.m82(1308));
                arrayList.add(contentValues9);
            }
        }
        Intent intent = new Intent(C0201.m82(1309), ContactsContract.Contacts.CONTENT_URI);
        intent.putExtra(C0201.m82(1310), str4);
        intent.putExtra(C0201.m82(1311), true);
        intent.putParcelableArrayListExtra(C0201.m82(1312), arrayList);
        updateContactCallback = callback;
        getReactApplicationContext().startActivityForResult(intent, 52941, Bundle.EMPTY);
    }

    @ReactMethod
    public void openExistingContact(ReadableMap readableMap, Callback callback) {
        String r0 = C0201.m82(1313);
        try {
            Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, readableMap.hasKey(r0) ? readableMap.getString(r0) : null);
            Intent intent = new Intent(C0201.m82(1314));
            intent.setDataAndType(withAppendedPath, C0201.m82(1315));
            intent.putExtra(C0201.m82(1316), true);
            updateContactCallback = callback;
            getReactApplicationContext().startActivityForResult(intent, 52942, Bundle.EMPTY);
        } catch (Exception e2) {
            callback.invoke(e2.toString());
        }
    }

    @ReactMethod
    public void requestPermission(Callback callback) {
        requestReadContactsPermission(callback);
    }

    public byte[] toByteArray(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    @ReactMethod
    public void updateContact(ReadableMap readableMap, Callback callback) {
        String str;
        ReadableArray readableArray;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Integer[] numArr;
        String[] strArr;
        int i2;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        int i3;
        ReadableArray readableArray2;
        String[] strArr6;
        Integer[] numArr2;
        int i4;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        Integer[] numArr3;
        int i5;
        String str8;
        String str9;
        String str10;
        String str11;
        int i6;
        int i7;
        String[] strArr11;
        Integer[] numArr4;
        String[] strArr12;
        String[] strArr13;
        String[] strArr14;
        Integer[] numArr5;
        String[] strArr15;
        String[] strArr16;
        String[] strArr17;
        String[] strArr18;
        int i8;
        ReadableArray readableArray3;
        String[] strArr19;
        String[] strArr20;
        String[] strArr21;
        int i9;
        String str12;
        String str13;
        String[] strArr22;
        Callback callback2;
        Exception e2;
        Bitmap thumbnailBitmap;
        int i10;
        String[] strArr23;
        ContentProviderOperation.Builder builder;
        String str14 = h;
        String string = readableMap.hasKey(str14) ? readableMap.getString(str14) : null;
        String str15 = aO;
        String string2 = readableMap.hasKey(str15) ? readableMap.getString(str15) : null;
        if (string2 == null || string == null) {
            callback.invoke(A);
            return;
        }
        String str16 = i;
        String string3 = readableMap.hasKey(str16) ? readableMap.getString(str16) : null;
        String str17 = ad;
        String string4 = readableMap.hasKey(str17) ? readableMap.getString(str17) : null;
        String str18 = aP;
        String string5 = readableMap.hasKey(str18) ? readableMap.getString(str18) : null;
        String str19 = an;
        String string6 = readableMap.hasKey(str19) ? readableMap.getString(str19) : null;
        String str20 = ab;
        String string7 = readableMap.hasKey(str20) ? readableMap.getString(str20) : null;
        String str21 = M;
        String string8 = readableMap.hasKey(str21) ? readableMap.getString(str21) : null;
        String string9 = readableMap.hasKey(aS) ? readableMap.getString(y) : null;
        String string10 = readableMap.hasKey(J) ? readableMap.getString(ar) : null;
        String string11 = readableMap.hasKey(R) ? readableMap.getString(af) : null;
        String string12 = readableMap.hasKey(aM) ? readableMap.getString(ac) : null;
        ReadableArray array = readableMap.hasKey(aR) ? readableMap.getArray(az) : null;
        String str22 = bw;
        String str23 = K;
        if (array != null) {
            str7 = string11;
            i2 = array.size();
            str6 = string2;
            strArr2 = new String[i2];
            str5 = string10;
            numArr = new Integer[i2];
            str4 = string9;
            strArr = new String[i2];
            str3 = string8;
            String[] strArr24 = new String[i2];
            str2 = string7;
            int i11 = 0;
            while (i11 < i2) {
                ReadableMap map = array.getMap(i11);
                String string13 = map.getString(bb);
                String string14 = map.getString(str22);
                String string15 = map.hasKey(str23) ? map.getString(str23) : null;
                strArr2[i11] = string13;
                numArr[i11] = Integer.valueOf(mapStringToPhoneType(string14));
                strArr[i11] = string14;
                strArr24[i11] = string15;
                i11++;
                i2 = i2;
                array = array;
                string6 = string6;
            }
            readableArray = array;
            str = string6;
        } else {
            str6 = string2;
            str7 = string11;
            readableArray = array;
            str = string6;
            str2 = string7;
            str3 = string8;
            str4 = string9;
            str5 = string10;
            strArr2 = null;
            i2 = 0;
            strArr = null;
            numArr = null;
        }
        ReadableArray array2 = readableMap.hasKey(bc) ? readableMap.getArray(X) : null;
        if (array2 != null) {
            int size = array2.size();
            strArr5 = new String[size];
            strArr4 = new String[size];
            strArr3 = strArr;
            int i12 = 0;
            while (i12 < size) {
                ReadableMap map2 = array2.getMap(i12);
                strArr5[i12] = map2.getString(s);
                strArr4[i12] = map2.hasKey(str23) ? map2.getString(str23) : null;
                i12++;
                size = size;
                array2 = array2;
            }
            i3 = size;
        } else {
            strArr3 = strArr;
            i3 = 0;
            strArr5 = null;
            strArr4 = null;
        }
        ReadableArray array3 = readableMap.hasKey(D) ? readableMap.getArray(bl) : null;
        if (array3 != null) {
            int size2 = array3.size();
            strArr8 = strArr5;
            strArr10 = new String[size2];
            strArr7 = strArr4;
            String[] strArr25 = new String[size2];
            i4 = i3;
            numArr3 = new Integer[size2];
            numArr2 = numArr;
            strArr9 = new String[size2];
            strArr6 = strArr2;
            int i13 = 0;
            while (i13 < size2) {
                ReadableMap map3 = array3.getMap(i13);
                strArr10[i13] = map3.getString(aZ);
                String string16 = map3.getString(str22);
                numArr3[i13] = Integer.valueOf(mapStringToEmailType(string16));
                strArr9[i13] = string16;
                strArr25[i13] = map3.hasKey(str23) ? map3.getString(str23) : null;
                i13++;
                size2 = size2;
                array3 = array3;
            }
            readableArray2 = array3;
            i5 = size2;
        } else {
            strArr6 = strArr2;
            i4 = i3;
            readableArray2 = array3;
            strArr8 = strArr5;
            strArr7 = strArr4;
            numArr2 = numArr;
            i5 = 0;
            numArr3 = null;
            strArr10 = null;
            strArr9 = null;
        }
        ReadableArray array4 = readableMap.hasKey(aq) ? readableMap.getArray(aA) : null;
        if (array4 != null) {
            int size3 = array4.size();
            strArr14 = new String[size3];
            strArr12 = strArr9;
            strArr13 = new String[size3];
            numArr4 = numArr3;
            strArr16 = new String[size3];
            strArr11 = strArr10;
            String[] strArr26 = new String[size3];
            i7 = i5;
            strArr18 = new String[size3];
            i6 = i2;
            strArr17 = new String[size3];
            str11 = string5;
            numArr5 = new Integer[size3];
            str10 = string4;
            strArr15 = new String[size3];
            str9 = string3;
            int i14 = 0;
            while (i14 < size3) {
                String valueFromKey = getValueFromKey(array4.getMap(i14), str22);
                strArr14[i14] = getValueFromKey(array4.getMap(i14), br);
                strArr13[i14] = getValueFromKey(array4.getMap(i14), e);
                strArr16[i14] = getValueFromKey(array4.getMap(i14), l);
                strArr26[i14] = getValueFromKey(array4.getMap(i14), m);
                strArr18[i14] = getValueFromKey(array4.getMap(i14), aG);
                strArr17[i14] = getValueFromKey(array4.getMap(i14), O);
                numArr5[i14] = Integer.valueOf(mapStringToPostalAddressType(valueFromKey));
                strArr15[i14] = valueFromKey;
                i14++;
                size3 = size3;
                str22 = str22;
                string = string;
            }
            str8 = string;
            i8 = size3;
        } else {
            str8 = string;
            i7 = i5;
            i6 = i2;
            numArr4 = numArr3;
            str9 = string3;
            str10 = string4;
            str11 = string5;
            strArr11 = strArr10;
            strArr12 = strArr9;
            i8 = 0;
            strArr18 = null;
            strArr17 = null;
            strArr16 = null;
            strArr15 = null;
            numArr5 = null;
            strArr14 = null;
            strArr13 = null;
        }
        ReadableArray array5 = readableMap.hasKey(ba) ? readableMap.getArray(bs) : null;
        if (array5 != null) {
            int size4 = array5.size();
            strArr21 = new String[size4];
            strArr20 = new String[size4];
            String[] strArr27 = new String[size4];
            strArr19 = strArr17;
            int i15 = 0;
            while (i15 < size4) {
                ReadableMap map4 = array5.getMap(i15);
                strArr21[i15] = map4.getString(au);
                strArr20[i15] = map4.getString(aD);
                strArr27[i15] = map4.hasKey(str23) ? map4.getString(str23) : null;
                i15++;
                size4 = size4;
                array5 = array5;
            }
            readableArray3 = array5;
            i9 = size4;
        } else {
            readableArray3 = array5;
            strArr19 = strArr17;
            i9 = 0;
            strArr21 = null;
            strArr20 = null;
        }
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        ContentProviderOperation.Builder withSelection = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection(Q, new String[]{String.valueOf(str8)});
        String str24 = ap;
        ContentProviderOperation.Builder withValue = withSelection.withValue(str24, H);
        String str25 = bo;
        ContentProviderOperation.Builder withValue2 = withValue.withValue(str25, str9);
        String str26 = aT;
        ContentProviderOperation.Builder withValue3 = withValue2.withValue(str26, str10);
        String str27 = bh;
        ContentProviderOperation.Builder withValue4 = withValue3.withValue(str27, str11);
        String str28 = bk;
        arrayList.add(withValue4.withValue(str28, str).withValue(ax, str2).build());
        ContentProviderOperation.Builder withSelection2 = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection(aB, new String[]{String.valueOf(str8), bd});
        String str29 = aE;
        ContentProviderOperation.Builder withValue5 = withSelection2.withValue(str29, str3).withValue(str28, str4).withValue(str26, str5);
        arrayList.add(withValue5.build());
        withValue5.withYieldAllowed(true);
        String str30 = bx;
        String str31 = aY;
        if (readableArray != null) {
            str13 = str26;
            str12 = str28;
            strArr22 = strArr13;
            arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection(str30, new String[]{U, String.valueOf(str6)}).build());
            int i16 = 0;
            for (int i17 = i6; i16 < i17; i17 = i17) {
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue(str31, String.valueOf(str6)).withValue(str24, S).withValue(str29, strArr6[i16]).withValue(str25, numArr2[i16]).withValue(str27, strArr3[i16]).build());
                i16++;
            }
        } else {
            str12 = str28;
            str13 = str26;
            strArr22 = strArr13;
        }
        int i18 = i4;
        int i19 = 0;
        while (i19 < i18) {
            if (strArr7[i19] == null) {
                i10 = i18;
                builder = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue(str31, String.valueOf(str6)).withValue(str24, w).withValue(str29, strArr8[i19]);
                strArr23 = strArr14;
            } else {
                i10 = i18;
                strArr23 = strArr14;
                builder = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection(u, new String[]{String.valueOf(strArr7[i19])}).withValue(str29, strArr8[i19]);
            }
            arrayList.add(builder.build());
            i19++;
            strArr14 = strArr23;
            i18 = i10;
        }
        if (readableArray2 != null) {
            arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection(str30, new String[]{ao, String.valueOf(str6)}).build());
            for (int i20 = 0; i20 < i7; i20++) {
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue(str31, String.valueOf(str6)).withValue(str24, at).withValue(str29, strArr11[i20]).withValue(str25, numArr4[i20]).withValue(str27, strArr12[i20]).build());
            }
        }
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection(str30, new String[]{B, String.valueOf(str6)}).build());
        if (str7 != null) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue(str31, String.valueOf(str6)).withValue(str24, G).withValue(str29, str7).build());
        }
        if (!(string12 == null || string12.isEmpty() || (thumbnailBitmap = getThumbnailBitmap(string12)) == null)) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(str31, 0).withValue(str24, L).withValue(aw, toByteArray(thumbnailBitmap)).build());
        }
        if (array4 != null) {
            arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection(str30, new String[]{v, String.valueOf(str6)}).build());
            for (int i21 = 0; i21 < i8; i21++) {
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue(str31, String.valueOf(str6)).withValue(str24, bg).withValue(str25, numArr5[i21]).withValue(str27, strArr15[i21]).withValue(str12, strArr14[i21]).withValue(bp, strArr22[i21]).withValue(b, strArr16[i21]).withValue(j, strArr18[i21]).withValue(bq, strArr19[i21]).build());
            }
        }
        if (readableArray3 != null) {
            arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection(str30, new String[]{z, String.valueOf(str6)}).build());
            for (int i22 = 0; i22 < i9; i22++) {
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue(str31, String.valueOf(str6)).withValue(str24, aJ).withValue(str29, strArr21[i22]).withValue(str25, 1).withValue(str13, -1).withValue(as, strArr20[i22]).build());
            }
        }
        try {
            ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
            ContentProviderResult[] applyBatch = contentResolver.applyBatch(aH, arrayList);
            if (applyBatch != null && applyBatch.length > 0) {
                callback2 = callback;
                try {
                    callback2.invoke(null, new a(contentResolver).b(str8));
                } catch (Exception e3) {
                    e2 = e3;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            callback2 = callback;
            callback2.invoke(e2.toString());
        }
    }

    @ReactMethod
    public void writePhotoToPath(String str, String str2, Callback callback) {
        new h(str, str2, callback).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }
}
