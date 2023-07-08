import java.util.Random;

public class Main {
    private static final Random rng = new Random();
    private static final Griffindor[] griffindorStudents = {
            new Griffindor("Гарри Поттер", rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100)),
            new Griffindor("Гермиона Грейнджер", rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100)),
            new Griffindor("Рон Уизли", rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100)),
    };
    private static final Slytherin[] slytherinStudents = {
            new Slytherin("Драко Малфой", rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100)),
            new Slytherin("Грэхэм Монтегю", rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100)),
            new Slytherin("Грегори Гойл", rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100))
    };
    private static final Ravenclaw[] ravenclawStudents = {
            new Ravenclaw("Чжоу Чанг", rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100)),
            new Ravenclaw("Падма Патил", rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100)),
            new Ravenclaw("Маркус Белби", rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100))
    };
    private static final Hufflepuff[] hufflepuffStudents = {
            new Hufflepuff("Захария Смит", rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100)),
            new Hufflepuff("Седрик Диггори", rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100)),
            new Hufflepuff("Джастин Финч-Флетчли", rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100)),
    };
    public static void main(String[] args) {
        System.out.println(griffindorStudents[1]);
        System.out.println(slytherinStudents[0]);

        hufflepuffStudents[1].compareHufflepuffStudents(hufflepuffStudents[0]);
        ravenclawStudents[2].compareRavenclawStudents(ravenclawStudents[2]);
        ravenclawStudents[0].compareStudents(hufflepuffStudents[2]);
    }
}
