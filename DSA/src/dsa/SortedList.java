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
        
    
        public  ListHouse  findHouse(int lotNumber)
        {
        for (int i = 0; i <Houselist.length; i++) {
            if (Houselist[i]!=null) {
                
            
            if (Houselist[i].LOTNUMBER== lotNumber) {
                
                return Houselist[i];
                
                
            }
            }
        }
             return null;
        }

     

    
       public ListHouse[] bubbleSort(){
      
     
           ListHouse []templist=new ListHouse[Houselist.length];
           
            for (int i = 0; i < templist.length; i++) {
                if (Houselist[i]!=null) {
                     templist[i]=Houselist[i].copy();
                }
               
                
            }
           
         
		for(int i =templist.length - 1; i > 1; i--){

			
			for(int j = 0; j < i; j++){
				
                                  
                                
                            if (templist[j]!=null && templist[j+1] !=null) {
                                
                            
			
                                         
                                      if(templist[j].compareTo(templist[j+1])==1){
					
			               
                                          ListHouse temp= templist[j];
                                          
                                         templist[j]=templist[j+1];
                                          templist[j+1]=temp;
									
					
				        }
                                      
                                     
                            }
                            }
				
			
			
		}
                
                return templist;
                
             
		
	}
    
    
    
   
    
}
