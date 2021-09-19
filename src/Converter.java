public interface Converter {

    public static double mToCm(double m) {
        return m * 100d;
    }

    public static double mToIn(double m) {
        return m * 39.3701d;
    }

    public static double mToFt(double m) {
        return m * 3.28084d;
    }

    public static double cmToM(double cm) {
        return cm * 0.01d;
    }

    public static double cmToIn(double cm) {
        return cm * 0.393701d;
    }

    public static double cmToFt(double cm) {
        return cm * 0.0328084d;
    }

    public static double inToM(double in) {
        return in * 0.0254d;
    }

    public static double inToCm(double in) {
        return in * 2.54d;
    }

    public static double inToFt(double in) {
        return in * 0.0833333d;
    }

    public static double ftToM(double ft) {
        return ft * 0.3048d;
    }

    public static double ftToCm(double ft) {
        return ft * 30.48d;
    }

    public static double ftToIn(double ft) {
        return ft * 12;
    }
}
