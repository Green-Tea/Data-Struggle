import java.util.ArrayList;
import java.util.List;

/**
 * Lorenzo Cassio 6280924
 */
public class Course {

    // Do not modify these
    private String name;
    private double assignmentWeightPercentage;
    private double quizWeightPercentage;
    private double midtermWeightPercentage;
    private double finalWeightPercentage;
    private List<GradeBook> gradeBooks;

    // Creates a course with default grading scheme:
    //   - assignment 50%
    //   - quiz 10%
    //   - midterm 20%
    //   - final 20%
    public Course(String name) {
        assignmentWeightPercentage = 50;
        quizWeightPercentage = 10;
        midtermWeightPercentage = 20;
        finalWeightPercentage = 20;
        List<GradeBook> gradeBooks = new ArrayList<>();
    }

    // Creates a course with a given grading scheme
    public Course(String name, double a, double q, double m, double f) {
        assignmentWeightPercentage = a;
        quizWeightPercentage = q;
        midtermWeightPercentage = m;
        finalWeightPercentage = f;
        List<GradeBook> gradeBooks = new ArrayList<>();
    }

    // Add a grade book to the course
    // You must also update the course reference in the grade book object.
    public void addGradebook(GradeBook gradebook) {
        gradeBooks = new ArrayList<>();
        gradeBooks.add(gradebook);
    }

    // Returns a List of all grade book objects
    public List<GradeBook> getAllGradeBooks() {
        return gradeBooks;
    }

    // Return the average term score across all students
    // You should make a call to getTermAverage() in each student's gradebook.
    // If no students, return -1
    public double getClassAverage(int numAssignmentDrop, int numQuizDrop) {
        double total = 0;
        GradeBook g = new GradeBook();
        int size = gradeBooks.size();

        if (size == 0) {
            return -1;
        }

        for (int i = 0; i < size; i++) {
            total += g.getTermAverage(numAssignmentDrop, numQuizDrop);
        }
        return total / size;
    }

    // Return the average term score across all students (no assignment/quiz dropping)
    // You should make a call to getTermAverage() in each student's gradebook.
    // If no students, return -1
    public double getClassAverage() {
        double total = 0;
        GradeBook g = new GradeBook();
        int size = gradeBooks.size();

        if (size == 0) {
            return -1;
        }

        for (int i = 0; i < size; i++) {
            total += g.getTermAverage(0, 0);
        }
        return total / size;
    }

    public double getAssignmentWeightPercentage() {
        return assignmentWeightPercentage;
    }

    public double getQuizWeightPercentage() {
        return quizWeightPercentage;
    }

    public double getMidtermWeightPercentage() {
        return midtermWeightPercentage;
    }

    public double getFinalWeightPercentage() {
        return finalWeightPercentage;
    }

    // Do not modify this
    public static void main(String[] args) {
        // Create a course with the default grading scheme
        Course course = new Course("Java");

        // Add two grade books
        GradeBook book1 = new GradeBook();
        GradeBook book2 = new GradeBook();
        course.addGradebook(book1);
        course.addGradebook(book2);

        System.out.println("Class average:" + course.getClassAverage());

        // first student
        book1.setAssignmentScore(1, 100);
        book1.setAssignmentScore(2, 100);
        book1.setAssignmentScore(3, 0);

        book1.setQuizScore(1,100);
        book1.setQuizScore(2,80);

        book1.setMidtermScore(100);
        book1.setFinalScore(100);

        // second student
        book2.setAssignmentScore(1, 90);
        book2.setAssignmentScore(2, 0);
        book2.setAssignmentScore(3, 90);

        book2.setQuizScore(1,80);
        book2.setQuizScore(2,100);

        book2.setMidtermScore(100);
        book2.setFinalScore(100);

        System.out.println("Class average:" + course.getClassAverage());
        System.out.println("Class average:" + course.getClassAverage(1, 1));
    }
}
