package uaspbo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;

public class UASPBO {

    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            
            Student student1 = null;
            Student student2 = null;
            Student student3 = null;
            Student student4 = null;
            Student student5 = null;
            Student student6 = null;
            Student student7 = null;
            Student student8 = null;
            Student student9 = null;
            Student student10 = null;
            Student student11 = null;
            Student student12 = null;
            Student student13 = null;
            Student student14 = null;
            Student student15 = null;
            Student student16 = null;
            Student student17 = null;
            Student student18 = null;
            Student student19 = null;
            Student student20 = null;

            Teacher teacher1 = new Teacher();
            teacher1.setName("Einstein");
            teacher1.getStudentSupervised().add(student1);
            teacher1.getStudentSupervised().add(student5);
            teacher1.getStudentSupervised().add(student9);
            teacher1.getStudentSupervised().add(student13);
            teacher1.getStudentSupervised().add(student17);
            session.save(teacher1);
            
            Teacher teacher2 = new Teacher();
            teacher2.setName("Newton");
            teacher2.getStudentSupervised().add(student2);
            teacher2.getStudentSupervised().add(student6);
            teacher2.getStudentSupervised().add(student10);
            teacher2.getStudentSupervised().add(student14);
            teacher2.getStudentSupervised().add(student18);
            session.save(teacher2);
            
            Teacher teacher3 = new Teacher();
            teacher3.setName("Archimedes");
            teacher3.getStudentSupervised().add(student3);
            teacher3.getStudentSupervised().add(student7);
            teacher3.getStudentSupervised().add(student11);
            teacher3.getStudentSupervised().add(student15);
            teacher3.getStudentSupervised().add(student19);
            session.save(teacher3);
            
            Teacher teacher4 = new Teacher();
            teacher4.setName("Brimstone");
            teacher4.getStudentSupervised().add(student4);
            teacher4.getStudentSupervised().add(student8);
            teacher4.getStudentSupervised().add(student13);
            teacher4.getStudentSupervised().add(student16);
            teacher4.getStudentSupervised().add(student20);
            session.save(teacher4);

            student1 = new Student();
            student1.setName("Hazal");
            student1.setSupervisor(teacher1);
            session.save(student1);

            student2 = new Student();
            student2.setName("Irene");
            student2.setSupervisor(teacher2);
            session.save(student2);

            student3 = new Student();
            student3.setName("Sana");
            student3.setSupervisor(teacher3);
            session.save(student3);
            
            student4 = new Student();
            student4.setName("Sova");
            student4.setSupervisor(teacher4);
            session.save(student4);
            
            student5 = new Student();
            student5.setName("Giyuu");
            student5.setSupervisor(teacher1);
            session.save(student5);
            
            student6 = new Student();
            student6.setName("Gojo");
            student6.setSupervisor(teacher2);
            session.save(student6);
            
            student7 = new Student();
            student7.setName("Muichiro");
            student7.setSupervisor(teacher3);
            session.save(student7);
            
            student8 = new Student();
            student8.setName("Wendy");
            student8.setSupervisor(teacher4);
            session.save(student8);
            
            student9 = new Student();
            student9.setName("Mina");
            student9.setSupervisor(teacher1);
            session.save(student9);
            
            student10 = new Student();
            student10.setName("Liliana");
            student10.setSupervisor(teacher2);
            session.save(student10);
            
            student11 = new Student();
            student11.setName("Kaito");
            student11.setSupervisor(teacher3);
            session.save(student11);
            
            student12 = new Student();
            student12.setName("Kuroda");
            student12.setSupervisor(teacher4);
            session.save(student12);
            
            student13 = new Student();
            student13.setName("Scarlett");
            student13.setSupervisor(teacher1);
            session.save(student13);
            
            student14 = new Student();
            student14.setName("Wardah");
            student14.setSupervisor(teacher2);
            session.save(student14);
            
            student15 = new Student();
            student15.setName("Jenna");
            student15.setSupervisor(teacher3);
            session.save(student15);
            
            student16 = new Student();
            student16.setName("Lisa");
            student16.setSupervisor(teacher4);
            session.save(student16);
            
