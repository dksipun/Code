package HashMap_Storage_5;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility(){
        this.storage=new HashMap<>();
    }

    public void add(String unit, String item){
        if(this.storage.containsKey(unit)){
            this.storage.get(unit).add(item);
        }else {
            this.storage.put(unit, new ArrayList<>());
            ArrayList<String> temp = storage.get(unit);
            temp.add(item);
        }
    }

    public ArrayList<String> contents(String storageUnit){
        if(this.storage.containsKey(storageUnit)){
            return this.storage.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item){
        for(int i=0;i<storage.get(storageUnit).size();i++){
            if (storage.get(storageUnit).get(i).equals(item)){
                storage.get(storageUnit).remove(i);
                return;
            }
        }

    }
    public ArrayList<String> storageUnits(){
        ArrayList<String> k=new ArrayList<>();
        for (String i:this.storage.keySet()){
            if(!(storage.get(i).isEmpty())){
                k.add(i);
            }
        }
        return k;
    }
}
