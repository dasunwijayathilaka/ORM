package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.Full_Type;
import org.example.entity.Mix_Animal;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Full_Type type = new Full_Type("king","cobra");
        Mix_Animal animal = new Mix_Animal();
        animal.setId(4);
        animal.setName("Snake");
        animal.setType(type);


        Transaction transaction = session.beginTransaction();


        //save()
        session.save(animal);
        //delete()
        //session.delete(animal);
        Mix_Animal animal1 = session.get(Mix_Animal.class,1);
        System.out.println(animal1.toString());
        transaction.commit();
        session.close();




    }
}