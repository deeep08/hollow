package com.netflix.vms.hollowoutput.pojos;

import java.util.Map;
import java.util.Arrays;

public class L10NResources {

    public char[] resourceIdStr;
    public Map<NFLocale, L10NStrings> localizedStrings;

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof L10NResources))
            return false;

        L10NResources o = (L10NResources) other;
        if(!Arrays.equals(o.resourceIdStr, resourceIdStr)) return false;
        if(o.localizedStrings == null) {
            if(localizedStrings != null) return false;
        } else if(!o.localizedStrings.equals(localizedStrings)) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}