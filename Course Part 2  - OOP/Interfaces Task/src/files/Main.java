public class Main {

    public static void main(String[] args) {
        var video = new Video("birthday.mp4", "Jennifer's birthday", new User("john@domain.com"));
        var processor = new VideoProcessor();
        processor.process(video, new ShortAlgorithmVideoEncoder(), new SQLVideoDatabase(), new EmailServiceWithGmail());
    }   
}