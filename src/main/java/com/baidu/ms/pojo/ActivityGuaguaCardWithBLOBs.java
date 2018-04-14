package com.baidu.ms.pojo;

import java.io.Serializable;

public class ActivityGuaguaCardWithBLOBs extends ActivityGuaguaCard implements Serializable {
    private String firstPrize;

    private String secoundPrize;

    private String thirdPrize;

    private String normalPrize;

    private static final long serialVersionUID = 1L;

    public String getFirstPrize() {
        return firstPrize;
    }

    public void setFirstPrize(String firstPrize) {
        this.firstPrize = firstPrize == null ? null : firstPrize.trim();
    }

    public String getSecoundPrize() {
        return secoundPrize;
    }

    public void setSecoundPrize(String secoundPrize) {
        this.secoundPrize = secoundPrize == null ? null : secoundPrize.trim();
    }

    public String getThirdPrize() {
        return thirdPrize;
    }

    public void setThirdPrize(String thirdPrize) {
        this.thirdPrize = thirdPrize == null ? null : thirdPrize.trim();
    }

    public String getNormalPrize() {
        return normalPrize;
    }

    public void setNormalPrize(String normalPrize) {
        this.normalPrize = normalPrize == null ? null : normalPrize.trim();
    }
}