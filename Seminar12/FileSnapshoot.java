public class FileSnapshoot {
    String content;
    int version;
    String dateTime;
    String mesaj;

    public FileSnapshoot(String content, int version, String dateTime, String mesaj) {
        this.content = content;
        this.version = version;
        this.dateTime = dateTime;
        this.mesaj = mesaj;
    }

    public String getContent() {
        return content;
    }
    
    public String getDetails() {
        return "FileSnapshoot{" +
                "content='" + content + '\'' +
                ", version='" + version + '\'' +
                ", mesaj='" + mesaj + '\'' +
                '}';
    }
}
