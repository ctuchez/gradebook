package gradebook.model;

/**
 * This is the inteface that makes sure grade
 * and grade are given uniformly for course,
 * class, section, and student.
 *
 * @author Christian Tuchez
 */
public interface AverageScores {

   int getGrade();

   String getLetterGrade();
}

