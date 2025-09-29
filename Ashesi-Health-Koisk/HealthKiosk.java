
import java.util.Scanner;

public class HealthKiosk {
    public static void main(String[] args) {
        //Task 1
        
        System.out.println("Enter your service code(P/L/T/C): ");
        Scanner response = new Scanner (System.in);
        char code = response.next().charAt(0);
        String direction;
        switch (code) {
            case 'P':
                direction = "Pharmacy Desk";
                break;
            case 'L':
                direction = "Lab Desk";
                break;
            case 'T':
                direction = "Triangle Desk";
                break;
            case 'C':
                direction = "Counselling Desk";
                break;
            default:
                direction = "Invalid service code";
        }
        System.out.println("Go To: "+direction);

        //Task 2

        System.out.println("Enter the health metric (1/2/3): ");
        int metric = response.nextInt()
        ;
         double bmi2 = 0;
         double bmi = 0;
        switch (metric) {
            case 1:
                System.out.println("Enter your weight(kg): ");
                double weight = response.nextDouble();
                System.out.println("Enter your height(m): ");
                double height = response.nextDouble();
                bmi = weight/(Math.pow(height,2));
                bmi2 = Math.round(bmi*10/10.0);
                
                if (bmi2 < 18.5) {
                    System.out.println(" You're Underweight");
                } else if (bmi2 >= 18.5 && bmi2 <= 24.9) {
                    System.out.println("Your're Normal");
                } else if (bmi2 >= 25 && bmi2 <= 29.9) {
                    System.out.println("Your're Overweight");
                } else {
                    System.out.println("You're Obese");
                }
                break;
            case 2:
                System.out.println("Enter the required dosage:" );
                double dosage = response.nextDouble();
                int tablets = (int)dosage/250;
                int numberoftablets = (int)Math.ceil(tablets);
                System.out.println("You need "+numberoftablets+" tablets");
                break;
            case 3:
                System.out.println("Enter an angle(degrees): ");
                double angle = response.nextDouble();
                double radians = Math.toRadians(angle);
                double sine = Math.sin(radians);
                double cosine = Math.cos(radians);
                double roundedsine = Math.round(sine*1000)/1000.0;
                double roundedcosine = Math.round(cosine*1000)/1000.0;
                System.out.println("Sine: "+roundedsine);
                System.out.println("Cosine: "+roundedcosine);
                break;
            default:
                System.out.println("Invaid metric");
        }

        //Task 3

        char randomCharacter = (char) ('A' + Math.random()*26);

        int firstdigit = (int)(Math.random()*7)+3;
        int seconddigit = (int)(Math.random()*7)+3;
        int thirddigit = (int)(Math.random()*7)+3;
        int fourthdigit = (int)(Math.random()*7)+3;

        String ID = ""+randomCharacter+firstdigit+seconddigit+thirddigit+fourthdigit;
        System.out.println("Your ID is: "+ID);

        if (ID.length() == 5){
            if (Character.isUpperCase(ID.charAt(0))&&
                Character.isLetter(ID.charAt(0))&&
                Character.isDigit(ID.charAt(1)) && 
                Character.isDigit(ID.charAt(2)) && 
                Character.isDigit(ID.charAt(3)) && 
                Character.isDigit(ID.charAt(4))){
                    System.out.println("ID OK");
                } 
            else{
                System.out.println("First character must be a letter and the last four should be digits");
            }        
        }
        else {
            System.out.println("Invalid length");
        }

        //Task 4
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name = input.nextLine();
        char firstletter = name.charAt(0);
        char upperfirstletter = Character.toUpperCase(firstletter);
        System.out.println("Uppercase of First Letter: "+upperfirstletter);
        char shiftedletter = (char) ('A' + (upperfirstletter - 'A' + 2) % 26);
        System.out.println("Shifted Letter: "+shiftedletter);
        String lasttwo = ID.substring(ID.length()-2);
        System.out.println("Last two characters of ID(Task3): "+lasttwo);
        bmi2 = (int) bmi2;
        String newID = shiftedletter+lasttwo+"-"+bmi2;
        System.out.println("Display code:"+newID);

        // Task 5

        switch (code) {
        case 'P':
                System.out.println("Summary: PHARMACY | "+ID+" | Code="+newID);
                break;
            case 'L':
               System.out.println("Summary: LAB | "+ID+" | Code="+newID);
                break;
            case 'T':
                System.out.println("Summary: TRIAGE | "+ID+" | BMI="+bmi+" | Code="+newID);
                break;
            case 'C':
                System.out.println("Summary: COUNSELING | "+ID+" | Code="+newID);
                break;
            default:
                direction = "Invalid service code";
        }
        }
        
    }