package com.ibm.jp.ignacio.control;

import com.ibm.jp.ignacio.entity.CarCreated;

import javax.enterprise.event.Observes;

public class CarCreationListener {
    public void onCarCreation(@Observes CarCreated carCreated) {
        System.out.print("Created " + carCreated.getIdentifier());
    }
}
