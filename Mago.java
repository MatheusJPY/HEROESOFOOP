public class Mago extends Personagem{
    
    public Mago(String nome){
        super(nome, 20, 10, 200);
    }
    @Override
    public void setArma(int arma){
		  if(arma == 1) {
			  super.setATAQUEARMA(16, 9);
		  }else if(arma == 2) {
			  super.setATAQUEARMA(13, 12);
		  }
    }
}
