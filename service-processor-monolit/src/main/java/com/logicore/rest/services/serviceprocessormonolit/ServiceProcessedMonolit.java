package com.logicore.rest.services.serviceprocessormonolit;

public class ServiceProcessedMonolit {

    private int id;
    private boolean processed;


    public ServiceProcessedMonolit() {
    }

    public ServiceProcessedMonolit(int id, boolean processed) {
        this.id = id;
        this.processed = processed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
}
