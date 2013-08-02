package gradebook.model;


/**
 * This makes a student that is passed into a section
 * and can hold gradbook items.
 *
 * @author Christian Tuchez
 */
public class Student implements AverageScores {

   private String name;
   private GradebookDAO gradeItems = new GradebookDAO();
   private GradingScheme gradesScheme;

   public Student(final String aName, final GradingScheme aScheme) {
      name = aName;
      gradesScheme = aScheme;
   }

   public int getGrade() {
      return gradesScheme.calculateGrade();
   }


   public String getLetterGrade() {
      return gradesScheme.calculateLetterGrade();
   }


   final void add(final GradebookItem anItem) {
      gradeItems.add(anItem);
   }

   final GradebookItem getItem(final int index) {
      return (GradebookItem) gradeItems.get(index);
   }

   final void remove(final GradebookItem anItem) {
      gradeItems.remove(anItem);
   }

}

