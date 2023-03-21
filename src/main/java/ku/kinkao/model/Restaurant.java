package ku.kinkao.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class Restaurant {

   @Id
   @GeneratedValue
   private UUID id;

   private String name;
   private String address;
   private int rating;
}

