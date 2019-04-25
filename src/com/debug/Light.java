package com.debug;


import com.ylp.util.Print;

public class Light {
    public String lightColor;
    public Light(String lightColor){
        this.lightColor = lightColor;
        Print.print(this.lightColor);
    }
}
