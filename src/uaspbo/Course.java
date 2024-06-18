package uaspbo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "course_code", nullable = false)
    private String courseCode;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Teacher teacherTaught;
    
    @ManyToMany(mappedBy = "courses")
    private Set<Class> classes = new HashSet<>();

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<Activity> activities = new HashSet<>();

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

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public Teacher getTeacherTaught() {
        return teacherTaught;
    }

    public void setTeacherTaught(Teacher teacherTaught) {
        this.teacherTaught = teacherTaught;
    }

    public Set<Activity> getActivities() {
        return activities;
    }

    public void setActivities(Set<Activity> activities) {
        this.activities = activities;
    }
}
