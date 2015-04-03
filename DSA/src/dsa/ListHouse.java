/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dsa;

/**
 *
 * @author Damitha
 */
<<<<<<< HEAD
public class ListHouse  implements Listable {
=======
public class ListHouse implements Listable{
>>>>>>> origin/master
    public int LOTNUMBER;
    public String FIRSTNAME;
    public String LASTNAME;
    public int PRICE;
    public int SQUAREFEET;
    public int NUMBEROFBEDROOMS;
    
    
        public ListHouse(){
            
            //cOn
        
    }
    
        public ListHouse(int lotNumber, String firstName,String lastName,int price, int squareFeet, int bedRooms) {
       
        this.LOTNUMBER = lotNumber;
        this.FIRSTNAME = firstName;
        this.LASTNAME = lastName;
        this.PRICE = price;
        this.SQUAREFEET = squareFeet;
        this.NUMBEROFBEDROOMS = bedRooms;
    }

     @Override
    public int compareTo(ListHouse other) {
        
      //  ListHouse thisHouse = (ListHouse) otherHouse;
        
        if (this.LOTNUMBER >other.LOTNUMBER) {
            
            return 1;
        }
        else if (this.LOTNUMBER ==other.LOTNUMBER) {
            
            return 0;
        }
        else
        {
            return  -1;
        }
        
        
    }

    @Override
    public ListHouse copy() {
       ListHouse list=this;
       return list;
    }
    


    @Override
    public int compareTo(ListHouse other) {
        
      //  ListHouse thisHouse = (ListHouse) otherHouse;
        
        if (this.LOTNUMBER >other.LOTNUMBER) {
            
            return 1;
        }
        else if (this.LOTNUMBER ==other.LOTNUMBER) {
            
            return 0;
        }
        else
        {
            return  -1;
        }
        
        
    }

    @Override
    public ListHouse copy() {
       ListHouse list=this;
       return list;
    }
    
    
}
