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
            return Utils.NumberToBool((Double) obj);
        }
    }
}
