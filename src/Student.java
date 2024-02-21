public class Student implements UniversityEntity {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(UniversityVisitor visitor) {
        visitor.visit(this);
    }
}
