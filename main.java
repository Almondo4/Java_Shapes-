import java.text.Normalizer;

public class main {
    public static void main(String[] args) {

        //        a. creation d'un objet Point
        Point x = new Point(1,2);

        //        b. affichage du contenu de x

        System.out.println(x.toString());

        Forme f1 = new Forme();
        f1.afficher();


        Cercle c1 = new Cercle("bleu");
        c1.afficher();

        Cylindre cl = new Cylindre(new Point(3,5),"Jaune",(float)3.50,4);
        cl.afficher();




    }
}
