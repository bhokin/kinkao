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
public class Member {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   private String username;
   private String password;
   private String firstName;
   private String lastName;
}
