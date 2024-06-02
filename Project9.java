package project9;

import project9.Exception.BevandaAlcolicaException;

public class Project9 {
    
    public static void main(String[] args) {
        
        Cantina c1 = new Cantina("Roma", "Brunello", 1999);
        Cantina c2 = new Cantina("Roma", "Brunello", 1999);
        Cantina c3 = new Cantina("Latina", "pippo", 1900);
        Cantina c4 = new Cantina("Milano", "pallino", 1900);
        Cantina c5 = new Cantina("Venezia", "pinco", 1900);
        
        Spumante s1 = new Spumante("Alta", "Niente", 9.9, c1);
        Spumante s2 = new Spumante("Media", "Dolci", 12.5, c2);
        Spumante s3 = new Spumante("Bassa", "Pesce", 13.7, c4);
        
        Prosecco p1 = new Prosecco("Media", "verde", 9.8, c1);
        Prosecco p2 = new Prosecco("Bassa", "bianco", 8.7, c3);
        Prosecco p3 = new Prosecco("Alta", "pallido", 11.3, c5);
        
        Vino v1 = new Vino("Niente", "Rosso", 8.7, c1);
        Vino v2 = new Vino("Tutto", "Arancione", 13.4, c2);
        Vino v3 = new Vino("Carne", "pinco", 8.99, c3);
        Vino v4 = new Vino("Dolci", "Bianco", 5.9, c4);
        Vino v5 = new Vino("Pesce", "Bianco", 12.4, c5);
        
        Nodo n1 = new Nodo(s1);
        Nodo n2 = new Nodo(s2);
        Nodo n3 = new Nodo(s3);
        Nodo n4 = new Nodo(p1);
        Nodo n5 = new Nodo(p2);
        Nodo n6 = new Nodo(p3);
        Nodo n7 = new Nodo(v1);
        Nodo n8 = new Nodo(v2);
        Nodo n9 = new Nodo(v3);
        Nodo n10 = new Nodo(v4);
        Nodo n11 = new Nodo(v5);
        
        Enoteca e1 = new Enoteca();
        try {
            e1.append(n1);
            e1.append(n2);
            e1.append(n3);
            e1.append(n4);
            e1.append(n5);
            e1.append(n6);
            e1.append(n7);
            e1.append(n8);
            e1.append(n9);
            e1.append(n10);
            e1.append(n11);
            
        } catch (BevandaAlcolicaException ex) {
            System.out.println(ex.getMessage());
        }
        
        e1.toCSV("file.csv");
        
    }
    
}
