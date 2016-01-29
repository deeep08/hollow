package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.HollowObject;
import com.netflix.hollow.HollowObjectSchema;

public class EpisodesHollow extends HollowObject {

    public EpisodesHollow(EpisodesDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public EpisodesEpisodeNameHollow _getEpisodeName() {
        int refOrdinal = delegate().getEpisodeNameOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getEpisodesEpisodeNameHollow(refOrdinal);
    }

    public long _getMovieId() {
        return delegate().getMovieId(ordinal);
    }

    public Long _getMovieIdBoxed() {
        return delegate().getMovieIdBoxed(ordinal);
    }

    public long _getEpisodeId() {
        return delegate().getEpisodeId(ordinal);
    }

    public Long _getEpisodeIdBoxed() {
        return delegate().getEpisodeIdBoxed(ordinal);
    }

    public VMSHollowVideoInputAPI api() {
        return typeApi().getAPI();
    }

    public EpisodesTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected EpisodesDelegate delegate() {
        return (EpisodesDelegate)delegate;
    }

}