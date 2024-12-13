package ch.digicomp.javatown;

public class Brigand  extends Humain implements HorsLaLoi{
    private String look="Mechant";
    private int numberKidnappedDame;
    private Float reward;
    private boolean isInPprison;
    private String drink;

    public Brigand(String name) {
        super(name,"tord boyaux");
        this.numberKidnappedDame = 0;
        this.isInPprison = false;
        this.reward = 100f;
    }

    public void setLook(String look) {
        this.look = look;
    }

    public void setNumberKidnappedDame(int numberKidnappedDame) {
        this.numberKidnappedDame = numberKidnappedDame;
    }

    public void setReward(Float reward) {
        this.reward = reward;
    }

    public void setPrison(boolean prison) {
        this.isInPprison = prison;
    }

    @Override
    public String quelEstTonNom() {
        return this.getName() + " le " + this.look;
    }

    public void Kidnapping(Dame myDame){
        myDame.setKidnapped(true);
        this.parler("Ah ah ! " + myDame.getName() + ", tu es mienne désormais");
        this.numberKidnappedDame++;
        this.reward *= numberKidnappedDame;
    }
    public void imprisoned(Cowboy cowboy){
        this.isInPprison=true;
        this.parler(" Damned, je suis fait ! " + cowboy.getName() + ", tu m’as eu !");
    }
    public void imprisoned(Sherif cowboy){
        this.isInPprison=true;
        this.parler(" Damned, je suis fait ! " + cowboy.getName() + ", tu m’as eu !");
    }
    public String getLook() {
        return look;
    }

    public int getNumberKidnappedDame() {
        return numberKidnappedDame;
    }

    public float getReward() {
        return reward;
    }

    public boolean isPrison() {
        return isInPprison;
    }
    public void presenter() {
        this.parler(" bonjour,je suis " + this.getName() + ", ma boisson favorite est " + this.getDrink() + " j'ai l'air " + this.getLook() + ", j'ai kidnappé  " + this.getNumberKidnappedDame() + " dames");

    }
}
