package com.cyc.ssm.controller;

import com.cyc.ssm.bean.Appointment;
import com.cyc.ssm.service.AppointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author 虚幻的元亨利贞
 * @Description
 * @date 2022-04-30 10:25
 */
@Controller
@RequestMapping("/appoint")
public class AppointController {
    @Autowired
    private AppointService appointService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    private ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        List<Appointment> appointmentList = appointService.getAll();
        mv.addObject("appointmentList",appointmentList);
        mv.setViewName("appointmentList");
        return mv;
    }
}
