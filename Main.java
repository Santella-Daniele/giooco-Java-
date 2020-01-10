import java.util.Random;
class Main {
    public static void main (String[] args){
        
        Personaggio human = new Personaggio("umano");
        Personaggio monster = new Personaggio("mostro");
   
        do{
         human.hit(monster.getPower());
         monster.hit(human.getPower());
         }while(human.getLife()>0 || monster.getLife()>0);


        if(human.isAlive() == 0 ){

            System.out.println ("Hai perso \n");
            System.out.printf (" La vita dell'umano e' %d", human.getLife());
        }else {
            System.out.println ("Hai vinto \n");
            System.out.printf("La vita del mostro e' %d", monster.getLife());

        }
        

}


}