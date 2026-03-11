package F;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

public abstract class n {
    public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static PrecomputedText.Params c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void d(TextView textView, int i3) {
        textView.setFirstBaselineToTopHeight(i3);
    }

    public static CharSequence a(PrecomputedText precomputedText) {
        return precomputedText;
    }
}
