import java.util.Objects;

public class Griffindor extends HogwartsStudent {
    public Griffindor(String name, int magicPower, int transgressionPower, int generosity, int honor, int bravery) {
        super(name, magicPower, transgressionPower);
        this.generosity = generosity;
        this.honor = honor;
        this.bravery = bravery;
    }

    private final int generosity;
    private final int honor;
    private final int bravery;

    public int getGenerosity() {
        return generosity;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    private int sumStats() {
        return this.bravery + this.generosity + this.honor;
    }

    public void compareGriffindorStudents(Griffindor s2) {
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
        Griffindor that = (Griffindor) o;
        return generosity == that.generosity && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), generosity, honor, bravery);
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionPower=" + transgressionPower +
                ", generosity=" + generosity +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
