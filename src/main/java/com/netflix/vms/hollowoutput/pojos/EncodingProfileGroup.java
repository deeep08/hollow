package com.netflix.vms.hollowoutput.pojos;

import java.util.Set;
import java.util.Arrays;

public class EncodingProfileGroup {

    public char[] groupNameStr;
    public Set<Integer> encodingProfileIds;

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof EncodingProfileGroup))
            return false;

        EncodingProfileGroup o = (EncodingProfileGroup) other;
        if(!Arrays.equals(o.groupNameStr, groupNameStr)) return false;
        if(o.encodingProfileIds == null) {
            if(encodingProfileIds != null) return false;
        } else if(!o.encodingProfileIds.equals(encodingProfileIds)) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}