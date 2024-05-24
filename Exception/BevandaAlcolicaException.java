package project9.Exception;

public class BevandaAlcolicaException extends Exception{
    
    private String msg;

    public BevandaAlcolicaException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
    
}
