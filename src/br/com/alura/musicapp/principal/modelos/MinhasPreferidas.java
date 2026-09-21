package br.com.alura.musicapp.principal.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos! ");
        } else {
            System.out.println(audio.getTitulo() + " É uma excelente opção para escutar daqui a pouco ");
        }
    }
}
