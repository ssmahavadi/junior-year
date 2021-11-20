import java.util.Scanner;

public class Average {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Do you have data? (y/n): ");
        String typedResponse = keyboard.next();
        
        double sumOfIntegers = 0.0;
        int amountOfIntegers = 0;

        while (typedResponse.charAt(0) == 'y' || typedResponse.charAt(0)=='Y'){
            System.out.print("Input an integer: ");
            int integer = keyboard.nextInt();
            sumOfIntegers += integer;
            amountOfIntegers ++;
            System.out.print("Do you have more data? (y/n)");
            typedResponse = keyboard.next();
        }

        keyboard.close();

        if (amountOfIntegers > 0){
            System.out.print("Your average is: ");
            System.out.println(sumOfIntegers/amountOfIntegers);
        }
        else{
            System.out.println("No data == No average. Bye!");
        }
        System.out.println();
    }
    
}
