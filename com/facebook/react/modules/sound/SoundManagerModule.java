package com.facebook.react.modules.sound;

import android.media.AudioManager;
import com.facebook.fbreact.specs.NativeSoundManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import vigqyno.C0201;

@pj0(name = "SoundManager")
public class SoundManagerModule extends NativeSoundManagerSpec {
    public static final String NAME = null;

    static {
        C0201.m83(SoundManagerModule.class, 590);
    }

    public SoundManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(34636);
    }

    @Override // com.facebook.fbreact.specs.NativeSoundManagerSpec
    public void playTouchSound() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService(C0201.m82(34637));
        if (audioManager != null) {
            audioManager.playSoundEffect(0);
        }
    }
}
