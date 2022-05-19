
public class File {
    String content;
    String id;
    String address;
    String name;

    public File(String content, String id, String address, String name) {
        this.content = content;
        this.id = id;
        this.address = address;
        this.name = name;
    }

    @Override
    public String toString() {
        return "File{" +
                "content='" + content + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public FileSnapshoot createSnapshoot(){
        FileSnapshoot fileSnapshoot = new FileSnapshoot("content", 1,  "19/05.2022", "mesaj");
        return  fileSnapshoot;
    }

    public void restoreToSomePoint(FileSnapshoot fileSnapshoot){

    }

}
