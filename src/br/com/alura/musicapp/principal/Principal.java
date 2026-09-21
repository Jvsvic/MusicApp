package br.com.alura.musicapp.principal;

import br.com.alura.musicapp.principal.modelos.MinhasPreferidas;
import br.com.alura.musicapp.principal.modelos.Musica;
import br.com.alura.musicapp.principal.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");
        
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
    
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");


        meuPodcast.setApresentador("Marcos Mendes");
        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);
        System.out.println(meuPodcast.getClassificacao());
        System.out.println(minhaMusica.getClassificacao());
        System.out.println(meuPodcast.getTotalCurtidas());
        System.out.println(meuPodcast.getTotalCurtidas());
        System.out.println(minhaMusica.getTotalReproducoes());
        System.out.println(minhaMusica.getTotalCurtidas());
    }
}
