package project9;

public class Nodo {
    
    private BevandaAlcolica info;
    private Nodo link;
    
    public Nodo(){
        
        /* Costruttore null*/
        
        info = null;
        link = null;
    }
    
    public Nodo(BevandaAlcolica info){
        
        /*Costruttore con solo il campo info*/
        
        this.info = info;
        link = null;
        
    }
    
    public Nodo(Nodo link){
        
        /*Costruttore copia*/
        
        this.info = link.getInfo();
        this.link = link.getLink();
    }
    
    public Nodo(BevandaAlcolica info, Nodo link){
        
        /*Costruttore con entrambi campi*/
        
        this.info = info;
        this.link = link;
    }

    public BevandaAlcolica getInfo() {
        return info;
    }

    public Nodo getLink() {
        return link;
    }

    public void setInfo(BevandaAlcolica info) {
        this.info = info;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }

    public boolean equals(Nodo n) {
        return info.equals(n.getInfo());
    }
    
    @Override
    public String toString(){
        return info.toString();
    }
    
}
