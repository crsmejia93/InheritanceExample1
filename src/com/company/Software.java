package com.company;

public class Software extends Product{
    private String programmer;
    private String platform;//linux,mac,pc
    private String os;

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString(){
        return "OS: "+getOs()+"\nProgrammer: "
                +getProgrammer()+"\nPlatform: "+getPlatform()+"\n"
                +"Price: "+getPrice()+"\n\n";
    }

}
