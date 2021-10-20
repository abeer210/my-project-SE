package com.huawei.hms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;
import vigqyno.C0201;

public class HMSCursorWrapper extends CursorWrapper implements CrossProcessCursor {
    private AbstractWindowedCursor mCursor;

    public HMSCursorWrapper(Cursor cursor) {
        super(cursor);
        if (cursor != null) {
            boolean z = cursor instanceof CursorWrapper;
            String r1 = C0201.m82(7588);
            if (z) {
                Cursor wrappedCursor = ((CursorWrapper) cursor).getWrappedCursor();
                if (wrappedCursor == null) {
                    throw new IllegalArgumentException(C0201.m82(7590));
                } else if (wrappedCursor instanceof AbstractWindowedCursor) {
                    this.mCursor = (AbstractWindowedCursor) wrappedCursor;
                } else {
                    throw new IllegalArgumentException(C0201.m82(7589) + wrappedCursor + r1);
                }
            } else {
                throw new IllegalArgumentException(C0201.m82(7591) + cursor + r1);
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(7592));
        }
    }

    public void fillWindow(int i, CursorWindow cursorWindow) {
        this.mCursor.fillWindow(i, cursorWindow);
    }

    public CursorWindow getWindow() {
        return this.mCursor.getWindow();
    }

    public Cursor getWrappedCursor() {
        return this.mCursor;
    }

    public boolean onMove(int i, int i2) {
        return this.mCursor.onMove(i, i2);
    }

    public void setWindow(CursorWindow cursorWindow) {
        this.mCursor.setWindow(cursorWindow);
    }
}
