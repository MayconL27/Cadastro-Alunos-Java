import java.util.ArrayList;

public class Sala {
    ArrayList<Aluno> listaDeAlunos;

    public Sala() {
        this.listaDeAlunos = new ArrayList<>();

    }

    // inserindo aluno na sala.
    void insereAluno(Aluno novoAluno) {
        listaDeAlunos.add(novoAluno);

    }

    void listarAlunos() {
        System.out.println("\nLista de alunos");

        // para cada aluno da : listaDeAlunos ira mostrar as notas.
        for(Aluno alunoNaLista : listaDeAlunos) {
            alunoNaLista.listar();

        }

    }
    
}
