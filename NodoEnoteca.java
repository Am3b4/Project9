package project9;

public class NodoEnoteca {
    
    private Enoteca info;
    private NodoEnoteca link;
    
    public NodoEnoteca(){
        
        /* Costruttore null*/
        
        info = null;
        link = null;
    }
    
    public NodoEnoteca(Enoteca info){
        
        /*Costruttore con solo il campo info*/
        
        this.info = info;
        link = null;
        
    }
    
    public NodoEnoteca(NodoEnoteca link){
        
        /*Costruttore copia*/
        
        this.info = link.getInfo();
        this.link = link.getLink();
    }
    
    public NodoEnoteca(Enoteca info, NodoEnoteca link){
        
        /*Costruttore con entrambi campi*/
        
        this.info = info;
        this.link = link;
    }

    public Enoteca getInfo() {
        return info;
    }

    public NodoEnoteca getLink() {
        return link;
    }

    public void setInfo(Enoteca info) {
        this.info = info;
    }

    public void setLink(NodoEnoteca link) {
        this.link = link;
    }

    public boolean equals(NodoEnoteca n) {
        return info.equals(n.getInfo());
    }
    
    @Override
    public String toString(){
        return info.toString();
    }
    
}
