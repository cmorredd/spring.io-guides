package hello;

public class Greeting {
    private final Long id;
    private  final String content;

    public Greeting(){
        this.id=-1l;
        this.content="";
    }

    public Greeting(Long id, String content){
        this.id=id;
        this.content=content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }


}
