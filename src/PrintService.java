public class PrintService {


    public void print(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Студент " + gryffindor.getName()
                    + ". Умеет колдовать и трансгрессировать. " +
                    "+ Всем Гриффиндорцам присущи благородство, честь и храбрость. ");
        }
        System.out.println();
    }
    public void print(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Студент " + hufflepuff.getName()
                    + ". Умеет колдовать и трансгрессировать." +
                    "+ Студенты Пуффендуя трудолюбивы, верны, честны ");
        }
        System.out.println();
    }

    public void print(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Студент " + ravenclaw.getName() +
                    ". Умеет колдовать и трансгрессировать. " +
                    "+ Когтевранцы умны, мудры, остроумны и полны творчества. ");
        }
        System.out.println();
    }

    public void print(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Студент " + slytherin.getName() +
                    ". Умеет колдовать и трансгрессировать. " +
                    "+ Когтевранцы умны, мудры, остроумны и полны творчества. ");
        }
        System.out.println();
    }


    }
