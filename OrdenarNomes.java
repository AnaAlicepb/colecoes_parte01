import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite a quantidade de nomes:");
        int quantidade = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha após o nextInt()

        System.out.println("Digite os nomes:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
        }

        Collections.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
