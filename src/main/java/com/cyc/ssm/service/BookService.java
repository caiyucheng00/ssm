package com.cyc.ssm.service;

import com.cyc.ssm.bean.Book;
import com.cyc.ssm.dto.AppointExecution;
import com.cyc.ssm.exception.AppointException;

import java.util.List;

/**
 * @author 虚幻的元亨利贞
 * @Description
 * @date 2022-04-29 15:38
 */
public interface BookService {
    // 查询
    Book getById(Integer bookId);
    List<Book> getAll();

    // 预约
    AppointExecution appoint(Integer bookId,long studentId);
}
