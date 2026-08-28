import java.util.Scanner;
public class ComputingConverter {
    public static void main(String[] args){
        Scanner stdinScanner = new Scanner (System.in);
        String userInput = "";
        int userInputNum = 0;
        int mainCounter = 0;
        System.out.println("Welcome to Computing Converter");
        while (mainCounter < 1){
            System.out.println("Select an option");
            System.out.println("1 Decimal to Binary");
            System.out.println("2 Binary to Decimal");
            System.out.println("3 Quit");
            userInput = stdinScanner.nextLine();
            if(userInput.equals("1"){

            }else if(userInput.equals("2")){

            }else if(userInput.equals("3")){
                System.out.println("Goodbye");
                mainCounter = 1;
            }else{
                System.out.println("Invalid Input");
            }
        }
    }
}
