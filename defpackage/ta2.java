package defpackage;

/* renamed from: ta2  reason: default package */
/* compiled from: DataMask */
public enum ta2 {
    DATA_MASK_000 {
        @Override // defpackage.ta2
        public boolean b(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    },
    DATA_MASK_001 {
        @Override // defpackage.ta2
        public boolean b(int i, int i2) {
            return (i & 1) == 0;
        }
    },
    DATA_MASK_010 {
        @Override // defpackage.ta2
        public boolean b(int i, int i2) {
            return i2 % 3 == 0;
        }
    },
    DATA_MASK_011 {
        @Override // defpackage.ta2
        public boolean b(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    },
    DATA_MASK_100 {
        @Override // defpackage.ta2
        public boolean b(int i, int i2) {
            return (((i / 2) + (i2 / 3)) & 1) == 0;
        }
    },
    DATA_MASK_101 {
        @Override // defpackage.ta2
        public boolean b(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    },
    DATA_MASK_110 {
        @Override // defpackage.ta2
        public boolean b(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    },
    DATA_MASK_111 {
        @Override // defpackage.ta2
        public boolean b(int i, int i2) {
            return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
        }
    };

    public abstract boolean b(int i2, int i3);

    public final void d(c72 c72, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (b(i3, i4)) {
                    c72.c(i4, i3);
                }
            }
        }
    }
}
