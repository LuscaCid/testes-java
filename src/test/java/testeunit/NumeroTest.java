package testeunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumeroTest{


    @Test
    void NegativoNumero1Test(){
        Numero numero = new Numero(-1);
         assertEquals(false,numero.par());
         assertEquals(true, numero.impar());
    }


    @Test
    void NegativoNumero2Test(){
        Numero numero = new Numero(-2);
         assertEquals(true,numero.par());
         assertEquals(false, numero.impar());
    }


    @Test
   void Numero0Test(){
       Numero numero = new Numero(0);
        assertEquals(true,numero.par());
        assertEquals(false, numero.impar());
    }
   @Test
   void Numero1Test(){
      Numero numero = new Numero(1);
      assertEquals(false, numero.par());
      assertEquals(true, numero.impar());

      }
  
  @Test
  void Numero2Test(){
       Numero numero = new Numero(2);
      assertEquals(true, numero.par());
      assertEquals(false, numero.impar());

  }
}
