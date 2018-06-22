public class Product {
    private String nazwa;
    private String porducent;
    private double cena;


    public Product(String nazwa, String porducent, double cena) {
        this.nazwa = nazwa;
        this.porducent = porducent;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getPorducent() {
        return porducent;
    }

    public void setPorducent(String porducent) {
        this.porducent = porducent;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
