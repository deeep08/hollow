package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectDelegate;

public interface CharactersDelegate extends HollowObjectDelegate {

    public int getBOrdinal(int ordinal);

    public int getPrefixOrdinal(int ordinal);

    public long getId(int ordinal);

    public Long getIdBoxed(int ordinal);

    public int getCnOrdinal(int ordinal);

    public CharactersTypeAPI getTypeAPI();

}