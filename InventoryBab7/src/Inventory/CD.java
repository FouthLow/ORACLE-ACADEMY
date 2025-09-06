package Inventory;

public class CD extends Product {
    private String artist;
    private int numSongs;
    private String label;

    public CD(int number, String name, int qty, double price,
              String artist, int numSongs, String label) {
        super(number, name, qty, price);
        this.artist = artist;
        this.numSongs = numSongs;
        this.label = label;
    }

    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }

    public int getNumSongs() { return numSongs; }
    public void setNumSongs(int numSongs) { this.numSongs = numSongs; }

    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }

    @Override
    public String toString() {
        return "Nomor Item : " + getitemNumber() +
               "\nNama : " + getitemName() +
               "\nArtis : " + artist +
               "\nLagu di Album : " + numSongs +
               "\nLabel Rekaman : " + label +
               "\nJumlah yang tersedia : " + getitemAvability() +
               "\nHarga : " + getunitPrice() +
               "\nNilai Persediaan : " + getInventoyvalue() +
               "\nStatus Produk : " + (isActive() ? "Aktif" : "Tidak aktif");
    }
}
