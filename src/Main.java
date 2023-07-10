import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int getRandom() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(100);
    }
    public static void main(String[] args){

               Gryffindor garru = new Gryffindor("Гарри Поттер",getRandom(),getRandom(), getRandom(),getRandom(),getRandom());
               Gryffindor germ = new Gryffindor("Гермиона Грейнджер",getRandom(),getRandom(), getRandom(),getRandom(),getRandom());
               Gryffindor ron = new Gryffindor("Рон Уизли",getRandom(),getRandom(), getRandom(),getRandom(),getRandom());

               Hufflepuff zaxariya  = new Hufflepuff("Захария Смит", 55,72,88,29,99);
               Hufflepuff sedrik  = new Hufflepuff("Седрик Диггори", 71,55,22,40,77);
               Hufflepuff djastiin =  new Hufflepuff(" Джастин Финч-Флетчли", 22,45,9,74,27);

               Ravenclaw hjoy = new Ravenclaw("Чжоу Чанг", 83,29,53,90,44,63);
               Ravenclaw padma = new Ravenclaw("Падма Патил", 39,55,20,77,33,90);
               Ravenclaw markys = new Ravenclaw("Маркус Белби",77 ,82,71,66,10,38);

               Slytherin drako = new Slytherin("Драко Малфой",92,66, 88,77,53,66,33);
               Slytherin grexm = new Slytherin(" Грэхэм Монтегю",74,82, 66,28,66,22,16);
               Slytherin gregori = new Slytherin("Грегори Гойл",37,73, 44,83,29,77,23);


garru.info();
drako.info();
padma.info();
germ.info();

        garru.compeerFacultu(ron);
        drako.compeerFacultu(gregori);

        sedrik.printCompareHogwartsStudents(garru);
        drako.printCompareHogwartsStudents(germ);
        ron.printCompareHogwartsStudents(hjoy);


    }
}