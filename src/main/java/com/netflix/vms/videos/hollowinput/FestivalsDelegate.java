package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectDelegate;

public interface FestivalsDelegate extends HollowObjectDelegate {

    public int getCopyrightOrdinal(int ordinal);

    public long getFestivalId(int ordinal);

    public Long getFestivalIdBoxed(int ordinal);

    public int getFestivalNameOrdinal(int ordinal);

    public int getDescriptionOrdinal(int ordinal);

    public int getShortNameOrdinal(int ordinal);

    public int getSingularNameOrdinal(int ordinal);

    public FestivalsTypeAPI getTypeAPI();

}