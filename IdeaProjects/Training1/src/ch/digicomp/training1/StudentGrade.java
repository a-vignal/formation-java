package ch.digicomp.training1;
import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        final int MAX_STUDENTS = 100;
        int nbStudents = 0;
        String[] firstNames = new String[MAX_STUDENTS];
        double[] marks = new double[MAX_STUDENTS];
        Student[] studentTab;
        studentTab = new Student[MAX_STUDENTS];
        for (int i = 0; i< studentTab.length; i++) {
            studentTab[i] = new Student("","",0,0);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saississez le prénom et la note de chaque élèves :");

        do {
            System.out.println("Prénom :");
            studentTab[nbStudents].prenom = scanner.next();
            if(studentTab[nbStudents].prenom.equals("-1")) {
                break;
            }
            System.out.println("Note :");
            studentTab[nbStudents].grade = scanner.nextDouble();
            if(studentTab[nbStudents].grade == -1) {
                break;
            }
            System.out.println("Age :");
            studentTab[nbStudents].age = scanner.nextInt();
            if(studentTab[nbStudents].age == -1) {
                break;
            }
            nbStudents++;
        }while (nbStudents < MAX_STUDENTS);
        scanner.close();
        StudentGrade.display(studentTab);
    }
    static void display(Student[] studentTab) {
        for (int i = 0; i < studentTab[i].prenom.length(); i++) {
            if(studentTab[i].prenom == null) {
                break;
            }
            System.out.println(studentTab[i].prenom + " Age " + studentTab[i].age + ":" + studentTab[i].grade);
        }
    }
}
