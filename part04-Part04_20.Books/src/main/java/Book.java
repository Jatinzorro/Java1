/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class Book {
    private String title;
    private int pages;
    private String year;
    public Book(String title,int pages,String year){
        this.title=title;
        this.pages=pages;
        this.year=year;
    }
    public String getTitle(){
        return this.title;
    }
    public int getPages(){
        return this.pages;
    }
    public String getYear(){
        return this.year;
    }
    public String toString(){
        return this.title+", "+this.pages+" pages, "+this.year;
    }
    
}
