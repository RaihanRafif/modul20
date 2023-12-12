package Response;

public class ResponseHandler {
    public String processResponse(int input) {
        // Some logic to process the input and generate response payload
        if (input > 0) {
            return "Positive Response Payload";
        } else {
            return "Negative Response Payload";
        }
    }
}
