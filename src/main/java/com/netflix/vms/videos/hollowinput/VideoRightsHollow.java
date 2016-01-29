package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.HollowObject;
import com.netflix.hollow.HollowObjectSchema;

public class VideoRightsHollow extends HollowObject {

    public VideoRightsHollow(VideoRightsDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public StringHollow _getCountryCode() {
        int refOrdinal = delegate().getCountryCodeOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getStringHollow(refOrdinal);
    }

    public VideoRightsRightsHollow _getRights() {
        int refOrdinal = delegate().getRightsOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getVideoRightsRightsHollow(refOrdinal);
    }

    public VideoRightsFlagsHollow _getFlags() {
        int refOrdinal = delegate().getFlagsOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getVideoRightsFlagsHollow(refOrdinal);
    }

    public long _getMovieId() {
        return delegate().getMovieId(ordinal);
    }

    public Long _getMovieIdBoxed() {
        return delegate().getMovieIdBoxed(ordinal);
    }

    public VMSHollowVideoInputAPI api() {
        return typeApi().getAPI();
    }

    public VideoRightsTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected VideoRightsDelegate delegate() {
        return (VideoRightsDelegate)delegate;
    }

}