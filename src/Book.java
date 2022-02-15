//SINGLE RESPONSIBILITY
//a class should only have one responsibility
//A class with one responsibility will have far fewer test cases.
//Less functionality in a single class will have fewer dependencies.
//Smaller, well-organized classes are easier to search than monolithic ones.

public class Book {
    private String name;
    private String author;
    private String text;

    //constructor, getters and setters

    // methods that directly relate to the book properties
    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }

    /*
    //this code violates the single responsibility principle we outlined earlier.
    void printTextToConsole(){
        // our code for formatting and printing the text
    }
    */
}
