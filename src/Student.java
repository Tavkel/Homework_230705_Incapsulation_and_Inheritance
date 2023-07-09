public abstract class Student {
    public Student(String name) {
        this.name = name;
    }

    private final String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
