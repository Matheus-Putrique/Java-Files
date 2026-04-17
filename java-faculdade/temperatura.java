import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> temperatura = new ArrayList<>();

        double temp;
        double media = 0;
        int dias = 0;
        double soma = 0;

        while (true) {
            System.out.println("Digite a temperatura: ");
            temp = scanner.nextDouble();

            if (temp <= 0) {
                break;
            }

            temperatura.add(temp);
        }

        if (temperatura.isEmpty()) {
            System.out.println("Nenhuma temperatura informada.");
            return;
        }

        double maior = temperatura.get(0);
        double menor = temperatura.get(0);

        for (int i = 0; i < temperatura.size(); i++) {
            soma += temperatura.get(i);

            if (maior < temperatura.get(i)) {
                maior = temperatura.get(i);
            }

            if (menor > temperatura.get(i)) {
                menor = temperatura.get(i);
            }
        }

        media = soma / temperatura.size();

        for (int i = 0; i < temperatura.size(); i++) {
            if (temperatura.get(i) > media) {
                dias++;
            }
        }

        System.out.println("As temperaturas passadas foram: " + temperatura);
        System.out.println("A maior temperatura foi de " + maior + "C");
        System.out.println("A menor temperatura foi de " + menor + "C");
        System.out.println("A media de temperaturas foi de " + media + "C");
        System.out.println("Tivemos " + dias + " dias acima da media de temperatura");
    }
}