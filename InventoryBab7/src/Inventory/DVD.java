package Inventory;

public class DVD extends Product {
    private int duration;       // menit
    private int ageRating;      // batas usia
    private String studio;      // studio film

    public DVD(int number, String name, int qty, double price,
               int duration, int ageRating, String studio) {
        super(number, name, qty, price);
        this.duration = duration;
        this.ageRating = ageRating;
        this.studio = studio;
    }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public int getAgeRating() { return ageRating; }
    public void setAgeRating(int ageRating) { this.ageRating = ageRating; }

    public String getStudio() { return studio; }
    public void setStudio(String studio) { this.studio = studio; }

    @Override
    public double getInventoyvalue() {
        return super.getInventoyvalue() * 1.05; // tambah 5%
    }

    @Override
    public String toString() {
        return "Nomor Item : " + getitemNumber() +
               "\nNama : " + getitemName() +
               "\nDurasi Film : " + duration +
               "\nNilai Usia : " + ageRating +
               "\nStudio Film : " + studio +
               "\nJumlah yang tersedia : " + getitemAvability() +
               "\nHarga : " + getunitPrice() +
               "\nNilai Persediaan : " + getInventoyvalue() +
               "\nStatus Produk : " + (isActive() ? "Aktif" : "Tidak aktif");
    }
}
