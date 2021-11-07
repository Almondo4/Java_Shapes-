public class Point {

    protected float x;
    protected float y;

//    Initialization d'un point sans coordonees

    public Point(){
        this.x = 0;
        this.y = 0;
    }

//    Intialization avec coordonnees X,Y

    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }

//    Getter

    public float getX() {
        return x;
    }
    public float getY(){
        return y;
    }


//    Setter

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

//    redifinition de la methode toString

    @Override
    public String toString(){
        return "les coordonnes sont:("+this.getX()+", "+this.getY()+")";
    }
}
