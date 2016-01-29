package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.HollowObject;
import com.netflix.hollow.HollowObjectSchema;

public class VideoDisplaySetHollow extends HollowObject {

    public VideoDisplaySetHollow(VideoDisplaySetDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public long _getTopNodeId() {
        return delegate().getTopNodeId(ordinal);
    }

    public Long _getTopNodeIdBoxed() {
        return delegate().getTopNodeIdBoxed(ordinal);
    }

    public VideoDisplaySetArrayOfSetsHollow _getSets() {
        int refOrdinal = delegate().getSetsOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getVideoDisplaySetArrayOfSetsHollow(refOrdinal);
    }

    public VMSHollowVideoInputAPI api() {
        return typeApi().getAPI();
    }

    public VideoDisplaySetTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected VideoDisplaySetDelegate delegate() {
        return (VideoDisplaySetDelegate)delegate;
    }

}