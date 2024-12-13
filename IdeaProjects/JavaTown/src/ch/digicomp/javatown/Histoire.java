package ch.digicomp.javatown;

public class Histoire {
    public static void main(String[] args) {
        // Question 2.1
        Humain bob = new Humain("Bob","lait fraise");
        bob.parler("Salut moi c'est " + bob.getName() + " !");
        bob.presenter();
        bob.parler("En fait c'est pas bon l'eau !");
        bob.setDrink("La Biere");
        bob.presenter();
        //Question 2.2
        Cowboy bebop = new Cowboy("Bebop");
        Brigand tuco = new Brigand("Tuco");
        Dame dame = new Dame("Rita");
        dame.presenter();
        bebop.presenter();
        tuco.presenter();
        tuco.Kidnapping(dame);
        System.out.println("Dame kidnapped: " + dame.isKidnapped());
        System.out.println("Tuco nb kidnapping: " + tuco.getNumberKidnappedDame());
        bebop.shoot(tuco);
        tuco.imprisoned(bebop);
        bebop.freeDame(dame);
        dame.Released(bebop);
        Couleur color = Couleur.ROUGE;
        dame.ChangDress(color);
        //Question 2.3
        System.out.println(tuco.quelEstTonNom());
        System.out.println(dame.quelEstTonNom());
        //Question 2.4
        dame.presenter();
        bebop.presenter();
        tuco.presenter();
        //Question 2.4
        Barman Isac = new Barman("Isac","Cognac");
        Isac.presenter();
        Isac.parler("Hey c'est ma tournée ");
    }
}