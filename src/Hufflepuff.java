public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int witchcraft, int transgress, int hardworking, int loyal, int honest) {
        super(name, witchcraft, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public void info(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return super.toString() + " Hufflepuff " +
                " hardworking = " + hardworking +
                ", loyal = " + loyal +
                ", honest = " + honest;
    }
    private int sumHx(){
        return this.hardworking + this.honest + this.loyal;
    }

    public void compeerFacultu(Hufflepuff student){
        if (this.sumHx() > student.sumHx()){
            System.out.println(this.getName() + " Лучше, чем " + student.getName());
        }else if (this.sumHx() < student.sumHx()){
            System.out.println(student.getName() + " Лучше, чем " + this.getName());
        }else {
            System.out.println("Студенты одинаковы");
        }
    }
}
