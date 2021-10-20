package com.huawei.hms.update.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.huawei.hms.utils.ResourceLoaderUtil;
import vigqyno.C0201;

/* compiled from: PromptDialogs */
public final class j {

    /* compiled from: PromptDialogs */
    private static abstract class a extends b {
        private a() {
        }

        @Override // com.huawei.hms.update.ui.b
        public AlertDialog a() {
            AlertDialog.Builder builder = new AlertDialog.Builder(f(), g());
            builder.setMessage(h());
            builder.setPositiveButton(i(), new DialogInterface.OnClickListener() {
                /* class com.huawei.hms.update.ui.j.a.AnonymousClass1 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    a.this.e();
                }
            });
            return builder.create();
        }

        public abstract int h();

        public int i() {
            return ResourceLoaderUtil.getStringId(C0201.m82(31774));
        }
    }

    /* compiled from: PromptDialogs */
    public static class b extends a {
        public b() {
            super();
        }

        @Override // com.huawei.hms.update.ui.j.a, com.huawei.hms.update.ui.b
        public /* bridge */ /* synthetic */ AlertDialog a() {
            return super.a();
        }

        @Override // com.huawei.hms.update.ui.j.a
        public int h() {
            return ResourceLoaderUtil.getStringId(C0201.m82(31748));
        }
    }

    /* compiled from: PromptDialogs */
    public static class c extends a {
        public c() {
            super();
        }

        @Override // com.huawei.hms.update.ui.j.a, com.huawei.hms.update.ui.b
        public /* bridge */ /* synthetic */ AlertDialog a() {
            return super.a();
        }

        @Override // com.huawei.hms.update.ui.j.a
        public int h() {
            return ResourceLoaderUtil.getStringId(C0201.m82(31720));
        }
    }

    /* compiled from: PromptDialogs */
    public static class d extends a {
        public d() {
            super();
        }

        @Override // com.huawei.hms.update.ui.j.a, com.huawei.hms.update.ui.b
        public /* bridge */ /* synthetic */ AlertDialog a() {
            return super.a();
        }

        @Override // com.huawei.hms.update.ui.j.a
        public int h() {
            return ResourceLoaderUtil.getStringId(C0201.m82(32150));
        }
    }
}
