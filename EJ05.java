public class EJ05 {
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String RED = "\033[0;31m";     // RED
    public static final String ORANGE = "\033[33m";     // ORANGE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static void main(String[] args) {
        System.out.printf(GREEN + "Lunes\tMartes\tMiércoles  Jueves  Viernes%n" + RESET);
        System.out.printf(CYAN + "=====\t======\t=========  ======  =======%n" + RESET);
        System.out.printf("%-5s\t%-6s\t%-9s\t   %-6s\t   %s%n", RED + "PROG", PURPLE + "LM", PURPLE + "LM", RED + "PROG", YELLOW + "FOL"+ RESET);
        System.out.printf("%-5s\t%-6s\t%-9s\t   %-6s\t   %s%n", RED + "PROG", PURPLE + "LM", PURPLE + "LM", RED + "PROG", YELLOW + "FOL"+ RESET);
        System.out.printf("%-5s\t%-6s\t%-9s\t   %-6s\t   %s%n", RED + "PROG", ORANGE + "BDATO", RED + "PROG", RED + "PROG", YELLOW +  "FOL" + RESET);
        System.out.printf("%-5s\t%-6s\t%-9s\t   %-6s   %s%n", CYAN + "SINF", ORANGE + "BDATO", RED + "PROG", ORANGE + "BDATO", CYAN + "SINF" + RESET);
        System.out.printf("%-5s\t%-6s\t%-9s\t   %-6s   %s%n", BLUE + "EIE", GREEN + "ED", ORANGE + "BDATO", ORANGE + "BDATO", BLUE + "EIE"+ RESET);
        System.out.printf("%-5s\t%-6s\t%-9s\t   %-6s\t   %s%n", CYAN + "SINF", GREEN + "ED", ORANGE + "BDATO", GREEN + "ED", BLUE + "EIE" + RESET);
    }
}
