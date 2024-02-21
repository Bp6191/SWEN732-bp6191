public class Professor implements UniversityEntity {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

// Implementation of the accept method from the Visitable interface.
// It allows a UniversityVisitor to visit and perform actions on this Professor object.
    @Override
    //Can call appropriate visit methods for professors
    public void accept(UniversityVisitor visitor) {
        visitor.visit(this);
    }
}
