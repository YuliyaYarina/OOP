public class Gryffindor extends Hogwarts {


    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, int witchcraft, int transgress, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void info(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + " Gryffindor " +
                " nobility = " + nobility +
                ", honor = " + honor +
                ", bravery = " + bravery;
    }

    private int sumHx(){
        return this.bravery + this.honor + this.nobility;
    }

    public void compeerFacultu(Gryffindor student){
        if (this.sumHx() > student.sumHx()){
            System.out.println(this.getName() + " Лучше, чем " + student.getName());
        }else if (this.sumHx() < student.sumHx()){
            System.out.println(student.getName() + " Лучше, чем " + this.getName());
        }else {
            System.out.println("Студенты одинаковы");
        }
    }
}


