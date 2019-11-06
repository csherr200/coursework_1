

import java.util.Scanner;

public class Dec2Hex {

    public static void main(String[] args) throws Exception {
        System.out.println("Hexadecimal representation is : " + convertToHexadecimal());
    }

    private static String getUserValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number You would Like to Convert To Hex: ");
        return scanner.nextLine();
    }


    static String convertToHexadecimal() throws Exception {
        String userValue = getUserValue();
        if (userValue == null || userValue.length() == 0) {
            throw new Exception("Please Insert a Value");
        }
        int hexValue;
        try {
            hexValue = Integer.parseInt(userValue);
        } catch (NumberFormatException e) {
            throw new Exception("Argument" + userValue + " must be an integer.");
        }
        return Integer.toHexString(hexValue);
    }
}
