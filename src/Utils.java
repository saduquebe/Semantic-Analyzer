import javax.swing.text.StyledEditorKit;

public class Utils {
    public static Boolean NumberToBool (Double number) {
        return number != 0.0;
    }

    public static Double BoolToNumber (Boolean bool) {
        return (bool) ? 1.0 : 0.0;
    }

    public static Boolean castToBoolean (Object obj) {
        try {
            return (Boolean) obj;
        } catch (ClassCastException e) {
            return NumberToBool((Double) obj);
        }
    }

    public static Double castToDouble (Object obj) {
        try {
            return (Double) obj;
        } catch (ClassCastException e) {
            return BoolToNumber((Boolean) obj);
        }
    }
}
