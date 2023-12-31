public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int witchcraft, int transgress, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, witchcraft, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() + " Slytherin " +
                " cunning = " + cunning +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", resourcefulness = " + resourcefulness +
                ", thirstForPower = " + thirstForPower;
    }

    public void info(){
        System.out.println(this.toString());
    }

    private int sumHx(){
        return this.ambition + this.cunning + this.determination + this.thirstForPower + this.resourcefulness;
    }

    public void compeerFacultu(Slytherin student){
        if (this.sumHx() > student.sumHx()){
            System.out.println(this.getName() + " Лучше, чем " + student.getName());
        }else if (this.sumHx() < student.sumHx()){
            System.out.println(student.getName() + " Лучше, чем " + this.getName());
        }else {
            System.out.println("Студенты одинаковы");
        }
    }
}
