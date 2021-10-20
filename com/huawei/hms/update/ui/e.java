package com.huawei.hms.update.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.huawei.hms.utils.ResourceLoaderUtil;
import vigqyno.C0201;

/* compiled from: ConfirmDialogs */
public final class e {

    /* compiled from: ConfirmDialogs */
    private static abstract class a extends b {
        private a() {
        }

        @Override // com.huawei.hms.update.ui.b
        public AlertDialog a() {
            AlertDialog.Builder builder = new AlertDialog.Builder(f(), g());
            builder.setMessage(h());
            builder.setPositiveButton(i(), new DialogInterface.OnClickListener() {
                /* class com.huawei.hms.update.ui.e.a.AnonymousClass1 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    a.this.e();
                }
            });
            builder.setNegativeButton(j(), new DialogInterface.OnClickListener() {
                /* class com.huawei.hms.update.ui.e.a.AnonymousClass2 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    a.this.b();
                }
            });
            return builder.create();
        }

        public abstract int h();

        public abstract int i();

        public abstract int j();
    }

    /* compiled from: ConfirmDialogs */
    public static class b extends a {
        public b() {
            super();
        }

        @Override // com.huawei.hms.update.ui.e.a, com.huawei.hms.update.ui.b
        public /* bridge */ /* synthetic */ AlertDialog a() {
            return super.a();
        }

        @Override // com.huawei.hms.update.ui.e.a
        public int h() {
            return ResourceLoaderUtil.getStringId(C0201.m82(32847));
        }

        @Override // com.huawei.hms.update.ui.e.a
        public int i() {
            return ResourceLoaderUtil.getStringId(C0201.m82(32848));
        }

        @Override // com.huawei.hms.update.ui.e.a
        public int j() {
            return ResourceLoaderUtil.getStringId(C0201.m82(32849));
        }
    }

    /* compiled from: ConfirmDialogs */
    public static class c extends a {
        public c() {
            super();
        }

        @Override // com.huawei.hms.update.ui.e.a, com.huawei.hms.update.ui.b
        public /* bridge */ /* synthetic */ AlertDialog a() {
            return super.a();
        }

        @Override // com.huawei.hms.update.ui.e.a
        public int h() {
            return ResourceLoaderUtil.getStringId(C0201.m82(33459));
        }

        @Override // com.huawei.hms.update.ui.e.a
        public int i() {
            return ResourceLoaderUtil.getStringId(C0201.m82(33460));
        }

        @Override // com.huawei.hms.update.ui.e.a
        public int j() {
            return ResourceLoaderUtil.getStringId(C0201.m82(33461));
        }
    }

    /* compiled from: ConfirmDialogs */
    public static class d extends a {
        public d() {
            super();
        }

        @Override // com.huawei.hms.update.ui.e.a, com.huawei.hms.update.ui.b
        public /* bridge */ /* synthetic */ AlertDialog a() {
            return super.a();
        }

        @Override // com.huawei.hms.update.ui.e.a
        public int h() {
            return ResourceLoaderUtil.getStringId(C0201.m82(33432));
        }

        @Override // com.huawei.hms.update.ui.e.a
        public int i() {
            return ResourceLoaderUtil.getStringId(C0201.m82(33433));
        }

        @Override // com.huawei.hms.update.ui.e.a
        public int j() {
            return ResourceLoaderUtil.getStringId(C0201.m82(33434));
        }
    }
}
