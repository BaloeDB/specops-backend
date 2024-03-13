package nl.itvitae.specops.tasks;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "tasks")
@NoArgsConstructor
public class Task {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @ManyToOne private TaskPlanning taskPlanning;

  private LocalDate deadline;

  public Task(TaskPlanning taskPlanning, LocalDate deadline) {
    this.taskPlanning = taskPlanning;
    this.deadline = deadline;
  }
}
