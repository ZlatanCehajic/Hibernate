package hibernacija;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Engine {
    private static Session sesija = null;
    public static Session getSession(){
        if(sesija==null){
            
            Configuration config = new Configuration();
            config.configure("/config/hibernate.cfg.xml");
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
            SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
            
            sesija = sessionFactory.openSession();
        }
        
        return sesija;
        
    }
    
    
    
}
