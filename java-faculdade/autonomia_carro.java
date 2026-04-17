import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
     
      float capacidade_tanque, litros_abastecidos, ka_percorrida, consumo_medio, autonomia;
     
      System.out.print("Informe capacidade do tanque: ");
      capacidade_tanque = scanner.nextFloat();
     
      System.out.print("Informe quantidade de litros abastecidos: ");
      litros_abastecidos = scanner.nextFloat();
     
      System.out.print("Informe quilometragem percorrida: ");
      ka_percorrida = scanner.nextFloat();
     
      consumo_medio = ka_percorrida / litros_abastecidos;
      autonomia = (capacidade_tanque - litros_abastecidos) * consumo_medio;
     
      System.out.printf("Consumo medio: %.2f", consumo_medio);
      System.out.printf("\nAutonomia: %.2f", autonomia);