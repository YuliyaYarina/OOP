public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int witchcraft, int transgress, int smart, int wise, int witty, int creativity) {
        super(name, witchcraft, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void info(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + " Ravenclaw" +
                " smart = " + smart +
                ", wise = " + wise +
                ", witty = " + witty +
                ", creativity = " + creativity;
    }

    private int sumHx(){
        return this.creativity + this.smart + this.wise + this.witty;
    }

    public void compeerFacultu(Ravenclaw student){
        if (this.sumHx() > student.sumHx()){
            System.out.println(this.getName() + " Лучше, чем " + student.getName());
        }else if (this.sumHx() < student.sumHx()) {
            System.out.println(student.getName() + " Лучше, чем " + this.getName());
        }else {
            System.out.println("Студенты одинаковы");
        }
    }
}
