import org.junit.Test;
import service.UserInputReader;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class UserInputReaderTest {

    UserInputReader userInputReader = new UserInputReader();

    @Test
    public void testUserInputWithValidString(){
        System.setIn(new ByteArrayInputStream("1".getBytes()));

        int userInput = userInputReader.readValidInt();

        assertEquals(userInput, 1);
    }



}
