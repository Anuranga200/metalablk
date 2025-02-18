package meta.metalablk.repository;

import meta.metalablk.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByAssignedToId(Long repairmanId);
}
