package com.facebook.react.bridge.queue;

import android.os.Build;
import vigqyno.C0201;

public class ReactQueueConfigurationSpec {
    private static final long LEGACY_STACK_SIZE_BYTES = 0;
    private final MessageQueueThreadSpec mJSQueueThreadSpec;
    private final MessageQueueThreadSpec mNativeModulesQueueThreadSpec;

    public static class Builder {
        private MessageQueueThreadSpec mJSQueueSpec;
        private MessageQueueThreadSpec mNativeModulesQueueSpec;

        public ReactQueueConfigurationSpec build() {
            MessageQueueThreadSpec messageQueueThreadSpec = this.mNativeModulesQueueSpec;
            yh0.c(messageQueueThreadSpec);
            MessageQueueThreadSpec messageQueueThreadSpec2 = this.mJSQueueSpec;
            yh0.c(messageQueueThreadSpec2);
            return new ReactQueueConfigurationSpec(messageQueueThreadSpec, messageQueueThreadSpec2);
        }

        public Builder setJSQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            yh0.b(this.mJSQueueSpec == null, C0201.m82(4385));
            this.mJSQueueSpec = messageQueueThreadSpec;
            return this;
        }

        public Builder setNativeModulesQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            yh0.b(this.mNativeModulesQueueSpec == null, C0201.m82(4386));
            this.mNativeModulesQueueSpec = messageQueueThreadSpec;
            return this;
        }
    }

    static {
        C0201.m83(ReactQueueConfigurationSpec.class, 585);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReactQueueConfigurationSpec createDefault() {
        MessageQueueThreadSpec messageQueueThreadSpec;
        int i = Build.VERSION.SDK_INT;
        String r1 = C0201.m82(3764);
        if (i < 21) {
            messageQueueThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec(r1, 2000000);
        } else {
            messageQueueThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec(r1);
        }
        return builder().setJSQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec(C0201.m82(3765))).setNativeModulesQueueThreadSpec(messageQueueThreadSpec).build();
    }

    public MessageQueueThreadSpec getJSQueueThreadSpec() {
        return this.mJSQueueThreadSpec;
    }

    public MessageQueueThreadSpec getNativeModulesQueueThreadSpec() {
        return this.mNativeModulesQueueThreadSpec;
    }

    private ReactQueueConfigurationSpec(MessageQueueThreadSpec messageQueueThreadSpec, MessageQueueThreadSpec messageQueueThreadSpec2) {
        this.mNativeModulesQueueThreadSpec = messageQueueThreadSpec;
        this.mJSQueueThreadSpec = messageQueueThreadSpec2;
    }
}
