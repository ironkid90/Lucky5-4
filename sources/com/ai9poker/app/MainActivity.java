package com.ai9poker.app;

import S1.C0078d;
import android.os.Bundle;

public final class MainActivity extends C0078d {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        getWindow().addFlags(524288);
        getWindow().addFlags(2097152);
    }
}
