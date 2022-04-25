package com.itspazaz.rt4;

import rt4.*;

public class Playground extends GameShell {
    public static Playground instance;

    public static void main(String[] args) {
        instance = new Playground();
        instance.startApplication(32, "runescape");
        GameShell.frame.setLocation(40, 40);
    }

    @Override
    public void init() {
        instance = this;
        this.startApplet(32);
    }

    @Override
    protected void mainInit() {
        Keyboard.init();
        Keyboard.start(GameShell.canvas);
        Mouse.start(GameShell.canvas);
        SoftwareRaster.frameBuffer.makeTarget();
    }

    @Override
    protected void mainLoop() {
        Keyboard.loop();
        Mouse.loop();

        GameShell.frame.setTitle(Keyboard.pressedKeys[Keyboard.KEY_CTRL] ? "pressed" : "not pressed");
    }

    @Override
    protected void mainRedraw() {
        SoftwareRaster.clear();

        SoftwareRaster.drawRect(50, 50, 100, 100, 0xFF00FF);

        SoftwareRaster.frameBuffer.draw(GameShell.canvas.getGraphics());
    }

    @Override
    protected void mainQuit() {
        Keyboard.stop(GameShell.canvas);
        Mouse.stop(GameShell.canvas);
        Keyboard.quit();
        Mouse.quit();
    }

    @Override
    protected void reset() {
    }
}
