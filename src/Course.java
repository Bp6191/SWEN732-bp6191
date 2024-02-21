public class Course implements UniversityEntity {
    private String courseCode;

    public Course(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    @Override
    public void accept(UniversityVisitor visitor) {
        visitor.visit(this);
    }
}
