package project9;

import java.io.*;
import project9.Exception.BevandaAlcolicaException;

public class Enoteca {
    
    private Nodo head;
    private int elementi;

    public Enoteca() {
        this.head = null;
        this.elementi = 0;
    }

    public int getElementi() {
        return elementi;
    }

    public Nodo getHead() {
        return head;
    }
    
    public void append(Nodo n) throws BevandaAlcolicaException{
    	if(n == null) {
            throw new BevandaAlcolicaException("Nodo is null");
    	}
        
    	if(head == null) {
            head = n;
            elementi++;
    	}
        
    	else {
            Nodo app = head;
            
            while(app.getLink() != null) {
        	app = app.getLink();
            }
            
            app.setLink(n);
            elementi++;
    	}
    }
            
    public Nodo rmvHead() throws BevandaAlcolicaException{
    	if(head == null) {
            throw new BevandaAlcolicaException("Head is null");
    	}
    	Nodo a = new Nodo(head);
    	head = head.getLink();
    	elementi--;
    	return a;
    }
    
    public void insertPos(Nodo n, int pos) throws BevandaAlcolicaException{
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
            Nodo app = head;
            
            for (int i = 0; i < pos; i++) {
                app = app.getLink();
            }
            n.setLink(app.getLink());
            app.setLink(n);
            
        }
    }
    
    public Nodo getPos(int pos){
        if (pos<=0){
            return new Nodo(getHead());
        }
        
        if (pos>=elementi){
            pos = elementi-1;
        }
        Nodo app = head;
            
        for (int i = 0; i < pos; i++) {
            app = app.getLink();
        }
            
        return new Nodo(app.getLink());
    }
    
    public int check(Nodo n){
        
        if (head==null){
            return -1;
        }
        
        Nodo app = head;
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
    
    public Enotece divideByCantina() throws BevandaAlcolicaException{
    	if(head == null) {
            throw new BevandaAlcolicaException("Head is null");
    	}
        
    	Enotece ris = new Enotece();
    	Nodo a = head;
        
    	ris.addEnoteca(a);
    	a = a.getLink();
        
        int pos;
        
    	while(a.getLink() != null) {
            pos = ris.checkCantina(a.getInfo().getProduttore());
            if(pos != -1) {
    		ris.addCantina(pos, a);
            }
            else {
    		ris.addEnoteca(new Nodo(a));
            }
            a = a.getLink();
    	}
    	return ris;
    }
    
    public void toCSV(String filename){
    
        BevandaAlcolica[] arr = listToArray();
        
        FileWriter file;
        
        try {
            file = new FileWriter(filename);
            PrintWriter write = new PrintWriter(file);
            
            for (BevandaAlcolica el: arr){
                write.println(el.toStringCSV());
            }
            
            write.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    
    }
    
    public void fromCSV(String filename) throws BevandaAlcolicaException{
    
        try {  
            BufferedReader br = new BufferedReader(new FileReader(filename));
            
            String line;
            
            while ((line = br.readLine()) != null) 
            {
            String[] LineArr = line.split(",");
            
            if(LineArr[0].equals("Vino")) {
                Cantina c1 = new Cantina(LineArr[4], LineArr[5], Integer.parseInt(LineArr[6]));
                Vino v1 = new Vino(LineArr[1], LineArr[2], Double.parseDouble(LineArr[3]), c1);
                Nodo n1 = new Nodo(v1);
                append(n1);
            }
            else if(LineArr[0].equals("Prosecco")) {
                Cantina c1 = new Cantina(LineArr[4], LineArr[5], Integer.parseInt(LineArr[6]));
                Prosecco v1 = new Prosecco(LineArr[1], LineArr[2], Double.parseDouble(LineArr[3]), c1);
                Nodo n1 = new Nodo(v1);
                append(n1);
            }
            else if(LineArr[0].equals("Spumante")){
                Cantina c1 = new Cantina(LineArr[4], LineArr[5], Integer.parseInt(LineArr[6]));
                Spumante v1 = new Spumante(LineArr[1], LineArr[2], Double.parseDouble(LineArr[3]), c1);
                Nodo n1 = new Nodo(v1);
                append(n1);
            }
            else {
                throw new BevandaAlcolicaException("");
            }
            
        }
        }catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    private BevandaAlcolica[] listToArray(){
        
        BevandaAlcolica[] arr = new BevandaAlcolica[elementi];
        Nodo app = head;
        
        for (int i=0;i<elementi;i++){
            arr[i] = app.getInfo();
            app = app.getLink();
        }
        
        return arr;
        
    }
    
}
