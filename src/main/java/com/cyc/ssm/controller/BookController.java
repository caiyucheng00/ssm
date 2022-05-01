package com.cyc.ssm.controller;

import com.cyc.ssm.bean.Book;
import com.cyc.ssm.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

/**
 * @author 虚幻的元亨利贞
 * @Description
 * @date 2022-04-29 17:07
 */
@Controller
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;


    @RequestMapping(value = "/list",method = RequestMethod.GET)
    private String list(Model model){
        List<Book> bookList = bookService.getAll();
        model.addAttribute("bookList",bookList);
        return "bookList";
    }


    @RequestMapping(value = "/list",method = RequestMethod.POST)
    private String add(@Param("studentId") String studentId,@Param("bookId") String bookId){
        int bookID = Integer.parseInt(bookId);
        long studentID = Long.parseLong(studentId);
        bookService.appoint(bookID,studentID);
        return "redirect:/book/list";
    }

    @RequestMapping(value = "/appoint", method = RequestMethod.GET)
    private String appoint(){
        return "appointExecution";
    }
}
