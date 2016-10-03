package Controlador;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//se importa modelo e interfaz
import Vista.Juego;


/**
 * @author Diego
 * @version 15/06/2016 21:03, diego lucas romero
 */ 




public class controlador implements ActionListener,MouseListener{

    /** instancia a nuestra interfaz de usuario*/
    Juego Vista ;
    
    /** instancia a nuestro modelo */
    

    
    /** Constrcutor de clase
     * @param vista Instancia de clase interfaz
     */
    public controlador( Juego Vista )
    {
        this.Vista = Vista;
        
        
    }
    
    public enum JuegoAction{
        Jirafa,
        Caballo,
        Perro,
        
    }
    
    
    public void iniciar(){
        
        Vista.setVisible(true);
        this.Vista.c.setVisible(false);
        this.Vista.p.setVisible(false);
        this.Vista.j.setVisible(false);
        
        this.Vista.lc.setVisible(false);
        this.Vista.lj.setVisible(false);
        this.Vista.lp.setVisible(false);
       
        
      this.Vista.Jirafa.setActionCommand("Jirafa");
      this.Vista.Jirafa.addActionListener(this);
      
      this.Vista.Perro.setActionCommand("Perro");
      this.Vista.Perro.addActionListener(this);
      
      this.Vista.Caballo.setActionCommand("Caballo");
      this.Vista.Caballo.addActionListener(this);
        
    
        
        
    }
        
        
            
            
            

    @Override
    public void actionPerformed(ActionEvent e) {
        switch ( JuegoAction.valueOf( e.getActionCommand() ) )
        {
            case Jirafa:
                 
                 this.Vista.c.setVisible(false);
                 this.Vista.p.setVisible(false);
                 this.Vista.j.setVisible(true);
                 
                 this.Vista.lc.setVisible(false);
                 this.Vista.lp.setVisible(false);
                 this.Vista.lj.setVisible(true);
                 
           
                break;
                
            case Caballo:
                this.Vista.j.setVisible(false);
                this.Vista.p.setVisible(false);
                this.Vista.c.setVisible(true);
                
                this.Vista.lp.setVisible(false);
                this.Vista.lj.setVisible(false);
                this.Vista.lc.setVisible(true);
                
                
                
                break;
                
            case Perro:
                this.Vista.c.setVisible(false);
                this.Vista.j.setVisible(false);
                this.Vista.p.setVisible(true);
                
                this.Vista.lj.setVisible(false);
                this.Vista.lc.setVisible(false);
                this.Vista.lp.setVisible(true);
                
                
                
                ;
            
        }
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
         
    }
}

