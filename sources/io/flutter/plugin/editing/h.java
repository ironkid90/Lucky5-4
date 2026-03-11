package io.flutter.plugin.editing;

import android.os.Bundle;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import b2.f;
import d2.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public final class h implements SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a  reason: collision with root package name */
    public final F0.h f3344a;

    /* renamed from: b  reason: collision with root package name */
    public final TextServicesManager f3345b;

    /* renamed from: c  reason: collision with root package name */
    public SpellCheckerSession f3346c;

    /* renamed from: d  reason: collision with root package name */
    public f f3347d;

    public h(TextServicesManager textServicesManager, F0.h hVar) {
        this.f3345b = textServicesManager;
        this.f3344a = hVar;
        hVar.f322g = this;
    }

    public final void a(String str, String str2, f fVar) {
        if (this.f3347d != null) {
            fVar.a("error", "Previous spell check request still pending.", (Object) null);
            return;
        }
        this.f3347d = fVar;
        Locale a2 = b.a(str);
        if (this.f3346c == null) {
            this.f3346c = this.f3345b.newSpellCheckerSession((Bundle) null, a2, this, true);
        }
        this.f3346c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f3347d.b(new ArrayList());
            this.f3347d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f3347d.b(new ArrayList());
            this.f3347d = null;
            return;
        }
        for (int i3 = 0; i3 < sentenceSuggestionsInfo.getSuggestionsCount(); i3++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i3);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i3);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i3) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z3 = false;
                for (int i4 = 0; i4 < suggestionsCount; i4++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i4);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z3 = true;
                    }
                }
                if (z3) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f3347d.b(arrayList);
        this.f3347d = null;
    }

    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
