/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN_MenuContextuel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

/**
 *
 * @author HP Pavilion
 */
public class RubriqueSimple extends JMenuItem{

    int taille = 12;
    
    public RubriqueSimple(String nom, int taille, boolean isGras, ImageIcon icone, RubriqueListener rubriqueListener) {
        super(nom, icone);
        this.taille = taille;
        if(isGras == true){
            setFont(new java.awt.Font("Tahoma", Font.BOLD, this.taille));
        }else{
            setFont(new java.awt.Font("Tahoma", Font.PLAIN, this.taille));
        }
        this.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (rubriqueListener != null) {
                    rubriqueListener.OnEcouterLaSelection();
                }
            }
        });
    }
    
    public void setCouleur(Color couleur){
        setForeground(couleur);
    }
    
    public void setGras(boolean isGras){
        if(isGras == true){
            setFont(new java.awt.Font("Tahoma", Font.BOLD, taille));
        }else{
            setFont(new java.awt.Font("Tahoma", Font.PLAIN, taille));
        }
    }
    
    public boolean isGras(){
        if(getFont().getStyle() == Font.BOLD){
            return true;
        }else{
            return false;
        }
    }
    
    public void setText(String texte, int taille, boolean isGras){
        setText(texte);
        if(isGras == true){
            setFont(new java.awt.Font("Tahoma", Font.BOLD, taille));
        }else{
            setFont(new java.awt.Font("Tahoma", Font.PLAIN, taille));
        }
    }

    public JMenuItem getItem() {
        return this;
    }

    public void appliquerDroitAccessDynamique(boolean oui) {
        this.setEnabled(oui);
    }

}
