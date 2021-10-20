package com.reactnativenavigation.views.topbar;

import com.google.android.material.appbar.AppBarLayout;

public class ScrollDIsabledBehavior extends AppBarLayout.Behavior {

    class a extends AppBarLayout.Behavior.a {
        public a(ScrollDIsabledBehavior scrollDIsabledBehavior) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.b
        public boolean a(AppBarLayout appBarLayout) {
            return false;
        }
    }

    public ScrollDIsabledBehavior() {
        m0(new a(this));
    }
}
