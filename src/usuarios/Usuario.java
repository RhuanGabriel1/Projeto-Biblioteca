package src.usuarios;
public class Usuario{
    private String cpf;
    private String celular;
    private String nome;
    private String email;
    private int numero_livro;
    private boolean suspensao;

    public Usuario(){
    }

    public Usuario(String cpf, String celular, String nome, String email){
        this.cpf = cpf;
        this.celular = celular;
        this.nome = nome;
        this.email = email;
        this.numero_livro = 1;
        this.suspensao = false;
    }

    public Usuario(String cpf, String celular, String nome, String email, int numero_livro){
        this.cpf = cpf;
        this.celular = celular;
        this.nome = nome;
        this.email = email;
        this.numero_livro = numero_livro;
        this.suspensao = false;
    }

    public Usuario(String cpf, String celular, String nome, String email, int numero_livro, boolean suspensao){
        this.cpf = cpf;
        this.celular = celular;
        this.nome = nome;
        this.email = email;
        this.numero_livro = numero_livro;
        this.suspensao = suspensao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumero_livro() {
        return numero_livro;
    }

    public void setNumero_livro(int numero_livro) {
        this.numero_livro = numero_livro;
    }

    public boolean isSuspensao() {
        return suspensao;
    }

    public void setSuspensao(boolean suspensao) {
        this.suspensao = suspensao;
    }
   
}