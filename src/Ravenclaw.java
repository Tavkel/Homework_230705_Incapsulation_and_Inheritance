import java.util.Objects;

public class Ravenclaw extends HogwartsStudent {
    public Ravenclaw(String name, int magicPower, int transgressionPower, int intelligence, int wisdom, int ingenuity, int creativity) {
        super(name, magicPower, transgressionPower);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.ingenuity = ingenuity;
        this.creativity = creativity;
    }

    private final int intelligence;
    private final int wisdom;
    private final int ingenuity;
    private final int creativity;

    private int sumStats() {
        return this.creativity + this.ingenuity + this.intelligence + this.wisdom;
    }

    public void compareRavenclawStudents(Ravenclaw s2) {
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
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return intelligence == ravenclaw.intelligence && wisdom == ravenclaw.wisdom && ingenuity == ravenclaw.ingenuity
                && creativity == ravenclaw.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), intelligence, wisdom, ingenuity, creativity);
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "name='" + this.getName() + '\'' +
                ", magicPower=" + this.getMagicPower() +
                ", transgressionPower=" + this.getTransgressionPower() +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", ingenuity=" + ingenuity +
                ", creativity=" + creativity +
                '}';
    }
}
