package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.embed.Full_Type;

@Entity
public class Mix_Animal {
    @Id
   private int id;
   private String name;

   private Full_Type type;

   public Mix_Animal(){}

    public Mix_Animal(int id, String name, Full_Type type){
       this.id = id;
       this.name = name;
       this.type = type;
    }

    public void setId(int id){
       this.id = id;
    }

    public int getId(){
       return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Full_Type getType() {
        return type;
    }

    public void setType(Full_Type type) {
        this.type = type;
    }
}
