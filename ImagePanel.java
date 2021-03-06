
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author Rahul Shandilya
 * Block : 1-3
 */
public class ImagePanel extends javax.swing.JPanel {

    /**
     * Creates new form ImagePanel to load the image
     */
    private Image img;
    //Get image
    public ImagePanel(String img) {
        this(new ImageIcon(img).getImage());
    }
    
    //Set the dimensions of the image
    public ImagePanel(Image img) {
    this.img = img;
    Dimension size = new Dimension(150, 150);
    this.setPreferredSize(size);
    this.setMinimumSize(size);
    this.setMaximumSize(size);
    this.setSize(size);
    this.setLayout(null);
  }
    @Override
  protected void paintComponent(Graphics g) {
   super.paintComponent(g);
    if (img != null) {
      g.drawImage(img, 0, 0, getWidth(), getHeight(), this); //draw the image
    }
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
