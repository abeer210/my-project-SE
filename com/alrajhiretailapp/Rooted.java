package com.alrajhiretailapp;

import android.os.Build;
import android.util.Log;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import vigqyno.C0201;

public class Rooted extends ReactContextBaseJavaModule {
    private static String TAG;
    private static Boolean isRooted;

    public class a {
        public a(Rooted rooted) {
        }

        public ArrayList<String> a(b bVar) {
            ArrayList<String> arrayList = new ArrayList<>();
            try {
                Process exec = Runtime.getRuntime().exec(bVar.a);
                new BufferedWriter(new OutputStreamWriter(exec.getOutputStream()));
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String str = Rooted.TAG;
                        Log.d(str, C0201.m82(27437) + readLine);
                        arrayList.add(readLine);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                String str2 = Rooted.TAG;
                Log.d(str2, C0201.m82(27438) + arrayList);
                return arrayList;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public enum b {
        check_su_binary(new String[]{"/system/xbin/which", "su"});
        
        public String[] a;

        private b(String[] strArr) {
            this.a = strArr;
        }
    }

    static {
        C0201.m83(Rooted.class, 601);
    }

    public Rooted(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static boolean checkRootMethod1() {
        String str = Build.TAGS;
        return str != null && str.contains(C0201.m82(7238));
    }

    private static boolean checkRootMethod2() {
        String[] strArr = {C0201.m82(7239), C0201.m82(7240), C0201.m82(7241), C0201.m82(7242), C0201.m82(7243), C0201.m82(7244), C0201.m82(7245), C0201.m82(7246), C0201.m82(7247), C0201.m82(7248)};
        for (int i = 0; i < 10; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkRootMethod3() {
        boolean z = false;
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{C0201.m82(7249), C0201.m82(7250)});
            if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null) {
                z = true;
            }
            if (process != null) {
                process.destroy();
            }
            return z;
        } catch (Throwable unused) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    @ReactMethod
    public void check() {
        isRooted = Boolean.valueOf(checkRootMethod1() || checkRootMethod2() || checkRootMethod3() || checkRootMethod4());
    }

    public boolean checkRootMethod4() {
        return new a(this).a(b.check_su_binary) != null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(7251);
    }

    @ReactMethod
    public void getStatus(Callback callback) {
        callback.invoke(null, isRooted);
    }
}
