import javax.management.loading.PrivateClassLoader;

public class Aluno {
    private String nome, cpf;

    // construtor vazio.
    public Aluno() {

    }

    public Aluno(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // mostrar na tela dados dos aluno.
    void listar() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nCPF: " + this.cpf);

    }

    
    
}
