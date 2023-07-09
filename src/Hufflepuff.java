import java.util.Objects;

public class Hufflepuff extends HogwartsStudent {
    public Hufflepuff(String name, int magicPower, int transgressionPower, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgressionPower);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    private final int industriousness;
    private final int loyalty;
    private final int honesty;

    private int sumStats() {
        return this.honesty + this.industriousness + this.loyalty;
    }

    public void compareHufflepuffStudents(Hufflepuff s2) {
        if (this.equals(s2)) {
            System.out.println("Tried to compare same student");
        } else {
            int s1Stats = this.sumStats();
            int s2Stats = s2.sumStats();
            if (s1Stats > s2Stats) {
                System.out.println(this + "\nКруче чем\n" + s2);
            } else if (s1Stats < s2Stats) {
                System.out.println(s2 + "\nКруче чем\n" + this);
            } else {
                System.out.println("Compared students have the same stats");
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return industriousness == that.industriousness && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), industriousness, loyalty, honesty);
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "name='" + this.getName() + '\'' +
                ", magicPower=" + this.getMagicPower() +
                ", transgressionPower=" + this.getTransgressionPower() +
                ", industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
