package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.HollowObject;
import com.netflix.hollow.HollowObjectSchema;

public class TerritoryCountriesHollow extends HollowObject {

    public TerritoryCountriesHollow(TerritoryCountriesDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public TerritoryCountriesArrayOfCountryCodesHollow _getCountryCodes() {
        int refOrdinal = delegate().getCountryCodesOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getTerritoryCountriesArrayOfCountryCodesHollow(refOrdinal);
    }

    public StringHollow _getTerritoryCode() {
        int refOrdinal = delegate().getTerritoryCodeOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getStringHollow(refOrdinal);
    }

    public VMSHollowVideoInputAPI api() {
        return typeApi().getAPI();
    }

    public TerritoryCountriesTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected TerritoryCountriesDelegate delegate() {
        return (TerritoryCountriesDelegate)delegate;
    }

}