            student17 = new Student();
            student17.setName("Yapuji");
            student17.setSupervisor(teacher1);
            session.save(student17);
            
            student18 = new Student();
            student18.setName("Sage");
            student18.setSupervisor(teacher2);
            session.save(student18);
            
            student19 = new Student();
            student19.setName("Natasha");
            student19.setSupervisor(teacher3);
            session.save(student19);
            
            student20 = new Student();
            student20.setName("Diego");
            student20.setSupervisor(teacher4);
            session.save(student20);

            Course course1 = new Course();
            course1.setName("Pemrograman Berorientasi Objek");
            course1.setCourseCode("PBO2024");
            course1.setTeacherTaught(teacher1);
            session.save(course1);
            
            Course course2 = new Course();
            course2.setName("Algoritma dan Desain Perangkat Lunak");
            course2.setCourseCode("ADPL2024");
            course2.setTeacherTaught(teacher4);
            session.save(course2);
            
            Course course3 = new Course();
            course3.setName("Desain dan Analisis Algoritma");
            course3.setCourseCode("DAA2024");
            course3.setTeacherTaught(teacher2);
            session.save(course3);
            
            Course course4 = new Course();
            course4.setName("Sistem Digital");
            course4.setCourseCode("SISDIG2024");
            course4.setTeacherTaught(teacher3);
            session.save(course4);

            Class class1 = new Class();
            class1.setName("Class 1");
            class1.getCourses().add(course1);
            class1.getCourses().add(course2);
            class1.getCourses().add(course3);
            class1.getStudents().add(student2);
            class1.getStudents().add(student1);
            class1.getStudents().add(student6);
            class1.getStudents().add(student4);
            class1.getStudents().add(student5);
            session.save(class1);
            
            Class class2 = new Class();
            class2.setName("Class 2");
            class2.getCourses().add(course2);
            class2.getCourses().add(course3);
            class2.getCourses().add(course4);
            class2.getStudents().add(student7);
            class2.getStudents().add(student3);
            class2.getStudents().add(student17);
            class2.getStudents().add(student18);
            class2.getStudents().add(student20);
            session.save(class2);
            
            Class class3 = new Class();
            class3.setName("Class 3");
            class3.getCourses().add(course1);
            class3.getCourses().add(course3);
            class3.getCourses().add(course4);
            class3.getStudents().add(student8);
            class3.getStudents().add(student11);
            class3.getStudents().add(student19);
            class3.getStudents().add(student15);
            class3.getStudents().add(student12);
            session.save(class3);
            
            Class class4 = new Class();
            class4.setName("Class 4");
            class4.getCourses().add(course1);
            class4.getCourses().add(course2);
            class4.getCourses().add(course3);
            class4.getCourses().add(course4);
            class4.getStudents().add(student9);
            class4.getStudents().add(student10);
            class4.getStudents().add(student14);
            class4.getStudents().add(student16);
            class4.getStudents().add(student13);
            session.save(class4);

            Meeting meetPBO = new Meeting();
            meetPBO.setClassId(class1);
            meetPBO.setCourse(course1);
            meetPBO.setTeacher(teacher1);
            meetPBO.setMeetingStartTime(LocalDateTime.now());
            meetPBO.setAttendees(new HashSet<>(Arrays.asList(student1, student2, student3)));
            session.save(meetPBO);
            
            Assignment assignmentPaper = new Assignment();
            assignmentPaper.setClassId(class1);
            assignmentPaper.setCourse(course1);
            assignmentPaper.setTeacher(teacher1);
            assignmentPaper.setDueDate(LocalDateTime.now().plusWeeks(1));
            assignmentPaper.setAssignees(new HashSet<>(Arrays.asList(student1, student2)));
            session.save(assignmentPaper);
            
            Assignment assignmentQuiz = new Assignment();
            assignmentQuiz.setClassId(class1);
            assignmentQuiz.setCourse(course1);
            assignmentQuiz.setTeacher(teacher1);
            assignmentQuiz.setDueDate(LocalDateTime.now().plusWeeks(1));
            assignmentQuiz.setAssignees(new HashSet<>(Arrays.asList(student1, student2)));
            session.save(assignmentQuiz);

