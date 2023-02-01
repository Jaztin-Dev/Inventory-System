
package inventory.system;

public class Peripherals {
   String name;
   String type;

  
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    
     public static int c;
     public static String code(){
        
        String Code = String.format("2023%04d", c++);
        
        return Code;
                
    }
    
}
