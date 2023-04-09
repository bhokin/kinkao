package ku.kinkao.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class Member {

   @Id
   @GeneratedValue
   private UUID id;

   private String username;
   private String password;
   private String firstName;
   private String lastName;
   private String email;
   private Instant createdAt;
   private String role;
}
