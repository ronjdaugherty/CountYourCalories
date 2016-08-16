package util;

import java.text.DecimalFormat;

/**
 * Created by ronjdaugherty on 4/12/16.
 */
public class Utils {
    public static String formatNumber(int value) {
        DecimalFormat formatter = new DecimalFormat("#,###,###");
        String formatted = formatter.format(value);

        return formatted;
    }
}
