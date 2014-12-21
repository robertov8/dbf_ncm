/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbf;

import org.xBaseJ.*;
import org.xBaseJ.fields.CharField;

/**
 *
 * @author roberto
 */
public class CreateDbf {
    public static void main(String[] args){
        
        try{
            // Create a new dbf file
            DBF aDB = new DBF("class.dbf", true);
            // Create the fields
            CharField classId = new CharField("classId", 9);
            // Add fields definitios to database
            aDB.addField(classId);
            // Create index
            // true - delete ndx, true - unique index,
            //aDB.createIndex("classId.ndx", "classId", true);  
            // data
            classId.put("Java1");
            // save data
            aDB.write();
            // data
            classId.put("Java2");
            // save data
            aDB.write();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
