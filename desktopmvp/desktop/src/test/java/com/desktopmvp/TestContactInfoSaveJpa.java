package com.desktopmvp;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import com.desktopmvp.model.ContactInfo;
import com.desktopmvp.util.*;;

public class TestContactInfoSaveJpa {

    public static void main(String[] args){
        
        ContactInfo contact = new ContactInfo();

        contact.setFullName("Jakub Nowak");
        contact.setEmail("jakub.nowak@nowak.pl");
        contact.setPhoneNumber("48123123123");
        contact.setLocation("Poznan");
        contact.setDescription("Test entry");
        contact.setPictureUrl("/img/nowak.png");

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction transaction = null;

        try {
            emf = JpaUtil.getEntityManagerFactory();
            em = emf.createEntityManager();
            transaction = em.getTransaction();
            transaction.begin();

            System.out.println("Persisting contact: " + contact.getFullName());
            em.persist(contact);
            System.out.println("Contact object is now managed, commit pending...");

            transaction.commit();;
            System.out.println("Transaction commited successfully");
            System.err.println("Contact saved! Generated ID: " + contact.getId());
        } catch (Exception e){
            System.err.println("Error: Failed to save contact info.");
            if (transaction != null && transaction.isActive()){
                try{
                    System.err.println("Transaction is active, attempting rollback...");
                    transaction.rollback();
                    System.err.println("Transaction rolled back.");
                } catch (Exception rbEx){
                    System.err.println("Error: Could not rollback transaction.");
                    rbEx.printStackTrace();
                }
            }

            e.printStackTrace();
        } finally{
            if (em != null && em.isOpen()) {
                em.close();
                System.err.println("EntityManager closed.");
            }
        }
        JpaUtil.shutdown();
        System.out.println("App closed");
    }
    
}
