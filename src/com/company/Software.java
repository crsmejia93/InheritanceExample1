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
        //this equals method is case-sensitive
        if(obj == null){
            return false;
        }

        if(obj instanceof Software){
            Software software = (Software)obj;
            if(software.getOs().length()!= this.getOs().length()
                    &&software.getPlatform().length()!= this.getPlatform().length()){
                return false;
            }

            for (int i=0; i<software.getOs().length();i++){
                if(software.getOs().charAt(i)!=this.getOs().charAt(i)){
                    return false;
                }
            }
        }
        //if this statement is reached then the objects are equal
        return  true;
    }

    @Override
    public String toString(){
        return "OS: "+getOs()+"\nProgrammer: "
                +getProgrammer()+"\nPlatform: "+getPlatform()+"\n"
                +"Price: "+getPrice()+"\n\n";
    }

}
