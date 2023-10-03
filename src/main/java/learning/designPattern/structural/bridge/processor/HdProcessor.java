package learning.designPattern.structural.bridge.processor;

import learning.designPattern.structural.bridge.processor.VideoProcessor;

public class HdProcessor implements VideoProcessor {

    @Override
    public void process(String vedioFile) {
        System.out.println("HD format video is running");
    }
}
