/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class Book {
    
    private String author;
    private String title;
    private int pages;
    
    public Book(String newAuthor, String newTitle, int newPageCount) {
        this.author = newAuthor;
        this.title = newTitle;
        this.pages = newPageCount;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getName() {
        return this.title;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public String toString() {
        return this.author + ", " + this.title + ", " + this.pages + " pages";
    }
    
}
