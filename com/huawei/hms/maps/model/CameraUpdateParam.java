package com.huawei.hms.maps.model;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.mco;
import vigqyno.C0188;
import vigqyno.C0201;

public class CameraUpdateParam implements Parcelable {
    public static final Parcelable.Creator<CameraUpdateParam> CREATOR = new Parcelable.Creator<CameraUpdateParam>() {
        /* class com.huawei.hms.maps.model.CameraUpdateParam.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public final CameraUpdateParam createFromParcel(Parcel parcel) {
            return new CameraUpdateParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CameraUpdateParam[] newArray(int i) {
            return new CameraUpdateParam[i];
        }
    };
    private CameraPosition a = null;
    private LatLng b = null;
    private NewLatLngBounds c = null;
    private NewLatLngBoundsWidthHeight d = null;
    private NewLatLngZoom e = null;
    private ScrollBy f = null;
    private ZoomByWithFocus g = null;
    private ZoomBy h = null;
    private ZoomTo i = null;

    public static class NewLatLngBounds implements Parcelable {
        public static final Parcelable.Creator<NewLatLngBounds> CREATOR = new Parcelable.Creator<NewLatLngBounds>() {
            /* class com.huawei.hms.maps.model.CameraUpdateParam.NewLatLngBounds.AnonymousClass1 */

            @Override // android.os.Parcelable.Creator
            public final NewLatLngBounds createFromParcel(Parcel parcel) {
                return new NewLatLngBounds(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final NewLatLngBounds[] newArray(int i) {
                return new NewLatLngBounds[i];
            }
        };
        private LatLngBounds a = null;
        private int b = C0188.f24;

        public NewLatLngBounds() {
        }

        public NewLatLngBounds(Parcel parcel) {
            ParcelReader parcelReader = new ParcelReader(parcel);
            this.a = (LatLngBounds) parcelReader.readParcelable(2, LatLngBounds.CREATOR, null);
            this.b = parcelReader.readInt(3, this.b);
        }

        public NewLatLngBounds(LatLngBounds latLngBounds, int i) {
            this.a = latLngBounds;
            this.b = i;
        }

        public int describeContents() {
            return 0;
        }

        public LatLngBounds getBounds() {
            return this.a;
        }

        public int getPadding() {
            return this.b;
        }

        public void setBounds(LatLngBounds latLngBounds) {
            this.a = latLngBounds;
        }

        public void setPadding(int i) {
            this.b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int beginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeParcelable(2, this.a, i, false);
            parcelWrite.writeInt(3, this.b);
            parcelWrite.finishObjectHeader(beginObjectHeader);
        }
    }

    public static class NewLatLngBoundsWidthHeight implements Parcelable {
        public static final Parcelable.Creator<NewLatLngBoundsWidthHeight> CREATOR = new Parcelable.Creator<NewLatLngBoundsWidthHeight>() {
            /* class com.huawei.hms.maps.model.CameraUpdateParam.NewLatLngBoundsWidthHeight.AnonymousClass1 */

            @Override // android.os.Parcelable.Creator
            public final NewLatLngBoundsWidthHeight createFromParcel(Parcel parcel) {
                return new NewLatLngBoundsWidthHeight(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final NewLatLngBoundsWidthHeight[] newArray(int i) {
                return new NewLatLngBoundsWidthHeight[i];
            }
        };
        private LatLngBounds a = null;
        private int b = C0188.f24;
        private int c = C0188.f24;
        private int d = C0188.f24;

        public NewLatLngBoundsWidthHeight() {
        }

        public NewLatLngBoundsWidthHeight(Parcel parcel) {
            ParcelReader parcelReader = new ParcelReader(parcel);
            this.a = (LatLngBounds) parcelReader.readParcelable(2, LatLngBounds.CREATOR, null);
            this.b = parcelReader.readInt(3, this.b);
            this.c = parcelReader.readInt(4, this.c);
            this.d = parcelReader.readInt(5, this.d);
        }

        public NewLatLngBoundsWidthHeight(LatLngBounds latLngBounds, int i, int i2, int i3) {
            this.a = latLngBounds;
            this.c = i;
            this.d = i2;
            this.b = i3;
        }

        public int describeContents() {
            return 0;
        }

        public LatLngBounds getBounds() {
            return this.a;
        }

        public int getHeight() {
            return this.d;
        }

        public int getPadding() {
            return this.b;
        }

        public int getWidth() {
            return this.c;
        }

        public void setBounds(LatLngBounds latLngBounds) {
            this.a = latLngBounds;
        }

        public void setHeight(int i) {
            this.d = i;
        }

        public void setPadding(int i) {
            this.b = i;
        }

        public void setWidth(int i) {
            this.c = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int beginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeParcelable(2, this.a, i, false);
            parcelWrite.writeInt(3, this.b);
            parcelWrite.writeInt(4, this.c);
            parcelWrite.writeInt(5, this.d);
            parcelWrite.finishObjectHeader(beginObjectHeader);
        }
    }

    public static class NewLatLngZoom implements Parcelable {
        public static final Parcelable.Creator<NewLatLngZoom> CREATOR = new Parcelable.Creator<NewLatLngZoom>() {
            /* class com.huawei.hms.maps.model.CameraUpdateParam.NewLatLngZoom.AnonymousClass1 */

            @Override // android.os.Parcelable.Creator
            public final NewLatLngZoom createFromParcel(Parcel parcel) {
                return new NewLatLngZoom(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final NewLatLngZoom[] newArray(int i) {
                return new NewLatLngZoom[i];
            }
        };
        private LatLng a = null;
        private float b = -1.0f;

        public NewLatLngZoom() {
        }

        public NewLatLngZoom(Parcel parcel) {
            ParcelReader parcelReader = new ParcelReader(parcel);
            this.a = (LatLng) parcelReader.readParcelable(2, LatLng.CREATOR, null);
            this.b = parcelReader.readFloat(3, this.b);
        }

        public NewLatLngZoom(LatLng latLng, float f) {
            this.a = latLng;
            this.b = f;
        }

        public int describeContents() {
            return 0;
        }

        public LatLng getLatLng() {
            return this.a;
        }

        public float getZoom() {
            return this.b;
        }

        public void setLatLng(LatLng latLng) {
            this.a = latLng;
        }

        public void setZoom(float f) {
            this.b = f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int beginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeParcelable(2, this.a, i, false);
            parcelWrite.writeFloat(3, this.b);
            parcelWrite.finishObjectHeader(beginObjectHeader);
        }
    }

    public static class ScrollBy implements Parcelable {
        public static final Parcelable.Creator<ScrollBy> CREATOR = new Parcelable.Creator<ScrollBy>() {
            /* class com.huawei.hms.maps.model.CameraUpdateParam.ScrollBy.AnonymousClass1 */

            @Override // android.os.Parcelable.Creator
            public final ScrollBy createFromParcel(Parcel parcel) {
                return new ScrollBy(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ScrollBy[] newArray(int i) {
                return new ScrollBy[i];
            }
        };
        private float a = Float.MAX_VALUE;
        private float b = Float.MAX_VALUE;

        public ScrollBy() {
        }

        public ScrollBy(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public ScrollBy(Parcel parcel) {
            ParcelReader parcelReader = new ParcelReader(parcel);
            this.a = parcelReader.readFloat(2, this.a);
            this.b = parcelReader.readFloat(3, this.b);
        }

        public int describeContents() {
            return 0;
        }

        public float getxPixel() {
            return this.a;
        }

        public float getyPixel() {
            return this.b;
        }

        public void setxPixel(float f) {
            this.a = f;
        }

        public void setyPixel(float f) {
            this.b = f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int beginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeFloat(2, this.a);
            parcelWrite.writeFloat(3, this.b);
            parcelWrite.finishObjectHeader(beginObjectHeader);
        }
    }

    public static class ZoomBy implements Parcelable {
        public static final Parcelable.Creator<ZoomBy> CREATOR = new Parcelable.Creator<ZoomBy>() {
            /* class com.huawei.hms.maps.model.CameraUpdateParam.ZoomBy.AnonymousClass1 */

            @Override // android.os.Parcelable.Creator
            public final ZoomBy createFromParcel(Parcel parcel) {
                return new ZoomBy(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ZoomBy[] newArray(int i) {
                return new ZoomBy[i];
            }
        };
        private float a;

        public ZoomBy(float f) {
            this.a = f;
        }

        public ZoomBy(Parcel parcel) {
            String r1 = C0201.m82(58);
            mco.a(r1, C0201.m82(57) + this.a);
            this.a = new ParcelReader(parcel).readFloat(2, 0.0f);
            mco.a(r1, C0201.m82(59) + this.a);
        }

        public int describeContents() {
            return 0;
        }

        public float getAmount() {
            return this.a;
        }

        public void setAmount(float f) {
            this.a = f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            mco.a(C0201.m82(61), C0201.m82(60) + this.a);
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int beginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeFloat(2, this.a);
            parcelWrite.finishObjectHeader(beginObjectHeader);
        }
    }

    public static class ZoomByWithFocus implements Parcelable {
        public static final Parcelable.Creator<ZoomByWithFocus> CREATOR = new Parcelable.Creator<ZoomByWithFocus>() {
            /* class com.huawei.hms.maps.model.CameraUpdateParam.ZoomByWithFocus.AnonymousClass1 */

            @Override // android.os.Parcelable.Creator
            public final ZoomByWithFocus createFromParcel(Parcel parcel) {
                return new ZoomByWithFocus(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ZoomByWithFocus[] newArray(int i) {
                return new ZoomByWithFocus[i];
            }
        };
        private float a;
        private Point b;

        public ZoomByWithFocus() {
        }

        public ZoomByWithFocus(float f, Point point) {
            this.a = f;
            this.b = point;
        }

        public ZoomByWithFocus(Parcel parcel) {
            ParcelReader parcelReader = new ParcelReader(parcel);
            this.a = parcelReader.readFloat(2, 1.0f);
            this.b = (Point) parcelReader.readParcelable(3, Point.CREATOR, null);
        }

        public int describeContents() {
            return 0;
        }

        public float getAmount() {
            return this.a;
        }

        public Point getFocus() {
            return this.b;
        }

        public void setAmount(float f) {
            this.a = f;
        }

        public void setFocus(Point point) {
            this.b = point;
        }

        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int beginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeFloat(2, this.a);
            parcelWrite.writeParcelable(3, this.b, i, false);
            parcelWrite.finishObjectHeader(beginObjectHeader);
        }
    }

    public static class ZoomTo implements Parcelable {
        public static final Parcelable.Creator<ZoomTo> CREATOR = new Parcelable.Creator<ZoomTo>() {
            /* class com.huawei.hms.maps.model.CameraUpdateParam.ZoomTo.AnonymousClass1 */

            @Override // android.os.Parcelable.Creator
            public final ZoomTo createFromParcel(Parcel parcel) {
                return new ZoomTo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ZoomTo[] newArray(int i) {
                return new ZoomTo[i];
            }
        };
        private float a = Float.MAX_VALUE;

        public ZoomTo(float f) {
            this.a = f;
        }

        public ZoomTo(Parcel parcel) {
            this.a = new ParcelReader(parcel).readFloat(2, this.a);
        }

        public int describeContents() {
            return 0;
        }

        public float getZoom() {
            return this.a;
        }

        public void setZoom(float f) {
            this.a = f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int beginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeFloat(2, this.a);
            parcelWrite.finishObjectHeader(beginObjectHeader);
        }
    }

    public CameraUpdateParam() {
    }

    public CameraUpdateParam(Parcel parcel) {
        mco.a(C0201.m82(38330), C0201.m82(38331));
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.a = (CameraPosition) parcelReader.readParcelable(2, CameraPosition.CREATOR, null);
        this.b = (LatLng) parcelReader.readParcelable(3, LatLng.CREATOR, null);
        this.c = (NewLatLngBounds) parcelReader.readParcelable(4, NewLatLngBounds.CREATOR, null);
        this.e = (NewLatLngZoom) parcelReader.readParcelable(5, NewLatLngZoom.CREATOR, null);
        this.f = (ScrollBy) parcelReader.readParcelable(6, ScrollBy.CREATOR, null);
        this.g = (ZoomByWithFocus) parcelReader.readParcelable(7, ZoomByWithFocus.CREATOR, null);
        this.h = (ZoomBy) parcelReader.readParcelable(8, ZoomBy.CREATOR, null);
        this.i = (ZoomTo) parcelReader.readParcelable(9, ZoomTo.CREATOR, null);
        this.d = (NewLatLngBoundsWidthHeight) parcelReader.readParcelable(10, NewLatLngBoundsWidthHeight.CREATOR, null);
    }

    public int describeContents() {
        return 0;
    }

    public CameraPosition getCameraPosition() {
        return this.a;
    }

    public LatLng getLatLng() {
        return this.b;
    }

    public NewLatLngBounds getNewLatLngBounds() {
        return this.c;
    }

    public NewLatLngBoundsWidthHeight getNewLatLngBoundsWidthHeight() {
        return this.d;
    }

    public NewLatLngZoom getNewLatLngZoom() {
        return this.e;
    }

    public ScrollBy getScrollBy() {
        return this.f;
    }

    public ZoomBy getZoomBy() {
        return this.h;
    }

    public ZoomByWithFocus getZoomByWithFocus() {
        return this.g;
    }

    public ZoomTo getZoomTo() {
        return this.i;
    }

    public void setCameraPosition(CameraPosition cameraPosition) {
        this.a = cameraPosition;
    }

    public void setLatLng(LatLng latLng) {
        this.b = latLng;
    }

    public void setNewLatLngBounds(NewLatLngBounds newLatLngBounds) {
        this.c = newLatLngBounds;
    }

    public void setNewLatLngBoundsWidthHeight(NewLatLngBoundsWidthHeight newLatLngBoundsWidthHeight) {
        this.d = newLatLngBoundsWidthHeight;
    }

    public void setNewLatLngZoom(NewLatLngZoom newLatLngZoom) {
        this.e = newLatLngZoom;
    }

    public void setScrollBy(ScrollBy scrollBy) {
        this.f = scrollBy;
    }

    public void setZoomBy(ZoomBy zoomBy) {
        this.h = zoomBy;
    }

    public void setZoomByWithFocus(ZoomByWithFocus zoomByWithFocus) {
        this.g = zoomByWithFocus;
    }

    public void setZoomTo(ZoomTo zoomTo) {
        this.i = zoomTo;
    }

    public String toString() {
        return CameraUpdateParam.class.getSimpleName() + C0201.m82(38332) + C0201.m82(38333) + this.a + C0201.m82(38334) + this.b + C0201.m82(38335) + this.f + C0201.m82(38336) + this.g + C0201.m82(38337) + this.c + C0201.m82(38338) + this.e + C0201.m82(38339) + this.h + C0201.m82(38340) + this.i + C0201.m82(38341);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeParcelable(2, getCameraPosition(), i2, false);
        parcelWrite.writeParcelable(3, getLatLng(), i2, false);
        parcelWrite.writeParcelable(4, getNewLatLngBounds(), i2, false);
        parcelWrite.writeParcelable(5, getNewLatLngZoom(), i2, false);
        parcelWrite.writeParcelable(6, getScrollBy(), i2, false);
        parcelWrite.writeParcelable(7, getZoomByWithFocus(), i2, false);
        parcelWrite.writeParcelable(8, getZoomBy(), i2, false);
        parcelWrite.writeParcelable(9, getZoomTo(), i2, false);
        parcelWrite.writeParcelable(10, getNewLatLngBoundsWidthHeight(), i2, false);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
