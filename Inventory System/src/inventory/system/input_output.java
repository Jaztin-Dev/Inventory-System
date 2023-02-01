
package inventory.system;

public class input_output extends Peripherals{
    
input_output( String name, String type ){
            
        this.name = name;
        this.type = type;
    
    }
    
    public String showIO(){
       
        return code() +" " + name +" "+ type ;
    }
    
    
}
