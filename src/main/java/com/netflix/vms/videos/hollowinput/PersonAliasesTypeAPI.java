package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.read.customapi.HollowObjectTypeAPI;
import com.netflix.hollow.read.dataaccess.HollowObjectTypeDataAccess;

public class PersonAliasesTypeAPI extends HollowObjectTypeAPI {

    private final PersonAliasesDelegateLookupImpl delegateLookupImpl;

    PersonAliasesTypeAPI(VMSHollowVideoInputAPI api, HollowObjectTypeDataAccess typeDataAccess) {
        super(api, typeDataAccess, new String[] {
            "aliasId",
            "name"
        });
        this.delegateLookupImpl = new PersonAliasesDelegateLookupImpl(this);
    }

    public long getAliasId(int ordinal) {
        if(fieldIndex[0] == -1)
            return missingDataHandler().handleLong("PersonAliases", ordinal, "aliasId");
        return getTypeDataAccess().readLong(ordinal, fieldIndex[0]);
    }

    public Long getAliasIdBoxed(int ordinal) {
        long l;
        if(fieldIndex[0] == -1) {
            l = missingDataHandler().handleLong("PersonAliases", ordinal, "aliasId");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[0]);
            l = getTypeDataAccess().readLong(ordinal, fieldIndex[0]);
        }
        if(l == Long.MIN_VALUE)
            return null;
        return Long.valueOf(l);
    }



    public int getNameOrdinal(int ordinal) {
        if(fieldIndex[1] == -1)
            return missingDataHandler().handleReferencedOrdinal("PersonAliases", ordinal, "name");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[1]);
    }

    public PersonAliasesNameTypeAPI getNameTypeAPI() {
        return getAPI().getPersonAliasesNameTypeAPI();
    }

    public PersonAliasesDelegateLookupImpl getDelegateLookupImpl() {
        return delegateLookupImpl;
    }

    @Override
    public VMSHollowVideoInputAPI getAPI() {
        return (VMSHollowVideoInputAPI) api;
    }

}