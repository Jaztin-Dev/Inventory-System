
package inventory.system;

public class Employee extends Peripherals {
    
    private String ename;

  Employee(String ename ,String type){
      this.ename=ename;
      
  }
   
    public String showemployee(){
       
        return code() +"   " + name+"   " + ename +"    "+ type ;
    }
}
