/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Version 3.3
package practicamp;

//import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author PcCom
 */
public class PracticaMP {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
//        UIManager.setLookAndFeel(new GraphiteLookAndFeel());
UIManager.put("nimbusBase",Color.DARK_GRAY);
        UIManager.put("control",Color.lightGray);
        UIManager.put("text",Color.black);
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        Multiplexor mult = new Multiplexor();
        mult.start();
    }

}
