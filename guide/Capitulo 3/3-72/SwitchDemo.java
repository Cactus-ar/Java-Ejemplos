/**
 * Demostracion de switch
 * SwitchDemo.java
 */
class SwitchDemo {
    public static void main(String args[]) {
        int i;

        for(i=0; i<10; i++)
        switch(i){
            case 0:
                System.out.println("i es cero");
                break;
            case 1:
                System.out.println("i es uno");
                break;
            case 2:
                System.out.println("i es dos");
                break;
            case 3:
                System.out.println("i es tres");
                break;
            case 4:
                System.out.println("i es cuatro");
                break;
            default:
                System.out.println("i es mayor a cinco");
        }
        
    }
    
}