package com.google.firebase.ktx;

import M0.a;
import a1.C0096a;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

@Keep
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    public List<C0096a> getComponents() {
        return a.A(a.f("fire-core-ktx", "21.0.0"));
    }
}
