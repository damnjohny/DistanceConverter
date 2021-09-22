public interface Converter {

    public static double mToCm(double m) {
        System.out.println(m * 100d);
        return m * 100d;
    }

    public static double mToIn(double m) {
        System.out.println(m * 39.3701d);
        return m * 39.3701d;
    }

    public static double mToFt(double m) {
        System.out.println(m * 3.28084d);
        return m * 3.28084d;
    }

    public static double cmToM(double cm) {
        System.out.println(cm * 0.01d);
        return cm * 0.01d;
    }

    public static double cmToIn(double cm) {
        System.out.println(cm * 0.393701d);
        return cm * 0.393701d;
    }

    public static double cmToFt(double cm) {
        System.out.println(cm * 0.0328084d);
        return cm * 0.0328084d;
    }

    public static double inToM(double in) {
        System.out.println(in * 0.0254d);
        return in * 0.0254d;
    }

    public static double inToCm(double in) {
        System.out.println(in * 2.54d);
        return in * 2.54d;
    }

    public static double inToFt(double in) {
        System.out.println(in * 0.0833333d);
        return in * 0.0833333d;
    }

    public static double ftToM(double ft) {
        System.out.println(ft * 0.3048d);
        return ft * 0.3048d;
    }

    public static double ftToCm(double ft) {
        System.out.println(ft * 30.48d);
        return ft * 30.48d;
    }

    public static double ftToIn(double ft) {
        System.out.println(ft * 12);
        return ft * 12;
    }
}
