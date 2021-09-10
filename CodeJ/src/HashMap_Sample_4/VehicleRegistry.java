package HashMap_Sample_4;

import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate,String> ownerlicence;

    public VehicleRegistry(){
        this.ownerlicence=new HashMap<>();
    }
    public boolean add(LicensePlate licensePlate, String owner){
        if(this.ownerlicence.containsKey(licensePlate)){
            return false;
        }
        this.ownerlicence.put(licensePlate,owner);
        return true;
    }
    public String get(LicensePlate licensePlate){
        if(this.ownerlicence.containsKey(licensePlate)){
            return this.ownerlicence.get(licensePlate);
        }else{
            return null;
        }
    }
    public boolean remove(LicensePlate licensePlate){
        if(this.ownerlicence.containsKey(licensePlate)){
            this.ownerlicence.remove(licensePlate);
            return true;
        }else{
            return false;
        }
    }
    public void printLicensePlates(){
        for(LicensePlate plate:this.ownerlicence.keySet()){
            System.out.println(plate.toString());
        }
    }
    public void printOwners(){
        HashMap<String,Boolean> own=new HashMap<>();
        for(String owner:this.ownerlicence.values()){
            if(!(own.containsKey(owner))){own.put(owner,true);}
        }
        for(String i:own.keySet()){
            System.out.println(i);
        }
    }
}
