package com.accenture.afls.model;

import java.io.Serializable;

public class ResponseStatus implements Serializable{

    public ResponseStatus(String status){
        this.status = status;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
