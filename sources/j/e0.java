package j;

import G.a;
import G.b;
import G.c;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.ai9poker.app.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

public final class e0 extends c implements View.OnClickListener {

    /* renamed from: D  reason: collision with root package name */
    public static final /* synthetic */ int f3667D = 0;

    /* renamed from: A  reason: collision with root package name */
    public int f3668A = -1;

    /* renamed from: B  reason: collision with root package name */
    public int f3669B = -1;

    /* renamed from: C  reason: collision with root package name */
    public int f3670C = -1;

    /* renamed from: n  reason: collision with root package name */
    public final int f3671n;

    /* renamed from: o  reason: collision with root package name */
    public final int f3672o;

    /* renamed from: p  reason: collision with root package name */
    public final LayoutInflater f3673p;

    /* renamed from: q  reason: collision with root package name */
    public final SearchView f3674q;

    /* renamed from: r  reason: collision with root package name */
    public final SearchableInfo f3675r;

    /* renamed from: s  reason: collision with root package name */
    public final Context f3676s;

    /* renamed from: t  reason: collision with root package name */
    public final WeakHashMap f3677t;

    /* renamed from: u  reason: collision with root package name */
    public final int f3678u;
    public int v = 1;

    /* renamed from: w  reason: collision with root package name */
    public ColorStateList f3679w;

    /* renamed from: x  reason: collision with root package name */
    public int f3680x = -1;

    /* renamed from: y  reason: collision with root package name */
    public int f3681y = -1;

    /* renamed from: z  reason: collision with root package name */
    public int f3682z = -1;

