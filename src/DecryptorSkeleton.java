import java.util.Arrays;
import java.util.HashMap;

/**
 * For this mini-assignment, the goal is to git you guys more familiar with Git.
 * You'll need to finish each of the methods. We made certain to make each method
 * relatively simple, as we are aware not everyone has experience with Java yet.
 *
 * Fear not, most of these can be solved with simple Google searches. The primary
 * goal is to make it such that each one of your team members makes at least one
 * commit (most likely a commit per method completion). Once finished, show your
 * TA the working code, as well as your Git history showing every team member
 * made a contribution. Explain what problems you had. Did you get your first
 * taste of merge conflicts? Potentially this could have been separated into multiple
 * files? What are your thoughts?
 *
 * Remember, GOOGLE IS YOUR FRIEND! If you feel you're working too hard on a problem,
 * you most likely are. Oh, and if you are completely new to Java, you're going to
 * love how much easier it is to work with arrays (and other data structures) in this
 * language as opposed to C (The C solution for this is literally like 8x more complex).
 *
 * Place your @author tags here.
 * @author First Last : netid@iastate.edu
 * @author ...
 * @author ...
 * @author ...
 */
public class DecryptorSkeleton {
    public static void main(String[] args) {
        int[] toDecrypt = {
                101001, 1001101, 1010011, 11010, 10, 10000000, 1001100, 1101011, 11,
                11010, 1001000, 110101, 1001100, 1111111, 11100, 10101, 10, 10000000,
                1001100, 1101011, 1011101, 1, 1100, 1011101, 11010, 111, 111010
        };

        convertBinaryArrayToDecimalArray(toDecrypt);
        System.out.println(Arrays.toString(toDecrypt)); // As a check, the first value will be 41 and the last is 58.

        shiftArrayValues(toDecrypt);
        System.out.println(Arrays.toString(toDecrypt)); // As a check, the first value will be 40 and the last is 55.

        divideArrayValues(toDecrypt);
        System.out.println(Arrays.toString(toDecrypt)); // As a check, the first value will be 8 and the last is 11.

        System.out.println(A1Z26Cypher(toDecrypt));     // As a check, the first word in this String is "hope".
    }


    /**
     * STEP 1: COMPLETE THIS METHOD. ONCE COMPLETED, HAVE THE TEAM MEMBER
     *         WHO COMPLETED THIS MAKE AND PUSH THE COMMIT TO GITHUB.
     *
     * Given an array of binary representations of numbers,
     * converts each value into its decimal representation.
     *
     * HINT: This can be done in two lines of code.
     *
     * @param toDecrypt - The array to be decoded.
     */
    public static void convertBinaryArrayToDecimalArray(int[] toDecrypt) {
        // TODO
    }


    /**
     * STEP 2: COMPLETE THIS METHOD. ONCE COMPLETED, HAVE THE TEAM MEMBER
     *         WHO COMPLETED THIS MAKE AND PUSH THE COMMIT TO GITHUB.
     *
     * Given an array of decimal ints, perform the following:
     *      If the array index mod 3 == 0, modify its value to be itself - 1.
     *      Else if the array index mod 3 == 1, modify its value to be itself - 2.
     *      Otherwise, modify its value to be itself - 3.
     *
     * HINT: This CAN be done in two lines of logic. Realistically though,
     *       it's easier to read and expectation is about seven lines of code.
     *
     * @param toDecrypt - The array to be decoded.
     */
    public static void shiftArrayValues(int[] toDecrypt) {
        // TODO
    }


    /**
     * STEP 3: COMPLETE THIS METHOD. ONCE COMPLETED, HAVE THE TEAM MEMBER
     *         WHO COMPLETED THIS MAKE AND PUSH THE COMMIT TO GITHUB.
     *
     * Given an array of decimal ints, set the value
     * of each index to be itself divided by 5.
     *
     * HINT: This can be done in two lines of code.
     *
     * @param toDecrypt - The array to be decoded.
     */
    public static void divideArrayValues(int[] toDecrypt) {
        // TODO
        for(i = 0; i < toDecrypt.length; i++){
            toDecrypt[i] = toDecrypt[i] / 5;
        }
    }


    /**
     * STEP 4: COMPLETE THIS METHOD. ONCE COMPLETED, HAVE THE TEAM MEMBER
     *         WHO COMPLETED THIS MAKE AND PUSH THE COMMIT TO GITHUB.
     *
     * Given an array of decimal ints, using the A1Z26 Cypher, build a String
     * that correlates each decimal value to a char (Character, a-z).
     *
     * HINT: This can be done in two additional lines of code.
     *
     * @param toDecrypt - The array to be decoded.
     */
    public static String A1Z26Cypher(int[] toDecrypt) {
        HashMap<Integer, Character> cypher = new HashMap<>();
        cypher.put(0, ' ');
        cypher.put(1, 'a');
        cypher.put(2, 'b');
        cypher.put(3, 'c');
        cypher.put(4, 'd');
        cypher.put(5, 'e');
        cypher.put(6, 'f');
        cypher.put(7, 'g');
        cypher.put(8, 'h');
        cypher.put(9, 'i');
        cypher.put(10, 'j');
        cypher.put(11, 'k');
        cypher.put(12, 'l');
        cypher.put(13, 'm');
        cypher.put(14, 'n');
        cypher.put(15, 'o');
        cypher.put(16, 'p');
        cypher.put(17, 'q');
        cypher.put(18, 'r');
        cypher.put(19, 's');
        cypher.put(20, 't');
        cypher.put(21, 'u');
        cypher.put(22, 'v');
        cypher.put(23, 'w');
        cypher.put(24, 'x');
        cypher.put(25, 'y');
        cypher.put(26, 'z');

        StringBuilder solution = new StringBuilder();

        // TODO
	//
	for (int i = 0; i < toDecrypt.length; i++){
		solution.append(cypher.get(toDecrypt[i]));
	}        solution.append('!');
        return solution.toString();
    }
}
