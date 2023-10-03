package learning.designPattern.structural.bridge.videoStream;

import learning.designPattern.structural.bridge.processor.VideoProcessor;
import learning.designPattern.structural.bridge.videoStream.VideoStream;

public class PrimeVideoStream extends VideoStream {

    public PrimeVideoStream(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String videoFile) {
        videoProcessor.process(videoFile);
    }
}
