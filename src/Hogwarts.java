public class Hogwarts {
    private String name;
    private int witchcraft;
    private int transgress;

    public Hogwarts(String name, int witchcraft, int transgress) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public boolean compareTo(Hogwarts hogwarts) {
        return false;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", witchcraft=" + witchcraft +
                ", transgress=" + transgress +
                '}';
    }


    public void printCompareHogwartsStudents(Hogwarts student) {
        System.out.print(getName());
        if (getWitchcraft() > student.getWitchcraft()) {
            System.out.print(" обладает бОльшей силой магии");
        } else if (getWitchcraft() < student.getWitchcraft()) {
            System.out.print(" обладает меньшей силой магии");
        } else {
            System.out.print(" обладает такой же силой магии");
        }
        if (getTransgress() > student.getTransgress()) {
            System.out.print(" и бОльшим расстоянием трансгрессии, чем ");
        } else if (getTransgress() < student.getTransgress()) {
            System.out.print(" и меньшим расстоянием трансгрессии, чем ");
        } else {
            System.out.print(" и таким же расстоянием трансгрессии, как ");
        }
        System.out.println(student.getName());
    }
}

