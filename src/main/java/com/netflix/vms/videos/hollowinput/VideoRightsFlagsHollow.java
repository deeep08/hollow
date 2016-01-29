package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.HollowObject;
import com.netflix.hollow.HollowObjectSchema;

public class VideoRightsFlagsHollow extends HollowObject {

    public VideoRightsFlagsHollow(VideoRightsFlagsDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public boolean _getSearchOnly() {
        return delegate().getSearchOnly(ordinal);
    }

    public Boolean _getSearchOnlyBoxed() {
        return delegate().getSearchOnlyBoxed(ordinal);
    }

    public boolean _getLocalText() {
        return delegate().getLocalText(ordinal);
    }

    public Boolean _getLocalTextBoxed() {
        return delegate().getLocalTextBoxed(ordinal);
    }

    public boolean _getLanguageOverride() {
        return delegate().getLanguageOverride(ordinal);
    }

    public Boolean _getLanguageOverrideBoxed() {
        return delegate().getLanguageOverrideBoxed(ordinal);
    }

    public boolean _getLocalAudio() {
        return delegate().getLocalAudio(ordinal);
    }

    public Boolean _getLocalAudioBoxed() {
        return delegate().getLocalAudioBoxed(ordinal);
    }

    public VideoRightsFlagsMapOfFirstDisplayDatesHollow _getFirstDisplayDates() {
        int refOrdinal = delegate().getFirstDisplayDatesOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getVideoRightsFlagsMapOfFirstDisplayDatesHollow(refOrdinal);
    }

    public boolean _getGoLive() {
        return delegate().getGoLive(ordinal);
    }

    public Boolean _getGoLiveBoxed() {
        return delegate().getGoLiveBoxed(ordinal);
    }

    public boolean _getAutoPlay() {
        return delegate().getAutoPlay(ordinal);
    }

    public Boolean _getAutoPlayBoxed() {
        return delegate().getAutoPlayBoxed(ordinal);
    }

    public long _getFirstDisplayDate() {
        return delegate().getFirstDisplayDate(ordinal);
    }

    public Long _getFirstDisplayDateBoxed() {
        return delegate().getFirstDisplayDateBoxed(ordinal);
    }

    public VMSHollowVideoInputAPI api() {
        return typeApi().getAPI();
    }

    public VideoRightsFlagsTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected VideoRightsFlagsDelegate delegate() {
        return (VideoRightsFlagsDelegate)delegate;
    }

}