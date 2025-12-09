package org.example;

public abstract class Services {
    protected String servicename;
    protected int duration;
    protected int timeleft;
    protected String location;


    //Constructor
    public Services(String servicename, int duration, String initialroom){
        this.servicename = servicename;
        this.duration = duration;
        this.location = initialroom;
        this.timeleft = 0;
    }

    //Getter
    public String getServicename() {return servicename;}
    public int getTimeleft() {return timeleft;}

    //Status for services
    public boolean isUsing(){
        return timeleft > 0;
    }
    //Display Status
    public String getStatus(){
        if (timeleft > 0)
            return ("The Serveice does not finish yet: " + timeleft + "hours left");
        else
            return ("The service is free");


    }
}
