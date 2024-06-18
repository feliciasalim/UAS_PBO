package uaspbo;

import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "meeting")
public class Meeting extends Activity {

    @Column(name = "meeting_start_time", nullable = false)
    private LocalDateTime meetingStartTime;

    @ManyToMany
    @JoinTable(
            name = "meeting_attendee",
            joinColumns = @JoinColumn(name = "meeting_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private Set<Student> attendees;

    @Override
    public String getDescription() {
        return "Meeting at " + meetingStartTime;
    }

    // Getters and Setters
    public LocalDateTime getMeetingStartTime() {
        return meetingStartTime;
    }

    public void setMeetingStartTime(LocalDateTime meetingStartTime) {
        this.meetingStartTime = meetingStartTime;
    }

    public Set<Student> getAttendees() {
        return attendees;
    }

    public void setAttendees(Set<Student> attendees) {
        this.attendees = attendees;
    }
}