            Meeting meetADPL = new Meeting();
            meetADPL.setClassId(class2);
            meetADPL.setCourse(course2);
            meetADPL.setTeacher(teacher4);
            meetADPL.setMeetingStartTime(LocalDateTime.now());
            meetADPL.setAttendees(new HashSet<>(Arrays.asList(student1, student2, student3)));
            session.save(meetADPL);
            
            Assignment assignmentProject = new Assignment();
            assignmentProject.setClassId(class2);
            assignmentProject.setCourse(course2);
            assignmentProject.setTeacher(teacher4);
            assignmentProject.setDueDate(LocalDateTime.now().plusWeeks(1));
            assignmentProject.setAssignees(new HashSet<>(Arrays.asList(student1, student2)));
            session.save(assignmentProject);
            
            Assignment assignmentVideo = new Assignment();
            assignmentVideo.setClassId(class2);
            assignmentVideo.setCourse(course2);
            assignmentVideo.setTeacher(teacher4);
            assignmentVideo.setDueDate(LocalDateTime.now().plusWeeks(1));
            assignmentVideo.setAssignees(new HashSet<>(Arrays.asList(student1, student2)));
            session.save(assignmentVideo);
            
            Meeting meetDAA = new Meeting();
            meetDAA.setClassId(class3);
            meetDAA.setCourse(course3);
            meetDAA.setTeacher(teacher2);
            meetDAA.setMeetingStartTime(LocalDateTime.now());
            meetDAA.setAttendees(new HashSet<>(Arrays.asList(student1, student2, student3)));
            session.save(meetDAA);
            
            Assignment assignmentCatatan = new Assignment();
            assignmentCatatan.setClassId(class3);
            assignmentCatatan.setCourse(course3);
            assignmentCatatan.setTeacher(teacher2);
            assignmentCatatan.setDueDate(LocalDateTime.now().plusWeeks(1));
            assignmentCatatan.setAssignees(new HashSet<>(Arrays.asList(student1, student2)));
            session.save(assignmentCatatan);
            
            Assignment assignmentCheatsheet = new Assignment();
            assignmentCheatsheet.setClassId(class3);
            assignmentCheatsheet.setCourse(course3);
            assignmentCheatsheet.setTeacher(teacher2);
            assignmentCheatsheet.setDueDate(LocalDateTime.now().plusWeeks(1));
            assignmentCheatsheet.setAssignees(new HashSet<>(Arrays.asList(student1, student2)));
            session.save(assignmentCheatsheet);
            
            Score score1 = new Score();
            score1.setValue(90);
            score1.setClassId(class1);
            score1.setStudent(student1);
            score1.setCourse(course1);
            session.save(score1);

            Score score2 = new Score();
            score2.setValue(80);
            score2.setClassId(class1);
            score2.setStudent(student1);
            score2.setCourse(course2);
            session.save(score2);

            Score score3 = new Score();
            score3.setValue(70);
            score3.setClassId(class1);
            score3.setStudent(student1);
            score3.setCourse(course3);
            session.save(score3);
            
            Score score4 = new Score();
            score4.setValue(75);
            score4.setClassId(class1);
            score4.setStudent(student1);
            score4.setCourse(course4);
            session.save(score4);
            
            Score score5 = new Score();
            score5.setValue(80);
            score5.setClassId(class1);
            score5.setStudent(student2);
            score5.setCourse(course1);
            session.save(score5);
            
            Score score6 = new Score();
            score6.setValue(65);
            score6.setClassId(class1);
            score6.setStudent(student2);
            score6.setCourse(course2);
            session.save(score6);
            
            Score score7 = new Score();
            score7.setValue(85);
            score7.setClassId(class1);
            score7.setStudent(student2);
            score7.setCourse(course3);
            session.save(score7);
            
            Score score8 = new Score();
            score8.setValue(75);
            score8.setClassId(class1);
            score8.setStudent(student2);
            score8.setCourse(course4);
            session.save(score8);
            
