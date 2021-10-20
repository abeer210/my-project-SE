package com.streem.selectcontact;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

public class SelectContactModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int CONTACT_REQUEST = 0;
    public static final String E_CONTACT_CANCELLED = null;
    public static final String E_CONTACT_EXCEPTION = null;
    public static final String E_CONTACT_NO_DATA = null;
    public static final String E_CONTACT_PERMISSION = null;
    private static final String TAG = null;
    public static final String a = null;
    public static final String b = null;
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
    private final ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
    private Promise mContactsPromise;

    public static class a extends Exception {
        public a(String str, String str2) {
            super(str2);
        }
    }

    static {
        C0201.m83(SelectContactModule.class, 37);
    }

    public SelectContactModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
    }

    private void addEmailEntry(WritableArray writableArray, Cursor cursor, Activity activity) {
        String string = cursor.getString(cursor.getColumnIndex(C0201.m82(11915)));
        CharSequence typeLabel = ContactsContract.CommonDataKinds.Email.getTypeLabel(activity.getResources(), cursor.getInt(cursor.getColumnIndex(C0201.m82(11916))), cursor.getString(cursor.getColumnIndex(C0201.m82(11917))));
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(11918), string);
        createMap.putString(C0201.m82(11919), String.valueOf(typeLabel));
        writableArray.pushMap(createMap);
    }

    private void addNameData(WritableMap writableMap, Cursor cursor) {
        writableMap.putString(C0201.m82(11921), cursor.getString(cursor.getColumnIndex(C0201.m82(11920))));
        int columnIndex = cursor.getColumnIndex(C0201.m82(11922));
        if (columnIndex != -1) {
            writableMap.putString(C0201.m82(11923), cursor.getString(columnIndex));
        }
        String r0 = C0201.m82(11924);
        if (cursor.getColumnIndex(r0) != -1) {
            writableMap.putString(C0201.m82(11925), cursor.getString(cursor.getColumnIndex(r0)));
        }
        int columnIndex2 = cursor.getColumnIndex(C0201.m82(11926));
        if (columnIndex2 != -1) {
            writableMap.putString(C0201.m82(11927), cursor.getString(columnIndex2));
        }
    }

    private void addPhoneEntry(WritableArray writableArray, Cursor cursor, Activity activity) {
        String string = cursor.getString(cursor.getColumnIndex(C0201.m82(11928)));
        CharSequence typeLabel = ContactsContract.CommonDataKinds.Phone.getTypeLabel(activity.getResources(), cursor.getInt(cursor.getColumnIndex(C0201.m82(11929))), cursor.getString(cursor.getColumnIndex(C0201.m82(11930))));
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(11931), string);
        createMap.putString(C0201.m82(11932), String.valueOf(typeLabel));
        writableArray.pushMap(createMap);
    }

    private void addPostalData(WritableArray writableArray, Cursor cursor, Activity activity) {
        int columnIndex = cursor.getColumnIndex(C0201.m82(11933));
        int columnIndex2 = cursor.getColumnIndex(C0201.m82(11934));
        int columnIndex3 = cursor.getColumnIndex(C0201.m82(11935));
        int columnIndex4 = cursor.getColumnIndex(C0201.m82(11936));
        int columnIndex5 = cursor.getColumnIndex(C0201.m82(11937));
        int columnIndex6 = cursor.getColumnIndex(C0201.m82(11938));
        WritableMap createMap = Arguments.createMap();
        if (columnIndex != -1) {
            createMap.putString(C0201.m82(11939), cursor.getString(columnIndex));
        }
        if (columnIndex2 != -1) {
            createMap.putString(C0201.m82(11940), cursor.getString(columnIndex2));
        }
        if (columnIndex3 != -1) {
            createMap.putString(C0201.m82(11941), cursor.getString(columnIndex3));
        }
        if (columnIndex4 != -1) {
            createMap.putString(C0201.m82(11942), cursor.getString(columnIndex4));
        }
        if (columnIndex5 != -1) {
            createMap.putString(C0201.m82(11943), cursor.getString(columnIndex5));
        }
        if (columnIndex6 != -1) {
            createMap.putString(C0201.m82(11944), cursor.getString(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex(C0201.m82(11945));
        int columnIndex8 = cursor.getColumnIndex(C0201.m82(11946));
        if (!(columnIndex7 == -1 || columnIndex8 == -1)) {
            String string = cursor.getString(columnIndex8);
            createMap.putString(C0201.m82(11947), String.valueOf(ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(activity.getResources(), cursor.getInt(columnIndex7), string)));
        }
        writableArray.pushMap(createMap);
    }

    private Uri buildContactUri(String str) {
        return Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, str).buildUpon().appendPath(C0201.m82(11948)).build();
    }

    private String getContactId(Uri uri) throws a {
        Cursor query = this.contentResolver.query(uri, null, null, null, null);
        if (query != null && query.moveToFirst()) {
            return query.getString(query.getColumnIndex(C0201.m82(11949)));
        }
        throw new a(C0201.m82(11950), C0201.m82(11951));
    }

    private void launchPicker(Promise promise, int i2) {
        Cursor query = this.contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        if (query != null) {
            this.mContactsPromise = promise;
            Intent intent = new Intent(C0201.m82(11952));
            intent.setType(C0201.m82(11953));
            Activity currentActivity = getCurrentActivity();
            if (intent.resolveActivity(currentActivity.getPackageManager()) != null) {
                currentActivity.startActivityForResult(intent, i2);
            }
            query.close();
            return;
        }
        this.mContactsPromise.reject(C0201.m82(11954), C0201.m82(11955));
    }

    private Cursor openContactQuery(Uri uri) throws a {
        Cursor query = this.contentResolver.query(uri, new String[]{C0201.m82(11956), C0201.m82(11957), C0201.m82(11958), C0201.m82(11959)}, null, null, C0201.m82(11960));
        if (query != null) {
            return query;
        }
        throw new a(C0201.m82(11961), C0201.m82(11962));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(11963);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i2, int i3, Intent intent) {
        char c2;
        String str = d;
        Promise promise = this.mContactsPromise;
        if (promise != null && i2 == 11112) {
            if (i3 != -1) {
                promise.reject(g, f);
                return;
            }
            WritableMap createMap = Arguments.createMap();
            try {
                String contactId = getContactId(intent.getData());
                createMap.putString(l, contactId);
                Uri buildContactUri = buildContactUri(contactId);
                WritableArray createArray = Arguments.createArray();
                WritableArray createArray2 = Arguments.createArray();
                WritableArray createArray3 = Arguments.createArray();
                Cursor openContactQuery = openContactQuery(buildContactUri);
                boolean z = false;
                if (openContactQuery.moveToFirst()) {
                    boolean z2 = false;
                    do {
                        String string = openContactQuery.getString(openContactQuery.getColumnIndex(c));
                        switch (string.hashCode()) {
                            case -1569536764:
                                if (string.equals(a)) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1079224304:
                                if (string.equals(j)) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -601229436:
                                if (string.equals(i)) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 684173810:
                                if (string.equals(o)) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        if (c2 == 0) {
                            addNameData(createMap, openContactQuery);
                        } else if (c2 == 1) {
                            addPostalData(createArray3, openContactQuery, activity);
                        } else if (c2 == 2) {
                            addPhoneEntry(createArray, openContactQuery, activity);
                        } else if (c2 == 3) {
                            addEmailEntry(createArray2, openContactQuery, activity);
                        }
                        z2 = true;
                    } while (openContactQuery.moveToNext());
                    z = z2;
                }
                openContactQuery.close();
                createMap.putArray(h, createArray);
                createMap.putArray(p, createArray2);
                createMap.putArray(m, createArray3);
                if (z) {
                    this.mContactsPromise.resolve(createMap);
                } else {
                    this.mContactsPromise.reject(e, b);
                }
            } catch (a e2) {
                this.mContactsPromise.reject(str, e2.getMessage());
            } catch (Exception e3) {
                Log.e(k, n, e3);
                this.mContactsPromise.reject(str, e3.getMessage());
            }
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void openContactSelection(Promise promise) {
        launchPicker(promise, 11112);
    }
}
