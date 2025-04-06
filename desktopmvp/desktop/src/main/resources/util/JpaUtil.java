package util;

import jakarta.persistence.*;
import java.util.*;
import com.desktopmvp.*;

public class JpaUtil {
    private static final String PERSISTENCE_UNIT_NAME = "myPersistenceUnit";

    private static EntityManagerFactory factory;

    private JpaUtil(){

    }

    public static EntityManagerFactory getEntityManagerFactory(){
        if (factory == null) {
            try{
                Map<String, String> properties = new HashMap<>();

                String dbUrl = DbVarStore.getDB_URL();
                String dbUser = DbVarStore.getDB_USER();
                String dbPass = DbVarStore.getDB_PASSWORD();

                properties.put("jakarta.persistence.jdbc.url", dbUrl);
                properties.put("jakarta.persistence.jbdc.user", dbUser);
                properties.put("jakarta.persistence.jbdc.password", dbPass); 

                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME, properties);
            } catch (Throwable ex){
                System.err.println("FATAL: Initial EntityManagerFactory creation failed.");
                System.err.println("Persistence Unit Name: " + PERSISTENCE_UNIT_NAME);
                System.err.println("Attempted URL: " + DbVarStore.getDB_URL());
                System.err.println("Attempted User: " + DbVarStore.getDB_USER());
                ex.printStackTrace();
                throw new ExceptionInInitializerError(ex);
            }
        }
        return factory;
    }
}
