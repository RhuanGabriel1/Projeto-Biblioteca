public class livro{
    private Integer id;
    private String nome;
    private Integer ano_publicacao;
    private String autor;
    private String editora;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getAno_publicacao() {
        return ano_publicacao;
    }
    public void setAno_publicacao(Integer ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
}