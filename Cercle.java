public class Cercle extends Forme {

//    Variables d'instances
    private float rayon;

//    Constucteurs

    // Constucteur avec Rayon
    public Cercle(float rayon){
        super();
        this.rayon = rayon;
    }
    // Constructeur avec couleur
    public Cercle ( String couleur){
        super(couleur);
        this.rayon=0;
    }
    // Constructeur avec un Point p

    public Cercle(Point p){

        super(p);
        this.rayon =0;
    }

    // Constructeur avec tous les parametres

    public Cercle (Point p, String couleur, int rayon){
        super(p,couleur);
        this.rayon = rayon;

    }


//    Get
    public float getRayon() {
        return rayon;
    }
//    Set
    public void setRayon(float rayon) {
        this.rayon = rayon;
    }

    @Override
    public void afficher(){

        System.out.println(super.toString()+", Rayon: "+this.rayon);
    }

}
