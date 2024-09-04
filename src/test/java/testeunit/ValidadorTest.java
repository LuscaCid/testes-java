package testeunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Interface.IValidador;


public class ValidadorTest {
    Validador validate;

    
    @AfterAll
    public void after()
    {
        System.out.println("Testes executados");
    }

    @BeforeEach
    public void setUp()
    {
        this.validate = new Validador(); 
    }

    @Test
    @DisplayName("Validar se o primeiro numero é maior que o segundo")
    public void validateFirstNumberGreaterThenSecond() {
        boolean res = validate.validateFirstNumberGreaterThenSecond(3, 2);
        assertEquals(true, res , "O primeiro numero é maior que o segundo!");
    }
    
    @Test
    @DisplayName("Validar se o primeiro numero é menor que o segundo")
    public void validateFirstNumberIsLowerThenFirst() {
        boolean res = validate.validateFirstNumberIsLowerThenSecond(2, 1);
        assertEquals(false, res , "O primeiro numero é menor que o segundo!");
    }

    @Test
    @DisplayName("Validacao para encontrar os valores iguais")
    public void validateNumbersAreEqual()
    {
        assertEquals(
            true, 
            validate.validateFirstNumberIsEqualToSecond(2, 1), 
            "O primeiro numero é menor que o segundo!"
        );

    }
}
