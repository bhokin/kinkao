package ku.kinkao.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Restaurant {

   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   private int id;

   private String name;
   private String address;
   private int rating;
}

