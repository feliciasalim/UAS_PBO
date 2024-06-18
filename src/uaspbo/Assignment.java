package uaspbo;

import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "assignment")
public class Assignment extends Activity {

    @Column(name = "due_date", nullable = false)
    private LocalDateTime dueDate;

    @ManyToMany
    @JoinTable(
            name = "assignment_assignee",
            joinColumns = @JoinColumn(name = "assignment_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private Set<Student> assignees;

    @Override
    public String getDescription() {
        return "Assignment due on " + dueDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Set<Student> getAssignees() {
        return assignees;
    }

    public void setAssignees(Set<Student> assignees) {
        this.assignees = assignees;
    }
}
