/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redes;

import javax.swing.JOptionPane;

/**
 *
 * @author Jacobo
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
           origen.setLineWrap(true);
        destino.setLineWrap(true);
        origen.setWrapStyleWord(true);
        destino.setWrapStyleWord(true);
    
        
      
      
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        origen = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        destino = new javax.swing.JTextArea();
        BtnTextBin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("enviar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Ingrese Texto");

        origen.setColumns(20);
        origen.setRows(5);
        jScrollPane1.setViewportView(origen);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Resultado en binario");

        destino.setColumns(20);
        destino.setRows(5);
        jScrollPane2.setViewportView(destino);

        BtnTextBin.setText("Enviar ");
        BtnTextBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTextBinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnTextBin)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(BtnTextBin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(84, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed



        int[] unidad_datos;
        int[] dividendo;
        int[] largo_p;
        int[] resto;
        int[] crc;
        int cantdatos, divisor, largo;
       // String lom = origen.getText();
        String lom=JOptionPane.showInputDialog("Ingrese la unidad de datos");
        char [] values;
        values = lom.toCharArray();
        cantdatos=values.length;
        unidad_datos=new int[cantdatos];

        for(int i=0; i<cantdatos; i++){            
            String auh=Character.toString(values[i]);
            int aux = Integer.parseInt(auh);
            unidad_datos[i]=aux;
        }
         // String rami = origen.getText();
        String rami=JOptionPane.showInputDialog("Ingrese el polinomio divisor");
        
        char [] ui;
        ui=rami.toCharArray();
        divisor=ui.length;
        largo_p=new int[divisor];
       
        
        for(int i=0; i<divisor; i++){
            String chap = Character.toString(ui[i]);
            int aux = Integer.parseInt(chap);
            largo_p[i]=aux;
        }
        
        
        String jkl="";
        for (int i=largo_p.length-1;i>=0;i--){
           for(int j =0;j<largo_p.length;j++){
            if(largo_p[i]==1){
                jkl=jkl+" + x^"+j;
            }
        }
        }
          jLabel1.setText(" "+jkl);
       System.out.println(jkl);
       
       largo=cantdatos+divisor-1;
        
        dividendo=new int[largo];
        resto=new int[largo];
        crc=new int[largo];
  
   
        for(int i=0;i<unidad_datos.length;i++){
            dividendo[i]=unidad_datos[i];
            
        }
                  jLabel2.setText("Diviviendo"+lom);
       System.out.println("Dividendo: "+lom);
        
          jLabel3.setText("Divisor "+rami);
        System.out.println("Divisor: "+rami);
        
  jLabel4.setText(" Dividiendo despues de agregar o's es : ");
        System.out.print("Dividendo (despues de agregar lo 0's) es : ");
        String dividendofinal="";
        for(int i=0; i< dividendo.length; i++)
        {
            
           jLabel5.setText(""+dividendo[i]);//.toString(dividendo[i]);
          //jLabel5.setText("");
            dividendofinal=dividendofinal+dividendo[i];
          System.out.print(dividendo[i]);   
       
       //  jLabel5.setText(""+dividendo[i]);
       System.out.println();
        }
        jLabel5.setText(dividendofinal);
        
        
        for(int j=0; j<dividendo.length; j++){
              resto[j] = dividendo[j];
        }
    
      resto=divide(dividendo, largo_p, resto);
   
        
        for(int i=0;i<dividendo.length;i++)           
        {
            crc[i]=(dividendo[i]^resto[i]);
        }
        
        System.out.println();
          jLabel6.setText("");  
        jLabel6.setText(" el dividendo al agregar el crc quedaria como: ");
       System.out.println("El dividendo al agregarle el CRC quedaria como : "); 
       
       String crcfinal="";
        for(int i=0;i<crc.length;i++)
        {
            
         jLabel7.setText(" "+crc[i]);
         crcfinal=crcfinal+crc[i];
       //   jLabel7.setText(""); 
        //System.out.print(crc[i]);
        }
        jLabel7.setText(crcfinal);
        
     System.out.println();
         //j1TextArea1
           // String bitna = jTextArea1.getText()+largo;       
        String bitna=JOptionPane.showInputDialog("Ingresa el codigo de CRC de  "+largo+" bits para comprobar: ");
        char [] nm;
        nm = bitna.toCharArray();
        
        for(int i=0; i<crc.length; i++){
            //String bitna;
              String chap = Character.toString(nm[i]);
            int aux = Integer.parseInt(chap);
            crc[i]=aux;
        }
          jLabel8.setText(" el dividendo recivido es : "+bitna);
        System.out.println("el dividendo recibido es: "+bitna);       
       
       resto=divide(crc, largo_p, resto);
        
        for(int i=0; i< resto.length; i++)
        {
            if(resto[i]!=0)
            {
                  jLabel10.setText(" error su resto no es  cero ");
                System.out.println("Error su resto no es cero");
                break;
            }
            if(i==resto.length-1)
            {
                  jLabel10.setText(" no hay error su resto es igual a 0 ");
                
                   System.out.println("No hay error su resto es igual  a 0");
            }
            
        }
        
    }
        
    


        // TODO add your handling code here:
        
        
        
        
       static int[] divide(int dividendo[],int largo_p[], int resto[])
     {
        int contador=0;
        while(true)
        {
            for(int i=0;i<largo_p.length;i++)
                resto[contador+i]=(resto[contador+i]^largo_p[i]);
            
            while(resto[contador]==0 && contador!=resto.length-1)
                contador++;
    
            if((resto.length-contador)<largo_p.length)
                break;
        }
       
        return resto;
     
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnTextBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTextBinActionPerformed
        String texto = origen.getText();
        //String texto = "";
        //char[] letra;
        //  char [] letra = texto.toCharArray();
        //String texto="puto";
        String codigoBinario = "";//guarda el en binario
        // char letra;
        int contadorerror =0;
        int tam = texto.length();
        if (tam==22){

            String R= null;
            String e= null;
            String d= null;
            String s= null;
            //if (texto.equals("Redes "))  {

                char ERRORES[] = new char[22];
                char palabrafrase[] = new char[22];
                palabrafrase[0]='R';
                palabrafrase[1]='e';
                palabrafrase[2]='d';
                palabrafrase[3]='e';
                palabrafrase[4]='s';
                palabrafrase[5]=' ';
                palabrafrase[6]='d';
                palabrafrase[7]='e';
                palabrafrase[8]=' ';
                palabrafrase[9]='C';
                palabrafrase[10]='o';
                palabrafrase[11]='m';
                palabrafrase[12]='p';
                palabrafrase[13]='u';
                palabrafrase[14]='t';
                palabrafrase[15]='a';
                palabrafrase[16]='d';
                palabrafrase[17]='o';
                palabrafrase[18]='r';
                palabrafrase[19]='a';
                palabrafrase[20]='s';
                palabrafrase[21]=' ';

                for (int i = 0; i < texto.length(); i++)

                {
                    //recorre el texto ingresado
                    char letra = texto.charAt(i);//separa letra a letra

                    if (palabrafrase[i]==letra)
                    {
                        ERRORES[i]='0';
                    }
                    else
                    {
                        ERRORES[i]='1';
                        contadorerror++;
                    }
                    int aux = Binario((int) (letra)).length();//almacena largo del binario de la letra devuelta
                    for (int j = 0; j < 8; j++) {//recorrido de 8 characteres
                        if (aux < 8) {//si el largo del binario es menor a 7 (0-7)entonces

                            codigoBinario = codigoBinario + "0";//agregar 0 a la concadenacion
                            aux++;
                            //System.out.println("la posiscion s " +j );

                        }

                    }

                    codigoBinario = codigoBinario + Binario ((int) (letra))+" = "+ letra +" " + " ; "  ;
                    if(contadorerror==0)
                    {
                        jLabel9.setText("la frase es correcta ");
                    }
                    if(contadorerror>=1)
                    {
                        jLabel9.setText("la frase es incorrecta ");
                    }
                    //codigoBinario = codigoBinario + "g" ;
                }
                String conca="";
                String fori="";
                for (int x =0; x<texto.length(); x++)
                {
                    if(ERRORES[x] == '1')
                    {
                        fori=fori+x+",";
                        conca=conca+palabrafrase[x]+",";
                        // jLabel4.setText("Error en la posicion "+" "+x+" "+"La letra deveria ser "+" "+palabrafrase[x]);
                        jLabel9.setText("Error en la posicion "+" "+fori+""+"La letra deveria ser "+""+conca+"");

                        //System.out.println("ERROR EN LA POSICION "+x+" LA LETRA DEBERIA DE SER "+palabrafrase[x]);
                    }
                    //jLabel4.setText(conca);

                }

                //}    FIN DE IF COMPROBACION
        }    //FIN DE IF DE TAM==&
        else if(tam <=20)
        {

            for (int i = 0; i < texto.length(); i++)

            {

                //recorre el texto ingresado
                char letra = texto.charAt(i);//separa letra a letra

                int aux = Binario((int) (letra)).length();//almacena largo del binario d ela letra devuelta
                for (int j = 0; j < 8; j++) {//recorrido de 8 characteres
                    if (aux < 8) {//si el largo del binario es menor a 7 (0-7)entonces

                        codigoBinario = codigoBinario + "0";//agregar 0 a la concadenacion
                        aux++;
                        //System.out.println("la posiscion s " +j );

                    }

                }

                codigoBinario = codigoBinario + Binario ((int) (letra))+" = "+ letra +" " + " ; "  ;
                //  jLabel4.setText("la frase es correcta ");
                //codigoBinario = codigoBinario + "g" ;

            }

            jLabel9.setText("Error la frase es muy corta");
        }

        else if(tam >=22)
        {

            for (int i = 0; i < texto.length(); i++)

            {

                //recorre el texto ingresado
                char letra = texto.charAt(i);//separa letra a letra

                int aux = Binario((int) (letra)).length();//almacena largo del binario d ela letra devuelta
                for (int j = 0; j < 8; j++) {//recorrido de 8 characteres
                    if (aux < 8) {//si el largo del binario es menor a 7 (0-7)entonces

                        codigoBinario = codigoBinario + "0";//agregar 0 a la concadenacion
                        aux++;
                        //System.out.println("la posiscion s " +j );

                    }

                }

                codigoBinario = codigoBinario + Binario ((int) (letra))+" = "+ letra +" " + " ; "  ;
                //  jLabel4.setText("la frase es correcta ");
                //codigoBinario = codigoBinario + "g" ;

            }

            jLabel9.setText(" error la frase es muy larga ");
        }

        destino.setText(codigoBinario);/*imprime el codigo binario completo*/

    }//GEN-LAST:event_BtnTextBinActionPerformed

       private String Binario(int Decimal) {
        int R, x = 0;//variables que se implementaran
        String Binario = ""; //guarda el contenido en codigo binario
        R = Decimal % 2;//resto del parametro 
        if (R == 1) {//si el resto es 1
            while (Decimal > 1) {//si el parametro es mas grande q el resto
                Decimal /= 2;//entonces decimal se divide en 2 y se guarda en decimal
                x = Decimal % 2;//x contendra el resto del decimal
                Binario = String.valueOf(x + Binario);//binario se ira formando de forma correcta y no alreves
            }
        } else {//si resto no es 1
            while (Decimal > 0) {//y decimal es mayor a 0
                Decimal /= 2;//decimal se divide en 2
                x = Decimal % 2;//x contendra el resto del decimal resultante
                Binario = String.valueOf(x + Binario);//se forma el numero en binario de forma correcta
            }
        }
        return String.valueOf(Binario + x);//devuelve el binario resultante mas el ultimo bit
    }

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnTextBin;
    private javax.swing.JTextArea destino;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea origen;
    // End of variables declaration//GEN-END:variables
}
