package com.cyc.ssm.dto;

import com.cyc.ssm.bean.Appointment;
import com.cyc.ssm.enums.AppointStateEnum;

/**
 * @author 虚幻的元亨利贞
 * @Description 存储执行预约操作的返回结果
 * @date 2022-04-29 15:24
 */
public class AppointExecution {
    private Integer bookId;
    private int state;
    private String info;
    private Appointment appointment;

    public AppointExecution() {
    }

    // 预约成功
    public AppointExecution(Integer bookId, AppointStateEnum stateEnum, Appointment appointment) {
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.info = stateEnum.getInfo();
        this.appointment = appointment;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "AppointExecution{" +
                "bookId=" + bookId +
                ", state=" + state +
                ", info='" + info + '\'' +
                ", appointment=" + appointment +
                '}';
    }
}
