package project9;

public class Vino extends BevandaAlcolica implements Servizio{
    
    private String abbinamento;
    private String tipo;

    public Vino() {
        super();
        this.abbinamento = null;
        this.tipo = null;
    }

    public Vino(String abbinamento, String tipo, double tassoAlc, Cantina produttore){
        super(produttore, tassoAlc);
        this.abbinamento = abbinamento;
        this.tipo = tipo;
    }

    public Vino(Vino v) {
        this.abbinamento = v.getAbbinamento();
        this.tipo = v.getTipo();
        setProduttore(v.getProduttore());
        setTassoAlc(v.getTassoAlc());
    }

    public String getAbbinamento() {
        return abbinamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAbbinamento(String abbinamento) {
        this.abbinamento = abbinamento;
    }
    
    public boolean equals(Vino v) {
        
        if (abbinamento.equals(v.getAbbinamento())){
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
        return "Vino: " + super.toStringBA() + "; Abbinamento: " + abbinamento + "; Tipo: " + tipo;
    }
    
    @Override
    public String toStringCSV(){
        return "Vino,"+abbinamento+","+tipo+","+getTassoAlc()+","+getProduttore().toStringCSV();
    }
    
    @Override
    public String servizio(){
        return "Deve essere servito a 16 gradi";
    }
    
}
