package com.huawei.hianalytics.ab.fg;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.ab.bc.cd.ab.ab;
import com.huawei.hianalytics.ab.bc.cd.ab.ef;
import java.util.LinkedHashMap;
import vigqyno.C0188;
import vigqyno.C0201;

public class cd {
    private String ab;
    public ef bc;

    public cd(String str) {
        this.ab = str;
        this.bc = new ef(str);
        ab.cd().ab(this.ab, this.bc);
    }

    private com.huawei.hianalytics.ab.bc.cd.ab.cd bc(int i) {
        if (i == 0) {
            return this.bc.cd();
        }
        if (i == 1) {
            return this.bc.bc();
        }
        if (i == 2) {
            return this.bc.de();
        }
        if (i != 3) {
            return null;
        }
        return this.bc.ab();
    }

    private boolean cd(int i) {
        String str;
        String r2 = C0201.m82(213);
        if (i == 2) {
            if (C0201.m82(214).equals(this.ab)) {
                return true;
            }
            str = C0201.m82(215);
        } else {
            com.huawei.hianalytics.ab.bc.cd.ab.cd bc2 = bc(i);
            if (bc2 != null && !TextUtils.isEmpty(bc2.de())) {
                return true;
            }
            str = C0201.m82(216) + i;
        }
        com.huawei.hianalytics.ab.bc.ef.ab.ef(r2, str);
        return false;
    }

    public void ab(int i) {
        com.huawei.hianalytics.ab.bc.ef.ab.ab(C0201.m82(217), C0201.m82(218), this.ab, Integer.valueOf(i));
        bc.ab().ab(this.ab, i);
    }

