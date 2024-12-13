package ch.digicomp.javatown;

import java.util.Random;

public class Dame extends Humain{
    private Couleur color;
    private boolean isKidnapped=false;

    public void setColor(String color) {
        this.color = Couleur.KAKI;
    }

    public void setKidnapped(boolean kidnapped) {
        this.isKidnapped = kidnapped;
    }

    public Couleur getColor() {
        return this.color;
    }

    public boolean isKidnapped() {
        return isKidnapped;
    }

    public Dame(String name) {
        super(name,"lait");
    }
    public void Kidnapped(HorsLaLoi brigand){
        this.parler("HIIIIIIIIIIIIIIIII");
        brigand.Kidnapping(this);
    }
    public void Released(Cowboy cowboy) {
        this.parler("Merci " + cowboy.getName());
    }
    public void ChangDress() {
        Random random = new Random();
        Couleur[] choixCouleurs = Couleur.values();
        int indexCouleur= random.nextInt(choixCouleurs.length);
        this.color = choixCouleurs[indexCouleur];
        this.parler("Regardez ma nouvelle robe " + this.color);
    }
    public void ChangDress(Couleur newColor) {
        this.color = newColor;
        this.parler("Regardez ma nouvelle robe " + this.color);
    }

    @Override
    public String quelEstTonNom() {
        return "Miss " + this.getName();
    }

    @Override
    public void presenter() {
        this.parler(" bonjour,je suis " + this.getName() + ", ma boisson favorite est " + this.getDrink() + " et ma robe est " + this.getColor());
    }
}

