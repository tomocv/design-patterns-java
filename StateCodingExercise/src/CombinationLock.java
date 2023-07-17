import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CombinationLock
{
    private int [] combination;
    public String status;
    private int digitsEntered = 0;
    private boolean failedToVerify = false;

    public CombinationLock(int[] combination)
    {
        this.combination = combination;
        reset();
    }

    public void reset() {
        status = "LOCKED";
        digitsEntered = 0;
        failedToVerify = false;
    }

    public void enterDigit(int digit)
    {
        if (status.equals("LOCKED")) status = "";
        status += digit;
        if (combination[digitsEntered++] != digit) {
            failedToVerify = true;
        }

        if (digitsEntered == combination.length) {
            status = failedToVerify ? "ERROR" : "OPEN";
        }
    }
}

class Tests {

    CombinationLock cl;

    @BeforeEach
    protected void setUp() {
        cl = new CombinationLock(new int[]{1,2,3,4});
    }

    @Test
    public void should_return_LOCKED_on_new_combination () {
        assertEquals("LOCKED", cl.status);
    }

    @Test
    public void should_return_concatenated_numbers_on_each_number_entered() {
        cl.enterDigit(1);
        assertEquals("1", cl.status);
        cl.enterDigit(2);
        assertEquals("12", cl.status);
        cl.enterDigit(3);
        assertEquals("123", cl.status);
    }

    @Test
    public void should_return_OPEN_on_correct_combination_entered () {
        cl.enterDigit(1);
        cl.enterDigit(2);
        cl.enterDigit(3);
        cl.enterDigit(4);
        assertEquals("OPEN", cl.status);
    }

    @Test
    public void should_return_ERROR_on_wrong_combination_entered () {
        cl.enterDigit(1);
        cl.enterDigit(1);
        cl.enterDigit(3);
        cl.enterDigit(4);
        assertEquals("ERROR", cl.status);
    }
}