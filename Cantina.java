package project9;

public class Cantina {
    private String citta;
    private String nome;
    private int anno;

    public Cantina() {
    }

    public Cantina(String citta, String nome, int anno) {
        this.citta = citta;
        this.nome = nome;
        this.anno = anno;
    }
    
    public Cantina(Cantina C){
        this.citta = C.getCitta();
        this.nome = C.getNome();
        this.anno = C.getAnno();
    }

    public int getAnno() {
        return anno;
    }

    public String getCitta() {
        return citta;
    }

    public String getNome() {
        return nome;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    @Override
    public String toString() {
        return "Citta: " + citta + "; Nome: " + nome + "; Anno: " + anno;
    }
    
    
    
    
}
