package com.netflix.vms.hollowoutput.pojos;

import java.util.Arrays;

public class HookType {

    public char[] value;

    public HookType() { }

    public HookType(char[] value) {
        this.value = value;
    }

    public HookType(String value) {
        this.value = value.toCharArray();
    }

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof HookType))
            return false;

        HookType o = (HookType) other;
        if(!Arrays.equals(o.value, value)) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}