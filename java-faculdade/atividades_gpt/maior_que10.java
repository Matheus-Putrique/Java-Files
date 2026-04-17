import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Greater or less than 10!");
        
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        
        if(num > 10){
            System.out.print("This number is greater than 10");
        }
        else{
            System.out.print("This number is less than or equal to 10");
        }
        
        
        
        scanner.close();
    }
}