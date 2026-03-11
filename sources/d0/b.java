package D0;

import G0.o;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public final class b extends DialogFragment {

    /* renamed from: f  reason: collision with root package name */
    public AlertDialog f193f;

    /* renamed from: g  reason: collision with root package name */
    public DialogInterface.OnCancelListener f194g;

    /* renamed from: h  reason: collision with root package name */
    public AlertDialog f195h;

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f194g;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f193f;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f195h == null) {
            Activity activity = getActivity();
            o.e(activity);
            this.f195h = new AlertDialog.Builder(activity).create();
        }
        return this.f195h;
    }
}
