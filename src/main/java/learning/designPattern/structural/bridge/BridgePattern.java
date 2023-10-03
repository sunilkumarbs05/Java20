package learning.designPattern.structural.bridge;

import learning.designPattern.structural.bridge.processor.FourKProcessor;
import learning.designPattern.structural.bridge.processor.HdProcessor;
import learning.designPattern.structural.bridge.videoStream.PrimeVideoStream;
import learning.designPattern.structural.bridge.videoStream.YouTubeVideoStream;

public class BridgePattern {
    public static void main(String[] args) {
        YouTubeVideoStream youTubeVideoStream = new YouTubeVideoStream(new HdProcessor());
        youTubeVideoStream.play("video file");

        youTubeVideoStream = new YouTubeVideoStream(new FourKProcessor());
        youTubeVideoStream.play("video file");

        PrimeVideoStream primeVideoStream = new PrimeVideoStream(new FourKProcessor());
        primeVideoStream.play("video file");
    }
}
