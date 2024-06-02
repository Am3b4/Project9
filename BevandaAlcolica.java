package project9;

public class BevandaAlcolica {
    
    private Cantina produttore; 
    private double tassoAlc;

    public BevandaAlcolica(Cantina produttore, double tassoAlc) {
        this.produttore = produttore;
        this.tassoAlc = tassoAlc;
    }
    
    public BevandaAlcolica() {
        this.produttore = null;
        this.tassoAlc = 0.0;
    }
    public BevandaAlcolica(BevandaAlcolica ba){
        this.produttore = ba.getProduttore();
        this.tassoAlc = ba.getTassoAlc();
    
    }

    public Cantina getProduttore() {
        return produttore;
    }

    public double getTassoAlc() {
        return tassoAlc;
    }

    public void setTassoAlc(double tassoAlc) {
        this.tassoAlc = tassoAlc;
    }

    public void setProduttore(Cantina produttore) {
        this.produttore = produttore;
    }

    public boolean equals(BevandaAlcolica ba) {
        
        if (tassoAlc==ba.getTassoAlc()){
            if (produttore.equals(ba.getProduttore())){
                return true;
            }
        }
        
        return false;
        
    }

    public String toStringBA() {
        
        String ris = "TassoAlc: " + tassoAlc + "; Cantina: " + produttore.toString();
        return ris; 
    }
    
    public String toStringCSV(){
        return tassoAlc+","+produttore.toStringCSV();
    }
    
    
    
}
