import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class HexCukesRunner {

    @Given("A Value is Given")
    public void scannerValue() {
        String input = "155";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Then("The Value Should be Converted to Hex")
    public void hexCheck() throws Exception {
        Dec2Hex.convertToHexadecimal();
    }
}
