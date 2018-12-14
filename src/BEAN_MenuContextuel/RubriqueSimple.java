/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN_MenuContextuel;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

/**
 *
 * @author HP Pavilion
 */
public class RubriqueSimple extends JMenuItem{

    public RubriqueSimple(String nom, ImageIcon icone, RubriqueListener rubriqueListener) {
        super(nom, icone);
        this.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (rubriqueListener != null) {
                    rubriqueListener.OnEcouterLaSelection();
                }
            }
        });
    }

    public JMenuItem getItem() {
        return this;
    }

    public void appliquerDroitAccessDynamique(boolean oui) {
        this.setEnabled(oui);
    }

}
