package com.example.quizapp;

public class QuestionAnswer {
    public static String question[] = {
            "Who is the father of computer?",
            "Which of the following computer language is written in binary codes only?",
            "Which of the following is the brain of the computer?",
            "What is the full form of DBMS?",
            "In which of the following formats data is stored in the database management system?",
            "Under which of the following Android is licensed?",
            "APK stands for?",
            "Which of the following method is used to handle what happens after clicking a button?",
            "On which kernel is Android-based on?",
            "What is a WebKit?"


    };

    public static String  choices[][] ={
            {"James Gosling","Charles Babbage","Dennis Ritchie","Bjarne stroustrup"},
            {"pascal","Machine language","c","c#"},
            {"CPU","Memory","ALU", "Control unit"},
            {"Data of Binary Management System","Database Management System ","Database Management Service","Data Backup Management System"},
            {"Image", "Text","Table","Graph"},
            {"OSS", "Sourceforge", "Apache/MIT", "None of the above"},
            {"Android Phone Kit", "Android Page Kit", "Android Package Kit", "None of the above"},
            {"onClick", "onCreate", "onSelect", "None of the above"},
            {"Windows", "Mac", "Linux", "Redhat"},
            {"Database Server", "Browser Engine","Database Engine","None"}

    };

    public static String correctAnswers[] ={
            "Charles Babbage",
            "Machine language",
            "CPU",
            "Database Management System ",
            "Table",
            "Apache/MIT",
            "Android Package Kit",
            "onClick",
            "Linux",
            "Browser Engine"
    };

}
