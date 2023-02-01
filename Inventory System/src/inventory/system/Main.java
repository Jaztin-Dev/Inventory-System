
package inventory.system;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    
   List<input> in =new ArrayList<>();
   Iterator<input> i = in.iterator();
   
   List<output> out =new ArrayList<>();
   Iterator<output> o = out.iterator();
   
   List<input_output> io =new ArrayList<>();
   Iterator<input_output> IO = io.iterator();
   
   List<Employee> emp =new ArrayList<>();
   Iterator<Employee> e = emp.iterator();
    
    Scanner sc =new Scanner(System.in);
                
		int option;
                boolean find = false;
                
		do {
			System.out.println("=================================================");
                        System.out.println("---------------Inventory System----------------");
			System.out.println("1. Add Record");
			System.out.println("2. View Record");
			System.out.println("3. Edit Record");
			System.out.println("4. Delete Record");
			System.out.println("5. Report");
			System.out.println("6. Exit");
                        System.out.println("------------------------------------------------");
			System.out.println("=================================================");
                        
			System.out.print("Enter Your Choice : "); 
			 option=sc.nextInt();
                         sc.nextLine();
        
                         
                         switch(option) {
                             
			 case 1: // Add Record
                             
                             char choice;
                             
                        do{
                            
                        System.out.println("=================================================");
                        System.out.println("---------------Add Record----------------");
                        System.out.println("A. Add Peripheral");
			System.out.println("B. Add Peripheral to Employee");
                        System.out.println("C. Exit");
                        System.out.println("-------------------------------------------------");
                        System.out.println("=================================================");
                        
                        System.out.print("Enter Your Choice : "); 
			 choice=sc.next().charAt(0);
                         
                         
                         switch(Character.toUpperCase(choice)){
                             case 'A' : // add peripheral
                        System.out.println("=================================================");
                        System.out.println("--------------- Peripheral Type ----------------");
                        System.out.println("a. Input Device");
			System.out.println("b. Output Device");
                        System.out.println("c. Input/Output Device");
                        System.out.println("d. Exit");
                        System.out.println("-------------------------------------------------");
                        System.out.println("=================================================");
                        
                         System.out.print("Enter Your Choice : "); 
			 choice=sc.next().charAt(0);
                         sc.nextLine();
                         
                         
                         switch(Character.toLowerCase(choice)){
                             case 'a': // add input device 
                                  
                                System.out.print("Enter Hardware Name: ");
                                String inname = sc.nextLine(); 
                                 
                                 
                                 in.add(new input(inname, "Input Device"));
                                 
                                 
                                 System.out.println("===========================================================");
                                 System.out.println("--------- New Peripheral Successfully Added ---------------");
                                 System.out.println();
                                 i=in.iterator();	 
                                 while(i.hasNext()) 
                                 System.out.println(i.next().showInput());
                                 System.out.println("-----------------------------------------------------------");
                                 System.out.println("===========================================================");
                                 
                              
                                  
                                 break;
                                 
                             case 'b': // add output device 
                                  
                                System.out.print("Enter Hardware Name: ");
                                String outname = sc.nextLine(); 
                                 
                                out.add(new output(outname, "Output Device"));
                                 
                                 
                                 System.out.println("===========================================================");
                                 System.out.println("--------- New Peripheral Successfully Added ---------------");
                                 System.out.println();
                                 o=out.iterator();	 
                                 while(o.hasNext()) 
                                 System.out.println(o.next().showOutput());
                                 System.out.println("-----------------------------------------------------------");
                                 System.out.println("===========================================================");
                                 break;
                                 
                             case 'c': // add input/output device 
                                  
                                System.out.print("Enter Hardware Name: ");
                                String IOname = sc.nextLine(); 
                                 
                                 io.add(new input_output(IOname, "Input/Output Device"));
                                 
                                 
                                 System.out.println("===========================================================");
                                 System.out.println("--------- New Peripheral Successfully Added ---------------");
                                 System.out.println();
                                 IO=io.iterator();	 
                                 while(IO.hasNext()) 
                                 System.out.println(IO.next().showIO());
                                 System.out.println("-----------------------------------------------------------");
                                 System.out.println("===========================================================");
                                  
                                 break;
                                 
                            default:
				System.out.println("======================== Please Try Again!!! =========================");
                        	 break;
                         }
                         
                          break;
                         
                       case 'B' : // adding periperal to employee
                         System.out.println("===========================================================");
                         System.out.println("---------------Add Peripheral to Employee----------------");
                         System.out.println("a. Input Device");
			 System.out.println("b. Output Device");
                         System.out.println("c. Input/Output Device");
                         System.out.println("d. Exit");
                         System.out.println("-------------------------------------------------");
                         System.out.println("===========================================================");
                         System.out.println("Enter Peripheral Type: ");
			 choice=sc.next().charAt(0);
                         sc.nextLine();
                         
                          switch(Character.toLowerCase(choice)){
                             case 'a':
                                  
                                System.out.print("Enter employee Name: ");
                                String emname = sc.nextLine(); 
                                 
                                 
                                 emp.add(new Employee(emname, "Input Device"));
                                 
                                 
                                 System.out.println("===========================================================");
                                 System.out.println("--------- New Employee Successfully Added ---------------");
                                 System.out.println();
                                 e=emp.iterator();	 
                                 while(e.hasNext()) 
                                 System.out.println(e.next().showemployee());
                                 System.out.println("-----------------------------------------------------------");
                                 System.out.println("===========================================================");
                                 
                              
                                  
                                 break;
                          
                          }
                         
                          break;

                             }
                         
                        
                        }while(Character.toUpperCase(choice) != 'C');
                         
                           break;
                         
                         
                         case 2: //view record
                        System.out.println("=================================================");
                        System.out.println("---------------View Record----------------");
                        System.out.println("a. View all Peripheral");
			System.out.println("b. View Available Peripherals");
                        System.out.println("c. View Not Available Peripherals");
                        System.out.println("d. View all Input Devices");
                        System.out.println("e. View all Output Devices");
                        System.out.println("f. View all Input/Output Devices");
                        System.out.println("g. View all Employee");
                        System.out.println("h. Exit");
                        System.out.println("--------------------------------------------");
                        System.out.println("=================================================");
                        
                        System.out.print("Enter Your Choice : "); 
                        
			 choice=sc.next().charAt(0);
                         
                             switch(Character.toLowerCase(choice)){
                                case 'a' : 
                                    
                                 System.out.println("===================================================");
                                 System.out.println("----------------- Input Device --------------------");
                                 System.out.println();
                                 i=in.iterator();	 
                                 while(i.hasNext()) 
                                 System.out.println(i.next().showInput());
                                 System.out.println("---------------------------------------------------");
                                 System.out.println("===================================================");
                                 
                                 System.out.println("=====================================================");
                                 System.out.println("----------------- Output Devices -------------------");
                                 System.out.println();
                                 o=out.iterator();	 
                                 while(o.hasNext()) 
                                 System.out.println(o.next().showOutput());
                                 System.out.println("---------------------------------------------------");
                                 System.out.println("===================================================");
                                 
                                 System.out.println("===================================================");
                                 System.out.println("------------ Input/Output Devices -----------------");
                                 System.out.println();
                                 IO=io.iterator();	 
                                 while(IO.hasNext()) 
                                 System.out.println(IO.next().showIO());
                                 System.out.println("---------------------------------------------------");
                                 System.out.println("===================================================");
                                 
                                 break;
                                 
                                 case 'b' : 
                                 System.out.println("===================================================");
                                 System.out.println("----------------- Input Device --------------------");
                                 System.out.println();
                                 i=in.iterator();	 
                                 while(i.hasNext()) 
                                 System.out.println(i.next().showInput());
                                 System.out.println("---------------------------------------------------");
                                 System.out.println("===================================================");
                                 
                                 System.out.println("=====================================================");
                                 System.out.println("----------------- Output Devices -------------------");
                                 System.out.println();
                                 o=out.iterator();	 
                                 while(o.hasNext()) 
                                 System.out.println(o.next().showOutput());
                                 System.out.println("---------------------------------------------------");
                                 System.out.println("===================================================");
                                 
                                 System.out.println("===================================================");
                                 System.out.println("------------ Input/Output Devices -----------------");
                                 System.out.println();
                                 IO=io.iterator();	 
                                 while(IO.hasNext()) 
                                 System.out.println(IO.next().showIO());
                                 System.out.println("---------------------------------------------------");
                                 System.out.println("===================================================");
                                 
                                 break;
                                 
                                 case 'c' : 
                                 System.out.println("===================================================");
                                 System.out.println("---------------- Employee ---------------------");
                                 System.out.println();
                                 e=emp.iterator();	 
                                 while(e.hasNext()) 
                                 System.out.println(e.next().showemployee());
                                 System.out.println("---------------------------------------------------");
                                 System.out.println("===================================================");
                                 break;
                                 
                                 case 'd' : 
                                 System.out.println("===================================================");
                                 System.out.println("----------------- Input Device --------------------");
                                 System.out.println();
                                 i=in.iterator();	 
                                 while(i.hasNext()) 
                                 System.out.println(i.next().showInput());
                                 System.out.println("---------------------------------------------------");
                                 System.out.println("===================================================");
                                 
                                 break;
                                 
                                 case 'e' : 
                                 System.out.println("===================================================");
                                 System.out.println("----------------- Output Devices -------------------");
                                 System.out.println();
                                 o=out.iterator();	 
                                 while(o.hasNext()) 
                                 System.out.println(o.next().showOutput());
                                 System.out.println("---------------------------------------------------");
                                 System.out.println("===================================================");
                                 
                                 break;
                                 
                                 case 'f' : 
                                 System.out.println("===================================================");
                                 System.out.println("------------ Input/Output Devices -----------------");
                                 System.out.println();
                                 IO=io.iterator();	 
                                 while(IO.hasNext()) 
                                 System.out.println(IO.next().showIO());
                                 System.out.println("---------------------------------------------------");
                                 System.out.println("===================================================");
                                 
                                 break;
                                 
                                 case 'g' : 
                                 System.out.println("===================================================");
                                 System.out.println("---------------- Employee ---------------------");
                                 System.out.println();
                                 e=emp.iterator();	 
                                 while(e.hasNext()) 
                                 System.out.println(e.next().showemployee());
                                 System.out.println("---------------------------------------------------");
                                 System.out.println("===================================================");
                                 break;
                                 default : 
                                 
                                 break;
                             }
                             
                             break;
                             
                             
                         case 3: // edit record
                        System.out.println("=================================================");
                        System.out.println("--------------- Peripheral Type ----------------");
                        System.out.println("A. Input Device");
			System.out.println("B. Output Device");
                        System.out.println("C. Input/Output Device");
                        System.out.println("D. Exit");
                        System.out.println("-------------------------------------------------");
                        System.out.println("=================================================");
                        
                         System.out.print("Enter Your Choice : "); 
			 choice=sc.next().charAt(0);
                         sc.nextLine();
                             
                         
                         
                         switch(Character.toUpperCase(choice)){
                             case 'A' :
                                 System.out.println("------------------------------------------");
                                i=in.iterator();
              
                                find=false;
              
               	
                                System.out.print("Please Enter The Name of the Device To Update :");
                                String inname=sc.nextLine();
		    	
		    	while(i.hasNext()) {
		    		input update =i.next();
		    		if(update.getName().equalsIgnoreCase(inname)) {
		    			
		    			
            	        System.out.print("Enter New Name :");
            	      inname=sc.nextLine();
                      
	        			  
                                    in.add(new input(inname, "Input Device"));
	        			  find=true;
	        			  
		    		}
		    		
		    		
		    	}
		    			 
		    	System.out.println("================================================");	
		    			 
		    			  if(!find) {
		   				   System.out.println("Please Try Again!!1");
		   			   }else {
		   				   System.out.println("Update Successfuly!!!!!!");	
		   				System.out.println("================================================");	
					 
		 }
                                          
                                 
                         
                             break;
                             
                             case 'B' :
                                 System.out.println("------------------------------------------");
                                o=out.iterator();
              
                                find=false;
              
               	
                                System.out.print("Please Enter The Name of the Device To Update :");
                                String outname=sc.nextLine();
		    	
		    	while(o.hasNext()) {
		    		output update =o.next();
		    		if(update.getName().equalsIgnoreCase(outname)) {
		    			
		    			
            	        System.out.print("Enter New Name :");
            	      outname=sc.nextLine();
                      
	        			  
                                    out.add(new output(outname, "output Device"));
	        			  find=true;
	        			  
		    		}
		    		
		    		
		    	}
		    			 
		    	System.out.println("================================================");	
		    			 
		    			  if(!find) {
		   				   System.out.println("Please Try Again!!1");
		   			   }else {
		   				   System.out.println("Update Successfuly!!!!!!");	
		   				System.out.println("================================================");	
					 
		 }
                                 
                          break;
                          
                             case 'C' :
                                 System.out.println("------------------------------------------");
                                IO=io.iterator();
              
                                find=false;
              
               	
                                System.out.print("Please Enter The Name of the Device To Update :");
                                String IOname=sc.nextLine();
		    	
		    	while(i.hasNext()) {
		    		input_output update =IO.next();
		    		if(update.getName().equalsIgnoreCase(IOname)) {
		    			
		    			
            	        System.out.print("Enter New Name :");
            	      IOname=sc.nextLine();
                      
	        			  
                                    io.add(new input_output(IOname, "Input/Output Device"));
	        			  find=true;
	        			  
		    		}
		    		
		    		
		    	}
		    			 
		    	System.out.println("================================================");	
		    			 
		    			  if(!find) {
		   				   System.out.println("Please Try Again!!1");
		   			   }else {
		   				   System.out.println("Update Successfuly!!!!!!");	
		   				System.out.println("================================================");	
					 
		 }
                                 
                          break;
                           
                            
                              
                  case 4: //delete record
                      
                      do{
                        System.out.println("===========================================================");
                         System.out.println("---------------Delete Peripheral ----------------");
                         System.out.println("a. Input Device");
			 System.out.println("b. Output Device");
                         System.out.println("c. Input/Output Device");
                         System.out.println("d. Exit");
                         System.out.println("-------------------------------------------------");
                         System.out.println("===========================================================");
                         System.out.println("Enter Peripheral Type: ");
			 choice=sc.next().charAt(0);
                         sc.nextLine();
                         
                            switch(Character.toUpperCase(choice)){
                                
                                
                                case 'A':
                                    
                                 System.out.println("===================================================");
                                 System.out.println("-------------- Delete Input Device ----------------");
                                 System.out.println();
                                 i=in.iterator();	 
                                 while(i.hasNext()) 
                                 System.out.println(i.next().showInput());
                                 System.out.println("---------------------------------------------------");
                                 System.out.println("===================================================");
                                 
                                
                             
                              System.out.print("Enter Name of Hardware :  ");
                              String inpname = sc.next();
                   
                              i=in.iterator();
                               find=false;
	    	   
	    	   
                               while(i.hasNext()) {
                                   input h = i.next();
                                   if(h.getName().equals(inpname)) {
                                      
                                       i.remove();
                                        find = true;
                                   } 
	    	   }
	    	   System.out.println("------------------------------------------------");	
	    	   if(!find)System.out.println("Try Again");
	              else System.out.println(" Deleted Successfully..!");
	    	   System.out.println("-------------------------------------------------");	
                   
                                    break;
                            
                                    case 'B':
                                    
                                 System.out.println("===================================================");
                                 System.out.println("-------------- Delete Output Device ----------------");
                                 System.out.println();
                                 o=out.iterator();	 
                                 while(o.hasNext()) 
                                 System.out.println(o.next().showOutput());
                                 System.out.println("---------------------------------------------------");
                                 System.out.println("===================================================");
                                 
                                
                             
                              System.out.print("Enter Name of Hardware :  ");
                              String otname = sc.next();
                   
                              o=out.iterator();
                               find=false;
	    	   
	    	   
                               while(o.hasNext()) {
                                   output h = o.next();
                                   if(h.getName().equals(otname)) {
                                      
                                       o.remove();
                                        find = true;
                                   } 
	    	   }
	    	   System.out.println("------------------------------------------------");	
	    	   if(!find)System.out.println("Try Again");
	              else System.out.println(" Deleted Successfully..!");
	    	   System.out.println("-------------------------------------------------");	
                   
                                    break;
                                    
                                    
                                    
                                      case 'C':
                                    
                                 System.out.println("===================================================");
                                 System.out.println("-------------- Delete Output Device ----------------");
                                 System.out.println();
                                 IO=io.iterator();	 
                                 while(IO.hasNext()) 
                                 System.out.println(IO.next().showIO());
                                 System.out.println("---------------------------------------------------");
                                 System.out.println("===================================================");
                                 
                                
                             
                              System.out.print("Enter Name of Hardware :  ");
                              String ioname = sc.next();
                   
                              IO=io.iterator();
                               find=false;
	    	   
	    	   
                               while(IO.hasNext()) {
                                   input_output h = IO.next();
                                   if(h.getName().equals(ioname)) {
                                      
                                       IO.remove();
                                        find = true;
                                   } 
	    	   }
                               
	    	   System.out.println("------------------------------------------------");	
	    	   if(!find)System.out.println("Try Again");
	              else System.out.println(" Deleted Successfully..!");
	    	   System.out.println("-------------------------------------------------");	
                   
                                    break;
                            }
                      }while(Character.toUpperCase(choice) != 'D');
                      }
                             
                         case 5: // report 
                             System.out.println("Input Devices: " + in.size());
                             System.out.println("Output Devices: " + out.size());
                             System.out.println("Input/Output Devices: " + io.size());
                             System.out.println("Employee: " + emp.size());
                             break;
                             
                        case 6:
			 System.out.println("=============================== Thank You Very Much!!! ========================");
                         break;
                             
                             default:
				System.out.println("======================== Please Try Again!!! =========================");
                        	 break;
                         }
                     } while(option != 6);
        }  
    } 
    


// Developed by: Justine Francisco
// IT-2A
