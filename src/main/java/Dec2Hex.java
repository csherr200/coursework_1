import java.util.Scanner;

class Dec2Hex {

    public static void main(String[] args) throws Exception {
        System.out.println("Hexadecimal representation is : " + convertToHexadecimal());
    }

    private static String getUserValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number You would Like to Convert To Hex: ");
        return scanner.nextLine();
    }


    static int convertToHexadecimal() throws Exception {
        String hex = getUserValue();
        if (hex == null || hex.length() == 0) {
            throw new Exception("Please Insert a Value");
        }
        int arg1;
        try {
            arg1 = Integer.parseInt(hex);
        } catch (NumberFormatException e) {
            throw new Exception("Argument" + hex + " must be an integer.");
        }

        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num;
        num = arg1;
        String hexadecimal = "";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }
        return num;
    }
}
