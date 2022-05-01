package com.cyc.ssm.bean;

import java.util.Date;

public class Appointment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column appointment.student_id
     *
     * @mbggenerated Thu Mar 31 20:00:46 CST 2022
     */
    private Long studentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column appointment.book_id
     *
     * @mbggenerated Thu Mar 31 20:00:46 CST 2022
     */
    private Integer bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column appointment.appoint_time
     *
     * @mbggenerated Thu Mar 31 20:00:46 CST 2022
     */
    private Date appointTime;

    public Appointment() {
    }

    public Appointment(Long studentId, Integer bookId, Date appointTime) {
        this.studentId = studentId;
        this.bookId = bookId;
        this.appointTime = appointTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column appointment.student_id
     *
     * @return the value of appointment.student_id
     *
     * @mbggenerated Thu Mar 31 20:00:46 CST 2022
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column appointment.student_id
     *
     * @param studentId the value for appointment.student_id
     *
     * @mbggenerated Thu Mar 31 20:00:46 CST 2022
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column appointment.book_id
     *
     * @return the value of appointment.book_id
     *
     * @mbggenerated Thu Mar 31 20:00:46 CST 2022
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column appointment.book_id
     *
     * @param bookId the value for appointment.book_id
     *
     * @mbggenerated Thu Mar 31 20:00:46 CST 2022
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column appointment.appoint_time
     *
     * @return the value of appointment.appoint_time
     *
     * @mbggenerated Thu Mar 31 20:00:46 CST 2022
     */
    public Date getAppointTime() {
        return appointTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column appointment.appoint_time
     *
     * @param appointTime the value for appointment.appoint_time
     *
     * @mbggenerated Thu Mar 31 20:00:46 CST 2022
     */
    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "studentId=" + studentId +
                ", bookId=" + bookId +
                ", appointTime=" + appointTime +
                '}';
    }
}