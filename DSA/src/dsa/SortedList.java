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
 * @author iresh
 */
<<<<<<< HEAD
public class SortedList {
    
=======
public class SortedList {  
>>>>>>> origin/master
     ListHouse []Houselist;
     int compareResult;
     int CurrentLotNumber;
     HouseFile HouseFileObject;
//       ListHouse[] CurrentLists = new ListHouse[10];

<<<<<<< HEAD
    public SortedList() {
       Houselist =new ListHouse[2];
      try{
       HouseFileObject = new HouseFile();
=======
       public SortedList() {
       Houselist =new ListHouse[2];
      try{
       HouseFile Object = new HouseFile();
>>>>>>> origin/master
        ListHouse[] newObject = HouseFileObject.ReadFromFile();
       
          if (newObject!=null) {
               Houselist=newObject;
          }
           
      
      }catch(Exception  e)
      {
      
      }
      
    }
    
    
    public void insert(ListHouse house) {
        System.out.println(house.LOTNUMBER);
          for (int i = 0; i < Houselist.length; i++) {
              
            if (Houselist[i] == null) {

                Houselist[i] = house;
                System.out.println(Houselist[i].LOTNUMBER);
               return;
            }
            

        }
          
            ListHouse[] NewHouseList = new ListHouse[Houselist.length * 2];

        for (int i = 0; i < Houselist.length; ++i) {
            NewHouseList[i] = Houselist[i];
        }

        Houselist = NewHouseList;

         for (int i = 0; i < Houselist.length; i++) {
              
            if (Houselist[i] == null) {

                Houselist[i] = house;
               return;
            }
            

        }
          
          
    
    }
    
<<<<<<< HEAD
 
        
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

    
    
     public void remove(int lotnumber)
        {
           
                for (int i = 0; i < Houselist.length; i++) {
                    if (Houselist[i]!=null) {
                        if (Houselist[i].LOTNUMBER==lotnumber) {

                            Houselist[i]=null;
                            return;
                            
                        }
                        
                        
                    }
                    
                    
                }
            
        }
     
     
    public ListHouse[] bubbleSort(){
=======
   public void remove(int lotnumber)
        {
           
                for (int i = 0; i < Houselist.length; i++) {
                    if (Houselist[i]!=null) {
                        if (Houselist[i].LOTNUMBER==lotnumber) {

                            Houselist[i]=null;
                            return;
                            
                        }
                        
                        
                    }
                    
                    
                }
            
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
>>>>>>> origin/master
      
     
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
<<<<<<< HEAD
	
	
	
        
    
    
=======
    
    
    
   
>>>>>>> origin/master
    
}