    public void ab(int i, com.huawei.hianalytics.ab.bc.cd.ab.cd cdVar) {
        com.huawei.hianalytics.ab.bc.cd.ab.cd cdVar2;
        String r1 = C0201.m82(219);
        if (cdVar == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.bc(r1, C0201.m82(220), this.ab, Integer.valueOf(i));
            cdVar2 = null;
        } else {
            cdVar2 = new com.huawei.hianalytics.ab.bc.cd.ab.cd(cdVar);
        }
        com.huawei.hianalytics.ab.bc.ef.ab.ab(r1, C0201.m82(221), this.ab, Integer.valueOf(i));
        if (i == 0) {
            cd(cdVar2);
            com.huawei.hianalytics.ab.bc.hi.ab.ab().ab(this.ab);
        } else if (i == 1) {
            bc(cdVar2);
        } else if (i == 2) {
            de(cdVar2);
        } else if (i != 3) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(222));
        } else {
            ab(cdVar2);
        }
    }

    public void ab(int i, String str) {
        String r1 = C0201.m82(224);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(223) + this.ab);
        com.huawei.hianalytics.ab.bc.cd.ab.cd bc2 = bc(i);
        if (bc2 == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(225) + i);
            return;
        }
        if (!com.huawei.hianalytics.ab.bc.kl.cd.ab(C0201.m82(226), str, 4096)) {
            str = C0201.m82(227);
        }
        bc2.ef(str);
    }

    public void ab(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        Object[] objArr = {this.ab, Integer.valueOf(i)};
        String r1 = C0201.m82(228);
        com.huawei.hianalytics.ab.bc.ef.ab.ab(r1, C0201.m82(229), objArr);
        boolean ab2 = com.huawei.hianalytics.ab.bc.kl.cd.ab(str);
        String r2 = C0201.m82(230);
        if (ab2 || !cd(i)) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(232) + this.ab + r2 + i);
            return;
        }
        if (!com.huawei.hianalytics.ab.bc.kl.cd.ab(linkedHashMap)) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(231) + this.ab + r2 + i);
            linkedHashMap = null;
        }
        bc.ab().ab(this.ab, i, str, linkedHashMap);
    }

    public void ab(int i, boolean z) {
        Object[] objArr = {this.ab, Integer.valueOf(i)};
        String r1 = C0201.m82(233);
        com.huawei.hianalytics.ab.bc.ef.ab.ab(r1, C0201.m82(234), objArr);
        com.huawei.hianalytics.ab.bc.cd.ab.cd bc2 = bc(i);
        if (bc2 == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(235) + i);
            return;
        }
        bc2.gh(z ? C0201.m82(236) : C0201.m82(237));
    }

    public void ab(Context context) {
        String r1 = C0201.m82(239);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(238) + this.ab);
        if (context == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(240) + this.ab);
        } else if (!cd(0)) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(241) + this.ab);
        } else {
            bc.ab().ab(this.ab, context);
        }
    }

    public void ab(Context context, int i) {
        Object[] objArr = {this.ab, Integer.valueOf(i)};
        String r1 = C0201.m82(242);
        com.huawei.hianalytics.ab.bc.ef.ab.ab(r1, C0201.m82(243), objArr);
        if (context == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(244));
        } else {
            bc.ab().ab(this.ab, i);
        }
    }

    public void ab(Context context, String str, String str2) {
        String r1 = C0201.m82(246);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(245) + this.ab);
        if (context == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(247));
        } else if (com.huawei.hianalytics.ab.bc.kl.cd.ab(str) || !cd(0)) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(251) + this.ab);
        } else {
            if (!com.huawei.hianalytics.ab.bc.kl.cd.ab(C0201.m82(248), str2, 65536)) {
                com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(249) + this.ab);
                str2 = C0201.m82(250);
            }
            bc.ab().ab(this.ab, context, str, str2);
        }
    }

    public void ab(Context context, LinkedHashMap<String, String> linkedHashMap) {
        String r1 = C0201.m82(253);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(252) + this.ab);
        if (context == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(254));
        } else if (!cd(0)) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(255) + this.ab);
        } else {
            if (!com.huawei.hianalytics.ab.bc.kl.cd.ab(linkedHashMap)) {
                com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(256) + this.ab);
                linkedHashMap = null;
            }
            bc.ab().ab(this.ab, context, linkedHashMap);
        }
    }

    public void ab(com.huawei.hianalytics.ab.bc.cd.ab.cd cdVar) {
        String r1 = C0201.m82(258);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(257) + this.ab);
        if (cdVar == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(259));
            this.bc.ab((com.huawei.hianalytics.ab.bc.cd.ab.cd) null);
            return;
        }
        this.bc.ab(cdVar);
    }

    public void ab(String str, LinkedHashMap<String, String> linkedHashMap) {
        String r1 = C0201.m82(261);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(260) + this.ab);
        if (!cd(0)) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(262) + this.ab);
        } else if (TextUtils.isEmpty(str) || !com.huawei.hianalytics.ab.bc.kl.cd.ab(C0201.m82(263), str, C0201.m82(264))) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(266) + this.ab);
        } else {
            if (!com.huawei.hianalytics.ab.bc.kl.cd.ab(linkedHashMap)) {
                com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(265) + this.ab);
                linkedHashMap = null;
            }
            bc.ab().ab(this.ab, str, linkedHashMap);
        }
    }

    public void bc(int i, String str) {
        String r1 = C0201.m82(268);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(267) + this.ab);
        com.huawei.hianalytics.ab.bc.cd.ab.cd bc2 = bc(i);
        if (bc2 == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(269) + i);
            return;
        }
        if (!com.huawei.hianalytics.ab.bc.kl.cd.ab(C0201.m82(270), str, 4096)) {
            str = C0201.m82(271);
        }
        bc2.fg(str);
    }

    public void bc(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        Object[] objArr = {this.ab, Integer.valueOf(i)};
        String r1 = C0201.m82(272);
        com.huawei.hianalytics.ab.bc.ef.ab.ab(r1, C0201.m82(273), objArr);
        boolean ab2 = com.huawei.hianalytics.ab.bc.kl.cd.ab(str);
        String r2 = C0201.m82(274);
        if (ab2 || !cd(i)) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(276) + this.ab + r2 + i);
            return;
        }
        if (!com.huawei.hianalytics.ab.bc.kl.cd.ab(linkedHashMap)) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(275) + this.ab + r2 + i);
            linkedHashMap = null;
        }
        bc.ab().bc(this.ab, i, str, linkedHashMap);
    }

    public void bc(Context context) {
        String r1 = C0201.m82(278);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(277) + this.ab);
        if (context == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(279));
        } else if (!cd(0)) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(280) + this.ab);
        } else {
            bc.ab().bc(this.ab, context);
        }
    }

    public void bc(Context context, LinkedHashMap<String, String> linkedHashMap) {
        String r1 = C0201.m82(282);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(281) + this.ab);
        if (context == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(283));
        } else if (!cd(0)) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(284) + this.ab);
        } else {
            if (!com.huawei.hianalytics.ab.bc.kl.cd.ab(linkedHashMap)) {
                com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(285) + this.ab);
                linkedHashMap = null;
            }
            bc.ab().bc(this.ab, context, linkedHashMap);
        }
    }

    public void bc(com.huawei.hianalytics.ab.bc.cd.ab.cd cdVar) {
        String r1 = C0201.m82(287);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(286) + this.ab);
        if (cdVar == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(288));
            this.bc.bc(null);
            return;
        }
        this.bc.bc(cdVar);
    }

    public void bc(String str, LinkedHashMap<String, String> linkedHashMap) {
        String r1 = C0201.m82(290);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(289) + this.ab);
        if (!cd(0)) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(291) + this.ab);
        } else if (TextUtils.isEmpty(str) || !com.huawei.hianalytics.ab.bc.kl.cd.ab(C0201.m82(292), str, C0201.m82(293))) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(295) + this.ab);
        } else {
            if (!com.huawei.hianalytics.ab.bc.kl.cd.ab(linkedHashMap)) {
                com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(294) + this.ab);
                linkedHashMap = null;
            }
            bc.ab().bc(this.ab, str, linkedHashMap);
        }
    }

    public void cd(com.huawei.hianalytics.ab.bc.cd.ab.cd cdVar) {
        String r1 = C0201.m82(297);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(296) + this.ab);
        if (cdVar == null) {
            this.bc.cd(null);
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(298));
            return;
        }
        this.bc.cd(cdVar);
    }

    public void de(com.huawei.hianalytics.ab.bc.cd.ab.cd cdVar) {
        String r1 = C0201.m82(C0188.f19);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(299) + this.ab);
        if (cdVar == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(301));
            this.bc.de(null);
            return;
        }
        this.bc.de(cdVar);
    }
}
