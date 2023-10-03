package learning.designPattern.structural.bridge.videoStream;

import learning.designPattern.structural.bridge.processor.VideoProcessor;
import learning.designPattern.structural.bridge.videoStream.VideoStream;

public class YouTubeVideoStream extends VideoStream {

    public YouTubeVideoStream(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String videoFile) {
        videoProcessor.process(videoFile);
    }
}
