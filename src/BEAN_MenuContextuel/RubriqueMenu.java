/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN_MenuContextuel;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author HP Pavilion
 */
public class RubriqueMenu extends JMenu{

    public RubriqueMenu(String nom) {
        super(nom);
    }
    
    public JMenu getMenu() {
        return this;
    }
    
    public void Ajouter(Component composant){
        if(composant != null){
            this.add(composant);
        }
    }

    public void appliquerDroitAccessDynamique(boolean oui) {
        this.setEnabled(oui);
    }

}
