package models;

import java.io.Serializable;

public class BoxTest implements Serializable {
    private int width;
    private int height;

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }
}
