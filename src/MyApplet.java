

import javax.swing.JApplet;
import java.awt.*;


public class MyApplet extends JApplet {

    
    public void init(){
        
    }

    public void paint(Graphics g){
        super.paint(g);
        
        g.drawString("Hello World!",20,40);
    }
}

