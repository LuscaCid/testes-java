package testeunit;

public class Numero {
    
    public int valor;

    public Numero(int valor){
        super();
        this.valor = valor;
    }

    public boolean par(){
        if(valor %2 == 0)
        return true;
        return false;
    }

    public boolean impar(){
        if (!par())
        return true;
        return false;
    }

}
