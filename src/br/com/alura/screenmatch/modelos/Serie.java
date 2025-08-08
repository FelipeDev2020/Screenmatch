package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{

    private int temporadas;
    private boolean ativa;
    private int episodioPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public Serie(String nome, int anodelancamento, int duracaoEmMinutos) {
        super(nome, anodelancamento, duracaoEmMinutos);
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodioPorTemporada * minutosPorEpisodio;
    }

    @Override
    public void exibeFichaTecnica(){
        super.exibeFichaTecnica();
        System.out.println("Duração para maratonar Lost: " + getDuracaoEmMinutos());
    }
}
