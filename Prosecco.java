package project9;

public class Prosecco extends BevandaAlcolica{
    
    private String frizzantezza;
    private String tipo;
    
    public Prosecco() {
        super();
        this.frizzantezza = null;
        this.tipo = null;
    }

    public Prosecco(String frizzantezza, String tipo, double tassoAlc, Cantina produttore){
        super(produttore, tassoAlc);
        this.frizzantezza = frizzantezza;
        this.tipo = tipo;
    }

    public Prosecco(Prosecco v) {
        this.frizzantezza = v.getFrizzantezza();
        this.tipo = v.getTipo();
        setProduttore(v.getProduttore());
        setTassoAlc(v.getTassoAlc());
    }

    public String getFrizzantezza() {
        return frizzantezza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFrizzantezza(String frizzantezza) {
        this.frizzantezza = frizzantezza;
    }
    
    public boolean equals(Prosecco v) {
        
        if (frizzantezza.equals(v.getFrizzantezza())){
            if (tipo.equals(v.getTipo())){
                if (super.equals(v)){
                    return true;
                }
            }
        }
        
        return false;
        
    }

    @Override
    public String toString() {
        return "Prosecco: " + super.toString() + "; Frizzantezza: " + frizzantezza + "; Tipo: " + tipo;
    }
    
}