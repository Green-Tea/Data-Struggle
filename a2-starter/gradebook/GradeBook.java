import java.util.ArrayList;
import java.util.List;

/**
 * Lorenzo Cassio 6280924
 */

public class GradeBook {

    // Do not modify these
    private List<Double> assignmentScores;
    private List<Double> quizScores;
    private double midtermScore;
    private double finalScore;
    private Course course;

    // Creates an empty grade book
    public GradeBook() {
        course = null;
        assignmentScores = new ArrayList<>();
        quizScores = new ArrayList<>();
        setMidtermScore(0.0);
        setFinalScore(0.0);
    }

    // Records the score of a particular assignment
    // Note: First assignment is assignment 1
    public void setAssignmentScore(int assignmentNumber, double score) {
        int size = assignmentScores.size();
        if (assignmentNumber > size) {
            int i = 0;
            while (i < assignmentNumber - size - 1) {
                assignmentScores.add(0.0);
                i++;
            }
            assignmentScores.add(score);
        } else {
            assignmentScores.set(assignmentNumber - 1, score);
        }
    }

    // Records the score of a particular quiz
    // Note: First quiz is quiz 1
    public void setQuizScore(int quizNumber, double score) {
        int size = quizScores.size();
        if (quizNumber > size) {
            int i = 0;
            while (i < quizNumber - size - 1) {
                quizScores.add(0.0);
                i++;
            }
            quizScores.add(score);
        } else {
            quizScores.set(quizNumber - 1, score);
        }
    }

    // Returns average score after dropping <numDrop> lowest scores.
    //
    // You must assume that the total number of assignments/quizzes is the
    // maximum of the assignment ids that has been recorded, and
    // assume scores of 0.0 for unrecorded scores.
    //
    // For example, if only scores of quiz 1 and 3 are recorded,
    // you should assume that there are 3 quizzes and quiz 2 score is 0.0.
    private double getAverageScore(List<Double> scores, int numDrop) {
        if (numDrop >= scores.size()) {
            return 0.0;
        }

        List<Double> newScores = new ArrayList<>(scores);
        double total = 0;
        int size = scores.size();

        // for numDrop loops,
        for (int i = 0; i < numDrop; i++) {
            double lowest = newScores.get(0);
            int lowestIndex = 0;
            // find the lowest score of the remaining in the list
            for (int n = 1; n < size; n++) {
                if (newScores.get(n) < lowest) {
                    lowest = newScores.get(n);
                    lowestIndex = n;
                }
            }
            // remove the lowest and reduce size by 1
            newScores.remove(lowestIndex);
            size--;
        }

        for (int k = 0; k < size; k++) {
            total += newScores.get(k);
        }
        return total / newScores.size();
    }

    public double getAverageQuizScore(int numDrop) {
        return getAverageScore(quizScores, numDrop);
    }

    public double getAverageAssignmentScore(int numDrop) {
        return getAverageScore(assignmentScores, numDrop);
    }

    // Returns the term weighted average according to the following formula:
    //  term_avg = (avg_assn_score * assn_weight% + avg_quiz_score * quiz_weight%
    //             + midterm_score * midterm_weight% + final_score * final_weight%) / 100
    // If the grading scheme is not define, return -1
    public double getTermAverage(int numAssignmentDrop, int numQuizDrop) {
        if (course == null) {
            return -1;
        }

        return (getAverageAssignmentScore(numAssignmentDrop) * course.getAssignmentWeightPercentage() + getAverageQuizScore(numQuizDrop) * course.getQuizWeightPercentage() + midtermScore * course.getMidtermWeightPercentage() + finalScore * course.getFinalWeightPercentage()) / 100;
    }

    public void printRawScores() {
        System.out.println("Assignment Scores:");
        int n = 1;
        int k = 1;
        for (int i = 0; i < assignmentScores.size(); i++) {
            System.out.println("" + n + " : " + assignmentScores.get(i));
            n++;
        }
        System.out.println("Quiz Scores:");
        for (int i = 0; i < quizScores.size(); i++) {
            System.out.println("" + k + " : " + quizScores.get(i));
            k++;
        }
        System.out.println("Midterm score:" + midtermScore);
        System.out.println("Final score:" + finalScore);
    }

    public void setMidtermScore(double score) {
        midtermScore = score;
    }

    public void setFinalScore(double score) {
        finalScore = score;
    }

    public void setCourse(Course name) {
        course = name;
    }

    // Do not modify this
    public static void main(String[] args) {
        GradeBook book = new GradeBook();

        book.setAssignmentScore(1, 80);
        book.setAssignmentScore(3, 88);
        book.setAssignmentScore(2, 90);

        book.setQuizScore(1,100);
        book.setQuizScore(2,80);

        book.setMidtermScore(100);
        book.setFinalScore(100);

        book.printRawScores();

        System.out.println("Avg Assignment Score (No drop): " + book.getAverageAssignmentScore(0));
        System.out.println("Avg Assignment Score (drop 1): " + book.getAverageAssignmentScore(1));
        System.out.println("Avg Assignment Score (drop 2): " + book.getAverageAssignmentScore(2));
        System.out.println("Avg Assignment Score (drop 3): " + book.getAverageAssignmentScore(3));
        System.out.println("Avg Assignment Score (drop 4): " + book.getAverageAssignmentScore(4));

        System.out.println("Avg Quiz Score (No drop): " + book.getAverageQuizScore(0));
        System.out.println("Avg Quiz Score (drop 1): " + book.getAverageQuizScore(1));
        System.out.println("Avg Quiz Score (drop 2): " + book.getAverageQuizScore(2));

        book.setAssignmentScore(9, 80);
        book.printRawScores();
        System.out.println("Avg Assignment Score (No drop): " + book.getAverageAssignmentScore(0));

    }


}
