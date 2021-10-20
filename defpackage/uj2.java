package defpackage;

import android.text.SpannedString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

/* renamed from: uj2  reason: default package */
/* compiled from: TextViewUtils */
public class uj2 {
    public static int a(TextView textView) {
        SpannedString spannedString = new SpannedString(textView.getText());
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannedString.getSpans(0, spannedString.length(), ForegroundColorSpan.class);
        return foregroundColorSpanArr.length == 0 ? textView.getCurrentTextColor() : foregroundColorSpanArr[0].getForegroundColor();
    }

    public static float b(TextView textView) {
        SpannedString spannedString = new SpannedString(textView.getText());
        AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spannedString.getSpans(0, spannedString.length(), AbsoluteSizeSpan.class);
        if (absoluteSizeSpanArr.length == 0) {
            return -1.0f;
        }
        return (float) absoluteSizeSpanArr[0].getSize();
    }
}
