package com.netflix.vms.videos.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.HollowObjectSchema;
import com.netflix.hollow.read.customapi.HollowTypeAPI;
import com.netflix.hollow.objects.delegate.HollowCachedDelegate;

public class CertificationsDelegateCachedImpl extends HollowObjectAbstractDelegate implements HollowCachedDelegate, CertificationsDelegate {

    private final int nameOrdinal;
    private final int descriptionOrdinal;
    private final Long certificationTypeId;
   private CertificationsTypeAPI typeAPI;

    public CertificationsDelegateCachedImpl(CertificationsTypeAPI typeAPI, int ordinal) {
        this.nameOrdinal = typeAPI.getNameOrdinal(ordinal);
        this.descriptionOrdinal = typeAPI.getDescriptionOrdinal(ordinal);
        this.certificationTypeId = typeAPI.getCertificationTypeIdBoxed(ordinal);
        this.typeAPI = typeAPI;
    }

    public int getNameOrdinal(int ordinal) {
        return nameOrdinal;
    }

    public int getDescriptionOrdinal(int ordinal) {
        return descriptionOrdinal;
    }

    public long getCertificationTypeId(int ordinal) {
        return certificationTypeId.longValue();
    }

    public Long getCertificationTypeIdBoxed(int ordinal) {
        return certificationTypeId;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

    public CertificationsTypeAPI getTypeAPI() {
        return typeAPI;
    }

    public void updateTypeAPI(HollowTypeAPI typeAPI) {
        this.typeAPI = (CertificationsTypeAPI) typeAPI;
    }

}