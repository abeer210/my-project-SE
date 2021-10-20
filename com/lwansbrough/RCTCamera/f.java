package com.lwansbrough.RCTCamera;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.facebook.react.bridge.ReactApplicationContext;
import vigqyno.C0201;

/* compiled from: RCTSensorOrientationChecker */
public class f {
    public int a = 0;
    private SensorEventListener b = new b();
    private SensorManager c;
    private g d = null;

    /* compiled from: RCTSensorOrientationChecker */
    private class b implements SensorEventListener {
        private b() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            if (f < 5.0f && f > -5.0f && f2 > 5.0f) {
                f.this.a = 0;
            } else if (f < -5.0f && f2 < 5.0f && f2 > -5.0f) {
                f.this.a = 3;
            } else if (f < 5.0f && f > -5.0f && f2 < -5.0f) {
                f.this.a = 2;
            } else if (f > 5.0f && f2 < 5.0f && f2 > -5.0f) {
                f.this.a = 1;
            }
            if (f.this.d != null) {
                f.this.d.a();
            }
        }
    }

    public f(ReactApplicationContext reactApplicationContext) {
        this.c = (SensorManager) reactApplicationContext.getSystemService(C0201.m82(4614));
    }

    public int b() {
        return this.a;
    }

    public void c() {
        this.c.unregisterListener(this.b);
    }

    public void d() {
        SensorManager sensorManager = this.c;
        sensorManager.registerListener(this.b, sensorManager.getDefaultSensor(1), 3);
    }

    public void e(g gVar) {
        this.d = gVar;
    }

    public void f() {
        this.d = null;
    }
}
