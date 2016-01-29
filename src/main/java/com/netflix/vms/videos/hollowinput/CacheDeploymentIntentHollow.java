package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.HollowObject;
import com.netflix.hollow.HollowObjectSchema;

public class CacheDeploymentIntentHollow extends HollowObject {

    public CacheDeploymentIntentHollow(CacheDeploymentIntentDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public long _getBitrateKBPS() {
        return delegate().getBitrateKBPS(ordinal);
    }

    public Long _getBitrateKBPSBoxed() {
        return delegate().getBitrateKBPSBoxed(ordinal);
    }

    public long _getStreamProfileId() {
        return delegate().getStreamProfileId(ordinal);
    }

    public Long _getStreamProfileIdBoxed() {
        return delegate().getStreamProfileIdBoxed(ordinal);
    }

    public StringHollow _getIsoCountryCode() {
        int refOrdinal = delegate().getIsoCountryCodeOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getStringHollow(refOrdinal);
    }

    public VMSHollowVideoInputAPI api() {
        return typeApi().getAPI();
    }

    public CacheDeploymentIntentTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected CacheDeploymentIntentDelegate delegate() {
        return (CacheDeploymentIntentDelegate)delegate;
    }

}