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

        List<String> suites = new ArrayList<String>();

        suites.add("src/test/resources/testng.xml");

        testng.setTestSuites(suites);
        testng.run();

    }
}