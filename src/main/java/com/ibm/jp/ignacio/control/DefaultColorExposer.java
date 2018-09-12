package com.ibm.jp.ignacio.control;

import com.ibm.jp.ignacio.entity.Color;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class DefaultColorExposer {

    @Produces
    @Named("diesel")
    public Color exposeDefaultColor() {
        // ... some logic here
        return Color.RED;
    }

    @Produces
    @Diesel
    public Color exposedDieselColor() {
        // ... some logic here
        return Color.BLACK;
    }
}
