package gradebook.model;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class SectionTest {

@Test
public void testGradeFromSection() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 90, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
assertEquals(
90, (int) sectionA.getGrade());
}

@Test
public void testLetterGradeAFromSection() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 93, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
assertEquals(
"A", sectionA.getLetterGrade());
}

@Test
public void testLetterGradeBFromSection() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 85, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
assertEquals(
"B", sectionA.getLetterGrade());
}

@Test
public void testLetterGradeCFromSection() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 78, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
assertEquals(
"C", sectionA.getLetterGrade());
}

@Test
public void testLetterGradeDFromSection() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 69, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
assertEquals(
"D", sectionA.getLetterGrade());
}

@Test
public void testLetterGradeFFromSection() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 40, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
assertEquals(
"F", sectionA.getLetterGrade());
}

@Test
public void testGettingStudentFromSection() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 93, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
assertEquals(
tuchez, sectionA.getStudent(0));
}

@Test
public void testMultipleStudentsFromSection() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 90, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
GradebookItem test2 = new GradebookItem("TestTwo",80 , tests);
ArrayList<GradebookItem> items2 = new ArrayList<GradebookItem>();
items2.add(test2);
GradingSchemeExample sampleScheme2 = new GradingSchemeExample(items2);
Student tuchez = new Student("Tuchez", sampleScheme);
Student sagan = new Student("Sagan", sampleScheme2);
Section sectionA = new Section();
sectionA.add(tuchez);
sectionA.add(sagan);
assertEquals(
85, sectionA.getGrade());
}

@Test
public void testRemoveStudentFromSection() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 90, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
GradebookItem test2 = new GradebookItem("TestTwo",80 , tests);
ArrayList<GradebookItem> items2 = new ArrayList<GradebookItem>();
items2.add(test2);
GradingSchemeExample sampleScheme2 = new GradingSchemeExample(items2);
Student tuchez = new Student("Tuchez", sampleScheme);
Student sagan = new Student("Sagan", sampleScheme2);
Section sectionA = new Section();
sectionA.add(tuchez);
sectionA.add(sagan);
sectionA.remove(tuchez);
assertEquals(
80, sectionA.getGrade());
}
}