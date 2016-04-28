package com.djqdesign.collector_of_duty;

/**
 * Created by uw_dave on 4/7/16.
 */
public class Mfg {
    private String src;
    private String onClick;

    public static final Mfg[] manuf = {
            new Mfg ("@drawable/atari_logo", "onClickAtari"),
            new Mfg ("@drawable/commodore_logo","onClickCommodore"),

    };

    private Mfg(String src, String onClick){
        this.src = src;
        this.onClick = onClick;
    }

    public String getSrc(){

        return src;
    }

    public String getOnClick(){
        return onClick;
    }
}
