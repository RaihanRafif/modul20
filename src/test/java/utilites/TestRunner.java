package utilites;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestRunner {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        XmlSuite suite = new XmlSuite();
        suite.setName("Test API");

        // Add a list of XmlTests to the XmlSuite
        List<XmlTest> tests = new ArrayList<>();

        // Define the test names based on your testng.xml
        String[] testNames = { "Test Positive", "Test Negative","Test Boundary" };


        for (String testName : testNames) {
            XmlTest xmlTest = new XmlTest(suite);
            xmlTest.setName(testName);

            // Add the classes to the XmlTest
            List<XmlClass> xmlClasses = new ArrayList<>();
            xmlClasses.add(new XmlClass("tests.APITest"));
            xmlTest.setClasses(xmlClasses);

            tests.add(xmlTest);
        }

        // Add the suite to TestNG
        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);


        testng.setXmlSuites(suites);

        // Run the tests
        testng.run();
    }
}