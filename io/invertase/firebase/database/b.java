package io.invertase.firebase.database;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.google.firebase.database.DataSnapshot;
import io.invertase.firebase.c;
import vigqyno.C0201;

/* compiled from: RNFirebaseDatabaseUtils */
public class b {
    private static <Any> WritableArray a(DataSnapshot dataSnapshot) {
        WritableArray createArray = Arguments.createArray();
        long j = 0;
        for (DataSnapshot dataSnapshot2 : dataSnapshot.getChildren()) {
            long parseLong = Long.parseLong(dataSnapshot2.getKey());
            if (parseLong > j) {
                while (j < parseLong) {
                    createArray.pushNull();
                    j++;
                }
                j = parseLong;
            }
            Object c = c(dataSnapshot2);
            String name = c.getClass().getName();
            char c2 = 65535;
            switch (name.hashCode()) {
                case -1658217206:
                    if (name.equals(C0201.m82(20941))) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -124438905:
                    if (name.equals(C0201.m82(20940))) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 344809556:
                    if (name.equals(C0201.m82(20939))) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 398795216:
                    if (name.equals(C0201.m82(20938))) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 761287205:
                    if (name.equals(C0201.m82(20937))) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1195259493:
                    if (name.equals(C0201.m82(20936))) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                createArray.pushBoolean(((Boolean) c).booleanValue());
            } else if (c2 == 1) {
                createArray.pushDouble((double) ((Long) c).longValue());
            } else if (c2 == 2) {
                createArray.pushDouble(((Double) c).doubleValue());
            } else if (c2 == 3) {
                createArray.pushString((String) c);
            } else if (c2 == 4) {
                createArray.pushMap((WritableMap) c);
            } else if (c2 != 5) {
                Log.w(C0201.m82(20943), C0201.m82(20942) + c.getClass().getName());
            } else {
                createArray.pushArray((WritableArray) c);
            }
            j++;
        }
        return createArray;
    }

    private static <Any> WritableMap b(DataSnapshot dataSnapshot) {
        WritableMap createMap = Arguments.createMap();
        for (DataSnapshot dataSnapshot2 : dataSnapshot.getChildren()) {
            Object c = c(dataSnapshot2);
            String name = c.getClass().getName();
            char c2 = 65535;
            switch (name.hashCode()) {
                case -1658217206:
                    if (name.equals(C0201.m82(20949))) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -124438905:
                    if (name.equals(C0201.m82(20948))) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 344809556:
                    if (name.equals(C0201.m82(20947))) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 398795216:
                    if (name.equals(C0201.m82(20946))) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 761287205:
                    if (name.equals(C0201.m82(20945))) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1195259493:
                    if (name.equals(C0201.m82(20944))) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                createMap.putBoolean(dataSnapshot2.getKey(), ((Boolean) c).booleanValue());
            } else if (c2 == 1) {
                createMap.putDouble(dataSnapshot2.getKey(), (double) ((Long) c).longValue());
            } else if (c2 == 2) {
                createMap.putDouble(dataSnapshot2.getKey(), ((Double) c).doubleValue());
            } else if (c2 == 3) {
                createMap.putString(dataSnapshot2.getKey(), (String) c);
            } else if (c2 == 4) {
                createMap.putMap(dataSnapshot2.getKey(), (WritableMap) c);
            } else if (c2 != 5) {
                Log.w(C0201.m82(20951), C0201.m82(20950) + c.getClass().getName());
            } else {
                createMap.putArray(dataSnapshot2.getKey(), (WritableArray) c);
            }
        }
        return createMap;
    }

    public static <Any> Any c(DataSnapshot dataSnapshot) {
        if (dataSnapshot.hasChildren()) {
            return e(dataSnapshot) ? (Any) a(dataSnapshot) : (Any) b(dataSnapshot);
        }
        if (dataSnapshot.getValue() == null) {
            return null;
        }
        String name = dataSnapshot.getValue().getClass().getName();
        char c = 65535;
        switch (name.hashCode()) {
            case 344809556:
                if (name.equals(C0201.m82(20955))) {
                    c = 0;
                    break;
                }
                break;
            case 398795216:
                if (name.equals(C0201.m82(20954))) {
                    c = 1;
                    break;
                }
                break;
            case 761287205:
                if (name.equals(C0201.m82(20953))) {
                    c = 2;
                    break;
                }
                break;
            case 1195259493:
                if (name.equals(C0201.m82(20952))) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1 || c == 2 || c == 3) {
            return (Any) dataSnapshot.getValue();
        }
        Log.w(C0201.m82(20957), C0201.m82(20956) + name);
        return null;
    }

    public static WritableArray d(DataSnapshot dataSnapshot) {
        WritableArray createArray = Arguments.createArray();
        if (dataSnapshot.hasChildren()) {
            for (DataSnapshot dataSnapshot2 : dataSnapshot.getChildren()) {
                createArray.pushString(dataSnapshot2.getKey());
            }
        }
        return createArray;
    }

    private static boolean e(DataSnapshot dataSnapshot) {
        long childrenCount = (dataSnapshot.getChildrenCount() * 2) - 1;
        long j = -1;
        for (DataSnapshot dataSnapshot2 : dataSnapshot.getChildren()) {
            try {
                long parseLong = Long.parseLong(dataSnapshot2.getKey());
                if (parseLong > j && parseLong <= childrenCount) {
                    j = parseLong;
                }
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        return true;
    }

    public static WritableMap f(DataSnapshot dataSnapshot) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(20958), dataSnapshot.getKey());
        createMap.putBoolean(C0201.m82(20959), dataSnapshot.exists());
        createMap.putBoolean(C0201.m82(20960), dataSnapshot.hasChildren());
        createMap.putDouble(C0201.m82(20961), (double) dataSnapshot.getChildrenCount());
        createMap.putArray(C0201.m82(20962), d(dataSnapshot));
        c.g(C0201.m82(20963), dataSnapshot.getPriority(), createMap);
        boolean hasChildren = dataSnapshot.hasChildren();
        String r2 = C0201.m82(20964);
        if (!hasChildren) {
            c.g(r2, dataSnapshot.getValue(), createMap);
        } else {
            Object c = c(dataSnapshot);
            if (c instanceof WritableNativeArray) {
                createMap.putArray(r2, (WritableArray) c);
            } else {
                createMap.putMap(r2, (WritableMap) c);
            }
        }
        return createMap;
    }

    public static WritableMap g(DataSnapshot dataSnapshot, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putMap(C0201.m82(20965), f(dataSnapshot));
        createMap.putString(C0201.m82(20966), str);
        return createMap;
    }
}
