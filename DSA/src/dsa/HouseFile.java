/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dsa;

/**
 *
 * @author iresh
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author iresh
 */
public class HouseFile {
    

    public HouseFile() {
         
    }
   
   
      
   public void WriteToFile(ListHouse []theArray )
   {
       try {
     String JSONString=    JsonWriter.objectToJson(theArray);
                
           WriteFilewithgson(JSONString);
       } catch (IOException ex) {
           System.out.println(ex);
       }
   }
   
   
   
   public ListHouse[] ReadFromFile()
   {
       try {
           
           ListHouse  []jsonToJava = (  ListHouse[]) JsonReader.jsonToJava(ReadFilewithgson());
        
         return jsonToJava;
       }catch(NullPointerException ex){
       } catch (IOException ex) {
           System.out.println(ex);
       }
       return null;
   }
   
   
 private void WriteFilewithgson(String writeString)
 {
      try {
         
             FileWriter fileWriter;
              fileWriter = new FileWriter("HouseDatabase.md");
          try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
              
              
              
              
             bufferedWriter .write(writeString);
              bufferedWriter.close();
          }
       } catch (IOException ex) {
          System.out.println(ex);
       
       }
       
 }
 
 
   private String ReadFilewithgson()
  {
      FileReader fileReader =   null;
       try {
           fileReader = new FileReader("HouseDatabase.md");
        
           BufferedReader bufferedReader =   new BufferedReader(fileReader);
          try {
              String readLine = bufferedReader.readLine().trim();
                               
              
              return readLine;
            
              
          } catch (IOException ex) {
            
          }
           
       }catch(NullPointerException ex){
       } catch (FileNotFoundException ex) {
           System.out.println(ex);
       } finally {
           try {
               fileReader.close();
           } catch (IOException ex) {
               System.out.println(ex);
           }
       }
       return null;

         
  }
  
  
   
    
}

