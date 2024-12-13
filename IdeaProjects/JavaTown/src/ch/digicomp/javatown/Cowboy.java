package ch.digicomp.javatown;

public class Cowboy  extends Humain{
    private int popularity=0;
    private String adjective="Vaillant";

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public Cowboy(String name) {
        super(name, "whisky");
    }
    public void exclaim(){
        this.parler("Prend ça, rascal !");
    }
    public void freeDame(Dame dame){
        this.parler("Je viens vous sauver " + dame.getName());
        dame.setKidnapped(false);
        popularity++;
    }

    public int getPopularity() {
        return popularity;
    }

    public String getAdjective() {
        return adjective;
    }

    public void shoot(HorsLaLoi brigand ){
        this.parler("Le " + this.adjective + " " + this.getName() + " tire sur " + brigand.quelEstTonNom() + ". PAN !");
        popularity++;
    }
    @Override
    public void presenter() {
        this.parler(" bonjour,je suis " + this.getName() + ", ma boisson favorite est " + this.getDrink() + " on dit de moi que je suis " + this.getAdjective() + ", niveau popularité je suis à " + this.getPopularity());

    }
}
