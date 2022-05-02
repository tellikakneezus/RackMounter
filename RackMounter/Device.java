
/**
 * Write a description of class Device here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Device
{
    private int powerConsumptionAmps;
    private int uSize;
    
    public Device(int powerConsumptionAmpsParam, int uSizeParam){
        powerConsumptionAmps = powerConsumptionAmpsParam;
        uSize = uSizeParam;
    }
    
    public int getPowerConsumptionAmps(){
        return powerConsumptionAmps;
    }
    
    public int getUSize(){
        return uSize;
    }

    
    
}
