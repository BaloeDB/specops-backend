package nl.itvitae.specops.departments;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.itvitae.specops.users.User;

import java.util.UUID;

@Getter
@Setter
@Entity(name = "departments")
@NoArgsConstructor
public class Department {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String name;

  @ManyToOne private User departmentHead;

  public Department(String name, User departmentHead) {
    this.name = name;
    this.departmentHead = departmentHead;
  }
}
