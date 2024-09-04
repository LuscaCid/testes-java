package testeunit;

import Interface.IValidador;

public class Validador implements IValidador {

    public boolean validateFirstNumberGreaterThenSecond(int x, int y) {
        return x > y;
    } 
    public boolean validateFirstNumberIsLowerThenSecond(int x, int y)
    {
        return x < y;
    }
    public boolean validateFirstNumberIsEqualToSecond(int x, int y) {
        return x == y;
    }

}
