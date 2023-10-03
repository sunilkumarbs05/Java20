package learning.designPattern.structural.bridge.processor;

import learning.designPattern.structural.bridge.processor.VideoProcessor;

public class FourKProcessor implements VideoProcessor {

    @Override
    public void process(String vedioFile) {
        System.out.println("4K video is running..");
    }
}
