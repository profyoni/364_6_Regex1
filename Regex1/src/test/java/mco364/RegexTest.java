package mco364;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class RegexTest {
    
    @Test
    public void findBob() {
        List<String> actual = Regex.findMatches("BOBBOB", "BOB");
        
        assertEquals(2, actual.size());
    }    
    
    @Test
    public void findWaldoCaseInsensitive() {
        List<String> actual = Regex.findMatches("Waldo walDOW WALDO", "BOB");
        
        assertEquals(3, actual.size());
    }
    
        
    @Test
    public void findCurrency() {
        List<String> actual = Regex.findMatches("6923749.02 475.10 ", "BOB");
        
        assertEquals(3, actual.size());
    }
           
    @Test
    public void findCurrency2() {
        List<String> actual = Regex.findMatches("45 0.45 .45 ", "BOB");
        
        assertEquals(3, actual.size());
    }
    
               
    @Test
    public void findCurrencyWithDollarSign() {
        List<String> actual = Regex.findMatches("$45 $0.45 $.45 ", "BOB");
        
        assertEquals(3, actual.size());
    }
               
    @Test
    public void findProperNameWithFirstLetterCapitalized() {
        List<String> actual = Regex.findMatches("Bob Smithers John 23 yohann JJ j", "BOB");
        
        assertEquals(3, actual.size());
    }
    
                   
    @Test
    public void fintTelNumber() {
        List<String> actual = Regex.findMatches("555-1234 555.1234 987-3453 123-QWER ", "BOB");
        
        assertEquals(3, actual.size());
    }
                   
    @Test
    public void findMomAncestor() {
        List<String> actual = Regex.findMatches("mother grandmother greatgrandmother greatgreatgreatgreatgrandmother ", "BOB");
        
        assertEquals(4, actual.size());
    }
    
                       
    @Test
    public void findScrabbleWord5LettersStartsWithM_AndEndsWithD() {
        List<String> actual = Regex.findMatches("MEAD MEND MOOD MUST", "BOB");
        
        assertEquals(3, actual.size());
    }
}
