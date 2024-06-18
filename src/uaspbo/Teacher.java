package uaspbo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private Set<Activity> activities = new HashSet<>();
 
    @OneToMany(mappedBy = "supervisor", cascade = CascadeType.ALL)
    private Set<Student> studentSupervised = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Activity> getActivities() {
        return activities;
    }

    public void setActivities(Set<Activity> activities) {
        this.activities = activities;
    }

    public Set<Student> getStudentSupervised() {
        return studentSupervised;
    }

    public void setStudentSupervised(Set<Student> studentSupervised) {
        this.studentSupervised = studentSupervised;
    }
}
