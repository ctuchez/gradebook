package gradebook.model;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class StudentTest {


@Test
public void testGradeFromStudent() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 90, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
assertEquals(
90, (int) tuchez.getGrade());
}

@Test
public void testLetterAGradeFromStudent() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 91, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
assertEquals(
"A", tuchez.getLetterGrade());
}

@Test
public void testLetterBGradeFromStudent() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 85, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
assertEquals(
"B", tuchez.getLetterGrade());
}

@Test
public void testLetterCGradeFromStudent() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 74, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
assertEquals(
"C", tuchez.getLetterGrade());
}

@Test
public void testLetterDGradeFromStudent() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 69, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
assertEquals(
"D", tuchez.getLetterGrade());
}

@Test
public void testLetterFGradeFromStudent() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 56, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
assertEquals(
"F", tuchez.getLetterGrade());
}


@Test
public void testGettingItemFromStudent() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 56, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
tuchez.add(testOne);
assertEquals(
testOne, tuchez.getItem(0));
}

@Test
public void testHavingMultipleItems() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 90, tests);
GradebookItem testTwo = new GradebookItem("TestTwo", 100, tests);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
items.add(testTwo);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
assertEquals(
95, (int) tuchez.getGrade());
}

@Test
public void testMultipleItemCategories() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookCategory homework = new GradebookCategory("homework", 1);
GradebookItem testOne = new GradebookItem("TestOne", 90, tests);
GradebookItem homeworkOne = new GradebookItem("homeworkOne", 100, homework);
ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
items.add(testOne);
items.add(homeworkOne);
GradingSchemeExample sampleScheme = new GradingSchemeExample(items);
Student tuchez = new Student("Tuchez", sampleScheme);
assertEquals(
95, (int) tuchez.getGrade());
}
}