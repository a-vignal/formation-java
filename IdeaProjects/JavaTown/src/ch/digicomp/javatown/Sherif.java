package ch.digicomp.javatown;

public class Sherif extends Cowboy{
    private int numberArrests=0;

    public Sherif(String name) {
        super(name);
    }
    public void arrest(Brigand brigand ){
        this.parler("Au nom de la loi, je \n" + "vous arrête ! " + brigand.getName());
        int popu = this.getPopularity();
        this.setPopularity(++popu);
        this.numberArrests++;
        brigand.imprisoned(this);
    }
    public void rechercher(Brigand brigand ){
        float reward = brigand.getReward();
        reward = 2*reward;
        this.parler("OYEZ OYEZ BRAVE GENS !! " + reward + " a qui arrêtera " +brigand.getName() + " le " + brigand.getLook() + ", mort ou vif !!");
        brigand.setReward(reward);
    }
    @Override
    public String getName() {
        return "Sherif " + super.getName();
    }
    @Override
    public void presenter() {
        this.parler(" bonjour,je suis " + this.getName() + ", ma boisson favorite est " + this.getDrink() + " j'ai arreté " + this.numberArrests + " brigands");
    }
}
