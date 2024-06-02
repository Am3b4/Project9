package project9;

import project9.Exception.BevandaAlcolicaException;

public class Enotece {
    
    private NodoEnoteca head;
    private int elementi;

    public Enotece() {
        this.head = null;
        this.elementi = 0;
    }

    public int getElementi() {
        return elementi;
    }

    public NodoEnoteca getHead() {
        return head;
    }
    
    public void append(NodoEnoteca n) throws BevandaAlcolicaException{
    	if(n == null) {
            throw new BevandaAlcolicaException("Nodo is null");
    	}
        
    	if(head == null) {
            head = n;
            elementi++;
    	}
        
    	else {
            NodoEnoteca app = head;
            
            while(app.getLink() != null) {
        	app = app.getLink();
            }
            
            app.setLink(n);
            elementi++;
    	}
    }
            
    public NodoEnoteca rmvHead() throws BevandaAlcolicaException{
    	if(head == null) {
            throw new BevandaAlcolicaException("Head is null");
    	}
    	NodoEnoteca a = new NodoEnoteca(head);
    	head = head.getLink();
    	elementi--;
    	return a;
    }
    
    public void insertPos(NodoEnoteca n, int pos) throws BevandaAlcolicaException{
        if (n==null){
            throw new BevandaAlcolicaException("Nodo is null");
        }
        
        if (head==null){
            append(n);
        }
        
        if(pos<1){
            n.setLink(head);
            head = n;
        }
        
        if(pos>=elementi){
            append(n);
        }
        
        else{
            NodoEnoteca app = head;
            
            for (int i = 0; i < pos; i++) {
                app = app.getLink();
            }
            n.setLink(app.getLink());
            app.setLink(n);
            
        }
    }
    
    public NodoEnoteca getPos(int pos){
        if (pos<=0){
            return new NodoEnoteca(getHead());
        }
        
        if (pos>=elementi){
            pos = elementi-1;
        }
        NodoEnoteca app = head;
            
        for (int i = 0; i < pos; i++) {
            app = app.getLink();
        }
            
        return new NodoEnoteca(app.getLink());
    }
    
    public int check(NodoEnoteca n){
        
        if (head==null){
            return -1;
        }
        
        NodoEnoteca app = head;
        int pos1 = -1;
        int pos2 = 0;
        
        while(app.getLink() != null){
            if(app.getInfo().equals(n.getInfo())){
                pos1 = pos2;
                break;
            }
            pos2++;
            app.getLink();
        }
        
        return pos1;
        
    }
    
    public void addEnoteca(Nodo n) throws BevandaAlcolicaException{
    	NodoEnoteca app = head;
    	if(app == null) {
            Enoteca appEnoteca = new Enoteca();
            appEnoteca.append(n);

            head = new NodoEnoteca(appEnoteca);
    	}
    	else {
            while(app.getLink() != null) {
        	app = app.getLink();
            }
            Enoteca appEnoteca = new Enoteca();
            appEnoteca.append(n);
            app.setLink(new NodoEnoteca(appEnoteca));
    	}
    }
    
    public int checkCantina(Cantina cantina) {
    	int ris = -1, cont = 0;
    	NodoEnoteca ne = head;
        
    	while(ne != null && ris == -1) {
            if(ne.getInfo().getHead().getInfo().getProduttore().equals(cantina)) {
                ris = cont;
            }
       	    cont++;
    	}
    	return ris;
    }
    
    public void addCantina(int pos, Nodo a) throws BevandaAlcolicaException{
    	NodoEnoteca app = head;
        
    	for(int i=1; i<pos; i++) {
            app = app.getLink();
    	}
        
        app.getInfo().append(a);
      
    }
}

