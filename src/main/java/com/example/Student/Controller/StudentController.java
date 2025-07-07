/*package com.example.Student.Controller;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Student.Model.StudentModel;
import com.example.Student.Repository.StudentRepository;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute StudentModel student) {
        repo.save(student);
        return "redirect:/students"; 
    }


    @GetMapping("/students")
    public String viewStudents(HttpServletRequest request) {
        List<StudentModel> students = repo.findAll();
        request.setAttribute("students", students);
        //System.out.print(students);
        return "view"; 

    }
}
*/
/*package com.example.Student.Controller;

import java.util.List;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Student.Model.StudentModel;
import com.example.Student.Repository.StudentRepository;



@Controller
public class StudentController {

    @Autowired
    private StudentRepository repo;

    // ✅ LOGIN PAGE - GET
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // return login.jsp from views
    }

    // ✅ LOGIN PAGE - POST
    @PostMapping("/login")
    public String doLogin(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "admin@123".equals(password)) {
            return "redirect:/home"; // after login redirect to form
        }
        else if("user".equals(username) && "user@123".equals(password)) {
            return "redirect:/home";
        }
        
        else {
            request.setAttribute("error", "Invalid username or password");
            return "login";
        }
    }

    // ✅ FORM PAGE
    @GetMapping("/home")
    public String home() {
        return "index";
    }

    // ✅ SUBMIT FORM DATA
    @PostMapping("/submit")
	public String submit( StudentModel student) {
	    repo.save(student);
	   
	    return "redirect:/students";  }

    // ✅ VIEW STUDENTS
    @GetMapping("/students")
    public String viewStudents(HttpServletRequest request) {
        List<StudentModel> students = repo.findAll();
        request.setAttribute("students", students);
        return "view"; 
    }
   
}
*/
package com.example.Student.Controller;

import java.util.List;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.Student.Model.StudentModel;
import com.example.Student.Repository.StudentRepository;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository repo;

    // ✅ LOGIN PAGE - GET
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    // ✅ LOGIN PAGE - POST
    @PostMapping("/login")
    public String doLogin(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "admin@123".equals(password)) {
            return "redirect:/home";
        } else if ("user".equals(username) && "user@123".equals(password)) {
            return "redirect:/home";
        } else {
            request.setAttribute("error", "Invalid username or password");
            return "login";
        }
    }

    // ✅ FORM PAGE
    @GetMapping("/home")
    public String home() {
        return "index";
    }

    // ✅ SUBMIT FORM DATA
    @PostMapping("/submit")
    public String submit(@ModelAttribute StudentModel student) {
        repo.save(student);
        return "index";
    }

    // ✅ VIEW ALL STUDENTS
    @GetMapping("/students")
    public String viewStudents(HttpServletRequest request) {
        List<StudentModel> students = repo.findAll();
        request.setAttribute("students", students);
        return "view";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        repo.deleteById(id);
        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable Integer id, HttpServletRequest request) {
        StudentModel student = repo.findById(id).orElse(null);
        request.setAttribute("student", student);
        return "edit";
    }

    // ✅ Handle Update
    @PostMapping("/update")
    public String updateStudent(@ModelAttribute StudentModel student) {
        repo.save(student); // If ID is present, it will update
        return "redirect:/students";
    }
}


