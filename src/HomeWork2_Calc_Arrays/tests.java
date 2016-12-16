package HomeWork2_Calc_Arrays;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;

/**
 * Created by user on 15.12.2016.
 */
public class tests {
    public static void main(String[] args) {
        double res =  2.45 - 0.34;
        DecimalFormat df = new DecimalFormat();
        df.setDecimalSeparatorAlwaysShown(false);
        String str = df.format(res).toString();
        String a = str.split(",")[0];
        String b = str.split(",")[1];
        String c = a.concat(".").concat(b);
        float fin = Float.parseFloat(c);
        System.out.printf("%.3f", fin);
        String.format(str, "");
    }
}
