package model.heroes;

public class Main {

    public static void main(String[] args) {
	Student student1 = new Student("Adam", "Nowak","Man", 24555);
    Lecturer lecturer1 = new Lecturer("Tomasz", "Kardasz", "Man", "Professor");
    Scholar scholar1 = new Scholar("Adrian", "Pielecki", "Man", 24588, 1000);

    student1.printOut();
    lecturer1.printOut();
    scholar1.printOut();
    }
}