            Score score9 = new Score();
            score9.setValue(80);
            score9.setClassId(class1);
            score9.setStudent(student3);
            score9.setCourse(course1);
            session.save(score9);
            
            Score score10 = new Score();
            score10.setValue(80);
            score10.setClassId(class1);
            score10.setStudent(student3);
            score10.setCourse(course2);
            session.save(score10);
            
            Score score11 = new Score();
            score11.setValue(75);
            score11.setClassId(class1);
            score11.setStudent(student3);
            score11.setCourse(course3);
            session.save(score11);
            
            Score score12 = new Score();
            score12.setValue(90);
            score12.setClassId(class1);
            score12.setStudent(student3);
            score12.setCourse(course4);
            session.save(score12);
            
            Score score13 = new Score();
            score13.setValue(80);
            score13.setClassId(class1);
            score13.setStudent(student4);
            score13.setCourse(course1);
            session.save(score13);
            
            Score score14 = new Score();
            score14.setValue(90);
            score14.setClassId(class1);
            score14.setStudent(student4);
            score14.setCourse(course2);
            session.save(score14);
            
            Score score15 = new Score();
            score15.setValue(85);
            score15.setClassId(class1);
            score15.setStudent(student4);
            score15.setCourse(course3);
            session.save(score15);
            
            Score score16 = new Score();
            score16.setValue(65);
            score16.setClassId(class1);
            score16.setStudent(student4);
            score16.setCourse(course4);
            session.save(score16);
            
            Score score17 = new Score();
            score17.setValue(60);
            score17.setClassId(class1);
            score17.setStudent(student5);
            score17.setCourse(course1);
            session.save(score17);
            
            Score score18 = new Score();
            score18.setValue(70);
            score18.setClassId(class1);
            score18.setStudent(student5);
            score18.setCourse(course2);
            session.save(score18);
            
            Score score19 = new Score();
            score19.setValue(75);
            score19.setClassId(class1);
            score19.setStudent(student5);
            score19.setCourse(course3);
            session.save(score19);
            
            Score score20 = new Score();
            score20.setValue(85);
            score20.setClassId(class1);
            score20.setStudent(student5);
            score20.setCourse(course4);
            session.save(score20);

            student1.getScores().add(score1);
            student1.getScores().add(score2);
            student1.getScores().add(score3);
            student1.getScores().add(score4);
            
            student2.getScores().add(score5);
            student2.getScores().add(score6);
            student2.getScores().add(score7);
            student2.getScores().add(score8);
            
            student3.getScores().add(score9);
            student3.getScores().add(score10);
            student3.getScores().add(score11);
            student3.getScores().add(score12);
            
            student4.getScores().add(score13);
            student4.getScores().add(score14);
            student4.getScores().add(score15);
            student4.getScores().add(score16);
            
            student5.getScores().add(score17);
            student5.getScores().add(score18);
            student5.getScores().add(score19);
            student5.getScores().add(score20);
            
            session.save(student1);
            session.save(student2);
            session.save(student3);
            session.save(student4);
            session.save(student5);

            class1.getActivities().add(assignmentPaper);
            class1.getActivities().add(assignmentQuiz);
            class1.getActivities().add(meetPBO);
            session.save(class1);

            transaction.commit();

            System.out.println("Student Name : "+student1.getName() + " GPA : " +student1.calculateGPA(student1.getId()));
            student1.printTranscript(student1.getId());
            System.out.println();
            
            System.out.println("Student Name : "+student2.getName() + " GPA : " +student2.calculateGPA(student2.getId()));
            student2.printTranscript(student2.getId());
            System.out.println();
            
            System.out.println("Student Name : "+student3.getName() + " GPA : " +student3.calculateGPA(student3.getId()));
            student3.printTranscript(student3.getId());
            System.out.println();
            
            System.out.println("Student Name : "+student4.getName() + " GPA : " +student4.calculateGPA(student4.getId()));
            student4.printTranscript(student4.getId());
            System.out.println();
            
            System.out.println("Student Name : "+student5.getName() + " GPA : " +student5.calculateGPA(student5.getId()));
            student5.printTranscript(student5.getId());
            System.out.println();
            }
        sessionFactory.close();
    }
}
