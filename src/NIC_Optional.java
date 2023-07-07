import java.util.Scanner;

// Numerical Image Compression
public class NIC_Optional
{
    public static void main(String[] args)
    {
        System.out.println("Note: This is the NIC_OPTIONAL program - if you meant the NID program, instead, open that window and go to <Run> menu -> Run... -> NID.");
        int imageWidth, imageHeight;
        String line, output;

        // ++++++
        // Suggested variables....
        int currentRow = 0;
        int currentCol = 0;
        // "final" keyword means "this 'variable' is a constant."
        final String DARK_CHARACTER  = "M";
        final String LIGHT_CHARACTER = ".";
        String currentSymbol = LIGHT_CHARACTER;
        // ++++++

        // Get the size of the image to be drawn.
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.print("Enter the width and height of the image, separated by spaces: ");
        imageWidth = keyboardScanner.nextInt();
        imageHeight = keyboardScanner.nextInt();
        System.out.println("You chose a ("+imageWidth+" x "+imageHeight+") image.");

        output = ""; // this is the variable you'll be using to accumulate the numbers, separated by spaces.
        for(currentRow =0; currentRow<imageHeight; currentRow++)
        {
            System.out.println("Enter the next line of the image, made of '"+DARK_CHARACTER+"' and '"+LIGHT_CHARACTER+"' characters:");
            line = keyboardScanner.nextLine();
            System.out.println("You typed: '"+line+"'."); // temporary line so you can see that n is being read. Please delete or comment out when you start writing!

            //--------------------------------
            // TODO: You write this!
            // Look at all the characters in the row; figure out the numbers, and if necessary, append each number at
            // the end of the "output" variable. e.g.: output = output + 5 + " ";
            // Hint: You are printing the number when the "color" *changes* or when you reach the end of the row.



            //--------------------------------
        }
        // now print the list of numbers
        System.out.println(output);

        System.out.println("Done.");
    }


}
