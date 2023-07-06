public class PrintService {
    private void generalqQualities(){
        System.out.println("сила магии,умение трансгрессировать.");
    }
    private void generalqQualities1(){
        System.out.println("сила магии,умение трансгрессировать.111");
    }



    public void print(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println(" " + gryffindor.getName()
                    + "; Возраст " + gryffindor
                    + "; номер " + gryffindor);
        }
        System.out.println();
    }
    public void print(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println(" " + hufflepuff.getName()
                    + "; Возраст " + hufflepuff
                    + "; номер " + hufflepuff);
        }
        System.out.println();
    }

    public void print(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println(" " + ravenclaw.getName()
                    + "; Возраст " + ravenclaw
                    + "; номер " + ravenclaw);
        }
        System.out.println();
    }

    public void print(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println(" " + slytherin.getName()
                    + "; Возраст " + slytherin
                    + "; номер " + slytherin);
        }
        System.out.println();
    }


    }
