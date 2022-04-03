package src.cadastros;

import java.time.LocalDate;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import src.consultas.Consulta;
import src.emprestimo.Emprestimo;
import src.emprestimo.Livro;
import src.usuarios.Bibliotecario;
import src.usuarios.Usuario;

public class CadastrarEmprestimo implements src.interfaces.Menus.MenuEmprestimo, src.interfaces.Menus.DigitarDados {
    private Emprestimo emprestimo;

    
    public void criacaoEmprestimo() {
        // TODO
        // "insert into emprestimo values(emprestimo.getId(), emprestimo.getIdLivro(), emprestimo.getCpf(), emprestimo.getIdBibliotecario(), emprestimo.getDataRetirada(), emprestimo.getDataDevolucao(), emprestimo.getDataLimite())"
    }

    @Override
    public void emprestar(){
        LocalDate hoje = LocalDate.now();
        this.emprestimo = new Emprestimo(hoje,hoje.plusDays(7));
    }

    @Override
    public void digitarDados(){
        Consulta consulta = new Consulta();
        Livro livro = consulta.procurarLivro();// Coletar livro
        Usuario usuario = consulta.procurarUsuario();// Coletar usuário
        Bibliotecario bibliotecario = /*Coleta do banco de dados o único bibliotecario*/null;
        if(livro != null && usuario != null){
            emprestimo.setLivro(livro);
            emprestimo.setUsuario(usuario);
            emprestimo.setBibliotecario(bibliotecario);
        }
        else{
            System.out.println("Livro ou usuário não existente.");
        }
        
        
    }

}
