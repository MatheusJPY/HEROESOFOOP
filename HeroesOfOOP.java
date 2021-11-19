import java.util.Scanner;
import java.util.Random;
public class HeroesOfOOP {

  public static void main(String[] args){
    Scanner menu = new Scanner(System.in); 
    System.out.println("1- Comecar jornada\n2- Sair do jogo");
    int opcao = menu.nextInt();
    if(opcao == 1){
      Iniciar_jornada();
    }
    else if(opcao == 2){
      System.exit(0);
    }
  }
  public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
} 
  public static void Iniciar_jornada(){
    Scanner menu = new Scanner(System.in);
    clearScreen();
    System.out.println("Quantos personagens deseja criar (maximo 3 personagens)");
    int numero_personagens = menu.nextInt();
    int numero_p = numero_personagens;
    Personagem[] personagens = new Personagem[numero_personagens];
    int indice = 0;
    while(numero_personagens > 0){
      clearScreen();
      System.out.println("Escolha seu personagem:\n1- GUERREIRO // ATQ 30 DEF 20 PVD 180\n2- ARQUEIRO // ATQ 20 DEF 30 PVD 160\n3- MAGO // ATQ 20 DEF 10 PVD 200");
      int personagem = menu.nextInt();
      if(personagem == 1){
        clearScreen();
        System.out.println("Digite o nome do Guerreiro: ");
        String nome_guerreiro = menu.next();
        Personagem guerreiro = new Guerreiro(nome_guerreiro); /// CRIANDO PERSONAGEM
        personagens[indice] = guerreiro;
        clearScreen();
        System.out.println("Escolha uma arma: \n1- Espada // ATQ +10  DEF +15\n2- Machado // ATQ +17  DEF +8 ");
        int arma = menu.nextInt();
        personagens[indice].setArma(arma);
        numero_personagens -= 1;
      }else if(personagem == 2){
        clearScreen();
        System.out.println("Digite o nome do Arqueiro: ");
        String nome_arqueiro = menu.next();
        Personagem arqueiro = new Arqueiro(nome_arqueiro);
        personagens[indice] = arqueiro;
        clearScreen();
        System.out.println("Escolha uma arma: \n1- Arco Longo // ATQ +12  DEF +13\n2- Balestra // ATQ +15  DEF +10 ");
        int arma = menu.nextInt();
        personagens[indice].setArma(arma);
        numero_personagens -= 1;
      }else if(personagem == 3){
        clearScreen();
        System.out.println("Digite o nome do Mago: ");
        String nome_mago = menu.next();
        Personagem mago = new Mago(nome_mago);
        personagens[indice] = mago;
        clearScreen();
        System.out.println("Escolha uma arma: \n1- Varinha // ATQ +16  DEF +9\n2- Cajado // ATQ +13  DEF +12 ");
        int arma = menu.nextInt();
        personagens[indice].setArma(arma);
        numero_personagens -= 1;
      }
      else{
        clearScreen();
        System.out.println("Digite um número correto");
      }
      indice += 1;
    }
    clearScreen();
    System.out.println("Ah A GUERRA COMECOU!\nPRIMEIRO TURNO");                          // OCORRENCIA DOS TURNOS
    Personagem dragao = new Dragao();
    while(dragao.getVIDA() > 0){
      System.out.println("1- Comecar Round\n2- Sair do jogo");
      int opcao = menu.nextInt();
      if(opcao == 1){
      }
      else if(opcao == 2){
        System.exit(0);
      }
      if(numero_p == 1){                                                                   // 1 PERSONAGEM JOGANDO
        System.out.println(personagens[0].getNOME() + " VAI 1- ATACAR 2-DEFENDER");
        int acao = menu.nextInt();
        if(dragao.getVIDA() <= 0){
          System.out.println("VITORA!!! " + dragao.getNOME() + " ESTA MORTO");
          System.exit(0);
        }
        else if(personagens[0].getVIDA() <= 0){
          System.out.println(personagens[0].getNOME() + " MORREU");
          System.exit(0);
        }
        else if(acao == 1){
          dragao.setVIDA(personagens[0].atacar(dragao.getDEFESA()));
          clearScreen();
          System.out.println(personagens[0].getNOME()  + " ATACOU --> " + dragao.getNOME() +" VIDA ATUAL: "+ dragao.getVIDA());
        }
        else if(acao == 2){
          clearScreen();
          personagens[0].defender();
          System.out.println(personagens[0].getNOME() + " SE DEFENDEU --|| DEF +10%");
        }
      }
      else if(numero_p == 2){                                                                   // 2 PERSONAGENS JOGANDO
        for (int i = 0; i <= 1; i++){
          System.out.println(personagens[i].getNOME() + " VAI 1- ATACAR 2-DEFENDER");
          int acao_1 = menu.nextInt();
          if(dragao.getVIDA() <= 0){
            System.out.println("VITORA!!! " + dragao.getNOME() + " ESTA MORTO");
            System.exit(0);
          }
          else if(personagens[i].getVIDA() <= 0){
            System.out.println(personagens[i].getNOME() + " MORREU");
            System.exit(0);
          }
          else if(acao_1 == 1){
            dragao.setVIDA(personagens[i].atacar(dragao.getDEFESA()));
            clearScreen();
            System.out.println(personagens[i].getNOME()  + " ATACOU --> " + dragao.getNOME() +" VIDA ATUAL: "+ dragao.getVIDA());
          }
          else if(acao_1 == 2){
            personagens[i].defender();
            clearScreen();
            System.out.println(personagens[i].getNOME() + " SE DEFENDEU --|| DEF +10%");
          }
        }
      }
      else if(numero_p == 3){                                                                 // 3 PERSONAAGENS JOGANDO
        for (int i = 0; i <= 2; i++){
          System.out.println(personagens[i].getNOME() + " VAI 1- ATACAR 2-DEFENDER");
          int acao_3 = menu.nextInt();
          if(dragao.getVIDA() <= 0){
            clearScreen();
            System.out.println("VITORA!!! " + dragao.getNOME() + " ESTA MORTO");
            System.exit(0);
          }
          else if(personagens[i].getVIDA() <= 0){
            clearScreen();
            System.out.println(personagens[i].getNOME() + " MORREU");
            System.exit(0);
          }                                                         // 3 PERSONAGENS JOGANDO
          else if(acao_3 == 1){
            dragao.setVIDA(personagens[i].atacar(dragao.getDEFESA()));
            clearScreen();
            System.out.println(personagens[i].getNOME()  + " ATACOU --> " + dragao.getNOME() +" VIDA ATUAL: "+ dragao.getVIDA());
            }
          else if(acao_3 == 2){
            clearScreen();
            personagens[i].defender();
            System.out.println(personagens[i].getNOME() + " SE DEFENDEU --|| DEF +10%");
            }
        }
      }
      Random radom  = new Random();
      int aleatorio = radom.nextInt(numero_p);
      personagens[aleatorio].setVIDA(dragao.atacar(personagens[aleatorio].getDEFESA()));
      System.out.println(dragao.getNOME() + " ATACOU --> " + personagens[aleatorio].getNOME() + " VIDA ATUAL: " + personagens[aleatorio].getVIDA());
    }
  }
}