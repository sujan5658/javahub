
package lib;
import java.text.DecimalFormat;
public class Util {
    public static double round(double db){
         DecimalFormat df = new DecimalFormat("##0.00");
         db = Double.parseDouble(df.format(db));
         return db;
    }
}
