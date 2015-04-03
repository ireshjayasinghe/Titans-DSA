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
     int CurrentLotNumber;
     
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
       
             return House;
         } 

    @Override
    public Listable copy() {
        
      //  Houselist[counter]
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(ListHouse other) {
        
      //  ListHouse thisHouse = (ListHouse) otherHouse;
        
        if (other.LOTNUMBER > CurrentLotNumber) {
            
            return -1;
        }
        else if (other.LOTNUMBER == CurrentLotNumber) {
            
            return 0;
        }
        else
        {
            return  1;
        }
        
        
    }
    
}
