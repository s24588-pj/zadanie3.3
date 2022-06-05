package model.heroes;

public class Scholar extends Student{
    private int scholarCost;

    public Scholar(String name, String surname, String gender, int indexNum, int scholarCost) {
        super(name, surname, gender, indexNum);
        this.scholarCost = scholarCost;
    }

    public int getScholarCost() {
        return scholarCost;
    }

    public void setScholarCost(int scholarCost) {
        this.scholarCost = scholarCost;
    }

    public void printOut() {
        System.out.println( "Scholar{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", scholarCost=" + scholarCost +
                ", indexNum=" + indexNum +
                '}');
    }
}
