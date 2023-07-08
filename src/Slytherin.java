import java.util.Objects;

public class Slytherin extends HogwartsStudent {
    public Slytherin(String name, int magicPower, int transgressionPower, int cunning, int determination, int ambition, int resourcefulness, int desireFoAuthority) {
        super(name, magicPower, transgressionPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desireForAuthority = desireFoAuthority;
    }

    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int desireForAuthority;

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getDesireFoAuthority() {
        return desireForAuthority;
    }

    private int sumStats() {
        return this.ambition + this.cunning + this.desireForAuthority + this.determination + this.resourcefulness;
    }

    public void compareSlytherinStudents(Slytherin s2) {
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
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && desireForAuthority == slytherin.desireForAuthority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cunning, determination, ambition, resourcefulness, desireForAuthority);
    }

    @Override
    public String toString() {
        return "Slytherin{" + "name='" + name + '\'' + ", magicPower=" + magicPower + ", transgressionPower=" + transgressionPower + ", cunning=" + cunning + ", determination=" + determination + ", ambition=" + ambition + ", resourcefulness=" + resourcefulness + ", desireFoAuthority=" + desireForAuthority + '}';
    }
}
