package gradebook.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * This makes a course. It can hold classes
 * and report the course grade and grade letter.
 *
 * @author Christian Tuchez
 */
public class Course implements AverageScores {

   private String subject;
   private int courseNum;
   private String courseName;
   private List<Course> prerequisites;
   private GradebookDAO classes = new GradebookDAO();
   private static final int A = 5;
   private static final int B = 4;
   private static final int C = 3;
   private static final int D = 2;


   public Course(final String aSubject, final int aCourseNum,
   final String aCourseName, final ArrayList<Course> somePrereqs) {
      subject = aSubject;
      courseNum = aCourseNum;
      courseName = aCourseName;
      prerequisites = somePrereqs;
   }

   final void add(final Class aClass) {
      classes.add(aClass);
   }

   final void remove(final Class aClass) {
      classes.remove(aClass);
   }

   final Class getClass(final int index) {
      return (Class) classes.get(index);
   }

   final String getSubject() {
      return subject;
   }

   final int getCourseNum() {
      return courseNum;
   }

   final String getCourseName() {
      return courseName;
   }

   final Course getPrereq(int index) {
      return prerequisites.get(index);
   }

   public int getGrade() {
      int courseGrade = 0;
      int numOfClasses = classes.size();
      for (Iterator classesIterator = classes.iterator();
      classesIterator.hasNext();) {
         Class aClass = (Class) classesIterator.next();
         courseGrade = courseGrade + aClass.getGrade();
      }
      return (courseGrade / numOfClasses);
   }


   public String getLetterGrade() {
      int total = getLetterTotals();
      float forProcessing = (float) total / (float) classes.size();
      String letterGrade = "F";
      if (forProcessing > B) {
         letterGrade = "A";
      } else if (forProcessing > C) {
         letterGrade = "B";
      } else if (forProcessing > 2) {
         letterGrade = "C";
      } else if (forProcessing > 1) {
         letterGrade = "D";
      }
      return letterGrade;
   }

   private int getLetterTotals() {
      int avgClassesGrade = 0;
      for (Iterator classesIterator = classes.iterator();
      classesIterator.hasNext();) {
         Class aClass = (Class) classesIterator.next();
         String letterGrade = aClass.getLetterGrade();
         if (letterGrade.equals("A")) {
            avgClassesGrade = avgClassesGrade + A;
         } else if (letterGrade.equals("B")) {
            avgClassesGrade = avgClassesGrade + B;
         } else if (letterGrade.equals("C")) {
            avgClassesGrade = avgClassesGrade + C;
         } else if (letterGrade.equals("D")) {
            avgClassesGrade = avgClassesGrade + D;
         } else {
            avgClassesGrade = avgClassesGrade + 1;
         }
      }
      return avgClassesGrade;
   }
}

