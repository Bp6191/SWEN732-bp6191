public interface UniversityVisitor {
    void visit(Student student);

    void visit(Professor professor);

    void visit(Course course);
}
