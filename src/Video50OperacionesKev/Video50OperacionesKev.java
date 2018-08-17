

package Video50OperacionesKev;

import javax.swing.JOptionPane;

//KM

public class Video50OperacionesKev {

    
    public static void main(String[] args) {
        
        int numero1,numero2,suma,resta,mult,division;
        
        
        char operacion;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        operacion = JOptionPane.showInputDialog("Digite operacion a realizar (S/R/M/D)").charAt(0);
        
        switch(operacion){
            
            case 's':
            case 'S':suma = numero1+numero2;
                     JOptionPane.showMessageDialog(null,"La suma es : " + suma);
            break;
            
            
            
            case 'r':
            case 'R':resta = numero1-numero2;
                     JOptionPane.showMessageDialog(null,"La resta es : " + resta);
            break;
            
            case 'p':
            case 'P':
            case 'm':
            case 'M': mult = numero1*numero2;
                     JOptionPane.showMessageDialog(null,"La multiplicación es:  " + mult);
            break;
            
            case 'd':
            case 'D':division = numero1+numero2;
                     JOptionPane.showMessageDialog(null,"La división es: " + division);
                     
            default: JOptionPane.showMessageDialog(null,"Operacion incorrecta");
        }
        
    }
    
}
