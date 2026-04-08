package models;

public class Doctor {
    private int doctorId;
    private String name;
    private String department;
    private String schedule;
    private String time; 

    public Doctor(int doctorId, String name, String department, String schedule, String time) {
        this.doctorId = doctorId;
        this.name = name;
        this.department = department;
        this.schedule = schedule;
        this.time = time;
    }
    public int getDoctorId() {
        return doctorId;
    }
    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getSchedule() {
        return schedule;
    }
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    public String getTime() {
        return time; // 
    }

    public void setTime(String time) {
        this.time = time;
    }
}
