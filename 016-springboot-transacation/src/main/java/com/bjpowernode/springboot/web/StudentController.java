package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/update")
    public @ResponseBody
    Object update(Integer id, String name){

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        int updateCount = studentService.updateStudentById(student);

        return "修改学生的编号为"+ id + "的姓名修改结果："+updateCount;
    }
}
