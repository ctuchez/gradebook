package gradebook.model;

/**
 * This makes a gradebook item which is the equivalent
 * of an assignment. It holds a category.
 */
public class GradebookItem {

   private String name;
   private GradebookCategory gradebookCategory;
   private int gradeForItem;

   public GradebookItem(final String aName, final int aGrade,
   final GradebookCategory aGradebookCategory) {
      name = aName;
      gradebookCategory = aGradebookCategory;
      gradeForItem = aGrade;
   }

   final GradebookCategory getGradebookCategory() {
      return gradebookCategory;
   }

   final int getGrade() {
      return gradeForItem;
   }

   final String getName() {
      return name;
   }

}

