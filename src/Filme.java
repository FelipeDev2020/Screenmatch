public class Filme {
    String nome;
    int anodelancamento;
    boolean incluidoNoPlano;
    double somaDaAvaliacao;
    int totalDeAvaliacao;
    int duracaoEmMinutos;

    public void exibeFichaTecnica(){
        System.out.println("Nome: " + nome + " | Ano de lançamento: " + anodelancamento + " | Nota do filme: " + pegaMedia());
    }

    public void avalia(double nota){
        somaDaAvaliacao += nota;
        totalDeAvaliacao++;
    }

    public String pegaMedia(){
        return String.format("%.1f", somaDaAvaliacao / totalDeAvaliacao);
    }

}
