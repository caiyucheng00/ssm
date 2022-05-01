package com.cyc.ssm.service.impl;

import com.cyc.ssm.bean.Appointment;
import com.cyc.ssm.mapper.AppointmentMapper;
import com.cyc.ssm.service.AppointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 虚幻的元亨利贞
 * @Description
 * @date 2022-04-30 10:52
 */
@Service
public class AppointServiceImpl implements AppointService {
    @Autowired
    private AppointmentMapper appointmentMapper;

    @Override
    public List<Appointment> getAll() {
        return appointmentMapper.selectByExample(null);
    }
}
