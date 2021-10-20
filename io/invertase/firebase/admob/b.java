package io.invertase.firebase.admob;

import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VideoOptions;
import io.invertase.firebase.c;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import vigqyno.C0201;

/* compiled from: RNFirebaseAdMobUtils */
public class b {
    public static AdRequest.Builder a(ReadableMap readableMap) {
        AdRequest.Builder builder = new AdRequest.Builder();
        String r1 = C0201.m82(2588);
        if (readableMap.hasKey(r1)) {
            builder.setIsDesignedForFamilies(readableMap.getBoolean(r1));
        }
        String r12 = C0201.m82(2589);
        if (readableMap.hasKey(r12)) {
            builder.tagForChildDirectedTreatment(readableMap.getBoolean(r12));
        }
        String r13 = C0201.m82(2590);
        if (readableMap.hasKey(r13)) {
            builder.setContentUrl(readableMap.getString(r13));
        }
        String r14 = C0201.m82(2591);
        if (readableMap.hasKey(r14)) {
            builder.setRequestAgent(readableMap.getString(r14));
        }
        String r15 = C0201.m82(2592);
        if (readableMap.hasKey(r15)) {
            String string = readableMap.getString(r15);
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -1278174388) {
                if (hashCode != -284840886) {
                    if (hashCode == 3343885 && string.equals(C0201.m82(2593))) {
                        c = 0;
                    }
                } else if (string.equals(C0201.m82(2594))) {
                    c = 2;
                }
            } else if (string.equals(C0201.m82(2595))) {
                c = 1;
            }
            if (c == 0) {
                builder.setGender(1);
            } else if (c == 1) {
                builder.setGender(2);
            } else if (c == 2) {
                builder.setGender(0);
            }
        }
        for (Object obj : c.i(readableMap.getArray(C0201.m82(2596)))) {
            if (obj == C0201.m82(2597)) {
                builder.addTestDevice(C0201.m82(2598));
            } else {
                builder.addTestDevice((String) obj);
            }
        }
        Iterator<Object> it = c.i(readableMap.getArray(C0201.m82(2599))).iterator();
        while (it.hasNext()) {
            builder.addKeyword((String) it.next());
        }
        return builder;
    }

    public static VideoOptions.Builder b(ReadableMap readableMap) {
        VideoOptions.Builder builder = new VideoOptions.Builder();
        builder.setStartMuted(readableMap.getBoolean(C0201.m82(2600)));
        return builder;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        if (r4.equals(vigqyno.C0201.m82(2608)) != false) goto L_0x00a3;
     */
    public static AdSize c(String str) {
        Matcher matcher = Pattern.compile(C0201.m82(2601)).matcher(str);
        char c = 2;
        if (matcher.find()) {
            return new AdSize(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        }
        String upperCase = str.toUpperCase();
        switch (upperCase.hashCode()) {
            case -1966536496:
                break;
            case -1008851236:
                if (upperCase.equals(C0201.m82(2607))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -140586366:
                if (upperCase.equals(C0201.m82(2606))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -96588539:
                if (upperCase.equals(C0201.m82(2605))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 446888797:
                if (upperCase.equals(C0201.m82(2604))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1669469470:
                if (upperCase.equals(C0201.m82(2603))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (upperCase.equals(C0201.m82(2602))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 2:
                return AdSize.LARGE_BANNER;
            case 3:
                return AdSize.MEDIUM_RECTANGLE;
            case 4:
                return AdSize.FULL_BANNER;
            case 5:
                return AdSize.LEADERBOARD;
            case 6:
                return AdSize.SMART_BANNER;
            case 7:
                return AdSize.SMART_BANNER;
            default:
                return AdSize.BANNER;
        }
    }
}
