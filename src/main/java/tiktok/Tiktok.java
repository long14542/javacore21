package tiktok;

public class Tiktok {
    private String idols;
    private String songs;

    public Tiktok(String idols, String songs) {
        this.idols = idols;
        this.songs = songs;
    }

    public String getIdols() {
        return idols;
    }

    public void setIdols(String idols) {
        this.idols = idols;
    }

    public String getSongs() {
        return songs;
    }

    public void setSong(String songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Tiktok{" +
                "idol='" + idols + '\'' +
                ", song='" + songs + '\'' +
                '}';
    }
}
