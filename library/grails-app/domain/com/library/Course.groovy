package com.library

class Course {
String title
String code
String tutor
String department
String description

string toString(){
"$title, $code, $department"
}

    static constraints = {
title()
code()
tutor()
department()
description(500)
    }
}
