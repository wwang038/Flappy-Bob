import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Main{
  public static void main(String[] args) {
    
    
    PennDraw.setCanvasSize(600,750);
    PennDraw.setXscale(0,100);
    PennDraw.setYscale(0,100);
    int modeNumChecker =0;
    int modeNumCounter = 0;
      mode modeNum = new mode();
    

    //score loop
    while(true){
      String filePath = modeNum.musicModify(modeNumCounter);
      

      
      try {
          File file = new File(filePath);
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);

          // Set loop to true to play the MP3 on a loop
          clip.loop(Clip.LOOP_CONTINUOUSLY);

          // Start the playback
          clip.start();
        /*  if (modeNumCounter%2==0){
            System.out.println("peppa");
          } else {
            System.out.println("bob");
          }*/ 
      } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
        e.printStackTrace();}

        

      int topScore = 0;
//master loop
    boolean loop = true;
    
     while (loop) {
    // System.out.println("looped");
      
     int x=30;
     double y = 70;
int score =0;

     boolean p = false;
     int angle = 0;
      double dy = 0;
      double bgx1 = 30;
      double pdx = 30;
      double pdx1 = 30;
      double pdx2 = 30;
      double pdx3 = 30;
      double floorx = 30;
      double yground = -9;
     // String mode = "btb2.png";

      

      int y1 = (int)(Math.random()*47)-18;
      int y2 = (int)(Math.random()*47)-18;
      int y3 = (int)(Math.random()*47)-18;
      int y4 = (int)(Math.random()*47)-18;
      
 

      //initialize arrayList to hold pipe objects
       pipes pipe1 = new pipes();
      pipes pipe2 = new pipes();
      pipes pipe3 = new pipes();
      pipes pipe4 = new pipes();
     // pipes pipe4 = new pipes();




    

    
  while (!PennDraw.hasNextKeyTyped()){
    
      //initialize arrayList to hold pipe objects
     // pipes pipe5 = new pipes();


     // pipes pipe4 = new pipes();



/*if (modeNumCounter%2==0){
            System.out.println("peppa");
          } else {
            System.out.println("bob");
          }*/
  //initial bg
  PennDraw.picture(bgx1, 50, "bg1.jpg", 1594, 750);
 // pipe5.draw(pdx, y1);
  PennDraw.picture(x, y + modeNum.heightModify(modeNumCounter), modeNum.modeModify(modeNumCounter), modeNum.modeModifySize(modeNumCounter), modeNum.modeModifySize(modeNumCounter), angle);
  
  //text
   PennDraw.setFont("SansSerif");
    PennDraw.setPenColor(255, 255, 255);
    PennDraw.setFontSize(50);
    PennDraw.picture(50,50.6, "board1.png", 580, 100);
    PennDraw.text(50, 50, "Press Space to Jump", 0); 
    

    PennDraw.picture(floorx, yground, "ground.png", 860, 319);
    PennDraw.picture(floorx+146.5, yground, "ground.png", 860, 319);
    floorx-=0.7;
      if (floorx <= -115) {
        floorx+=168;
      }
      PennDraw.picture(94, 97, modeNum.faceModify(modeNumCounter), modeNum.sizeModify(modeNumCounter), 50, 0);

      if(PennDraw.mouseX() >= 91 && PennDraw.mouseX() <= 97 && PennDraw.mouseY() >= 94 && PennDraw.mouseY() <= 100 && PennDraw.mousePressed()){
        modeNum.modeModify(modeNumCounter);
        modeNumCounter++;       
      }
      PennDraw.enableAnimation(60);
      PennDraw.advance();
      modeNumChecker=modeNumCounter;
  }


PennDraw.nextKeyTyped();


p = true;
    //game loop
    while (p){
      
      //clear canvas so it can redraw
      //System.out.println("running");
      //draw bird
       PennDraw.picture(bgx1, 50, "bg1.jpg", 1594, 750); 
      PennDraw.picture(bgx1+87.8, 50, "bg2.jpg", 1594, 750); 
       
      
      
      
      bgx1-=0.7;
      if (bgx1 <= -115) {
        bgx1+=170;
      }

      
      
    
        pipe1.draw(pdx+50, y1);
      pipe2.draw(pdx1+50+50, y2);
      pipe3.draw(pdx2+100+50, y3);
      pipe4.draw(pdx3+150+50, y4);
      PennDraw.picture(x, y + modeNum.heightModify(modeNumCounter), modeNum.modeModify(modeNumCounter), modeNum.modeModifySize(modeNumCounter), modeNum.modeModifySize(modeNumCounter), angle);
      PennDraw.picture(floorx, yground, "ground.png", 860, 319);
      PennDraw.picture(floorx+146.5, yground, "ground.png", 860, 319);
      floorx-=0.7;
        if (floorx <= -115) {
          floorx+=168;
        }
    //  pipe4.draw(32-50, 10);
      pdx -=0.7;
      pdx1 -=0.7;
      pdx2 -=0.7;
      pdx3 -=0.7;

  //score counter
  PennDraw.setFont("SansSerif");
  PennDraw.setPenColor(255, 255, 255);
  String Score = Integer.toString(score);
  PennDraw.text(15, 90, Score, 0);
  PennDraw.setFontSize(90);
  if ((pipe1.getX() > -20.3 && pipe1.getX() < -19.6) || (pipe2.getX() > -20.3 && pipe2.getX() < -19.6) || (pipe3.getX() > -20.3 && pipe3.getX() < -19.6) || (pipe4.getX() > -20.3 && pipe4.getX() < -19.6)){
    score++;
  }
    //pipe repeater
  if (pipe1.getX() < -60){
    pdx = 89;
    y1 = (int)(Math.random()*47)-18;
   // System.out.println("1");
  }
  if (pipe4.getX() < -60){
    pdx3 = 89-150;
    y4 = (int)(Math.random()*47)-18;
   // System.out.println("4");
  }
  if (pipe2.getX() < -60){
    pdx1 = 89-50;
    y2 = (int)(Math.random()*47)-18;
  //  System.out.println("2");
  }
  if (pipe3.getX() < -60){
    pdx2 = 89-100;
    y3 = (int)(Math.random()*47)-18;
  //  System.out.println("3");
  }
//body collision
     if (pipe1.getX()<86-95 && pipe1.getX()>74-104){
      if(pipe1.detectCollision(y)){
        break;
      }
      
    }
    if (pipe4.getX()<86-95 && pipe4.getX()>74-104){
      if(pipe4.detectCollision(y)){
        break;
      }
      
    }
    if (pipe2.getX()<86-96 && pipe2.getX()>74-104){
        if(pipe2.detectCollision(y)){
        break;
        }
      }
    
    if (pipe3.getX()<86-96 && pipe3.getX()>74-104){
      if(pipe3.detectCollision(y)){
        break;
      }
    }
//wing collision
    if (pipe1.getX()<86-96-8 && pipe1.getX()>74-104-6){
      if(pipe1.detectCollisionWings(y)){
        break;
      }
    }
    if (pipe4.getX()<86-96-8 && pipe4.getX()>74-104-6){
      if(pipe4.detectCollisionWings(y)){
        break;
      }
    }
    if (pipe2.getX()<86-96-8 && pipe2.getX()>74-104-6){
      if(pipe2.detectCollisionWings(y)){
        break;
      }
    }
    if (pipe3.getX()<86-96-8 && pipe3.getX()>74-104-6){
      if(pipe3.detectCollisionWings(y)){
        break;
      }
    }

  

    //hitbox
    //PennDraw.filledRectangle(x, y+4, 4, 7.3);
    //PennDraw.filledRectangle(x-7, y+6, 3, 3.8);
      //add gravity - constantly subtract y

    /*  if(y>14){
        
        y -= dy;
        dy += 0.019;
       // angle = -35;
      } */

//bob
    PennDraw.picture(x, y + modeNum.heightModify(modeNumCounter), modeNum.modeModify(modeNumCounter), modeNum.modeModifySize(modeNumCounter), modeNum.modeModifySize(modeNumCounter), angle);
      //add gravity - constantly subtract y
      if(y>14){
        
        y -= dy;
        dy += 0.0475;
       // angle = -35;
      }
      boolean flap; 
      flap = false;
      flap = PennDraw.hasNextKeyTyped();
      
      //move bird up by pressing a key
      if (flap){
          dy=0;
          while (dy>-0.8025)  {
            dy -= 0.4;
            y-=dy;
          }

          //angle = 35;
          PennDraw.nextKeyTyped();
        
      }
      
      //animate screen
      PennDraw.enableAnimation(60);
      PennDraw.advance();
    }
    while (y>=13.8){
    //  System.out.println(y);
      PennDraw.picture(bgx1, 50, "bg1.jpg", 1594, 750); 
      PennDraw.picture(bgx1+87.8, 50, "bg2.jpg", 1594, 750); 
      pipe1.draw(pdx+50, y1);
      pipe2.draw(pdx1+50+50, y2);
      pipe3.draw(pdx2+100+50, y3);
      pipe4.draw(pdx3+150+50, y4);
      PennDraw.picture(x, y + modeNum.heightModify(modeNumCounter), modeNum.modeModify(modeNumCounter), modeNum.modeModifySize(modeNumCounter), modeNum.modeModifySize(modeNumCounter), angle);
      y -= dy;
      dy += 0.049;

     // angle = -35;
     
     PennDraw.enableAnimation(60);
      PennDraw.advance();
      if (PennDraw.hasNextKeyTyped()){
        PennDraw.nextKeyTyped();
      }
      
    }
    
    PennDraw.picture(bgx1, 50, "bg1.jpg", 1594, 750); 
      PennDraw.picture(bgx1+87.8, 50, "bg2.jpg", 1594, 750); 
      pipe1.draw(pdx+50, y1);
      pipe2.draw(pdx1+100, y2);
      pipe3.draw(pdx2+150, y3);
      pipe4.draw(pdx3+150+50, y4);
      PennDraw.picture(floorx, yground, "ground.png", 860, 319);
      PennDraw.picture(floorx+146.5, yground, "ground.png", 860, 319);
      floorx-=0.7;
        if (floorx <= -115) {
          floorx+=168;
        }
    
    PennDraw.picture(94, 97, modeNum.faceModify(modeNumCounter), 50, 50, 0);

    while(!PennDraw.hasNextKeyTyped()){
      PennDraw.picture(bgx1, 50, "bg1.jpg", 1594, 750); 
      PennDraw.picture(bgx1+87.8, 50, "bg2.jpg", 1594, 750); 
      pipe1.draw(pdx+50, y1);
      pipe2.draw(pdx1+100, y2);
      pipe3.draw(pdx2+150, y3);
      pipe4.draw(pdx3+150+50, y4);
      PennDraw.picture(floorx, yground, "ground.png", 860, 319);
      PennDraw.picture(floorx+146.5, yground, "ground.png", 860, 319);
      PennDraw.picture(94, 97, modeNum.faceModify(modeNumCounter), modeNum.sizeModify(modeNumCounter), 50, 0);
      
      if(PennDraw.mouseX() >= 91 && PennDraw.mouseX() <= 97 && PennDraw.mouseY() >= 94 && PennDraw.mouseY() <= 100 && PennDraw.mousePressed()){
        modeNum.modeModify(modeNumCounter);
        modeNumCounter++;
      }
      PennDraw.picture(x, y + modeNum.heightModify(modeNumCounter), modeNum.modeModify(modeNumCounter), modeNum.modeModifySize(modeNumCounter), modeNum.modeModifySize(modeNumCounter), angle);
    PennDraw.picture(50, 50, "score.png", 370, 330);
    PennDraw.picture(50, 85.5, "board1.png", 560, 100);
    String Score = Integer.toString(score);
    PennDraw.setFontSize(50);
    PennDraw.text(50, 55, Score);
    PennDraw.text(50, 62.5, "Score:");
    PennDraw.text(50,45, "Top Score:");
    if (score >= topScore){
      topScore = score;
    }
    String TopScore = Integer.toString(topScore);
    PennDraw.text(50,35,TopScore);
    PennDraw.setFontSize(40);
    String string = "Press Space to Play Again";
    PennDraw.text(50, 85, string);

    PennDraw.enableAnimation(60);
      PennDraw.advance();

    }
      
   
   
   //PennDraw.nextKeyTyped();
  
     }
}
  }
}