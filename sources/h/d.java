package h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import i.C0207i;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public final class d extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f3029e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class[] f3030f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f3031a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f3032b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f3033c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3034d;

    static {
        Class[] clsArr = {Context.class};
        f3029e = clsArr;
        f3030f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.f3033c = context;
        Object[] objArr = {context};
        this.f3031a = objArr;
        this.f3032b = objArr;
    }

    public static Object a(Context context) {
        if (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0211, code lost:
        if (r4 != null) goto L_0x0218;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.res.XmlResourceParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            h.c r2 = new h.c
            r3 = r19
            r2.<init>(r0, r3)
            android.view.Menu r3 = r2.f3004a
            int r4 = r17.getEventType()
        L_0x0011:
            r5 = 1
            java.lang.String r6 = "menu"
            r7 = 2
            if (r4 != r7) goto L_0x0032
            java.lang.String r4 = r17.getName()
            boolean r8 = r4.equals(r6)
            if (r8 == 0) goto L_0x0026
            int r4 = r17.next()
            goto L_0x0038
        L_0x0026:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Expecting menu, got "
            java.lang.String r2 = r2.concat(r4)
            r1.<init>(r2)
            throw r1
        L_0x0032:
            int r4 = r17.next()
            if (r4 != r5) goto L_0x0261
        L_0x0038:
            r8 = 0
            r10 = r8
            r11 = r10
            r12 = 0
        L_0x003c:
            if (r10 != 0) goto L_0x0260
            if (r4 == r5) goto L_0x0258
            java.lang.String r13 = "item"
            java.lang.String r14 = "group"
            r15 = 3
            if (r4 == r7) goto L_0x009d
            if (r4 == r15) goto L_0x004d
        L_0x0049:
            r9 = r17
            r7 = r5
            goto L_0x009a
        L_0x004d:
            java.lang.String r4 = r17.getName()
            if (r11 == 0) goto L_0x0061
            boolean r15 = r4.equals(r12)
            if (r15 == 0) goto L_0x0061
            r9 = r17
            r7 = r5
            r11 = r8
            r5 = 0
            r12 = 0
            goto L_0x0250
        L_0x0061:
            boolean r14 = r4.equals(r14)
            if (r14 == 0) goto L_0x0074
            r2.f3005b = r8
            r2.f3006c = r8
            r2.f3007d = r8
            r2.f3008e = r8
            r2.f3009f = r5
            r2.f3010g = r5
            goto L_0x0049
        L_0x0074:
            boolean r13 = r4.equals(r13)
            if (r13 == 0) goto L_0x0090
            boolean r4 = r2.f3011h
            if (r4 != 0) goto L_0x0049
            r2.f3011h = r5
            int r4 = r2.f3005b
            int r13 = r2.f3012i
            int r14 = r2.f3013j
            java.lang.CharSequence r15 = r2.f3014k
            android.view.MenuItem r4 = r3.add(r4, r13, r14, r15)
            r2.b(r4)
            goto L_0x0049
        L_0x0090:
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0049
            r9 = r17
            r7 = r5
            r10 = r7
        L_0x009a:
            r5 = 0
            goto L_0x0250
        L_0x009d:
            if (r11 == 0) goto L_0x00a0
            goto L_0x0049
        L_0x00a0:
            java.lang.String r4 = r17.getName()
            boolean r14 = r4.equals(r14)
            r7 = 4
            h.d r9 = r2.f3003D
            if (r14 == 0) goto L_0x00e0
            android.content.Context r4 = r9.f3033c
            int[] r9 = e.C0153a.f2928l
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r1, r9)
            int r9 = r4.getResourceId(r5, r8)
            r2.f3005b = r9
            int r9 = r4.getInt(r15, r8)
            r2.f3006c = r9
            int r7 = r4.getInt(r7, r8)
            r2.f3007d = r7
            r7 = 5
            int r7 = r4.getInt(r7, r8)
            r2.f3008e = r7
            r7 = 2
            boolean r9 = r4.getBoolean(r7, r5)
            r2.f3009f = r9
            boolean r7 = r4.getBoolean(r8, r5)
            r2.f3010g = r7
            r4.recycle()
            goto L_0x0049
        L_0x00e0:
            boolean r13 = r4.equals(r13)
            if (r13 == 0) goto L_0x0228
            android.content.Context r4 = r9.f3033c
            int[] r13 = e.C0153a.f2929m
            android.content.res.TypedArray r13 = r4.obtainStyledAttributes(r1, r13)
            r14 = 2
            int r5 = r13.getResourceId(r14, r8)
            r2.f3012i = r5
            int r5 = r2.f3006c
            r14 = 5
            int r5 = r13.getInt(r14, r5)
            int r14 = r2.f3007d
            r7 = 6
            int r7 = r13.getInt(r7, r14)
            r14 = -65536(0xffffffffffff0000, float:NaN)
            r5 = r5 & r14
            r14 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r14
            r5 = r5 | r7
            r2.f3013j = r5
            r5 = 7
            java.lang.CharSequence r5 = r13.getText(r5)
            r2.f3014k = r5
            r5 = 8
            java.lang.CharSequence r5 = r13.getText(r5)
            r2.f3015l = r5
            int r5 = r13.getResourceId(r8, r8)
            r2.f3016m = r5
            r5 = 9
            java.lang.String r5 = r13.getString(r5)
            if (r5 != 0) goto L_0x012c
            r5 = r8
            goto L_0x0130
        L_0x012c:
            char r5 = r5.charAt(r8)
        L_0x0130:
            r2.f3017n = r5
            r5 = 16
            r7 = 4096(0x1000, float:5.74E-42)
            int r5 = r13.getInt(r5, r7)
            r2.f3018o = r5
            r5 = 10
            java.lang.String r5 = r13.getString(r5)
            if (r5 != 0) goto L_0x0146
            r5 = r8
            goto L_0x014a
        L_0x0146:
            char r5 = r5.charAt(r8)
        L_0x014a:
            r2.f3019p = r5
            r5 = 20
            int r5 = r13.getInt(r5, r7)
            r2.f3020q = r5
            r5 = 11
            boolean r7 = r13.hasValue(r5)
            if (r7 == 0) goto L_0x0163
            boolean r5 = r13.getBoolean(r5, r8)
            r2.f3021r = r5
            goto L_0x0167
        L_0x0163:
            int r5 = r2.f3008e
            r2.f3021r = r5
        L_0x0167:
            boolean r5 = r13.getBoolean(r15, r8)
            r2.f3022s = r5
            boolean r5 = r2.f3009f
            r7 = 4
            boolean r5 = r13.getBoolean(r7, r5)
            r2.f3023t = r5
            boolean r5 = r2.f3010g
            r7 = 1
            boolean r5 = r13.getBoolean(r7, r5)
            r2.f3024u = r5
            r5 = 21
            r7 = -1
            int r5 = r13.getInt(r5, r7)
            r2.v = r5
            r5 = 12
            java.lang.String r5 = r13.getString(r5)
            r2.f3027y = r5
            r5 = 13
            int r5 = r13.getResourceId(r5, r8)
            r2.f3025w = r5
            r5 = 15
            java.lang.String r5 = r13.getString(r5)
            r2.f3026x = r5
            r5 = 14
            java.lang.String r5 = r13.getString(r5)
            if (r5 == 0) goto L_0x01aa
            r14 = 1
            goto L_0x01ab
        L_0x01aa:
            r14 = r8
        L_0x01ab:
            if (r14 == 0) goto L_0x01c6
            int r15 = r2.f3025w
            if (r15 != 0) goto L_0x01c6
            java.lang.String r15 = r2.f3026x
            if (r15 != 0) goto L_0x01c6
            java.lang.Class[] r14 = f3030f
            java.lang.Object[] r9 = r9.f3032b
            java.lang.Object r5 = r2.a(r5, r14, r9)
            if (r5 != 0) goto L_0x01c0
            goto L_0x01cf
        L_0x01c0:
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>()
            throw r1
        L_0x01c6:
            if (r14 == 0) goto L_0x01cf
            java.lang.String r5 = "SupportMenuInflater"
            java.lang.String r9 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
            android.util.Log.w(r5, r9)
        L_0x01cf:
            r5 = 17
            java.lang.CharSequence r5 = r13.getText(r5)
            r2.f3028z = r5
            r5 = 22
            java.lang.CharSequence r5 = r13.getText(r5)
            r2.f3000A = r5
            r5 = 19
            boolean r9 = r13.hasValue(r5)
            if (r9 == 0) goto L_0x01f4
            int r5 = r13.getInt(r5, r7)
            android.graphics.PorterDuff$Mode r7 = r2.f3002C
            android.graphics.PorterDuff$Mode r5 = j.C0258x.c(r5, r7)
            r2.f3002C = r5
            goto L_0x01f7
        L_0x01f4:
            r5 = 0
            r2.f3002C = r5
        L_0x01f7:
            r5 = 18
            boolean r7 = r13.hasValue(r5)
            if (r7 == 0) goto L_0x021c
            boolean r7 = r13.hasValue(r5)
            if (r7 == 0) goto L_0x0214
            int r7 = r13.getResourceId(r5, r8)
            if (r7 == 0) goto L_0x0214
            java.lang.Object r9 = f.C0159a.f2941a
            android.content.res.ColorStateList r4 = r4.getColorStateList(r7)
            if (r4 == 0) goto L_0x0214
            goto L_0x0218
        L_0x0214:
            android.content.res.ColorStateList r4 = r13.getColorStateList(r5)
        L_0x0218:
            r2.f3001B = r4
            r5 = 0
            goto L_0x021f
        L_0x021c:
            r5 = 0
            r2.f3001B = r5
        L_0x021f:
            r13.recycle()
            r2.f3011h = r8
            r9 = r17
            r7 = 1
            goto L_0x0250
        L_0x0228:
            r5 = 0
            boolean r7 = r4.equals(r6)
            if (r7 == 0) goto L_0x024b
            r7 = 1
            r2.f3011h = r7
            int r4 = r2.f3005b
            int r9 = r2.f3012i
            int r13 = r2.f3013j
            java.lang.CharSequence r14 = r2.f3014k
            android.view.SubMenu r4 = r3.addSubMenu(r4, r9, r13, r14)
            android.view.MenuItem r9 = r4.getItem()
            r2.b(r9)
            r9 = r17
            r0.b(r9, r1, r4)
            goto L_0x0250
        L_0x024b:
            r9 = r17
            r7 = 1
            r12 = r4
            r11 = r7
        L_0x0250:
            int r4 = r17.next()
            r5 = r7
            r7 = 2
            goto L_0x003c
        L_0x0258:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected end of document"
            r1.<init>(r2)
            throw r1
        L_0x0260:
            return
        L_0x0261:
            r9 = r17
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: h.d.b(android.content.res.XmlResourceParser, android.util.AttributeSet, android.view.Menu):void");
    }

    public final void inflate(int i3, Menu menu) {
        if (!(menu instanceof C0207i)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f3033c.getResources().getLayout(i3);
            b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
