import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatriceTest {
    
    @Test
    public void testAddition() {
        // Arrange
        Calculatrice calculatrice = new Calculatrice();
        
        // Act
        int resultat = calculatrice.additionner(2, 3);
        
        // Assert
        assertEquals(5, resultat);
    }
    
    @Test
    public void testSoustraction() {
        // Arrange
        Calculatrice calculatrice = new Calculatrice();
        
        // Act
        int resultat = calculatrice.soustraire(5, 3);
        
        // Assert
        assertEquals(2, resultat);
    }
    
    @Test
    public void testMultiplication() {
        // Arrange
        Calculatrice calculatrice = new Calculatrice();
        
        // Act
        int resultat = calculatrice.multiplier(2, 3);
        
        // Assert
        assertEquals(6, resultat);
    }
    
    @Test
    public void testDivision() {
        // Arrange
        Calculatrice calculatrice = new Calculatrice();
        
        // Act
        int resultat = calculatrice.diviser(6, 3);
        
        // Assert
        assertEquals(2, resultat);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivisionParZero() {
        // Arrange
        Calculatrice calculatrice = new Calculatrice();
        
        // Act
        calculatrice.diviser(6, 0);
        
        // Assert implicite : une exception ArithmeticException doit être levée
    }
    
    @Test
    public void testExecuterAddition() {
        // Arrange
        Calculatrice calculatrice = new Calculatrice();
        
        // Act
        int resultat = calculatrice.executer("addition", 2, 3);
        
        // Assert
        assertEquals(5, resultat);
    }
    
    @Test
    public void testExecuterSoustraction() {
        // Arrange
        Calculatrice calculatrice = new Calculatrice();
        
        // Act
        int resultat = calculatrice.executer("soustraction", 5, 3);
        
        // Assert
        assertEquals(2, resultat);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExecuterOperationInconnue() {
        // Arrange
        Calculatrice calculatrice = new Calculatrice();
        
        // Act
        calculatrice.executer("puissance", 2, 3);
        
        // Assert implicite : une exception IllegalArgumentException doit être levée
    }
} 