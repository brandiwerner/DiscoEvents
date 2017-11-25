package com.brandi.discoevents;

/**
 * Created by Owner on 11/25/2017.
 */

public class globals {

    private static globals instance;

    // Variable for the check boxes that will determine what events will show up in the TagEventsList view
    private boolean CS;
    private boolean CE;
    private boolean EE;
    private boolean DEPT;

    // To stop calling from other classes
    private globals(){
        CS=false;
        CE=false;
        EE=false;
        DEPT=false;
    }

    public boolean isCS() {
        return CS;
    }

    public void setCS(boolean CS) {
        this.CS = CS;
    }

    public boolean isCE() {
        return CE;
    }

    public void setCE(boolean CE) {
        this.CE = CE;
    }

    public boolean isEE() {
        return EE;
    }

    public void setEE(boolean EE) {
        this.EE = EE;
    }

    public boolean isDEPT() {
        return DEPT;
    }

    public void setDEPT(boolean DEPT) {
        this.DEPT = DEPT;
    }

    // Acts as a medium between the variables and other classes
    public static synchronized globals getInstance(){
        if(instance==null){
            instance=new globals();
        }
        return instance;
    }
}
