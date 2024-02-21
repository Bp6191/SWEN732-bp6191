public class UniversityInfoSystem {
    public static void main(String[] args) {
        // Creating entities
        Student student = new Student("John Doe");
        Professor professor = new Professor("Dr. Smith");
        Course course = new Course("CS101");

        // Creating visitor
        UniversityVisitor visitor = new ReportGeneratorVisitor();

        // Accepting visitor on entities
        student.accept(visitor);
        professor.accept(visitor);
        course.accept(visitor);
    }
}
