/*
    Assuming an int variable named repeat has been declared and initialized to a value larger than or equal to zero,
    write snippet of code (not a function) that alternately prints "easy" and "peasy" on separate lines a total of
    repeat times. You should print "easy" first, then "peasy", then "easy", etc. So if repeat = 5 you should print:
        easy
        peasy
        easy
        peasy
        easy
        You may use any kind of loop you want!

    Note that you can test if a number is even by using the remainder operator. n is even if n % 2 == 0.
 */
public class forFormat {
    if (repeat % 2 == 0) {
        while (repeat > 0) {
            if (repeat % 2 == 0) {
                System.out.println("easy");
            }
            if (repeat % 2 != 0) {
                System.out.println("peasy");
            }
            repeat--;
        }
    }
    if (repeat % 2 != 0) {
        while (repeat > 0) {
            if (repeat % 2 != 0) {
                System.out.println("easy");
            }
            if (repeat % 2 == 0) {
                System.out.println("peasy");
            }
            repeat--;
        }
    }
}
