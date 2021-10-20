package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import vigqyno.C0201;

@TargetApi(21)
/* compiled from: AudioAttributesImplApi21 */
public class b implements a {
    public AudioAttributes a;
    public int b = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.a.equals(((b) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return C0201.m82(16936) + this.a;
    }
}
