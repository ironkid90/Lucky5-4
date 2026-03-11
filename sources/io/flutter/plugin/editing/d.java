package io.flutter.plugin.editing;

import C0.f;
import C0.r;
import S1.o;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import c2.p;
import c2.q;
import d2.C0152a;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;

public final class d extends BaseInputConnection implements f {

    /* renamed from: a  reason: collision with root package name */
    public final o f3317a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3318b;

    /* renamed from: c  reason: collision with root package name */
    public final r f3319c;

    /* renamed from: d  reason: collision with root package name */
    public final g f3320d;

    /* renamed from: e  reason: collision with root package name */
    public final EditorInfo f3321e;

    /* renamed from: f  reason: collision with root package name */
    public ExtractedTextRequest f3322f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3323g = false;

    /* renamed from: h  reason: collision with root package name */
    public CursorAnchorInfo.Builder f3324h;

    /* renamed from: i  reason: collision with root package name */
    public final ExtractedText f3325i = new ExtractedText();

    /* renamed from: j  reason: collision with root package name */
    public final InputMethodManager f3326j;

    /* renamed from: k  reason: collision with root package name */
    public final DynamicLayout f3327k;

    /* renamed from: l  reason: collision with root package name */
    public final C0152a f3328l;

    /* renamed from: m  reason: collision with root package name */
    public final f f3329m;

