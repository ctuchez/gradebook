package gradebook.model;

import java.util.Iterator;

/**
 * This makes a section that is passed into a class
 * and can hold students.
 *
 * @author Christian Tuchez
 */
public class Section implements AverageScores {

   private GradebookDAO students = new GradebookDAO();
   private static final int A = 5;
   private static final int B = 4;
   private static final int C = 3;
   private static final int D = 2;


   public Section() {

   }

   public int getGrade() {
      int sectionGrade = 0;
      int numOfStudents = students.size();
      for (Iterator studentIterator = students.iterator();
      studentIterator.hasNext();) {
         Student student = (Student) studentIterator.next();
         sectionGrade = sectionGrade + student.getGrade();
      }
      return (sectionGrade / numOfStudents);
   }


   final void add(final Student aStudent) {
      students.add(aStudent);
   }

   final void remove(final Student aStudent) {
      students.remove(aStudent);
   }

   final Student getStudent(final int index) {
      return (Student) students.get(index);
   }



   public String getLetterGrade() {
      int total = getLetterTotals();
      float forProcessing = (float) total / (float) students.size();
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
      for (Iterator studentIterator = students.iterator();
      studentIterator.hasNext();) {
         Student aStudent = (Student) studentIterator.next();
         String letterGrade = aStudent.getLetterGrade();
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

