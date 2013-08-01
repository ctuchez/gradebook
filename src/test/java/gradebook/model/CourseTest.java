package gradebook.model;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class CourseTest {


@Test
public void testGradeFromCourse() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 90, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
Class fallCS = new Class();
fallCS.add(sectionA);
ArrayList<Course> prereqs = new ArrayList<Course>();
Course objectOriented = new Course("objectOriented", 1331, "CS1331", prereqs);
objectOriented.add(fallCS);
assertEquals(
90, (int) objectOriented.getGrade());
}


@Test
public void testLetterGradeAFromCourse() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 95, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
Class fallCS = new Class();
fallCS.add(sectionA);
ArrayList<Course> prereqs = new ArrayList<Course>();
Course objectOriented = new Course("objectOriented", 1331, "CS1331", prereqs);
objectOriented.add(fallCS);
assertEquals(
"A", objectOriented.getLetterGrade());
}

@Test
public void testLetterGradeBFromCourse() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 85, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
Class fallCS = new Class();
fallCS.add(sectionA);
ArrayList<Course> prereqs = new ArrayList<Course>();
Course objectOriented = new Course("objectOriented", 1331, "CS1331", prereqs);
objectOriented.add(fallCS);
assertEquals(
"B", objectOriented.getLetterGrade());
}

@Test
public void testLetterGradeCFromCourse() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 75, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
Class fallCS = new Class();
fallCS.add(sectionA);
ArrayList<Course> prereqs = new ArrayList<Course>();
Course objectOriented = new Course("objectOriented", 1331, "CS1331", prereqs);
objectOriented.add(fallCS);
assertEquals(
"C", objectOriented.getLetterGrade());
}

@Test
public void testLetterGradeDFromCourse() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 65, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
Class fallCS = new Class();
fallCS.add(sectionA);
ArrayList<Course> prereqs = new ArrayList<Course>();
Course objectOriented = new Course("objectOriented", 1331, "CS1331", prereqs);
objectOriented.add(fallCS);
assertEquals(
"D", objectOriented.getLetterGrade());
}

@Test
public void testLetterGradeFFromCourse() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 14, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
Class fallCS = new Class();
fallCS.add(sectionA);
ArrayList<Course> prereqs = new ArrayList<Course>();
Course objectOriented = new Course("objectOriented", 1331, "CS1331", prereqs);
objectOriented.add(fallCS);
assertEquals(
"F", objectOriented.getLetterGrade());
}


@Test
public void testSubjectFromCourse() {
ArrayList<Course> prereqs = new ArrayList<Course>();
Course objectOriented = new Course("objectOriented", 1331, "CS1331", prereqs);
assertEquals(
"objectOriented", objectOriented.getSubject());
}

@Test
public void testCourseNumberFromCourse() {
ArrayList<Course> prereqs = new ArrayList<Course>();
Course objectOriented = new Course("objectOriented", 1331, "CS1331", prereqs);
assertEquals(
1331, objectOriented.getCourseNum());
}

@Test
public void testCourseNameFromCourse() {
ArrayList<Course> prereqs = new ArrayList<Course>();
Course objectOriented = new Course("objectOriented", 1331, "CS1331", prereqs);
assertEquals(
"CS1331", objectOriented.getCourseName());
}

@Test
public void testCoursePrereqsFromCourse() {
ArrayList<Course> prereqs = new ArrayList<Course>();
ArrayList<Course> prereqs2 = new ArrayList<Course>();
Course intro = new Course("intro", 1301, "CS1301", prereqs2);
prereqs.add(intro);
Course objectOriented = new Course("objectOriented", 1331, "CS1331", prereqs);
assertEquals(
intro, objectOriented.getPrereq(0));
}

@Test
public void testMultipleClassesFromCourse() {
Class fallCS = new Class();
Class springCS = new Class();
ArrayList<Course> prereqs = new ArrayList<Course>();
Course objectOriented = new Course("objectOriented", 1331, "CS1331", prereqs);
objectOriented.add(fallCS);
objectOriented.add(springCS);
assertEquals(
springCS, objectOriented.getClass(1));
}

@Test
public void testRemoveClassFromCourse() {
Class fallCS = new Class();
Class springCS = new Class();
ArrayList<Course> prereqs = new ArrayList<Course>();
Course objectOriented = new Course("objectOriented", 1331, "CS1331", prereqs);
objectOriented.add(fallCS);
objectOriented.add(springCS);
objectOriented.remove(fallCS);
assertEquals(
springCS, objectOriented.getClass(0));
}

}