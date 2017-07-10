package alexander.tsoy;

import alexander.tsoy.ProcessInput;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexander on 09.07.17.
 */
public class ProcessInputTest {
    @Test
    public void processSimpleInput() throws Exception {
        assertEquals(ProcessInput.processInput("one"),new Integer(1));
        assertEquals(ProcessInput.processInput("five"),new Integer(5));
        assertEquals(ProcessInput.processInput("nine"),new Integer(9));
    }

    @Test
    public void processTensInput() throws Exception {
        assertEquals(ProcessInput.processInput("eleven"),new Integer(11));
        assertEquals(ProcessInput.processInput("fifteen"),new Integer(15));
        assertEquals(ProcessInput.processInput("nineteen"),new Integer(19));
        assertEquals(ProcessInput.processInput("twenty two"),new Integer(22));
        assertEquals(ProcessInput.processInput("forty one"),new Integer(41));
        assertEquals(ProcessInput.processInput("eighty four"),new Integer(84));
    }

    @Test
    public void processHundredsInput() throws Exception {
        assertEquals(ProcessInput.processInput("one hundred eleven"),new Integer(111));
        assertEquals(ProcessInput.processInput("two hundred fifteen"),new Integer(215));
        assertEquals(ProcessInput.processInput("eight hundred nineteen"),new Integer(819));
        assertEquals(ProcessInput.processInput("three hundred"),new Integer(300));
        assertEquals(ProcessInput.processInput("nine hundred forty six"),new Integer(946));
    }

    @Test
    public void processThousandsInput() throws Exception {
        assertEquals(ProcessInput.processInput("one thousand one hundred eleven"),new Integer(1111));
        assertEquals(ProcessInput.processInput("two thousand forty six"),new Integer(2046));
        assertEquals(ProcessInput.processInput("four thousand eight hundred nine"),new Integer(4809));
        assertEquals(ProcessInput.processInput("nine thousand three hundred"),new Integer(9300));
        assertEquals(ProcessInput.processInput("nine thousand"),new Integer(9000));
    }
}