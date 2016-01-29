package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectDelegate;

public interface CacheDeploymentIntentDelegate extends HollowObjectDelegate {

    public long getBitrateKBPS(int ordinal);

    public Long getBitrateKBPSBoxed(int ordinal);

    public long getStreamProfileId(int ordinal);

    public Long getStreamProfileIdBoxed(int ordinal);

    public int getIsoCountryCodeOrdinal(int ordinal);

    public CacheDeploymentIntentTypeAPI getTypeAPI();

}