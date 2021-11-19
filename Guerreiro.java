public class Guerreiro extends Personagem{
     
    public Guerreiro(String nome){
         super(nome, 30, 20, 180);
      }
      @Override
      public void setArma(int arma){
        if(arma == 1) {
            super.setATAQUEARMA(10, 15);
        }else if(arma == 2) {
            super.setATAQUEARMA(17, 8);
      }
}
}