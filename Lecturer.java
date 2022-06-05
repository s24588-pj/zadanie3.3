package model.heroes;

public class Lecturer extends Person{
    private String title;

    public Lecturer(String name, String surname, String gender, String title) {
        super(name, surname, gender);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void printOut() {
        System.out.println( "Lecturer{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                '}');
    }
}
