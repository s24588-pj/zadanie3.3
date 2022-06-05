package model.heroes;

public class Student extends Person{
    protected int indexNum;

    public Student(String name, String surname, String gender, int indexNum) {
        super(name, surname, gender);
        this.indexNum = indexNum;
    }

    public int getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(int indexNum) {
        this.indexNum = indexNum;
    }

    public void printOut(){
        System.out.println( "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", indexNum=" + indexNum +
                '}');
    }
}
