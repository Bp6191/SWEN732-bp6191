public interface UniversityVisitor {
    // Interface for visit methods for different types of entities
    void visit(Student student);

    void visit(Professor professor);

    void visit(Course course);
}
