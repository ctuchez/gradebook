package gradebook.model;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class ClassTest {


@Test
public void testGradeFromClass() {
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
assertEquals(
90, (int) fallCS.getGrade());
}

@Test
public void testLetterAGradeFromClass() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 98, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
Class fallCS = new Class();
fallCS.add(sectionA);
assertEquals(
"A", fallCS.getLetterGrade());
}

@Test
public void testLetterBGradeFromClass() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 88, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
Class fallCS = new Class();
fallCS.add(sectionA);
assertEquals(
"B", fallCS.getLetterGrade());
}

@Test
public void testLetterCGradeFromClass() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 78, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
Class fallCS = new Class();
fallCS.add(sectionA);
assertEquals(
"C", fallCS.getLetterGrade());
}

@Test
public void testLetterDGradeFromClass() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 63, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
Class fallCS = new Class();
fallCS.add(sectionA);
assertEquals(
"D", fallCS.getLetterGrade());
}

@Test
public void testLetterFGradeFromClass() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 30, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
Section sectionA = new Section();
sectionA.add(tuchez);
Class fallCS = new Class();
fallCS.add(sectionA);
assertEquals(
"F", fallCS.getLetterGrade());
}



@Test
public void testGetSectionFromClass() {
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
assertEquals(
sectionA, fallCS.getSection(0));
}

@Test
public void testMultipleSectionsFromClass() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 84, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
GradebookItem test2 = new GradebookItem("TestTwo",80 , tests);
ArrayList<GradebookItem> items2 = new ArrayList<GradebookItem>();
items2.add(test2);
GradingSchemeExample sampleScheme2 = new GradingSchemeExample(items2);
Student sagan = new Student("Sagan", sampleScheme2);
Section sectionA = new Section();
Section sectionB = new Section();
sectionA.add(tuchez);
sectionB.add(sagan);
Class fallCS = new Class();
fallCS.add(sectionA);
fallCS.add(sectionB);
assertEquals(
82, fallCS.getGrade());
}

@Test
public void testRemoveSectionFromClass() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 84, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
GradebookItem test2 = new GradebookItem("TestTwo",80 , tests);
ArrayList<GradebookItem> items2 = new ArrayList<GradebookItem>();
items2.add(test2);
GradingSchemeExample sampleScheme2 = new GradingSchemeExample(items2);
Student sagan = new Student("Sagan", sampleScheme2);
Section sectionA = new Section();
Section sectionB = new Section();
sectionA.add(tuchez);
sectionB.add(sagan);
Class fallCS = new Class();
fallCS.add(sectionA);
fallCS.add(sectionB);
fallCS.remove(sectionA);
assertEquals(
80, fallCS.getGrade());
}
}