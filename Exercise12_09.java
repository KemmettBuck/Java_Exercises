import java.util.Scanner;

public class Exercise12_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary string: ");
        String binaryString = input.next();

        //try to convert and display
        try {
            System.out.println(binaryString + 
                " in decimal is " + bin2Dec(binaryString));
        } 
        catch (BinaryFormatException ex) {
        // display custom message
        System.out.println(ex.getMessage());
        }

        input.close();
    }

// Convert binary string to decimal
 public static int bin2Dec(String binaryString) 
    throws BinaryFormatException {

    for (int i = 0; i < binaryString.length(); i++) {
        if (binaryString.charAt(i) != '0' 
        && binaryString.charAt(i) != '1') {
            throw new BinaryFormatException(
                binaryString + " is not a binary string");

        }
    }

    //convert binary to decimal
    int decimalValue = 0;
    for (int i = 0; i < binaryString.length(); i++) {
        decimalValue = decimalValue * 2 + 
        (binaryString.charAt(i) - '0');
    }

    // return
    return decimalValue;
    }
 }
// custom exception class for invalid binary strings
class BinaryFormatException extends Exception {
    public BinaryFormatException(String message) {
        super(message);
    }
}
