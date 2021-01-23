
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snaker
 */
public class Openlk {   
    

   
   
    public static void main(String[] args)  {
    
       String enlaces= "https://www.jc-mouse.net/java/abrir-enlace-web-desde-jlabel-con-java";
          
       Desktop enlace=Desktop.getDesktop();
       
        try {
                enlace.browse(new URI(enlaces));
        } catch (IOException | URISyntaxException e) {
            e.getMessage();
        }
  
    
  

    
}
}
