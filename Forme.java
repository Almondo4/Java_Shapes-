import java.util.StringJoiner;

public class Forme extends Point {

// Variables d'instances

   String couleur;


// Constructeurs

    //      Sans parametres
    public Forme() {
        super();
        this.couleur= null;
        // On peut toujours passer une variable par défaut si besoin
        // (Cela dépend de l'enonce du TP, sinon Null suffit pour ce cas
    }
    //      Tous les parametres
   public Forme(Point p,String couleur) {
      super(p.getY(), p.getX());
      this.couleur=couleur;
   }

    //      Uniquement avec Couleur

    public Forme(String couleur) {
        super();
        this.couleur=couleur;
    }

    //      Uniquement avec un Point

    public Forme(Point p) {
        super(p.getY(),p.getX());
        this.couleur="null"; // meme histoire..
    }



    //    toString
    @Override
    public String toString() {
        return super.toString()+", Couleur: "+ this.couleur;
    }
    //    Methode Afficher
    public void afficher(){

        System.out.println(this.toString() );
    }





//    Getters and Setters de Couleur


  public String getCouleur(){
      return this.couleur;
  }

   public void setCouleur(String couleur) {
      this.couleur = couleur;
   }
//   X et Y ssont deja herite de la class Point



}
