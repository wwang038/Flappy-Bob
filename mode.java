public class mode {
    private int x=0;
    private String mode1;
    private String mode2;
    private int size1;
    private int size2;
    private double height1;
    private double height2;
    private String face1;
    private String face2;
    private int size3;
    private int size4;
    private String music1;
    private String music2;

    public String musicModify(int x){
        this.x = x;
        if (x%2==1){
            return music1 = "peppa.wav";
        } else {
            return music2 = "btb.wav";
        }
    }
    public String modeModify(int x){
        this.x = x;

        if (x%2==1){
            return mode1 = "peppa1.png";
        } else {
            return mode2 = "btb2.png";
        }
    }
    public int modeModifySize(int x){
        this.x = x;
        if (x%2==1){
            return size1 = 130;
        } else {
            return size2 = 250;
        }
    }
    public double heightModify(int x){
        this.x = x;
        if (x%2==1){
            return height1 = 5;
        } else {
            return height2 = 0;
        }
    }
    public String faceModify(int x){
        this.x = x;
        if (x%2==0){
            return face1 = "btbface.png";
        } else {
            return face2 = "peppa.png";
        }
    }
    public int sizeModify(int x){
        this.x = x;
        if (x%2==0){
            return size3 = 110;
        } else {
            return size4 = 50;
        }
    }
}