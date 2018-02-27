package com.company;

public enum Book {
    JAVA("Java How to program" ,  "2015"),
    PYTHON("How to program python" , "2014"),
    ANGULAR_JS("Learning angular JS" , "2011");
    RAILS("Learning Rails" , "2007");



    //instance variable

    private final String bookName
            private final String copyRightYear;

    Book(String bookName, String copyRightYear){
        this.bookName=bookName;
        this.copyRightYear=copyRightYear;
    }

    public String getBookName() {
        return bookName;
    }

    public String getCopyRightYear() {
        return copyRightYear;
    }
}
