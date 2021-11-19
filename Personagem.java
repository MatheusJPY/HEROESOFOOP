public class Personagem{
    private String NOME;
    private int ATAQUE;
    private int DEFESA;
    private int VIDA;


    public Personagem(String nome, int ataque, int defesa, int vida){
        this.NOME = nome;
        this.ATAQUE = ataque;
        this.DEFESA = defesa;
        this.VIDA = vida;
    }

    public String getNOME() {
        return NOME;
    }
    public void setNome(String nome) {
        this.NOME = nome;
    }
    public int getATAQUE() {
        return ATAQUE;
    }
    public void setATAQUE(int ataque) {
        this.ATAQUE = ataque;
    }
    public void setATAQUEARMA(int ataque, int defesa) {
        ATAQUE += ataque;
        DEFESA += defesa;
    }
    public int getDEFESA() {
        return DEFESA;
    }
    public void setDEFESA(int defesa) {
        this.DEFESA = defesa;
    }
    public int getVIDA() {
        return VIDA;
    }
    public void setVIDA(int dano) {
        this.VIDA -= dano;
    }
    public int atacar(int defesa){
        int dano = ATAQUE - defesa;
        return dano;
    }
    public void defender(){
        this.DEFESA += DEFESA * 0.1;
    }
    public void setArma(int arma){}
}