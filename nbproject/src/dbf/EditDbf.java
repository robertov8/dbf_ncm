/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbf;
import org.xBaseJ.*;
import org.xBaseJ.fields.CharField;
import org.xBaseJ.fields.NumField;
/**
 *
 * @author roberto
 */
public class EditDbf {
    public static void main(String args[]){
        
        try{
            // Open dbf file 
            DBF classDB = new DBF("C:\\Users\\roberto\\Documents\\NetBeansProjects\\dbf\\produto_java.dbf");
            
            // Define fields
            CharField descr = (CharField) classDB.getField("DESCR");
            NumField codigoNCM = (NumField) classDB.getField("CODIGONCM");
            
            
            
            for (int i = 0; i < classDB.getRecordCount(); i++) {
                
                classDB.read();
                String id = codigoNCM.get().replaceAll("\\s", "");
                                
                if(id.equals("84451924") || id.equals("")){
                    // Antes da atualização
                    //classDB.read();
                    //System.out.println("#" + (i+1) + " #Descrição: " + descr.get());
                    // Atualização                    
                    codigoNCM.put("84451924");
                    classDB.update();
                    // Depois da atualização
                    
                    System.out.println("#" + (i+1) + " #Descrição: " + descr.get());
                    
                }
            }
                    
            
            
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
