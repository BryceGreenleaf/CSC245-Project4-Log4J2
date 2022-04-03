//Bryce Greenleaf
//CSC 245

package edu.arapahoe.csc245;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class HelloWorld {

    private static final Logger logger = LogManager.getLogger(HelloWorld.class);

    public static void main(String[] args) {

        int[] data = new int[100];

        // Initialize array
        for (int i = 0; i < 100; i++)
            data[i] = (int)(Math.random() * 10000);
        logger.info("Array Created" ); // Adding a logger to see when the array was created and


        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter an index: ");
            int index = input.nextInt();
            logger.info("What the users input is: " + index); //Adding a logger with the users input to see what the user typed

            System.out.println("The element is " + data[index]);
            logger.info("Element Number " + data[index]); //Adding a logger for the element number that was created.
        }
        catch (InputMismatchException ex) {
            System.out.println("Input Mismatch please enter correct input");
            logger.debug("Input Mismatch"); //Adding a logger to see if there were any input mismatch.
        }
        catch (ArrayIndexOutOfBoundsException ex) {

           System.out.println("Index is out of bounds");
           logger.debug("Index out of bounds"); //Adding a logger to see if there is any Index out of bounds.

        }

        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int index = input.nextInt();
        logger.info("What the users input is: " + index);
        try {
            System.out.println("The element is " + data[index]);
        }
        catch (Exception ex) {
            System.out.println("Out of Bounds");
            //logger.info("How many times Out of Bounds has occurred", () -> 5);
        }
*/

        //logger.debug("Hello from Log4j 2");

       // logger.debug("Example of a DEBUG {}", () -> 1);
        //logger.fatal("Example of a FATAL {}", () -> 2);
        //logger.error("Example of a ERROR {}", () -> 3);
        //logger.warn("Example of a WARN {}", () -> 4);
        //logger.info("Example of a INFO {}", () -> 5);
        //logger.trace("Example of a TRACE {}", () -> 6);

       //while (true)//test rolling file
           // logger.debug("hello {}", () -> getNumber());

    }

    static int getNumber() {
        return 5;
    }

}
