package Response;

import org.testng.Assert;
import org.testng.annotations.Test;

import Response.ResponseHandler; // Update the import statement to the correct package

public class TestResponsePayload {

    @Test
    public void testPositiveResponsePayload() {
        // Create an instance of ResponseHandler
        ResponseHandler responseHandler = new ResponseHandler();

        // Define test input
        int testInput = 5;

        // Call the method to get the response payload
        String actualResponse = responseHandler.processResponse(testInput);

        // Define the expected output
        String expectedResponse = "Positive Response Payload";

        // Verify the result
        Assert.assertEquals(actualResponse, expectedResponse);
    }

    @Test
    public void testNegativeResponsePayload() {
        // Create an instance of ResponseHandler
        ResponseHandler responseHandler = new ResponseHandler();

        // Define test input
        int testInput = -5;

        // Call the method to get the response payload
        String actualResponse = responseHandler.processResponse(testInput);

        // Define the expected output
        String expectedResponse = "Negative Response Payload";

        // Verify the result
        Assert.assertEquals(actualResponse, expectedResponse);
    }
}

