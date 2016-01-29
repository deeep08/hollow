package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectDelegate;

public interface MoviesShortDisplayNameDelegate extends HollowObjectDelegate {

    public int getTranslatedTextsOrdinal(int ordinal);

    public MoviesShortDisplayNameTypeAPI getTypeAPI();

}