
/**
 * Write a description of class Cabinet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cabinet
{
    private int uSlots;
    private int powerCapacity;
    
    private Device[] devices = new Device[uSlots];
        
    public Cabinet(int uSlotsParam, int powerCapacityParam){
        uSlots = uSlotsParam;
        powerCapacity = powerCapacityParam;
        
    }
    
    public void addPower(int power){
        powerCapacity+= power;
    }
    
    public void usePower(int power){
        powerCapacity-= power;
    }
    
    public void addDevice(Device dev){
        
    }
    
    public boolean atCapacity(){
        boolean atCapacity = false;
        
        if((uSlots <= 0) || (powerCapacity <= 0)){
            atCapacity = true;
        }
        
        return atCapacity;
    }
}
