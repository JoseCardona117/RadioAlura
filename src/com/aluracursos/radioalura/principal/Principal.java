package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args){
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguiar");
        miPodcast.setTitulo("Cafe.Tech");

        for (int i = 0; i<10000; i++){
            miCancion.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }

        for (int i = 0; i < 20; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 50; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total reproducciones: "+ miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: "+ miCancion.getTotalDeMeGusta());
        System.out.println("Total reproducciones podcast: "+ miPodcast.getTotalDeReproducciones());
        System.out.println("Total de me gusta podcast: "+ miPodcast.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();

        favoritos.adiciones(miPodcast);
        favoritos.adiciones(miCancion);
    }
}
