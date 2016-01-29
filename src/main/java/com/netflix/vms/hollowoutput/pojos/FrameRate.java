package com.netflix.vms.hollowoutput.pojos;


public class FrameRate {

    public float val;

    public FrameRate() { }

    public FrameRate(float value) {
        this.val = value;
    }

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof FrameRate))
            return false;

        FrameRate o = (FrameRate) other;
        if(o.val != val) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}