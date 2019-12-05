package com.aaa.web;

import com.aaa.model.BookInfo;
import com.aaa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:祁继港
 * @Date:2019/12/2 15:22
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("getAllBook")
    public List<BookInfo> getAllBook(){
        List<BookInfo> allBook=bookService.getAllBook();
        return allBook;
    }
}
