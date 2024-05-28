package project9;

public class Spumante extends BevandaAlcolica{
    
    private String frizzantezza;
    private String abbinamento;
    
    public Spumante() {
        super();
        this.frizzantezza = null;
        this.abbinamento = null;
    }

    public Spumante(String frizzantezza, String abbinamento, double tassoAlc, Cantina produttore){
        super(produttore, tassoAlc);
        this.frizzantezza = frizzantezza;
        this.abbinamento = abbinamento;
    }

    public Spumante(Spumante s) {
        this.abbinamento = s.getAbbinamento();
        this.frizzantezza = s.getFrizzantezza();
        setProduttore(s.getProduttore());
        setTassoAlc(s.getTassoAlc());
    }

    public String getAbbinamento() {
        return abbinamento;
    }

    public String getFrizzantezza() {
        return frizzantezza;
    }

    public void setFrizzantezza(String frizzantezza) {
        this.frizzantezza = frizzantezza;
    }

    public void setAbbinamento(String abbinamento) {
        this.abbinamento = abbinamento;
    }
    
    public boolean equals(Spumante s) {
        
        if (abbinamento.equals(s.getAbbinamento())){
            if (frizzantezza.equals(s.getFrizzantezza())){
                if (super.equals(s)){
                    return true;
                }
            }
        }
        
        return false;
        
    }

    @Override
    public String toString() {
        return "Spumante: " + super.toString() + "; Abbinamento: " + abbinamento + "; Frizzantezza: " + frizzantezza;
    }
    
}
