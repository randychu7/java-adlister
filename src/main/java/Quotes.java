public class Quotes {
    private String content;
    private Author author;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Quotes( String content, Author author) {
        this.content = content;
        this.author = author;
    }
}
