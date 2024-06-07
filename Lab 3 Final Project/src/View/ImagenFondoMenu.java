package View;

import Model.Config;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImagenFondoMenu extends JPanel {
    private Image imagen;

    public ImagenFondoMenu(Dimension dimPantalla){
        try {
            imagen = ImageIO.read(new File(Config.getCarpetaImagenes() + "background.jpg"));
        }catch (IOException err){
            System.out.println("ERROR---> " + err.getMessage());
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            // Dibujar la imagen
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

}

