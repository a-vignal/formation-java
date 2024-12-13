package ch.digicomp.exceptiontraining;

public class AgeCapException extends Exception{

    public AgeCapException(int age) {
        super(age + " ans n'est pas un âge valide");
    }

}
