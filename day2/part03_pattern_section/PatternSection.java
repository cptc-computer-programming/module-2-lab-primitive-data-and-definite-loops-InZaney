package day2.part03_pattern_section;

public class PatternSection {

    public static final int SIZE = 3;

    public static void main(String[] args) {
        // TODO: Call each method below in this order:
        printEdge();
        // printDiamondTop();
        // printDiamondBottom();
        printEdge();
    }

    // Format: + followed by repeating "=*" and ending with +
    // Example for SIZE=2: +=*=*=*=*+
    public static void printEdge() {
        // print a +
        System.out.print("+");

        // write a loop to print =* a variable number of times
        for (int i = 0; i < SIZE * 2; i ++) {
            System.out.print("=*");
        }

        // print a +
        System.out.println("+");

    }

    // TODO: Print the top half of the “double-diamond” section.
    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots decrease while "/\" pairs increase, then dots again
    // - use SIZE in all loop bounds (no magic numbers except 0/1)
    public static void printDiamondTop() {

    }

    // TODO: Print the bottom half (mirror/inverse of the top half).
    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots increase while "\/" pairs decrease, then dots again
    // - use SIZE in all loop bounds
    public static void printDiamondBottom() {

    }
    

    /*
    +=*=*=*=*=*=*+
    |...../\.....|
    |..../\/\....|
    |.../\/\/\...|
    |../\/\/\/\..|
    |./\/\/\/\/\.|
    |/\/\/\/\/\/\|
    |\/\/\/\/\/\/|
    |.\/\/\/\/\/.|
    |..\/\/\/\/..|
    |...\/\/\/...|
    |....\/\/....|
    |.....\/.....|
    +=*=*=*=*=*=*+
     */
}
