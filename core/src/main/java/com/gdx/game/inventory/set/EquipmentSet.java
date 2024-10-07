package com.gdx.game.inventory.set;

import com.gdx.game.inventory.item.InventoryItem;

import java.util.HashMap;

public class EquipmentSet {

    private InventoryItem.ItemSetID itemSetID;
    private String itemSetDescription;
    private HashMap<String, String> bonus = new HashMap<>();


    /**
    * Represents a set of equipment in the inventory. 
    * An EquipmentSet consists of an item set ID, description, and bonuses.
    */
    public EquipmentSet(EquipmentSet equipmentSet) {
        /** The unique identifier for the equipmentset. */
        this.itemSetID = equipmentSet.getItemSetID();
        /** The unique description for the equipmentset*/ 
        this.itemSetDescription = equipmentSet.getItemSetDescription();
        /** The unique bonus the equipmentset gives*/ 
        this.bonus = equipmentSet.getBonus();
    }

    /**
     * Returns the id for an itemset
     * 
     * @return itemSetID
    */ 
    public InventoryItem.ItemSetID getItemSetID() {
        return itemSetID;
    }

    /**
     * Specifies the ID for an itemset
     * 
     * @param itemSetID
    */ 
    public void setItemSetID(InventoryItem.ItemSetID itemSetID) {
        this.itemSetID = itemSetID;
    }

    /**
     * Returns the description for an itemset
     * 
     * @return itemSetDescription
    */ 
    public String getItemSetDescription() {
        return itemSetDescription;
    }

    /**
     * Specifies the description for an itemset
     * 
     * @param itemSetDescription
    */ 
    public void setItemSetDescription(String itemSetDescription) {
        this.itemSetDescription = itemSetDescription;
    }

    /**
     * Returns the bonus of an itemset
     * 
     * @return bonus
    */ 
    public HashMap<String, String> getBonus() {
        return bonus;
    }

    /**
     * Specifies the bonus for an itemset
     * 
     * @param bonus
    */ 
    public void setBonus(HashMap<String, String> bonus) {
        this.bonus = bonus;
    }
}
