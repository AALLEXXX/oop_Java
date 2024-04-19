package music;

import java.util.ArrayList;
import java.util.List;

// Базовый класс для музыкальных композиций
abstract class Composition {
    private String title;
    private int duration; // Продолжительность в секундах

    public Composition(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}

// Класс для альбома, который хранит список композиций
class Album {
    private List<Composition> compositions;

    public Album() {
        this.compositions = new ArrayList<>();
    }

    public void addComposition(Composition composition) {
        compositions.add(composition);
    }

    public void removeComposition(Composition composition) {
        compositions.remove(composition);
    }

    public int getTotalDuration() {
        int totalDuration = 0;
        for (Composition composition : compositions) {
            totalDuration += composition.getDuration();
        }
        return totalDuration;
    }

    // Перестановка композиций по стилю (здесь просто заглушка)
    public void rearrangeByStyle(String style) {
        // Реализация перестановки композиций по стилю
        System.out.println("Перестановка композиций по стилю: " + style);
    }

    // Поиск композиции по диапазону длины треков
    public List<Composition> findCompositionsByDurationRange(int minDuration, int maxDuration) {
        List<Composition> foundCompositions = new ArrayList<>();
        for (Composition composition : compositions) {
            if (composition.getDuration() >= minDuration && composition.getDuration() <= maxDuration) {
                foundCompositions.add(composition);
            }
        }
        return foundCompositions;
    }
}

// Класс для песни
class Song extends Composition {
    private String artist;

    public Song(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    public Song(String title, int duration) {
        super(title, duration);
        this.artist = "Unknown Artist";
    }

    public String getArtist() {
        return artist;
    }
}

// Класс для альбома сборника
class CompilationAlbum extends Album {
    private String genre;

    public CompilationAlbum(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}