    public e0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f370g = true;
        this.f371h = null;
        this.f369f = false;
        this.f372i = context;
        this.f373j = -1;
        this.f374k = new a(this);
        this.f375l = new b(0, this);
        this.f3672o = suggestionRowLayout;
        this.f3671n = suggestionRowLayout;
        this.f3673p = (LayoutInflater) context.getSystemService("layout_inflater");
        SearchManager searchManager = (SearchManager) this.f372i.getSystemService("search");
        this.f3674q = searchView;
        this.f3675r = searchableInfo;
        this.f3678u = searchView.getSuggestionCommitIconResId();
        this.f3676s = context;
        this.f3677t = weakHashMap;
    }

    public static String h(Cursor cursor, int i3) {
        if (i3 == -1) {
            return null;
        }
        try {
            return cursor.getString(i3);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r22, android.database.Cursor r23) {
        /*
            r21 = this;
            r1 = r21
            r2 = r23
            java.lang.Object r0 = r22.getTag()
            r3 = r0
            j.d0 r3 = (j.d0) r3
            int r0 = r1.f3670C
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0018
        L_0x0017:
            r6 = r4
        L_0x0018:
            android.widget.TextView r7 = r3.f3662a
            r8 = 8
            if (r7 == 0) goto L_0x0034
            int r0 = r1.f3680x
            java.lang.String r0 = h(r2, r0)
            r7.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0031
            r7.setVisibility(r8)
            goto L_0x0034
        L_0x0031:
            r7.setVisibility(r4)
        L_0x0034:
            r9 = 1
            r10 = 2
            android.widget.TextView r0 = r3.f3663b
            if (r0 == 0) goto L_0x00bc
            int r11 = r1.f3682z
            java.lang.String r11 = h(r2, r11)
            if (r11 == 0) goto L_0x008f
            android.content.res.ColorStateList r12 = r1.f3679w
            if (r12 != 0) goto L_0x0065
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            android.content.Context r13 = r1.f372i
            android.content.res.Resources$Theme r13 = r13.getTheme()
            r14 = 2130903380(0x7f030154, float:1.7413576E38)
            r13.resolveAttribute(r14, r12, r9)
            android.content.Context r13 = r1.f372i
            android.content.res.Resources r13 = r13.getResources()
            int r12 = r12.resourceId
            android.content.res.ColorStateList r12 = r13.getColorStateList(r12)
            r1.f3679w = r12
        L_0x0065:
            android.text.SpannableString r12 = new android.text.SpannableString
            r12.<init>(r11)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            android.content.res.ColorStateList r14 = r1.f3679w
            r16 = 0
            r18 = 0
            r17 = 0
            r19 = 0
            r13 = r15
            r20 = r14
            r14 = r16
            r5 = r15
            r15 = r17
            r16 = r19
            r17 = r20
            r13.<init>(r14, r15, r16, r17, r18)
            int r11 = r11.length()
            r13 = 33
            r12.setSpan(r5, r4, r11, r13)
            goto L_0x0095
        L_0x008f:
            int r5 = r1.f3681y
            java.lang.String r12 = h(r2, r5)
        L_0x0095:
            boolean r5 = android.text.TextUtils.isEmpty(r12)
            if (r5 == 0) goto L_0x00a4
            if (r7 == 0) goto L_0x00ac
            r7.setSingleLine(r4)
            r7.setMaxLines(r10)
            goto L_0x00ac
        L_0x00a4:
            if (r7 == 0) goto L_0x00ac
            r7.setSingleLine(r9)
            r7.setMaxLines(r9)
        L_0x00ac:
            r0.setText(r12)
            boolean r5 = android.text.TextUtils.isEmpty(r12)
            if (r5 == 0) goto L_0x00b9
            r0.setVisibility(r8)
            goto L_0x00bc
        L_0x00b9:
            r0.setVisibility(r4)
        L_0x00bc:
            android.widget.ImageView r11 = r3.f3664c
            if (r11 == 0) goto L_0x0172
            int r0 = r1.f3668A
            r12 = -1
            if (r0 != r12) goto L_0x00c8
            r0 = 0
            goto L_0x015f
        L_0x00c8:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.f(r0)
            if (r0 == 0) goto L_0x00d4
            goto L_0x015f
        L_0x00d4:
            android.app.SearchableInfo r0 = r1.f3675r
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r12 = r0.flattenToShortString()
            java.util.WeakHashMap r13 = r1.f3677t
            boolean r14 = r13.containsKey(r12)
            if (r14 == 0) goto L_0x00fb
            java.lang.Object r0 = r13.get(r12)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f0
            r0 = 0
            goto L_0x0152
        L_0x00f0:
            android.content.Context r12 = r1.f3676s
            android.content.res.Resources r12 = r12.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r12)
            goto L_0x0152
        L_0x00fb:
            java.lang.String r14 = "SuggestionsAdapter"
            android.content.Context r15 = r1.f372i
            android.content.pm.PackageManager r15 = r15.getPackageManager()
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r5 = r15.getActivityInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x013d }
            int r10 = r5.getIconResource()
            if (r10 != 0) goto L_0x0111
        L_0x010f:
            r0 = 0
            goto L_0x0147
        L_0x0111:
            java.lang.String r8 = r0.getPackageName()
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo
            android.graphics.drawable.Drawable r5 = r15.getDrawable(r8, r10, r5)
            if (r5 != 0) goto L_0x013b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "Invalid icon resource "
            r5.<init>(r8)
            r5.append(r10)
            java.lang.String r8 = " for "
            r5.append(r8)
            java.lang.String r0 = r0.flattenToShortString()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r14, r0)
            goto L_0x010f
        L_0x013b:
            r0 = r5
            goto L_0x0147
        L_0x013d:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r14, r0)
            goto L_0x010f
        L_0x0147:
            if (r0 != 0) goto L_0x014b
            r5 = 0
            goto L_0x014f
        L_0x014b:
            android.graphics.drawable.Drawable$ConstantState r5 = r0.getConstantState()
        L_0x014f:
            r13.put(r12, r5)
        L_0x0152:
            if (r0 == 0) goto L_0x0155
            goto L_0x015f
        L_0x0155:
            android.content.Context r0 = r1.f372i
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x015f:
            r11.setImageDrawable(r0)
            if (r0 != 0) goto L_0x0169
            r0 = 4
            r11.setVisibility(r0)
            goto L_0x0172
        L_0x0169:
            r11.setVisibility(r4)
            r0.setVisible(r4, r4)
            r0.setVisible(r9, r4)
        L_0x0172:
            android.widget.ImageView r0 = r3.f3665d
            if (r0 == 0) goto L_0x0199
            int r5 = r1.f3669B
            r8 = -1
            if (r5 != r8) goto L_0x017d
            r5 = 0
            goto L_0x0185
        L_0x017d:
            java.lang.String r2 = r2.getString(r5)
            android.graphics.drawable.Drawable r5 = r1.f(r2)
        L_0x0185:
            r0.setImageDrawable(r5)
            if (r5 != 0) goto L_0x0190
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x0199
        L_0x0190:
            r0.setVisibility(r4)
            r5.setVisible(r4, r4)
            r5.setVisible(r9, r4)
        L_0x0199:
            int r0 = r1.v
            android.widget.ImageView r2 = r3.f3666e
            r3 = 2
            if (r0 == r3) goto L_0x01ad
            if (r0 != r9) goto L_0x01a7
            r0 = r6 & 1
            if (r0 == 0) goto L_0x01a7
            goto L_0x01ad
        L_0x01a7:
            r3 = 8
            r2.setVisibility(r3)
            goto L_0x01ba
        L_0x01ad:
            r2.setVisibility(r4)
            java.lang.CharSequence r0 = r7.getText()
            r2.setTag(r0)
            r2.setOnClickListener(r1)
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.e0.a(android.view.View, android.database.Cursor):void");
    }

    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f3680x = cursor.getColumnIndex("suggest_text_1");
                this.f3681y = cursor.getColumnIndex("suggest_text_2");
                this.f3682z = cursor.getColumnIndex("suggest_text_2_url");
                this.f3668A = cursor.getColumnIndex("suggest_icon_1");
                this.f3669B = cursor.getColumnIndex("suggest_icon_2");
                this.f3670C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    public final String c(Cursor cursor) {
        String h3;
        String h4;
        if (cursor == null) {
            return null;
        }
        String h5 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h5 != null) {
            return h5;
        }
        SearchableInfo searchableInfo = this.f3675r;
        if (searchableInfo.shouldRewriteQueryFromData() && (h4 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h4;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h3 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h3;
    }

    public final View d(ViewGroup viewGroup) {
        View inflate = this.f3673p.inflate(this.f3671n, viewGroup, false);
        inflate.setTag(new d0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f3678u);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int i3;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f372i.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i3 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i3 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i3 != 0) {
                        return resourcesForApplication.getDrawable(i3);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a0, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x008f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            r10 = this;
            java.util.WeakHashMap r0 = r10.f3677t
            java.lang.String r1 = "SuggestionsAdapter"
            android.content.Context r2 = r10.f3676s
            java.lang.String r3 = "android.resource://"
            r4 = 0
            if (r11 == 0) goto L_0x0113
            boolean r5 = r11.isEmpty()
            if (r5 != 0) goto L_0x0113
            java.lang.String r5 = "0"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x001b
            goto L_0x0113
        L_0x001b:
            int r5 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0060, NotFoundException -> 0x0056 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0060, NotFoundException -> 0x0056 }
            r6.<init>(r3)     // Catch:{ NumberFormatException -> 0x0060, NotFoundException -> 0x0056 }
            java.lang.String r3 = r2.getPackageName()     // Catch:{ NumberFormatException -> 0x0060, NotFoundException -> 0x0056 }
            r6.append(r3)     // Catch:{ NumberFormatException -> 0x0060, NotFoundException -> 0x0056 }
            java.lang.String r3 = "/"
            r6.append(r3)     // Catch:{ NumberFormatException -> 0x0060, NotFoundException -> 0x0056 }
            r6.append(r5)     // Catch:{ NumberFormatException -> 0x0060, NotFoundException -> 0x0056 }
            java.lang.String r3 = r6.toString()     // Catch:{ NumberFormatException -> 0x0060, NotFoundException -> 0x0056 }
            java.lang.Object r6 = r0.get(r3)     // Catch:{ NumberFormatException -> 0x0060, NotFoundException -> 0x0056 }
            android.graphics.drawable.Drawable$ConstantState r6 = (android.graphics.drawable.Drawable.ConstantState) r6     // Catch:{ NumberFormatException -> 0x0060, NotFoundException -> 0x0056 }
            if (r6 != 0) goto L_0x0041
            r6 = r4
            goto L_0x0045
        L_0x0041:
            android.graphics.drawable.Drawable r6 = r6.newDrawable()     // Catch:{ NumberFormatException -> 0x0060, NotFoundException -> 0x0056 }
        L_0x0045:
            if (r6 == 0) goto L_0x0048
            return r6
        L_0x0048:
            android.graphics.drawable.Drawable r5 = r.C0408a.b(r2, r5)     // Catch:{ NumberFormatException -> 0x0060, NotFoundException -> 0x0056 }
            if (r5 == 0) goto L_0x0055
            android.graphics.drawable.Drawable$ConstantState r6 = r5.getConstantState()     // Catch:{ NumberFormatException -> 0x0060, NotFoundException -> 0x0056 }
            r0.put(r3, r6)     // Catch:{ NumberFormatException -> 0x0060, NotFoundException -> 0x0056 }
        L_0x0055:
            return r5
        L_0x0056:
            java.lang.String r0 = "Icon resource not found: "
            java.lang.String r11 = r0.concat(r11)
            android.util.Log.w(r1, r11)
            return r4
        L_0x0060:
            java.lang.Object r3 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3
            if (r3 != 0) goto L_0x006a
            r3 = r4
            goto L_0x006e
        L_0x006a:
            android.graphics.drawable.Drawable r3 = r3.newDrawable()
        L_0x006e:
            if (r3 == 0) goto L_0x0071
            return r3
        L_0x0071:
            android.net.Uri r3 = android.net.Uri.parse(r11)
            java.lang.String r5 = "Error closing icon stream for "
            java.lang.String r6 = "Failed to open "
            java.lang.String r7 = "Resource does not exist: "
            java.lang.String r8 = r3.getScheme()     // Catch:{ FileNotFoundException -> 0x008d }
            java.lang.String r9 = "android.resource"
            boolean r8 = r9.equals(r8)     // Catch:{ FileNotFoundException -> 0x008d }
            if (r8 == 0) goto L_0x00a1
            android.graphics.drawable.Drawable r4 = r10.e(r3)     // Catch:{ NotFoundException -> 0x008f }
            goto L_0x010a
        L_0x008d:
            r2 = move-exception
            goto L_0x00ed
        L_0x008f:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x008d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x008d }
            r5.<init>(r7)     // Catch:{ FileNotFoundException -> 0x008d }
            r5.append(r3)     // Catch:{ FileNotFoundException -> 0x008d }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x008d }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008d }
            throw r2     // Catch:{ FileNotFoundException -> 0x008d }
        L_0x00a1:
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x008d }
            java.io.InputStream r2 = r2.openInputStream(r3)     // Catch:{ FileNotFoundException -> 0x008d }
            if (r2 == 0) goto L_0x00db
            android.graphics.drawable.Drawable r6 = android.graphics.drawable.Drawable.createFromStream(r2, r4)     // Catch:{ all -> 0x00c5 }
            r2.close()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x00c3
        L_0x00b3:
            r2 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x008d }
            r7.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008d }
            r7.append(r3)     // Catch:{ FileNotFoundException -> 0x008d }
            java.lang.String r5 = r7.toString()     // Catch:{ FileNotFoundException -> 0x008d }
            android.util.Log.e(r1, r5, r2)     // Catch:{ FileNotFoundException -> 0x008d }
        L_0x00c3:
            r4 = r6
            goto L_0x010a
        L_0x00c5:
            r6 = move-exception
            r2.close()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00da
        L_0x00ca:
            r2 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x008d }
            r7.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008d }
            r7.append(r3)     // Catch:{ FileNotFoundException -> 0x008d }
            java.lang.String r5 = r7.toString()     // Catch:{ FileNotFoundException -> 0x008d }
            android.util.Log.e(r1, r5, r2)     // Catch:{ FileNotFoundException -> 0x008d }
        L_0x00da:
            throw r6     // Catch:{ FileNotFoundException -> 0x008d }
        L_0x00db:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x008d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x008d }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x008d }
            r5.append(r3)     // Catch:{ FileNotFoundException -> 0x008d }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x008d }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008d }
            throw r2     // Catch:{ FileNotFoundException -> 0x008d }
        L_0x00ed:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Icon not found: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = ", "
            r5.append(r3)
            java.lang.String r2 = r2.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            android.util.Log.w(r1, r2)
        L_0x010a:
            if (r4 == 0) goto L_0x0113
            android.graphics.drawable.Drawable$ConstantState r1 = r4.getConstantState()
            r0.put(r11, r1)
        L_0x0113:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j.e0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f372i.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public final View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i3, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.f3673p.inflate(this.f3672o, viewGroup, false);
            if (inflate != null) {
                ((d0) inflate.getTag()).f3662a.setText(e2.toString());
            }
            return inflate;
        }
    }

    public final View getView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i3, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View d3 = d(viewGroup);
            ((d0) d3.getTag()).f3662a.setText(e2.toString());
            return d3;
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f371h;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f371h;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3674q.n((CharSequence) tag);
        }
    }
}
