package com.gmail.safordog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Question extends HttpServlet {

    static final int question_1_prog = 0;
    static final int question_1_moto = 1;
    static final int question_2_yes = 2;
    static final int question_2_no = 3;

    static final String template = "<html>" +
    "<head><title>questionnaire</title></head>" +
        "<body><style>body{background-color:#3366CC;}h3{background-color:RGB(249, 201, 16);}p{background-color:#3370CC;color:white;}</style>" +
            "<h3>%s</h3></body></html>";

    final int[] result = new int[4];
    final List<String> voter = new ArrayList<>();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String qOne = req.getParameter("Java");
        final String qTwo = req.getParameter("Programmer");
        final String name = req.getParameter("name");
        final String surname = req.getParameter("surname");
        final String age = req.getParameter("age");

        final int idx1 = "programming language".equals(qOne) ? question_1_prog : question_1_moto;
        final int idx2 = "yes".equals(qTwo) ? question_2_yes : question_2_no;
        final String str = name + " " + surname + ", " + age;

        result[idx1]++;
        result[idx2]++;
        voter.add(str);

        String res = "<p>Question 1: programming language = " + result[question_1_prog] + ", motobike = " + result[question_1_moto] + "</p>";
        res += "<p>Question 2 : yes = " + result[question_2_yes] + ", no = " + result[question_2_no] + "</p>";
        res += "<p>Voters: " + voter.toString() + "</p>";

        resp.getWriter().println(String.format(template, res));
    }
}
