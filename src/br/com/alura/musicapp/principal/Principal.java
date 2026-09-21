package br.com.alura.musicapp.principal;

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
        System.out.println(meuPodcast.getTitulo());
    }
}
