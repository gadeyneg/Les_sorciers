public class Monstre extends Personnage {

    public Monstre(int v, String n){
        super(v,n);
    }

    public void attaque(Personnage p){
        System.out.println("Je suis "+this.nom+" et j'attaque "+p.nom);
        if(!p.mort()&!this.mort()){
         int r=p.subitFrappe(super.getVie()/2);
         this.addVie(-r);
         if(this.getVie()<=0) {
             this.en_vie = false;
         }
         }

    }

    public int subitFrappe(int coup){
        this.addVie(-coup);
        if(this.getVie()<=0){
            this.en_vie=false;
            return(0);
        }
        else {
            return(this.getVie()/2);
        }
    }

    public int subitCharme(int coup){
        this.addVie(-coup);
        if(this.getVie()<=0) {
            this.en_vie = false;
            return (0);
        }
        else {
            return(this.getVie()/2);
        }
    }


}

