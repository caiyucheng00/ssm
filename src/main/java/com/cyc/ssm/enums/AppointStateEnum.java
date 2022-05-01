package com.cyc.ssm.enums;

/**
 * @author 虚幻的元亨利贞
 * @Description 枚举状态类
 * @date 2022-04-29 15:19
 */
public enum AppointStateEnum {
    SUCCESS(1,"预约成功"),NO_NUMBER(0,"库存不足"),REPEAT_APPOINT(-1,"重复预约"),INNER_ERROR(-2,"系统异常");
    private int state;
    private String info;

    AppointStateEnum(int state, String info) {
        this.state = state;
        this.info = info;
    }

    public int getState() {
        return state;
    }

    public String getInfo() {
        return info;
    }
}
