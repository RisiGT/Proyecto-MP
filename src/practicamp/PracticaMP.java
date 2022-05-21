/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Version 3.3
package practicamp;

//import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author PcCom
 */
public class PracticaMP {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
//        UIManager.setLookAndFeel(new GraphiteLookAndFeel());
        Multiplexor mult = new Multiplexor();
        mult.start();
    }

}
