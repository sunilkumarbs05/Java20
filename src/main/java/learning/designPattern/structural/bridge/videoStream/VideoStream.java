package learning.designPattern.structural.bridge.videoStream;

import learning.designPattern.structural.bridge.processor.VideoProcessor;

public abstract class VideoStream {

    protected VideoProcessor videoProcessor;

    public VideoStream(VideoProcessor videoProcessor) {
        this.videoProcessor = videoProcessor;
    }

    public abstract  void play(String videoFile);
}
