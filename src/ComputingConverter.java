import java.util.Scanner;
public class ComputingConverter {
    public static void main(String[] args){
        Scanner stdinScanner = new Scanner (System.in);
        String userInput = "";
        String binaryOutput;
        int userInputNum = 0;
        int mainCounter = 0;
        int bitCounter = 0;
        int numOutput = 0;
        double userInputDouble;
        System.out.println("Welcome to Computing Converter");
        while (mainCounter < 1){
            System.out.println("Select an option");
            System.out.println("1) Decimal to Binary");
            System.out.println("2) Binary to Decimal");
            System.out.println("3) Quit");
            userInput = stdinScanner.nextLine();
            if(userInput.equals("1")){
                bitCounter = 0;
                System.out.println("Please enter a whole decimal number");
                while (bitCounter < 1){
                    try{
                        userInputNum = Integer.parseInt(stdinScanner.nextLine());
                        userInputDouble = userInputNum;
                        bitCounter++;
                    }catch (NumberFormatException e){
                        System.out.println("Invalid Input, please enter a whole decimal number");
                    }
                }
                binaryOutput = toBinary(userInputNum);
                new Calculator(binaryOutput, userInputNum);
                System.out.println(userInputNum + " to binary is " + binaryOutput);
            }else if(userInput.equals("2")){
                bitCounter = 0;
                System.out.println("Please enter a binary number");
                while (bitCounter < 1){
                    try{
                        userInputNum = Integer.parseInt(stdinScanner.nextLine());
                        userInputDouble = userInputNum;
                        bitCounter++;
                    }catch (NumberFormatException e){
                        System.out.println("Invalid Input, please enter a whole decimal number");
                    }
                }
                userInput = String.valueOf(userInputNum);
                int[] binaryLength = new int[userInput.length()];
                numOutput = toDecimal(binaryLength, userInput);
                new Calculator(userInput, numOutput);
                System.out.println(userInputNum + " to decimal is " + numOutput);
            }else if(userInput.equals("3")){
                System.out.println("Goodbye");
                mainCounter++;
            }else{
                System.out.println("Sorry, " + userInput + " is not a valid option");
            }
        }
    }
    public static String toBinary(double num){
        String outputBin = "";
        double decimal = num;
        int arrCounter = 0;
        while (num > 0){
            if(num % 2 == 0){
                num = num / 2;
                arrCounter = arrCounter + 1;
            }else{
                num = num / 2;
                num = num - .5;
                arrCounter = arrCounter + 1;
            }
        }
        int[] bitCounter = new int[arrCounter];
        for(int i = bitCounter.length - 1; i >= 0; i--){
            if(decimal % 2 == 0){
                decimal = decimal / 2;
                bitCounter[i] = 0;
            }else{
                decimal = decimal / 2;
                decimal = decimal - .5;
                bitCounter[i] = 1;
            }
        }
        for(int i = 0; i < bitCounter.length; i++){
            outputBin = outputBin + bitCounter[i];
        }
        return outputBin;
    }
    public static int toDecimal(int[] binaryArr, String binInput){
        int outputDec = 0;
        for(int i = 0; i < binInput.length(); i++){
            binaryArr[i] = binInput.charAt(i) - '0';
        }
        for(int i = 0; i < binaryArr.length; i++){
            outputDec = 2 * outputDec + binaryArr[i];
        }
        return outputDec;
    }
}
