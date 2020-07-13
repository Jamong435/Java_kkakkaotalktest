package com.kim9212.kkakkaotalktest;

import java.io.Serializable;

public class option implements Serializable {

    String address;

    public option(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
