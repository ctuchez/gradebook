package gradebook.model;

import java.util.Iterator;

/**
 * This makes a class that belongs to a course. It can hold sections
 * and report the class grade and grade letter.
 */

public class Class implements AverageScores {


   private GradebookDAO sections = new GradebookDAO();
   private static final int A = 5;
   private static final int B = 4;
   private static final int C = 3;
   private static final int D = 2;


   public Class() {

   }

   public int getGrade() {
      int classGrade = 0;
      int numOfSections = sections.size();
      for (Iterator sectionIterator = sections.iterator();
      sectionIterator.hasNext();) {
         Section aSection = (Section) sectionIterator.next();
         classGrade = classGrade + aSection.getGrade();
      }
      return (classGrade / numOfSections);
   }


   final void add(final Section aSection) {
      sections.add(aSection);
   }

   final void remove(final Section aSection) {
      sections.remove(aSection);
   }

   final Section getSection(final int index) {
      return (Section) sections.get(index);
   }

   public String getLetterGrade() {
      int total = getLetterTotals();
      float forProcessing = (float) total / (float) sections.size();
      String letterGrade = "F";
      if (forProcessing > B) {
         letterGrade = "A";
      } else if (forProcessing > C) {
         letterGrade = "B";
      } else if (forProcessing > D) {
         letterGrade = "C";
      } else if (forProcessing > 1) {
         letterGrade = "D";
      }
      return letterGrade;
   }


   private int getLetterTotals() {
      int avgGrade = 0;
      for (Iterator sectionIterator = sections.iterator();
      sectionIterator.hasNext();) {
         Section aSection = (Section) sectionIterator.next();
         String letterGrade = aSection.getLetterGrade();
         if (letterGrade.equals("A")) {
            avgGrade = avgGrade + A;
         } else if (letterGrade.equals("B")) {
            avgGrade = avgGrade + B;
         } else if (letterGrade.equals("C")) {
            avgGrade = avgGrade + C;
         } else if (letterGrade.equals("D")) {
            avgGrade = avgGrade + D;
         } else {
            avgGrade = avgGrade + 1;
         }
      }
      return avgGrade;
   }
}

