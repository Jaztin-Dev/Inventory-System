
package inventory.system;


public class input extends Peripherals{
    
    input( String name, String type ){
            
        this.name = name;
        this.type = type;
    
    }
    
    public String showInput(){
       
        return code() +"   " + name +"    "+ type ;
    }

}
