import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Dec2HexTest {

    @Test
    public void hexademicalConversionSuccessTest() throws Exception {
        String input = "155";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThat(Dec2Hex.convertToHexadecimal()).isEqualTo("9b");
    }

    @Test(expected = Exception.class)
    public void hexademicalConversionEmptyFailureTest() throws Exception {
        String input = "";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Dec2Hex.convertToHexadecimal();
    }

    @Test(expected = Exception.class)
    public void hexademicalConversionStringFailureTest() throws Exception {
        String input = "Failure";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Dec2Hex.convertToHexadecimal();
    }
}
