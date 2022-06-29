import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opc, qtdNotas;
        float nota = 0;
        String nome, cpf;
        Sala novaSala = new Sala();
        Aluno novoAluno = new Aluno();
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
                    nome = teclado.nextLine();
                    System.out.println("\nCPF: ");
                    cpf = teclado.nextLine();

                    novoAluno = new Aluno(nome, cpf);

                    System.out.println("\nQuantidades de notas?");
                    qtdNotas = teclado.nextInt();

                    for (int i = 0; i < qtdNotas; i++) {
                        System.out.println("\nNota " + (i + 1));
                        nota = teclado.nextFloat();
                    }

                    novaSala.insereAluno(novoAluno);

                    
                    break;
                case 2:
                    novaSala.listarAlunos();

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
