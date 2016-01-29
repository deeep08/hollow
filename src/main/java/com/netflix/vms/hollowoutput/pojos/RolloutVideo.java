package com.netflix.vms.hollowoutput.pojos;

import java.util.Map;

public class RolloutVideo {

    public Video video;
    public Map<Strings, RolloutSummary> summaryMap;

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof RolloutVideo))
            return false;

        RolloutVideo o = (RolloutVideo) other;
        if(o.video == null) {
            if(video != null) return false;
        } else if(!o.video.equals(video)) return false;
        if(o.summaryMap == null) {
            if(summaryMap != null) return false;
        } else if(!o.summaryMap.equals(summaryMap)) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}