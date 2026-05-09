import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Estacionamento{
    public static String LerPlaca(Scanner scanner){
    System.out.println("Sua placa: ");
    String placa = scanner.nextLine();
    return placa;
}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter horario = DateTimeFormatter.ofPattern("HH:mm");

        String placa;


        placa = LerPlaca(scanner);

        System.out.println("Entrada: ");
        String entrada = scanner.nextLine();

        LocalTime hoje = LocalDate.perse(entrada, horario);

        

        
    }
}