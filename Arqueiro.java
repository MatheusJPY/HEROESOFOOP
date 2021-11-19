public class Arqueiro extends Personagem {

    public Arqueiro(String nome){
        super(nome, 20, 30, 160);
    }
    @Override
    public void setArma(int arma){
		  if(arma == 1) {
			  super.setATAQUEARMA(12, 13);
		  }else if(arma == 2) {
		    super.setATAQUEARMA(15, 10);
		  }
    }
}