public class ReportGeneratorVisitor implements UniversityVisitor {
    @Override
    public void visit(Student student) {
        System.out.println("Generating report for student: " + student.getName());

        System.out.println("Student Report:");
        System.out.println("Name: " + student.getName());
        System.out.println("Performance: Excellent");
        System.out.println("Attendance: 95%");

    }

    @Override
    public void visit(Professor professor) {
        System.out.println("Calculating workload for professor: " + professor.getName());


        int numberOfCourses = 5;
        int workload = numberOfCourses * 10;
        System.out.println("Workload for " + professor.getName() + ": " + workload + " hours");

    }

    @Override
    public void visit(Course course) {
        System.out.println("Displaying details for course: " + course.getCourseCode());

        System.out.println("Course Details:");
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Instructor: Dr. Example");
        System.out.println("Schedule: Monday, Wednesday, Friday at 10:00 AM");

    }
}
