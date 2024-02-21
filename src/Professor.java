public class Professor implements UniversityEntity {
    private String name;

    public Professor(String name) {
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
