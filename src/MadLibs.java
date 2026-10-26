/**
 * Exercise 1 — MadLibs
 *
 * Declare at least 6 variables of mixed types (int, double,
 * String, char, boolean), then concatenate them into a paragraph.
 *
 * Requirements:
 *   - At least one computed value printed inside parentheses,
 *     e.g. ... + (price * quantity) + ...
 *   - At least one char and one boolean in the output
 *   - The result should actually be funny. That's a requirement.
 */
public class MadLibs {
    public static void main(String[] args) {

       int tries = 10;
       char me = 'J';
       double triestwo = 8.8;
       String one = "Hi, it's ";
       String two = " sorry I tried ";
       String three = " times, but it's still not funny.";

        System.out.println(one + me + two + (tries * triestwo) + three);

    }
}
