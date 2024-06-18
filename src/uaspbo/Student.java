package uaspbo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany(mappedBy = "attendees")
    private Set<Meeting> meetings = new HashSet<>();

    @ManyToMany(mappedBy = "assignees")
    private Set<Assignment> assignments = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supervisor_id")
    private Teacher supervisor;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Score> scores = new HashSet<>();

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

    public Set<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(Set<Meeting> meetings) {
        this.meetings = meetings;
    }

    public Set<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(Set<Assignment> assignments) {
        this.assignments = assignments;
    }

    public Teacher getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Teacher supervisor) {
        this.supervisor = supervisor;
    }

    public Set<Score> getScores() {
        return scores;
    }

    public void setScores(Set<Score> scores) {
        this.scores = scores;
    }

    public float calculateGPA(Integer studentId) {

        Integer totalScore = 0;
        Integer totalTakenCourse = 0;

        for (Score score : scores) {
            if (Integer.valueOf(score.getStudent().getId()).equals(studentId)){
                totalTakenCourse += 1;
                totalScore +=  score.getValue();
            }
        }

         return (float) (totalScore / totalTakenCourse) / 25;
    }

    public void printTranscript(Integer studentId){
        System.out.print("Course Code   |");
        System.out.print("Course Name   |");
        System.out.println("Score |");
        for (Score score : scores) {
            if (Integer.valueOf(score.getStudent().getId()).equals(studentId)) {
                System.out.print(score.getCourse().getCourseCode() + "    |");
                System.out.print(score.getCourse().getName() + "    |");
                System.out.println(score.getValue() + " |");
            }
        }
    }
}
