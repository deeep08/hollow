package com.netflix.vms.hollowoutput.pojos;


public class VRole {

    public int id;

    public VRole() { }

    public VRole(int value) {
        this.id = value;
    }

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof VRole))
            return false;

        VRole o = (VRole) other;
        if(o.id != id) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}