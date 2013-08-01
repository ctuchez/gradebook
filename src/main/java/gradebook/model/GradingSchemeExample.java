package gradebook.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This is an example of a grading scheme
 * that implements the GradingScheme interface
 */
public class GradingSchemeExample implements GradingScheme {

   private List<GradebookItem> items;
   private int numOfGradebookItems;
   private List<GradebookCategory> categs = new ArrayList<GradebookCategory>();
   private static final int A = 90;
   private static final int B = 80;
   private static final int C = 70;
   private static final int D = 60;


   public GradingSchemeExample(ArrayList<GradebookItem> someItems) {
      items = someItems;
   }

   private void processCategories() {
      for (GradebookItem anItem : items) {
         GradebookCategory aCateg = anItem.getGradebookCategory();
         if (!(categs.contains(aCateg))) {
            categs.add(aCateg);
         }
      }
   }

   public int calculateGrade() {
      processCategories();
      int total = 0;
      for (GradebookCategory aCategory : categs) {
         int weight = aCategory.getWeight();
         int categoryTotal = 0;
         for (GradebookItem anItem : items) {
            if (anItem.getGradebookCategory() == aCategory) {
               categoryTotal = categoryTotal + anItem.getGrade();
            }
         }
         total = total + categoryTotal * weight;
      }
      return total / items.size();
   }

   public String calculateLetterGrade() {
      int forProcessing = calculateGrade();
      String toReturn = "F";
      if (forProcessing > A) {
         toReturn = "A";
      } else if (forProcessing > B) {
         toReturn = "B";
      } else if (forProcessing > C) {
         toReturn = "C";
      } else if (forProcessing > D) {
         toReturn = "D";
      }
      return toReturn;
   }
}

