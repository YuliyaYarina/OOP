public class Main {
    public static void main(String[] args){
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер",66,59, 91,66,44),
                new Gryffindor("Гермиона Грейнджер",91,48, 88,92,66),
                new Gryffindor("Рон Уизли",83,33, 57,83,29),
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 55,72,88,29,99),
                new Hufflepuff("Седрик Диггори", 71,55,22,40,77),
                new Hufflepuff(" Джастин Финч-Флетчли", 22,45,9,74,27),
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 83,29,53,90,44,63),
                new Ravenclaw("Падма Патил", 39,55,20,77,33,90),
                new Ravenclaw("Маркус Белби",77 ,82,71,66,10,38),
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой",92,66, 88,77,53,66,33),
                new Slytherin(" Грэхэм Монтегю",74,82, 66,28,66,22,16),
                new Slytherin("Грегори Гойл",37,73, 44,83,29,77,23),
        };

        PrintService printService = new PrintService();
        printService.print(gryffindors);
        printService.print(hufflepuffs);
        printService.print(ravenclaws);
        printService.print(slytherins);



    }
}