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
public class SortedList {
    
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
        
    public ListHouse retrieve(ListHouse House) {
             
             return House;
         } 
    
}
