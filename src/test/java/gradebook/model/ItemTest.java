package gradebook.model;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class ItemTest {

@Test
public void testGradebookItemGrade() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 90, tests);
assertEquals(
90, (int) testOne.getGrade());
}

@Test
public void testGradebookItemName() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 90, tests);
assertEquals(
"TestOne", testOne.getName());
}

@Test
public void testGradebookItemCategory() {
GradebookCategory tests = new GradebookCategory("tests", 1);
GradebookItem testOne = new GradebookItem("TestOne", 90, tests);
assertEquals(
tests, testOne.getGradebookCategory());
}
}