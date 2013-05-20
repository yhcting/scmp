package scmp;

public class Utils {
    static class Logger {
        Logger(Class<?> cls) {

        }

        void v(String s) {
            System.out.println(s);
        }
        void d(String s) {
            System.out.println(s);
        }
        void i(String s) {
            System.out.println(s);
        }
        void w(String s) {
            System.out.println(s);
        }
        void e(String s) {
            System.out.println(s);
        }
    }

    static float
    max(float f0, float f1) {
        return (f0 > f1)? f0: f1;
    }
}
