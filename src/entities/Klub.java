package entities;

import javax.persistence.*;

@Entity
@Table(name = "klubovi")
public class Klub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     public int id;
    
    public String naziv;
    public String drzava;
    
    @Override
    public String toString(){
        
        return this.id + " " + this.naziv + " " + this.drzava;
    }
   
}

    

