

public class pipes {
    private double x;
    private double y;
    private double birdY;
    private double birdY2;
    int i;

    
    public void draw(double x, double y){
        
        PennDraw.picture(50 + x, y, "pipe.png", 250, 500, 0);
        this.x = x;
        this.y = y;
        PennDraw.picture(50 + x, y+105, "pipe.png", 250, 500, 180);
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public boolean detectCollision(double birdY){
        this.birdY = birdY;
        if ((birdY<y+38) || (birdY>y+105-34.5-11 )) {
            return true;
        } else return false;
    }
    public boolean detectCollisionWings(double birdY2){
        this.birdY2 = birdY2;
        if ((birdY2<y+29.5) || (birdY2>y+105-34.5-11)) {
            return true;
        } else return false;
    }
}

