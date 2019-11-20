
package util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


public class GerenteDeJanelas {
    
    public static JDesktopPane jdesktopPane;

    public GerenteDeJanelas(JDesktopPane jdesktopPane) {
        
        GerenteDeJanelas.jdesktopPane = jdesktopPane;
    }
    
    public void abrirJanelas(JInternalFrame jInternalFrame){
        if (jInternalFrame.isVisible()){
            
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();
            
        }else{
            jdesktopPane.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        }
    }
    
       public void abrirJanelas2(JInternalFrame jInternalFrame1, JInternalFrame jInternalFrame2){
        if (jInternalFrame2.isVisible()){
            jInternalFrame2.dispose();
        }else{
            jdesktopPane.add(jInternalFrame1);
            jInternalFrame1.setVisible(true);
            jdesktopPane.add(jInternalFrame2);
                    jInternalFrame2.setVisible(false);
        }
    }
}
