/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN_MenuContextuel;

import java.awt.Component;
import javax.swing.JPopupMenu;

/**
 *
 * @author HP Pavilion
 */
public class MenuContextuel extends JPopupMenu {

    public MenuContextuel() {
        super();
    }

    public MenuContextuel(String label) {
        super(label);
    }

    public void Ajouter(Component composant) {
        if (composant != null) {
            this.add(composant);
        }
    }

    public void afficher(Component composant, int x, int y) {
        this.show(composant, x, y);
    }

    public JPopupMenu getMenuCont() {
        return this;
    }

}
