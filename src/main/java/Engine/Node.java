package Engine;

public class Node {
    private String id;
    private String yesId;
    private String noId;
    private String description;
    private String question;

    public Node(String id, String yesId, String noId, String description, String question) {
        this.id = id;
        this.yesId = yesId;
        this.noId = noId;
        this.description = description;
        this.question = question;
    }

    public Node(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYesId() {
        return yesId;
    }

    public void setYesId(String yesId) {
        this.yesId = yesId;
    }

    public String getNoId() {
        return noId;
    }

    public void setNoId(String noId) {
        this.noId = noId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id='" + id + '\'' +
                ", yesId='" + yesId + '\'' +
                ", noId='" + noId + '\'' +
                ", description='" + description + '\'' +
                ", question='" + question + '\'' +
                '}';
    }

}
