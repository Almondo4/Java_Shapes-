public class Cylindre extends Forme{

//    Variables d'instance
    private float rayon;
    private float hauteur;


//       Constucteurs

    // Constucteur avec Rayon et hauteur
    public Cylindre(float rayon,float hauteur){
        super();
        this.rayon = rayon;
        this.hauteur =hauteur;
    }
    // Constructeur avec couleur
    public Cylindre ( String couleur){
        super(couleur);
        this.rayon=0;
        this.hauteur =0;
    }
    // Constructeur avec un Point p

    public Cylindre(Point p){

        super(p);
        this.rayon =0;
        this.hauteur =0;
    }

    // Constructeur avec tous les parametres

    public Cylindre (Point p, String couleur, float rayon,float hauteur){
        super(p,couleur);
        this.rayon = rayon;
        this.hauteur =hauteur;

    }

//Getters and Setters of Rayon
    //    Get
    public float getRayon() {
        return rayon;
    }
    //    Set
    public void setRayon(float rayon) {
        this.rayon = rayon;


    }
    //        Gettes and setters de Hauteur
    public float getHauteur() {
        return hauteur;
    }
    //    Set
    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
}

    @Override
    public void afficher(){

        System.out.println(super.toString()+", Rayon: "+this.rayon+" ,Hauteur:"+ this.hauteur);
    }
}
