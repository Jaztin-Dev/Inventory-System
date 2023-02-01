
package inventory.system;


public class output extends Peripherals{
    
output( String name, String type ){
            
        this.name = name;
        this.type = type;
    
    }
    
    public String showOutput(){
       
        return code() +" " + name +" "+ type ;
    }
    
    
    
}
