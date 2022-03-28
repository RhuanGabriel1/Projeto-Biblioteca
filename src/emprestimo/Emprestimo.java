package src.emprestimo;

import java.time.LocalDate;

public class Emprestimo{

    private int id;
    private LocalDate data_retirada;
    private LocalDate data_devolucao;
    private LocalDate data_limite;

    public Emprestimo(){
    }

    public Emprestimo(int id, LocalDate data_retirada,LocalDate data_devolucao,LocalDate data_limite){
        this.id = id;
        this.data_retirada = data_retirada;
        this.data_devolucao = data_devolucao;
        this.data_limite = data_limite;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getData_retirada() {
        return data_retirada;
    }
    public void setData_retirada(LocalDate data_retirada) {
        this.data_retirada = data_retirada;
    }
    public LocalDate getData_devolucao() {
        return data_devolucao;
    }
    public void setData_devolucao(LocalDate data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
    public LocalDate getData_limite() {
        return data_limite;
    }
    public void setData_limite(LocalDate data_limite) {
        this.data_limite = data_limite;
    }


}