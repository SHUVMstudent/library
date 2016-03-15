package com.library

class Book {
String title
String author
String dateBorrowed
String returnDate
String student

string toString(){
"$title,$author,$dateBorrowed"
}

    static constraints = {
title()
author()
dateBorrowed()
returnDate()
student()
    }
}
