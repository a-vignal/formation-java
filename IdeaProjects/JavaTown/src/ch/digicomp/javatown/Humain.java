package ch.digicomp.javatown;

public class Humain {
    private String name;
    private String drink;

    public String quelEstTonNom() {
        return name;
    }
    public Humain(String name) {
        this.name = name;
        this.drink = "eau";
    }
    public Humain(String name, String drink) {
        this.name = name;
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public void parler(String texte){
        System.out.println(quelEstTonNom() + " - " + texte);
    }
    public void presenter(){
        this.parler(" bonjour,je suis " + quelEstTonNom() + " et ma boisson favorite est " + this.drink);
    }
    public void boire(){
        this.parler("Et hop une rasade de " + this.drink + " HAAAAAA !");
    }
}