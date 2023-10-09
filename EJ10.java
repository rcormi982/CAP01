public class EJ10 {
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String RED = "\033[0;31m";     // RED
    public static final String ORANGE = "\033[33m";     // ORANGE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static void main(String[] args) {
        char cuadrado = '\uD127';
        System.out.println(RED + cuadrado + cuadrado + cuadrado + cuadrado + cuadrado +cuadrado +cuadrado +cuadrado +cuadrado +cuadrado +cuadrado);
        System.out.println("" +cuadrado + cuadrado + cuadrado + cuadrado + cuadrado +cuadrado +cuadrado +cuadrado +cuadrado +cuadrado +cuadrado);
        System.out.println("" +cuadrado + cuadrado + cuadrado);
        System.out.println("" +cuadrado + cuadrado + cuadrado);
        System.out.println("" +cuadrado + cuadrado + cuadrado);
        System.out.println("" +cuadrado + cuadrado + cuadrado);
        System.out.println("" +cuadrado + cuadrado + cuadrado);
        System.out.println("" +cuadrado + cuadrado + cuadrado + cuadrado + cuadrado +cuadrado +cuadrado +cuadrado +cuadrado +cuadrado +cuadrado);
        System.out.println("" +cuadrado + cuadrado + cuadrado + cuadrado + cuadrado +cuadrado +cuadrado +cuadrado +cuadrado +cuadrado +cuadrado);
        System.out.printf("%19s%n", "" +cuadrado + cuadrado + cuadrado);
        System.out.printf("%19s%n", "" +cuadrado + cuadrado + cuadrado);
        System.out.printf("%19s%n", "" +cuadrado + cuadrado + cuadrado);
        System.out.printf("%19s%n", "" +cuadrado + cuadrado + cuadrado);
        System.out.printf("%19s%n", "" +cuadrado + cuadrado + cuadrado);
        System.out.println("" +cuadrado + cuadrado + cuadrado + cuadrado + cuadrado +cuadrado +cuadrado +cuadrado +cuadrado +cuadrado +cuadrado);
        System.out.println("" +cuadrado + cuadrado + cuadrado + cuadrado + cuadrado +cuadrado +cuadrado +cuadrado +cuadrado +cuadrado +cuadrado + RESET);





    }
}
