package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectDelegate;

public interface FestivalsCopyrightDelegate extends HollowObjectDelegate {

    public int getTranslatedTextsOrdinal(int ordinal);

    public FestivalsCopyrightTypeAPI getTypeAPI();

}