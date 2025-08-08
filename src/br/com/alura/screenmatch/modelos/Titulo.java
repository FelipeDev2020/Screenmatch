package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anodelancamento;
    private boolean incluidoNoPlano;
    private int duracaoEmMinutos;
    private double somaDaAvaliacao;
    private int totalDeAvaliacao;

    public Titulo(String nome, int anodelancamento, int duracaoEmMinutos){
        this.nome = nome;
        this.anodelancamento = anodelancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("\nNome: " + nome + " | Ano de lançamento: " + anodelancamento + " | Nota do filme: " + pegaMedia());
    }

    public void avalia(double nota){
        somaDaAvaliacao += nota;
        totalDeAvaliacao++;
    }

    public String pegaMedia(){
        return String.format("%.1f", somaDaAvaliacao / totalDeAvaliacao);
    }


    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
