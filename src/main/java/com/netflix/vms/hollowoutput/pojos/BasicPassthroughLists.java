package com.netflix.vms.hollowoutput.pojos;

import java.util.List;

public class BasicPassthroughLists {

    public List<SuperFloat> floatList;

    public BasicPassthroughLists() { }

    public BasicPassthroughLists(List<SuperFloat> value) {
        this.floatList = value;
    }

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof BasicPassthroughLists))
            return false;

        BasicPassthroughLists o = (BasicPassthroughLists) other;
        if(o.floatList == null) {
            if(floatList != null) return false;
        } else if(!o.floatList.equals(floatList)) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}