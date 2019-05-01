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
    public boolean equals(Object obj){
        boolean isTrue=false;
        if(obj == this ){
            return true;
        }

        if(!(obj instanceof Software)){
            return false;
        }
        //type cast obj to Book
        Software software = (Software) obj;
        if((software.getOs().equalsIgnoreCase(this.getOs()))||
                (software.getProgrammer().equalsIgnoreCase(this.getProgrammer()))||
                (software.getPlatform().equalsIgnoreCase(this.getPlatform()))){
            isTrue = true;
        }
        return isTrue;
    }

    @Override
    public String toString(){
        return "OS: "+getOs()+"\nProgrammer: "
                +getProgrammer()+"\nPlatform: "+getPlatform()+"\n"
                +"Price: "+getPrice()+"\n\n";
    }

}
