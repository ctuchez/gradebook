package gradebook.model;

/**
 * This is a category that is passed in to a grading item
 * which will be used by the scheme to calculate grades.
 */
public class GradebookCategory {

   private String name;
   private int weight;

   public GradebookCategory(final String aName, final int aWeight) {
      name = aName;
      weight = aWeight;
   }

   final int getWeight() {
      return weight;
   }

   final String getName() {
      return name;
   }
}

