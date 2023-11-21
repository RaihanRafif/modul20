package utilites;

import org.testng.TestNG;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {

    public static void main(String[] args) {
        // Create a TestNG object
        TestNG testNG = new TestNG();

        // Create a list to store test classes
        List<Class<?>> classes = new ArrayList<>();

        // Add test classes to the list
        classes.add(tests.APITest.class); // Change this to your actual test class

        // Set the test classes to be executed
        testNG.setTestClasses(classes.toArray(new Class[0]));

        // Run the tests
        testNG.run();
    }
}
