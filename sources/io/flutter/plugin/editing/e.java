package io.flutter.plugin.editing;

import S1.o;
import android.text.Editable;
import android.view.inputmethod.BaseInputConnection;

public final class e extends BaseInputConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f3331a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(o oVar, g gVar) {
        super(oVar, true);
        this.f3331a = gVar;
    }

    public final Editable getEditable() {
        return this.f3331a;
    }
}
