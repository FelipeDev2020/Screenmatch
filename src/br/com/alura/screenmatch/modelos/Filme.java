package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Filme(String nome, int anodelancamento, int duracaoEmMinutos){
        super(nome, anodelancamento, duracaoEmMinutos);

    }
}
