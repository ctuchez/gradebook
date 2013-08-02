package gradebook.model;

/**
 * This interface allows a great deal of flexibility
 * for the grading scheme objects. They can do anything
 * as long as they have these methods.
 *
 * @author Christian Tuchez
 */
public interface GradingScheme {


   String calculateLetterGrade();

   int calculateGrade();
}

