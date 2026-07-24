public class VideoProcessor {
    public void process(Video video, VideoEncoder encoder, VideoDatabase database, NotifcationSender emailService) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

