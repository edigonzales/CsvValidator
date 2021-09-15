package ch.so.agi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test 
    void validate_Ok() {
        CsvValidator csvValidator = new CsvValidator();
        boolean result = csvValidator.validate("src/main/data/csv/data1.csv", "CsvModel");
        assertTrue(result, "validation is not true");
    }
    
    @Test 
    void validate_Fail() {
        CsvValidator csvValidator = new CsvValidator();
        boolean result = csvValidator.validate("src/main/data/csv/data2.csv", "CsvModel");
        assertFalse(result, "validation is true");
    }
}
