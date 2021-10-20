package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.yq0;
import vigqyno.C0201;

/* renamed from: hh1  reason: default package */
public abstract class hh1 extends g41 implements qe1 {
    public hh1() {
        super(C0201.m82(5649));
    }

    public static qe1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(5650));
        if (queryLocalInterface instanceof qe1) {
            return (qe1) queryLocalInterface;
        }
        return new sg1(iBinder);
    }

    @Override // defpackage.g41
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        jh1 jh1;
        jh1 jh12;
        String r1 = C0201.m82(5651);
        String r2 = C0201.m82(5652);
        jh1 jh13 = null;
        jh1 jh14 = null;
        jh1 jh15 = null;
        jh1 jh16 = null;
        kh1 kh1 = null;
        kh1 kh12 = null;
        kh1 kh13 = null;
        jh1 jh17 = null;
        jh1 jh18 = null;
        jh1 jh19 = null;
        jh1 jh110 = null;
        jh1 jh111 = null;
        jh1 jh112 = null;
        oh1 oh1 = null;
        jh1 jh113 = null;
        jh1 jh114 = null;
        jh1 jh115 = null;
        jh1 jh116 = null;
        switch (i) {
            case 1:
                initialize(yq0.a.U3(parcel.readStrongBinder()), (qh1) m71.b(parcel, qh1.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) m71.b(parcel, Bundle.CREATOR), m71.e(parcel), m71.e(parcel), parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) m71.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    jh1 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(r2);
                    if (queryLocalInterface instanceof jh1) {
                        jh12 = (jh1) queryLocalInterface;
                    } else {
                        jh12 = new lh1(readStrongBinder);
                    }
                    jh1 = jh12;
                }
                logEventAndBundle(readString, readString2, bundle, jh1, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), yq0.a.U3(parcel.readStrongBinder()), m71.e(parcel), parcel.readLong());
                break;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean e = m71.e(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(r2);
                    if (queryLocalInterface2 instanceof jh1) {
                        jh13 = (jh1) queryLocalInterface2;
                    } else {
                        jh13 = new lh1(readStrongBinder2);
                    }
                }
                getUserProperties(readString3, readString4, e, jh13);
                break;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface(r2);
                    if (queryLocalInterface3 instanceof jh1) {
                        jh116 = (jh1) queryLocalInterface3;
                    } else {
                        jh116 = new lh1(readStrongBinder3);
                    }
                }
                getMaxUserProperties(readString5, jh116);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) m71.b(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) m71.b(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface(r2);
                    if (queryLocalInterface4 instanceof jh1) {
                        jh115 = (jh1) queryLocalInterface4;
                    } else {
                        jh115 = new lh1(readStrongBinder4);
                    }
                }
                getConditionalUserProperties(readString6, readString7, jh115);
                break;
            case 11:
                setMeasurementEnabled(m71.e(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(yq0.a.U3(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface(r2);
                    if (queryLocalInterface5 instanceof jh1) {
                        jh114 = (jh1) queryLocalInterface5;
                    } else {
                        jh114 = new lh1(readStrongBinder5);
                    }
                }
                getCurrentScreenName(jh114);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface(r2);
                    if (queryLocalInterface6 instanceof jh1) {
                        jh113 = (jh1) queryLocalInterface6;
                    } else {
                        jh113 = new lh1(readStrongBinder6);
                    }
                }
                getCurrentScreenClass(jh113);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface(C0201.m82(5653));
                    if (queryLocalInterface7 instanceof oh1) {
                        oh1 = (oh1) queryLocalInterface7;
                    } else {
                        oh1 = new nh1(readStrongBinder7);
                    }
                }
                setInstanceIdProvider(oh1);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface(r2);
                    if (queryLocalInterface8 instanceof jh1) {
                        jh112 = (jh1) queryLocalInterface8;
                    } else {
                        jh112 = new lh1(readStrongBinder8);
                    }
                }
                getCachedAppInstanceId(jh112);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface(r2);
                    if (queryLocalInterface9 instanceof jh1) {
                        jh111 = (jh1) queryLocalInterface9;
                    } else {
                        jh111 = new lh1(readStrongBinder9);
                    }
                }
                getAppInstanceId(jh111);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface(r2);
                    if (queryLocalInterface10 instanceof jh1) {
                        jh110 = (jh1) queryLocalInterface10;
                    } else {
                        jh110 = new lh1(readStrongBinder10);
                    }
                }
                getGmpAppId(jh110);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface(r2);
                    if (queryLocalInterface11 instanceof jh1) {
                        jh19 = (jh1) queryLocalInterface11;
                    } else {
                        jh19 = new lh1(readStrongBinder11);
                    }
                }
                generateEventId(jh19);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(yq0.a.U3(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(yq0.a.U3(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(yq0.a.U3(parcel.readStrongBinder()), (Bundle) m71.b(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(yq0.a.U3(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(yq0.a.U3(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(yq0.a.U3(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                yq0 U3 = yq0.a.U3(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface(r2);
                    if (queryLocalInterface12 instanceof jh1) {
                        jh18 = (jh1) queryLocalInterface12;
                    } else {
                        jh18 = new lh1(readStrongBinder12);
                    }
                }
                onActivitySaveInstanceState(U3, jh18, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) m71.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface(r2);
                    if (queryLocalInterface13 instanceof jh1) {
                        jh17 = (jh1) queryLocalInterface13;
                    } else {
                        jh17 = new lh1(readStrongBinder13);
                    }
                }
                performAction(bundle2, jh17, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), yq0.a.U3(parcel.readStrongBinder()), yq0.a.U3(parcel.readStrongBinder()), yq0.a.U3(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface(r1);
                    if (queryLocalInterface14 instanceof kh1) {
                        kh13 = (kh1) queryLocalInterface14;
                    } else {
                        kh13 = new mh1(readStrongBinder14);
                    }
                }
                setEventInterceptor(kh13);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface(r1);
                    if (queryLocalInterface15 instanceof kh1) {
                        kh12 = (kh1) queryLocalInterface15;
                    } else {
                        kh12 = new mh1(readStrongBinder15);
                    }
                }
                registerOnMeasurementEventListener(kh12);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface(r1);
                    if (queryLocalInterface16 instanceof kh1) {
                        kh1 = (kh1) queryLocalInterface16;
                    } else {
                        kh1 = new mh1(readStrongBinder16);
                    }
                }
                unregisterOnMeasurementEventListener(kh1);
                break;
            case 37:
                initForTests(m71.f(parcel));
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface(r2);
                    if (queryLocalInterface17 instanceof jh1) {
                        jh16 = (jh1) queryLocalInterface17;
                    } else {
                        jh16 = new lh1(readStrongBinder17);
                    }
                }
                getTestFlag(jh16, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(m71.e(parcel));
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface(r2);
                    if (queryLocalInterface18 instanceof jh1) {
                        jh15 = (jh1) queryLocalInterface18;
                    } else {
                        jh15 = new lh1(readStrongBinder18);
                    }
                }
                isDataCollectionEnabled(jh15);
                break;
            case 41:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface(r2);
                    if (queryLocalInterface19 instanceof jh1) {
                        jh14 = (jh1) queryLocalInterface19;
                    } else {
                        jh14 = new lh1(readStrongBinder19);
                    }
                }
                getDeepLink(jh14);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
