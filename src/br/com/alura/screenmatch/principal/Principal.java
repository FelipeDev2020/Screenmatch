package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970, 180);


        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getTotalDeAvaliacao());
        meuFilme.exibeFichaTecnica();

        Serie lost = new Serie("Lost", 2000, 120);
        lost.avalia(6);
        lost.avalia(8);
        lost.avalia(7);
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();

        Filme outroFilme = new Filme("Avatar", 2023, 210);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(lost);
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao reco = new FiltroRecomendacao();
        reco.filtra(meuFilme);
    }
}
