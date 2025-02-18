package meta.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    
    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    private int priority; // 1 - High, 2 - Medium, 3 - Low

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    private String pausedReason;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assignedTo;
}
