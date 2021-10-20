package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: nb2  reason: default package */
public class nb2 implements lb2 {
    private final JSONObject a;

    public nb2(InputStream inputStream) {
        this.a = b(inputStream);
    }

    private JSONObject b(InputStream inputStream) {
        String str;
        String r0 = C0201.m82(32980);
        if (inputStream != null) {
            try {
                return new JSONObject(rb2.a(inputStream, C0201.m82(32981)));
            } catch (IOException unused) {
                str = C0201.m82(32983);
                Log.e(r0, str);
                return new JSONObject();
            } catch (JSONException unused2) {
                str = C0201.m82(32982);
                Log.e(r0, str);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    @Override // defpackage.lb2
    public String a(String str, String str2) {
        String r0 = C0201.m82(32984);
        if (str.endsWith(r0)) {
            return str2;
        }
        String[] split = str.split(r0);
        try {
            JSONObject jSONObject = this.a;
            for (int i = 1; i < split.length; i++) {
                if (i == split.length - 1) {
                    return jSONObject.get(split[i]).toString();
                }
                jSONObject = jSONObject.getJSONObject(split[i]);
            }
        } catch (JSONException unused) {
            Log.w(C0201.m82(32986), C0201.m82(32985) + str);
        }
        return str2;
    }
}
