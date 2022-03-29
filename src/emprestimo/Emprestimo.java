package src.emprestimo;

import java.time.LocalDate;

public class Emprestimo {

    private int id;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;
    private LocalDate dataLimite;

    public Emprestimo() {
    }

    public Emprestimo(int id, LocalDate dataRetirada, LocalDate dataDevolucao, LocalDate dataLimite) {
        this.id = id;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.dataLimite = dataLimite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

}