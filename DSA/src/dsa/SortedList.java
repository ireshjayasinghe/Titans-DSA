/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dsa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author envy
 */
public class SortedList implements Listable{
    
     ListHouse []Houselist;
     int compareResult;
//       ListHouse[] CurrentLists = new ListHouse[10];

    public SortedList() {
       Houselist =new ListHouse[5];
       
    }
    
    
    public void insert(ListHouse house) {
      
          for (int i = 0; i < Houselist.length; i++) {
              
            if (Houselist[i] == null) {

                Houselist[i] = house;
                break;
            }

        }
          
          
    
    }
    
        public void delete(Listable item) 
    {
       
    }
        
    public ListHouse Find(ListHouse House) {
               boolean foundHouse = false;
        int counter =0; 
         while (!foundHouse) {
             
            if(compareTo(House))
            {
          
               
             
              } 
             counter ++;
                     
         
         }
      
        
             return House;
         } 

    @Override
    public Listable copy() {
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(ListHouse other) {
        
      //  ListHouse thisHouse = (ListHouse) otherHouse;
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
