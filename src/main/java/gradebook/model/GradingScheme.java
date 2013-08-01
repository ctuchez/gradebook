package gradebook.model;

/**
 * This interface allows a great deal of flexibility
 * for the grading scheme objects. They can do anything
 * as long as they have these methods.
 */
public interface GradingScheme {


   String calculateLetterGrade();

   int calculateGrade();
}

