

public class Rectangle extends Forme {



//    Les attribues de la class Rectangle
    private float longeur;
    private float largeur;


//    La surcharage des constructeur de la class Rectangle

    //    Constureur 1 : pour toutes les variables

    public  Rectangle(Point p, int longeur, int largeur, String couleur ){
        // Point, couleur
        super(p,couleur);
        // Ls
        this.longeur = longeur;
        this.largeur = largeur;


    }
    //    Constureur 2 : pour Longeur et Largeur
    public Rectangle(int longeur, int largeur){
        super();
        this.longeur = longeur;
        this.largeur = largeur;
    }

    //    Constureur 3 : en Utilisant Un point

    public  Rectangle(Point p) {
        super(p);
        this.longeur = 0;
        this.largeur = 0;


    }
    public Rectangle(String couleur){
        super(couleur);
        this.longeur = 0;
        this.largeur = 0;

    }

// Getter et setter de Largeur
    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

//    Getter et Setter de longeur


    public float getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    //    Methode Afficher

    @Override
    public void afficher(){

        System.out.println(super.toString()+", Longeur: "+this.longeur+", Largeur: "+this.largeur);
    }

}
