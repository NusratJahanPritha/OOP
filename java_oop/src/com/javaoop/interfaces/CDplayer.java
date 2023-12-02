package com.javaoop.interfaces;

public class CDplayer implements Media{

    @Override
    public void start() {
        System.out.println("music on");
    }

    @Override
    public void stop() {
        System.out.println("music off");

    }
}
