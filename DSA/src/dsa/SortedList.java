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
        int location = 0;

        while (item.compareTo(Houselist[location]) != 0) {
            location++;
        }
        
        for (int index = location + 1;
                index < numberOfItems;
                index++) {
            Houselist[index - 1] = Houselist[index];
        }
        numberOfItems--;
    }
        
        public Listable retrieve(Listable item) {
        int compareResult;

        int first = 0;
        int last = numberOfItems - 1;
        int midPoint = (first + last) / 2;
        boolean found = false;
        while (!found) {
            midPoint = (first + last) / 2;
            compareResult = item.compareTo(list[midPoint]);
            if (compareResult == 0) {
                found = true;
            } else if (compareResult < 0) // item is less than element at location 
            {
                last = midPoint - 1;
            } else // item is greater than element at location 
            {
                first = midPoint + 1;
            }

        }
        return list[midPoint].copy();
    }

    @Override
    public void insert(Listable item) // Adds a copy of item to this list 
    {
        int location = 0;
        boolean moreToSearch = (location < numberOfItems);
        while (moreToSearch) {
            if (item.compareTo(list[location]) < 0) // item is less 
            {
                moreToSearch = false;
            } else // item is more 
            {
                location++;
                moreToSearch = (location < numberOfItems);
            }
        }
        {
            for (int index = numberOfItems; index > location; index--) {
                list[index] = list[index - 1];
            }
        }
        list[location] = item.copy();
        numberOfItems++;
    }
    
    // Deletes the element that matches item from this list 
    @Override
    public void delete(Listable item) 
    {
        int location = 0;

        while (item.compareTo(list[location]) != 0) {
            location++;
        }
        for (int index = location + 1;
                index < numberOfItems;
                index++) {
            list[index - 1] = list[index];
        }
        numberOfItems--;
    }
    
}
