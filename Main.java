public class Main {

    public static void main(String[] args) {

        int n = 10;
        int n_monstres = 5;

        Personnage liste[] = new Personnage[10];

        Monstre p1 = new Monstre((int) (Math.random() * 100), "m1");
        Monstre p2 = new Monstre((int) (Math.random() * 100), "m2");
        Monstre p3 = new Monstre((int) (Math.random() * 100), "m3");
        Monstre p4 = new Monstre((int) (Math.random() * 100), "m4");
        Monstre p5 = new Monstre((int) (Math.random() * 100), "m5");

        Sorcier p6 = new Sorcier((int) (Math.random() * 100), "s1");
        Sorcier p7 = new Sorcier((int) (Math.random() * 100), "s2");
        Sorcier p8 = new Sorcier((int) (Math.random() * 100), "s3");
        Sorcier p9 = new Sorcier((int) (Math.random() * 100), "s4");
        Sorcier p10 = new Sorcier((int) (Math.random() * 100), "s5");

        liste[0] = p1;
        liste[1] = p2;
        liste[2] = p3;
        liste[3] = p4;
        liste[4] = p5;
        liste[5] = p6;
        liste[6] = p7;
        liste[7] = p8;
        liste[8] = p9;
        liste[9] = p10;

        //la liste des monstres permet d'en choisir deux pour un tour 'attaque plus facilement.

        int a =0;
        int b =0;

        while (n != 1 & n_monstres != 0) {
            //si tous les monstres sont morts ou qu'il ne reste qu'un seul personnage, la partie est finie.
             a = (int) (Math.random() * 10);
             b = (int) (Math.random() * 10);
            while(a==b){
                b = (int) (Math.random() * 10);
            }
            liste[a].attaque(liste[b]);
            if (liste[a].mort()) {
                if (a > 4) {
                    n--;
                } else {
                    n--;
                    n_monstres--;
                }
            }
            if (liste[b].mort()) {
                if (b > 4) {
                    n--;
                } else {
                    n--;
                    n_monstres--;
                }
            }
        }
        a++;
        b++;

        //le numéro du monstre et sa place dans la liste sont décalés de 1.

        if(liste[a].mort()){
            //le dernier attaquant s'est suicidé, l'attaqué gagne.
            if(b>5){
                System.out.println("Les sorciers gagnent !");
            }
            else {
                System.out.println("le monstre "+b+" gagne !");
            }
        }
        else {
            //le dernier attaqué est mort, l'attaquant gagne.
            if(a>5){
                System.out.println("Les sorciers gagnent !");
            }
            else {
                System.out.println("le monstre " + a + " gagne !");
            }
        }

    }
}