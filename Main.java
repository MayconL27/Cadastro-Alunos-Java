import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opc;
        Scanner teclado;

        teclado = new Scanner(System.in);

        do{
            System.out.println("\n--------------");
            System.out.println("MENU");
            System.out.println("Escolha uma opção");
            System.out.println("1 - inserir aluno");
            System.out.println("2- Listar alunos");
            System.out.println("3- situações");
            System.out.println("0- Sair");

            opc = teclado.nextInt();
            teclado.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("\nNome: ");
                    String nome = teclado.nextLine();

                    System.out.println("\nCPF: ");
                    String cpf = teclado.nextLine();
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 0:

                    System.out.println("\nSaindo...");

                    break;
            
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }

        }while(opc != 0);
        

        

        
    }
    
}
