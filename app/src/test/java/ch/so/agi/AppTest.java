package ch.so.agi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test 
    void validate_Ok() {
        CsvValidator csvValidator = new CsvValidator();
        boolean result = csvValidator.validate("src/test/data/csv/data1.csv", "CsvModel");
        assertTrue(result, "validation is not true");
    }
    
    @Test 
    void validate_Fail() {
        CsvValidator csvValidator = new CsvValidator();
        boolean result = csvValidator.validate("src/test/data/csv/data2.csv", "CsvModel");
        assertFalse(result, "validation is true");
    }
    
    // Achtung: "Function SO_Functions.containsChar is not yet implemented" wird so nicht 
    // geprüft. Prüfung ist trotz nicht gefundener Funktion trotzdem ok.
    @Test 
    void validateFunction_Ok() {
        CsvValidator csvValidator = new CsvValidator();
        boolean result = csvValidator.validate("src/test/data/csv/data1.csv", "CsvModelFunction");
        assertTrue(result, "validation is not true");
    }
    
    @Test 
    void validateFunction_Fail() {
        CsvValidator csvValidator = new CsvValidator();
        boolean result = csvValidator.validate("src/test/data/csv/data3.csv", "CsvModelFunction");
        assertFalse(result, "validation is true");
    }
}
