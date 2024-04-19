package music;

import java.util.List;

public class MusicApp {
    public static void main(String[] args) {
        Song song1 = new Song("Song 1", 180, "Artist 1");
        Song song2 = new Song("Song 2", 220, "Artist 2");
        Song song3 = new Song("Song 3", 200, "Artist 3");
        Song song4 = new Song("Song 4", 200);

        CompilationAlbum compilationAlbum = new CompilationAlbum("Rock");
        compilationAlbum.addComposition(song1);
        compilationAlbum.addComposition(song2);
        compilationAlbum.addComposition(song3);
        compilationAlbum.addComposition(song4);

        System.out.println("Общая продолжительность альбома: " + compilationAlbum.getTotalDuration() + " секунд");

        // Перестановка композиций по стилю
        compilationAlbum.rearrangeByStyle("Rock");

        // Поиск композиции по диапазону длины треков
        List<Composition> foundCompositions = compilationAlbum.findCompositionsByDurationRange(180, 210);
        System.out.println("Композиции в диапазоне от 3 до 3.5 минут:");
        for (Composition composition : foundCompositions) {
            System.out.println(composition.getTitle() + " - " + composition.getDuration() + " секунд");
        }
    }
}