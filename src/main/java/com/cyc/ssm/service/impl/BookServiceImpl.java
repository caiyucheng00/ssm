package com.cyc.ssm.service.impl;

import com.cyc.ssm.bean.Appointment;
import com.cyc.ssm.bean.AppointmentExample;
import com.cyc.ssm.bean.Book;
import com.cyc.ssm.dto.AppointExecution;
import com.cyc.ssm.enums.AppointStateEnum;
import com.cyc.ssm.exception.AppointException;
import com.cyc.ssm.exception.NoNumberException;
import com.cyc.ssm.mapper.AppointmentMapper;
import com.cyc.ssm.mapper.BookMapper;
import com.cyc.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.sql.Date;
import java.util.List;

/**
 * @author 虚幻的元亨利贞
 * @Description
 * @date 2022-04-29 15:41
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private AppointmentMapper appointmentMapper;


    @Override
    public Book getById(Integer bookId) {
        return bookMapper.selectByPrimaryKey(bookId);
    }

    @Override
    public List<Book> getAll() {
        return bookMapper.selectByExample(null);
    }

    @Override
    @Transactional
    public AppointExecution appoint(Integer bookId, long studentId) {
        try {

            // 减少库存
            Book book = bookMapper.selectByPrimaryKey(bookId);
            Integer bookCount = book.getBookCount();

            if (bookCount <= 0) {
                throw new NoNumberException("库存不足");
            } else {
                book.setBookCount(bookCount - 1);
                bookMapper.updateByPrimaryKeySelective(book);

                appointmentMapper.insert(new Appointment(studentId, bookId, new Date(new java.util.Date().getTime())));
                AppointmentExample appointmentExample = new AppointmentExample();
                appointmentExample.createCriteria().andBookIdEqualTo(bookId).andStudentIdEqualTo(studentId);
                List<Appointment> appointmentList = appointmentMapper.selectByExample(appointmentExample);
                return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointmentList.get(0));
            }

        } catch (NoNumberException e) {
            e.getMessage();
        } catch (Exception e) {
            throw new AppointException("other error:" + e.getMessage());
        }
        return null;
    }
}
