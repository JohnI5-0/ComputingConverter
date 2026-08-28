import java.util.Scanner;
public class ComputingConverter {
    public static void main(String[] args){
        Scanner stdinScanner = new Scanner (System.in);
        String userInput = "";
        int userInputNum = 0;
        int mainCounter = 0;
        int bitCounter = 0;
        System.out.println("Welcome to Computing Converter");
        while (mainCounter < 1){
            System.out.println("Select an option");
            System.out.println("1) Decimal to Binary");
            System.out.println("2) Binary to Decimal");
            System.out.println("3) Quit");
            userInput = stdinScanner.nextLine();
            if(userInput.equals("1"){
                bitCounter = 0;
                while (bitCounter < 1){
                    System.out.println("4 bit, 6 bit, or 8 bit?");
                    System.out.println("4");
                    System.out.println("6");
                    System.out.println("8");
                    try{
                        userInputNum = Integer.parseInt(stdinScanner.nextLine());
                        bitCounter++;
                    }catch (NumberFormatException e){
                        System.out.println("Please enter a valid option");
                    }
                    if (userInputNum == 4){
                        int[] array = Calculator.bitArrBuilder(userInputNum);
                    }else if (userInputNum == 6){
                        int[] array = Calculator.bitArrBuilder(userInputNum);
                    }else if (userInputNum == 8){
                        int[] array = Calculator.bitArrBuilder(userInputNum);
                    }
                }
            }else if(userInput.equals("2")){

            }else if(userInput.equals("3")){
                System.out.println("Goodbye");
                mainCounter++;
            }else{
                System.out.println("Sorry, " + userInput + " is not a valid option");
            }
        }
    }
}
