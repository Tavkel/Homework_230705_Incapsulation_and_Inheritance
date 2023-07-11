import java.util.Objects;

public abstract class HogwartsStudent {
    private final String name;
    private final int magicPower;
    private final int transgressionPower;

    public HogwartsStudent(String name, int magicPower, int transgressionPower) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionPower = transgressionPower;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionPower() {
        return transgressionPower;
    }

    private int sumStats() {
        return this.magicPower + this.transgressionPower;
    }

    public void compareStudents(HogwartsStudent s2) {
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
        HogwartsStudent that = (HogwartsStudent) o;
        return magicPower == that.magicPower && transgressionPower == that.transgressionPower
                && name.equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(magicPower, transgressionPower);
    }

    @Override
    public String toString() {
        return "name='" + name + '\''
                + ", magicPower=" + magicPower
                + ", transgressionPower=" + transgressionPower;
    }
}
