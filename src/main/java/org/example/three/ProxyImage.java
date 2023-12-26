package org.example.three;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProxyImage implements MyImage{
    private String filename;

    @Override
    public void display() {
        RealImage img = new RealImage(this.filename);
    }
}
