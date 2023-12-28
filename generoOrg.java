import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa {
        String nome;
        String sexo;

        Pessoa(String nome, String sexo) {
            this.nome = nome;
            this.sexo = sexo;
        }
    }


public class generoOrg {

    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> grupoFeminino = new ArrayList<>();
        List<Pessoa> grupoMasculino = new ArrayList<>();

        
        while (true) {
                   try {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch (IOException | InterruptedException ex) {
    ex.printStackTrace();
    }
            System.out.println("Digite o nome da pessoa (ou 'sair' para encerrar):");
            String nome = scanner.nextLine();
            if(nome.equalsIgnoreCase("sair")) {
                       try {
             new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
                break;
            }

            System.out.println("Digite o sexo (F para feminino, M para masculino):");
            String sexo = scanner.nextLine();

            Pessoa pessoa = new Pessoa(nome, sexo);
            if (pessoa.sexo.equalsIgnoreCase("F")) {
                grupoFeminino.add(pessoa);
            } else if (pessoa.sexo.equalsIgnoreCase("M")) {
                grupoMasculino.add(pessoa);
            } else {
                System.out.println("Sexo inválido. Por favor, digite F ou M.");
            }
        }

        System.out.println("Grupo Feminino:");
        for (Pessoa p : grupoFeminino) {
            System.out.println(p.nome);
        }

        System.out.println("Grupo Masculino:");
        for (Pessoa p : grupoMasculino) {
            System.out.println(p.nome);
        }

        scanner.close();
    }
}