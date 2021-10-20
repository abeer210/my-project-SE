package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.g;

/* compiled from: AppCompatTextClassifierHelper */
public final class x {
    private TextView a;
    private TextClassifier b;

    public x(TextView textView) {
        g.c(textView);
        this.a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }

    public void b(TextClassifier textClassifier) {
        this.b = textClassifier;
    }
}
