package com.company;
import static org.junit.jupiter.api.Assertions.*;

class PeselControllerTest {

    @org.junit.jupiter.api.Test
    void validatePeselWithCorrectValue() {
        PeselController peselController = new PeselController("98042901690");
        assertEquals(true, peselController.isValid());

    }

    @org.junit.jupiter.api.Test
    void validatePeselWithIncorrectValue() {
        PeselController peselController = new PeselController("00000000001");
        assertEquals(false, peselController.isValid());

    }
}