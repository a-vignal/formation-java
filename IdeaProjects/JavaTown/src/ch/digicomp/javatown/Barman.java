package ch.digicomp.javatown;

public class Barman extends Humain{
    private String barName= "Chez " + this.getName();

    public Barman(String name) {
        super(name, "vin");
    }

    public Barman(String name, String barName) {
        super(name, "vin");
        this.barName = barName;
    }
    @Override
    public void presenter() {
        this.parler(" bonjour,je suis " + this.getName() + ", ma boisson favorite est " + this.getDrink() + " je suis le proprio du bar " + this.barName);
    }
    @Override
    public void parler(String texte) {
        this.parler(this.getName() + " - " + texte + " Coco");
    }
}