    /* renamed from: n  reason: collision with root package name */
    public int f3330n = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(o oVar, int i3, r rVar, f fVar, g gVar, EditorInfo editorInfo) {
        super(oVar, true);
        FlutterJNI flutterJNI = new FlutterJNI();
        this.f3317a = oVar;
        this.f3318b = i3;
        this.f3319c = rVar;
        this.f3320d = gVar;
        gVar.a(this);
        this.f3321e = editorInfo;
        this.f3329m = fVar;
        this.f3328l = new C0152a(3, flutterJNI);
        this.f3327k = new DynamicLayout(gVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f3326j = (InputMethodManager) oVar.getContext().getSystemService("input_method");
    }

    public final void a(boolean z3) {
        g gVar = this.f3320d;
        gVar.getClass();
        this.f3326j.updateSelection(this.f3317a, Selection.getSelectionStart(gVar), Selection.getSelectionEnd(gVar), BaseInputConnection.getComposingSpanStart(gVar), BaseInputConnection.getComposingSpanEnd(gVar));
        ExtractedTextRequest extractedTextRequest = this.f3322f;
        InputMethodManager inputMethodManager = this.f3326j;
        o oVar = this.f3317a;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(oVar, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f3323g) {
            inputMethodManager.updateCursorAnchorInfo(oVar, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f3324h;
        if (builder == null) {
            this.f3324h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f3324h;
        g gVar = this.f3320d;
        gVar.getClass();
        int selectionStart = Selection.getSelectionStart(gVar);
        gVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(gVar));
        gVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(gVar);
        gVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(gVar);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.f3324h.setComposingText(-1, "");
        } else {
            this.f3324h.setComposingText(composingSpanStart, gVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.f3324h.build();
    }

    public final boolean beginBatchEdit() {
        this.f3320d.b();
        this.f3330n++;
        return super.beginBatchEdit();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if ((r4.flags & 1) == 0) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.inputmethod.ExtractedText c(android.view.inputmethod.ExtractedTextRequest r4) {
        /*
            r3 = this;
            android.view.inputmethod.ExtractedText r0 = r3.f3325i
            r1 = 0
            r0.startOffset = r1
            r1 = -1
            r0.partialStartOffset = r1
            r0.partialEndOffset = r1
            io.flutter.plugin.editing.g r1 = r3.f3320d
            r1.getClass()
            int r2 = android.text.Selection.getSelectionStart(r1)
            r0.selectionStart = r2
            r1.getClass()
            int r2 = android.text.Selection.getSelectionEnd(r1)
            r0.selectionEnd = r2
            if (r4 == 0) goto L_0x0026
            int r4 = r4.flags
            r4 = r4 & 1
            if (r4 != 0) goto L_0x002a
        L_0x0026:
            java.lang.String r1 = r1.toString()
        L_0x002a:
            r0.text = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.d.c(android.view.inputmethod.ExtractedTextRequest):android.view.inputmethod.ExtractedText");
    }

    public final void closeConnection() {
        super.closeConnection();
        this.f3320d.e(this);
        while (this.f3330n > 0) {
            endBatchEdit();
            this.f3330n--;
        }
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        int i4;
        if (Build.VERSION.SDK_INT >= 25 && (i3 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri b3 = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f3317a.getContext();
                    if (b3 != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(b3);
                            if (openInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i4 = openInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i4 = -1;
                                    }
                                    if (i4 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("mimeType", mimeType);
                                        hashMap.put("data", byteArray);
                                        hashMap.put("uri", b3.toString());
                                        r rVar = this.f3319c;
                                        rVar.getClass();
                                        ((q) rVar.f160g).a("TextInputClient.performAction", Arrays.asList(new Object[]{Integer.valueOf(this.f3318b), "TextInputAction.commitContent", hashMap}), (p) null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i4);
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r11 = java.lang.Character.codePointBefore(r1, r3);
        r12 = java.lang.Character.charCount(r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x003f A[EDGE_INSN: B:184:0x003f->B:14:0x003f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x01ad A[EDGE_INSN: B:190:0x01ad->B:99:0x01ad ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(boolean r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            io.flutter.plugin.editing.g r1 = r0.f3320d
            int r2 = android.text.Selection.getSelectionStart(r1)
            int r3 = android.text.Selection.getSelectionEnd(r1)
            r4 = 0
            if (r2 < 0) goto L_0x02e5
            if (r3 >= 0) goto L_0x0013
            goto L_0x02e5
        L_0x0013:
            d2.a r5 = r0.f3328l
            r6 = 1
            r7 = 8205(0x200d, float:1.1498E-41)
            r8 = 8419(0x20e3, float:1.1798E-41)
            r9 = 13
            r10 = 10
            if (r17 == 0) goto L_0x0187
            r5.getClass()
            if (r3 > r6) goto L_0x0028
        L_0x0025:
            r1 = r4
            goto L_0x0181
        L_0x0028:
            int r11 = java.lang.Character.codePointBefore(r1, r3)
            int r12 = java.lang.Character.charCount(r11)
            int r13 = r3 - r12
            if (r13 != 0) goto L_0x0035
            goto L_0x0025
        L_0x0035:
            if (r11 != r10) goto L_0x0043
            int r1 = java.lang.Character.codePointBefore(r1, r13)
            if (r1 != r9) goto L_0x003f
            int r12 = r12 + 1
        L_0x003f:
            int r1 = r3 - r12
            goto L_0x0181
        L_0x0043:
            java.lang.Object r5 = r5.f2912g
            io.flutter.embedding.engine.FlutterJNI r5 = (io.flutter.embedding.engine.FlutterJNI) r5
            boolean r9 = r5.isCodePointRegionalIndicator(r11)
            if (r9 == 0) goto L_0x0072
            int r7 = java.lang.Character.codePointBefore(r1, r13)
            int r8 = java.lang.Character.charCount(r7)
            int r13 = r13 - r8
            r8 = r6
        L_0x0057:
            if (r13 <= 0) goto L_0x006b
            boolean r7 = r5.isCodePointRegionalIndicator(r7)
            if (r7 == 0) goto L_0x006b
            int r7 = java.lang.Character.codePointBefore(r1, r13)
            int r9 = java.lang.Character.charCount(r7)
            int r13 = r13 - r9
            int r8 = r8 + 1
            goto L_0x0057
        L_0x006b:
            int r8 = r8 % 2
            if (r8 != 0) goto L_0x003f
            int r12 = r12 + 2
            goto L_0x003f
        L_0x0072:
            if (r11 != r8) goto L_0x00a5
            int r7 = java.lang.Character.codePointBefore(r1, r13)
            int r8 = java.lang.Character.charCount(r7)
            int r13 = r13 - r8
            if (r13 <= 0) goto L_0x0099
            boolean r5 = r5.isCodePointVariantSelector(r7)
            if (r5 == 0) goto L_0x0099
            int r1 = java.lang.Character.codePointBefore(r1, r13)
            boolean r5 = d2.C0152a.f(r1)
            if (r5 == 0) goto L_0x003f
            int r5 = java.lang.Character.charCount(r7)
            int r1 = java.lang.Character.charCount(r1)
            int r1 = r1 + r5
            goto L_0x00a3
        L_0x0099:
            boolean r1 = d2.C0152a.f(r7)
            if (r1 == 0) goto L_0x003f
            int r1 = java.lang.Character.charCount(r7)
        L_0x00a3:
            int r12 = r12 + r1
            goto L_0x003f
        L_0x00a5:
            r8 = 917631(0xe007f, float:1.285875E-39)
            if (r11 != r8) goto L_0x00de
            int r8 = java.lang.Character.codePointBefore(r1, r13)
            int r9 = java.lang.Character.charCount(r8)
            int r13 = r13 - r9
            r11 = r8
        L_0x00b4:
            if (r13 <= 0) goto L_0x00cf
            r8 = 917536(0xe0020, float:1.285742E-39)
            if (r8 > r11) goto L_0x00cf
            r8 = 917630(0xe007e, float:1.285874E-39)
            if (r11 > r8) goto L_0x00cf
            int r8 = java.lang.Character.charCount(r11)
            int r12 = r12 + r8
            int r11 = java.lang.Character.codePointBefore(r1, r13)
            int r8 = java.lang.Character.charCount(r11)
            int r13 = r13 - r8
            goto L_0x00b4
        L_0x00cf:
            boolean r8 = r5.isCodePointEmoji(r11)
            if (r8 != 0) goto L_0x00d9
            int r1 = r3 + -2
            goto L_0x0181
        L_0x00d9:
            int r8 = java.lang.Character.charCount(r11)
            int r12 = r12 + r8
        L_0x00de:
            boolean r8 = r5.isCodePointVariantSelector(r11)
            if (r8 == 0) goto L_0x00f6
            int r11 = java.lang.Character.codePointBefore(r1, r13)
            boolean r8 = r5.isCodePointEmoji(r11)
            if (r8 != 0) goto L_0x00f0
            goto L_0x003f
        L_0x00f0:
            int r8 = java.lang.Character.charCount(r11)
            int r12 = r12 + r8
            int r13 = r13 - r12
        L_0x00f6:
            boolean r8 = r5.isCodePointEmoji(r11)
            if (r8 == 0) goto L_0x003f
            r8 = r4
            r9 = r8
        L_0x00fe:
            if (r8 == 0) goto L_0x0109
            int r8 = java.lang.Character.charCount(r11)
            int r8 = r8 + r9
            int r8 = r8 + r6
            int r8 = r8 + r12
            r12 = r8
            r8 = r4
        L_0x0109:
            boolean r9 = r5.isCodePointEmojiModifier(r11)
            if (r9 == 0) goto L_0x0142
            int r7 = java.lang.Character.codePointBefore(r1, r13)
            int r8 = java.lang.Character.charCount(r7)
            int r13 = r13 - r8
            if (r13 <= 0) goto L_0x0134
            boolean r8 = r5.isCodePointVariantSelector(r7)
            if (r8 == 0) goto L_0x0134
            int r7 = java.lang.Character.codePointBefore(r1, r13)
            boolean r1 = r5.isCodePointEmoji(r7)
            if (r1 != 0) goto L_0x012c
            goto L_0x003f
        L_0x012c:
            int r1 = java.lang.Character.charCount(r7)
            java.lang.Character.charCount(r7)
            goto L_0x0135
        L_0x0134:
            r1 = r4
        L_0x0135:
            boolean r5 = r5.isCodePointEmojiModifierBase(r7)
            if (r5 == 0) goto L_0x003f
            int r5 = java.lang.Character.charCount(r7)
            int r5 = r5 + r1
            int r12 = r12 + r5
            goto L_0x017f
        L_0x0142:
            if (r13 <= 0) goto L_0x0173
            int r9 = java.lang.Character.codePointBefore(r1, r13)
            int r10 = java.lang.Character.charCount(r9)
            int r13 = r13 - r10
            if (r9 != r7) goto L_0x0172
            int r8 = java.lang.Character.codePointBefore(r1, r13)
            int r9 = java.lang.Character.charCount(r8)
            int r13 = r13 - r9
            if (r13 <= 0) goto L_0x0170
            boolean r9 = r5.isCodePointVariantSelector(r8)
            if (r9 == 0) goto L_0x0170
            int r8 = java.lang.Character.codePointBefore(r1, r13)
            int r9 = java.lang.Character.charCount(r8)
            int r10 = java.lang.Character.charCount(r8)
            int r13 = r13 - r10
        L_0x016d:
            r11 = r8
            r8 = r6
            goto L_0x0174
        L_0x0170:
            r9 = r4
            goto L_0x016d
        L_0x0172:
            r11 = r9
        L_0x0173:
            r9 = r4
        L_0x0174:
            if (r13 != 0) goto L_0x0177
            goto L_0x017f
        L_0x0177:
            if (r8 == 0) goto L_0x003f
            boolean r10 = r5.isCodePointEmoji(r11)
            if (r10 != 0) goto L_0x00fe
        L_0x017f:
            goto L_0x003f
        L_0x0181:
            int r1 = java.lang.Math.max(r1, r4)
            goto L_0x02d9
        L_0x0187:
            r5.getClass()
            int r11 = r1.length()
            int r12 = r11 + -1
            if (r3 < r12) goto L_0x0195
            r4 = r11
            goto L_0x02d1
        L_0x0195:
            int r13 = java.lang.Character.codePointAt(r1, r3)
            int r14 = java.lang.Character.charCount(r13)
            int r15 = r3 + r14
            if (r15 != 0) goto L_0x01a3
            goto L_0x02d1
        L_0x01a3:
            if (r13 != r10) goto L_0x01b1
            int r4 = java.lang.Character.codePointAt(r1, r15)
            if (r4 != r9) goto L_0x01ad
            int r14 = r14 + 1
        L_0x01ad:
            int r4 = r3 + r14
            goto L_0x02d1
        L_0x01b1:
            java.lang.Object r5 = r5.f2912g
            io.flutter.embedding.engine.FlutterJNI r5 = (io.flutter.embedding.engine.FlutterJNI) r5
            boolean r9 = r5.isCodePointRegionalIndicator(r13)
            if (r9 == 0) goto L_0x01eb
            if (r15 >= r12) goto L_0x01e8
            int r7 = java.lang.Character.codePointAt(r1, r15)
            boolean r7 = r5.isCodePointRegionalIndicator(r7)
            if (r7 != 0) goto L_0x01c8
            goto L_0x01e8
        L_0x01c8:
            r7 = r3
        L_0x01c9:
            if (r7 <= 0) goto L_0x01e1
            int r8 = java.lang.Character.codePointBefore(r1, r3)
            boolean r8 = r5.isCodePointRegionalIndicator(r8)
            if (r8 == 0) goto L_0x01e1
            int r8 = java.lang.Character.codePointBefore(r1, r3)
            int r8 = java.lang.Character.charCount(r8)
            int r7 = r7 - r8
            int r4 = r4 + 1
            goto L_0x01c9
        L_0x01e1:
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x01ad
            int r14 = r14 + 2
            goto L_0x01ad
        L_0x01e8:
            r4 = r15
            goto L_0x02d1
        L_0x01eb:
            boolean r9 = d2.C0152a.f(r13)
            if (r9 == 0) goto L_0x01f6
            int r9 = java.lang.Character.charCount(r13)
            int r14 = r14 + r9
        L_0x01f6:
            if (r13 != r8) goto L_0x022a
            int r4 = java.lang.Character.codePointBefore(r1, r15)
            int r7 = java.lang.Character.charCount(r4)
            int r7 = r7 + r15
            if (r7 >= r11) goto L_0x021e
            boolean r5 = r5.isCodePointVariantSelector(r4)
            if (r5 == 0) goto L_0x021e
            int r5 = java.lang.Character.codePointAt(r1, r7)
            boolean r7 = d2.C0152a.f(r5)
            if (r7 == 0) goto L_0x01ad
            int r4 = java.lang.Character.charCount(r4)
            int r5 = java.lang.Character.charCount(r5)
        L_0x021b:
            int r5 = r5 + r4
            int r14 = r14 + r5
            goto L_0x01ad
        L_0x021e:
            boolean r5 = d2.C0152a.f(r4)
            if (r5 == 0) goto L_0x01ad
            int r4 = java.lang.Character.charCount(r4)
        L_0x0228:
            int r14 = r14 + r4
            goto L_0x01ad
        L_0x022a:
            boolean r9 = r5.isCodePointEmoji(r13)
            if (r9 == 0) goto L_0x01ad
            r9 = r4
            r10 = r9
        L_0x0232:
            if (r9 == 0) goto L_0x023d
            int r9 = java.lang.Character.charCount(r13)
            int r9 = r9 + r10
            int r9 = r9 + r6
            int r9 = r9 + r14
            r14 = r9
            r9 = r4
        L_0x023d:
            boolean r10 = r5.isCodePointEmojiModifier(r13)
            if (r10 == 0) goto L_0x0245
            goto L_0x02cf
        L_0x0245:
            if (r15 >= r11) goto L_0x02c3
            int r10 = java.lang.Character.codePointAt(r1, r15)
            int r12 = java.lang.Character.charCount(r10)
            int r12 = r12 + r15
            if (r10 != r8) goto L_0x0281
            int r4 = java.lang.Character.codePointBefore(r1, r12)
            int r7 = java.lang.Character.charCount(r4)
            int r7 = r7 + r12
            if (r7 >= r11) goto L_0x0276
            boolean r5 = r5.isCodePointVariantSelector(r4)
            if (r5 == 0) goto L_0x0276
            int r5 = java.lang.Character.codePointAt(r1, r7)
            boolean r7 = d2.C0152a.f(r5)
            if (r7 == 0) goto L_0x01ad
            int r4 = java.lang.Character.charCount(r4)
            int r5 = java.lang.Character.charCount(r5)
            goto L_0x021b
        L_0x0276:
            boolean r5 = d2.C0152a.f(r4)
            if (r5 == 0) goto L_0x01ad
            int r4 = java.lang.Character.charCount(r4)
            goto L_0x0228
        L_0x0281:
            boolean r13 = r5.isCodePointEmojiModifier(r10)
            if (r13 == 0) goto L_0x028d
            int r4 = java.lang.Character.charCount(r10)
        L_0x028b:
            int r14 = r14 + r4
            goto L_0x02cf
        L_0x028d:
            boolean r13 = r5.isCodePointVariantSelector(r10)
            if (r13 == 0) goto L_0x0298
            int r4 = java.lang.Character.charCount(r10)
            goto L_0x028b
        L_0x0298:
            if (r10 != r7) goto L_0x02c1
            int r9 = java.lang.Character.codePointAt(r1, r12)
            int r10 = java.lang.Character.charCount(r9)
            int r10 = r10 + r12
            if (r10 >= r11) goto L_0x02bd
            boolean r12 = r5.isCodePointVariantSelector(r9)
            if (r12 == 0) goto L_0x02bd
            int r9 = java.lang.Character.codePointAt(r1, r10)
            int r12 = java.lang.Character.charCount(r9)
            int r13 = java.lang.Character.charCount(r9)
            int r13 = r13 + r10
            r10 = r12
            r15 = r13
            r13 = r9
        L_0x02bb:
            r9 = r6
            goto L_0x02c4
        L_0x02bd:
            r13 = r9
            r15 = r10
            r10 = r4
            goto L_0x02bb
        L_0x02c1:
            r13 = r10
            r15 = r12
        L_0x02c3:
            r10 = r4
        L_0x02c4:
            if (r15 < r11) goto L_0x02c7
            goto L_0x02cf
        L_0x02c7:
            if (r9 == 0) goto L_0x01ad
            boolean r12 = r5.isCodePointEmoji(r13)
            if (r12 != 0) goto L_0x0232
        L_0x02cf:
            goto L_0x01ad
        L_0x02d1:
            int r1 = r1.length()
            int r1 = java.lang.Math.min(r4, r1)
        L_0x02d9:
            if (r2 != r3) goto L_0x02e1
            if (r18 != 0) goto L_0x02e1
            r0.setSelection(r1, r1)
            goto L_0x02e4
        L_0x02e1:
            r0.setSelection(r2, r1)
        L_0x02e4:
            return r6
        L_0x02e5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.d.d(boolean, boolean):boolean");
    }

    public final boolean deleteSurroundingText(int i3, int i4) {
        g gVar = this.f3320d;
        gVar.getClass();
        if (Selection.getSelectionStart(gVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i3, i4);
    }

    public final boolean e(boolean z3, boolean z4) {
        g gVar = this.f3320d;
        int selectionStart = Selection.getSelectionStart(gVar);
        int selectionEnd = Selection.getSelectionEnd(gVar);
        boolean z5 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z4) {
            z5 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f3327k;
        if (z5) {
            if (z3) {
                Selection.moveUp(gVar, dynamicLayout);
            } else {
                Selection.moveDown(gVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(gVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z3) {
                Selection.extendUp(gVar, dynamicLayout);
            } else {
                Selection.extendDown(gVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(gVar), Selection.getSelectionEnd(gVar));
        }
        endBatchEdit();
        return true;
    }

    public final boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f3330n--;
        this.f3320d.c();
        return endBatchEdit;
    }

    public final Editable getEditable() {
        return this.f3320d;
    }

    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i3) {
        ExtractedTextRequest extractedTextRequest2;
        boolean z3 = true;
        if ((i3 & 1) == 0) {
            z3 = false;
        }
        if (z3) {
            extractedTextRequest2 = extractedTextRequest;
        } else {
            extractedTextRequest2 = null;
        }
        this.f3322f = extractedTextRequest2;
        return c(extractedTextRequest);
    }

    public final boolean performContextMenuAction(int i3) {
        beginBatchEdit();
        boolean z3 = true;
        g gVar = this.f3320d;
        if (i3 == 16908319) {
            setSelection(0, gVar.length());
        } else {
            o oVar = this.f3317a;
            if (i3 == 16908320) {
                int selectionStart = Selection.getSelectionStart(gVar);
                int selectionEnd = Selection.getSelectionEnd(gVar);
                if (selectionStart != selectionEnd) {
                    int min = Math.min(selectionStart, selectionEnd);
                    int max = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) oVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", gVar.subSequence(min, max)));
                    gVar.delete(min, max);
                    setSelection(min, min);
                }
            } else if (i3 == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(gVar);
                int selectionEnd2 = Selection.getSelectionEnd(gVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) oVar.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", gVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i3 == 16908322) {
                ClipData primaryClip = ((ClipboardManager) oVar.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(oVar.getContext());
                    int max2 = Math.max(0, Selection.getSelectionStart(gVar));
                    int max3 = Math.max(0, Selection.getSelectionEnd(gVar));
                    int min2 = Math.min(max2, max3);
                    int max4 = Math.max(max2, max3);
                    if (min2 != max4) {
                        gVar.delete(min2, max4);
                    }
                    gVar.insert(min2, coerceToText);
                    int length = coerceToText.length() + min2;
                    setSelection(length, length);
                }
            } else {
                z3 = false;
            }
        }
        endBatchEdit();
        return z3;
    }

    public final boolean performEditorAction(int i3) {
        int i4 = this.f3318b;
        r rVar = this.f3319c;
        if (i3 == 0) {
            rVar.getClass();
            ((q) rVar.f160g).a("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.unspecified"}), (p) null);
        } else if (i3 == 1) {
            rVar.getClass();
            ((q) rVar.f160g).a("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.newline"}), (p) null);
        } else if (i3 == 2) {
            rVar.getClass();
            ((q) rVar.f160g).a("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.go"}), (p) null);
        } else if (i3 == 3) {
            rVar.getClass();
            ((q) rVar.f160g).a("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.search"}), (p) null);
        } else if (i3 == 4) {
            rVar.getClass();
            ((q) rVar.f160g).a("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.send"}), (p) null);
        } else if (i3 == 5) {
            rVar.getClass();
            ((q) rVar.f160g).a("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.next"}), (p) null);
        } else if (i3 != 7) {
            rVar.getClass();
            ((q) rVar.f160g).a("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.done"}), (p) null);
        } else {
            rVar.getClass();
            ((q) rVar.f160g).a("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i4), "TextInputAction.previous"}), (p) null);
        }
        return true;
    }

    public final boolean performPrivateCommand(String str, Bundle bundle) {
        r rVar = this.f3319c;
        rVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof byte[]) {
                    hashMap2.put(next, bundle.getByteArray(next));
                } else if (obj instanceof Byte) {
                    hashMap2.put(next, Byte.valueOf(bundle.getByte(next)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(next, bundle.getCharArray(next));
                } else if (obj instanceof Character) {
                    hashMap2.put(next, Character.valueOf(bundle.getChar(next)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(next, bundle.getCharSequenceArray(next));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(next, bundle.getCharSequence(next));
                } else if (obj instanceof float[]) {
                    hashMap2.put(next, bundle.getFloatArray(next));
                } else if (obj instanceof Float) {
                    hashMap2.put(next, Float.valueOf(bundle.getFloat(next)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        ((q) rVar.f160g).a("TextInputClient.performPrivateCommand", Arrays.asList(new Serializable[]{Integer.valueOf(this.f3318b), hashMap}), (p) null);
        return true;
    }

    public final boolean requestCursorUpdates(int i3) {
        boolean z3;
        if ((i3 & 1) != 0) {
            this.f3326j.updateCursorAnchorInfo(this.f3317a, b());
        }
        if ((i3 & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f3323g = z3;
        return true;
    }

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f3329m.M(keyEvent);
    }

    public final boolean setComposingText(CharSequence charSequence, int i3) {
        boolean z3;
        beginBatchEdit();
        if (charSequence.length() == 0) {
            z3 = super.commitText(charSequence, i3);
        } else {
            z3 = super.setComposingText(charSequence, i3);
        }
        endBatchEdit();
        return z3;
    }

    public final boolean setSelection(int i3, int i4) {
        beginBatchEdit();
        boolean selection = super.setSelection(i3, i4);
        endBatchEdit();
        return selection;
    }
}
