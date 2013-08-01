package gradebook.model;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class CategoryTest {

@Test
public void testGradebookCategoryWeight() {
GradebookCategory tests = new GradebookCategory("tests", 2);
assertEquals(
2, (int) tests.getWeight());
}

@Test
public void testGradebookCategoryName() {
GradebookCategory tests = new GradebookCategory("tests", 2);
assertEquals(
"tests", tests.getName());
}
}