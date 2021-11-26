package com.example.demo.contact;

import ru.rt.restream.reindexer.annotations.Reindex;

import java.util.List;

import static ru.rt.restream.reindexer.IndexType.HASH;

public class ClientContactViewReindexer {

    @Reindex(name = "contactId", isPrimaryKey = true, type = HASH)
    private Long contactId;

    @Reindex(name = "contactTypeId", type = HASH)
    private Long contactTypeId;

    @Reindex(name = "organizationUnid", type = HASH)
    private String organizationUnid;

    @Reindex(name = "contactFullName", type = HASH)
    private String contactFullName;

    @Reindex(name = "contactRoleName", type = HASH)
    private String contactRoleName;

    @Reindex(name = "workPhones", type = HASH)
    private List<CommunicationWayReindexer> workPhones;

    @Reindex(name = "homePhones", type = HASH)
    private List<CommunicationWayReindexer> homePhones;

    @Reindex(name = "mobilePhones", type = HASH)
    private List<CommunicationWayReindexer> mobilePhones;

    @Reindex(name = "emails", type = HASH)
    private List<CommunicationWayReindexer> emails;

    @Reindex(name = "faxes", type = HASH)
    private List<CommunicationWayReindexer> faxes;

    @Reindex(name = "gender", type = HASH)
    private String gender;

    @Reindex(name = "language", type = HASH)
    private String language;

    @Reindex(name = "escalation", type = HASH)
    private String escalation;

    @Reindex(name = "nps", type = HASH)
    private String nps;

    @Reindex(name = "csi", type = HASH)
    private String csi;

    @Reindex(name = "loyalty", type = HASH)
    private String loyalty;

    @Reindex(name = "country", type = HASH)
    private String country;

    @Reindex(name = "address", type = HASH)
    private String address;

    @Reindex(name = "city", type = HASH)
    private String city;

    @Reindex(name = "services", type = HASH)
    private List<String> services;

    @Reindex(name = "statusName", type = HASH)
    private String statusName;

    @Reindex(name = "mediaTypes", type = HASH)
    private List<String> mediaTypes;

    @Reindex(name = "medias")
    private List<SocialMediaReindexer> medias;

    @Reindex(name = "specializations")
    private List<SpecializationReindexer> specializations;

    @Reindex(name = "workingDayStart", type = HASH)
    private Integer workingDayStart;

    @Reindex(name = "workingDayEnd", type = HASH)
    private Integer workingDayEnd;

    @Reindex(name = "isOutdated")
    private Boolean isOutdated;

    public ClientContactViewReindexer() {
    }

    public ClientContactViewReindexer(Long contactId, Long contactTypeId, String organizationUnid, String contactFullName, String contactRoleName, List<CommunicationWayReindexer> workPhones, List<CommunicationWayReindexer> homePhones, List<CommunicationWayReindexer> mobilePhones, List<CommunicationWayReindexer> emails, List<CommunicationWayReindexer> faxes, String gender, String language, String escalation, String nps, String csi, String loyalty, String country, String address, String city, List<String> services, String statusName, List<String> mediaTypes, List<SocialMediaReindexer> medias, List<SpecializationReindexer> specializations, Integer workingDayStart, Integer workingDayEnd, Boolean isOutdated) {
        this.contactId = contactId;
        this.contactTypeId = contactTypeId;
        this.organizationUnid = organizationUnid;
        this.contactFullName = contactFullName;
        this.contactRoleName = contactRoleName;
        this.workPhones = workPhones;
        this.homePhones = homePhones;
        this.mobilePhones = mobilePhones;
        this.emails = emails;
        this.faxes = faxes;
        this.gender = gender;
        this.language = language;
        this.escalation = escalation;
        this.nps = nps;
        this.csi = csi;
        this.loyalty = loyalty;
        this.country = country;
        this.address = address;
        this.city = city;
        this.services = services;
        this.statusName = statusName;
        this.mediaTypes = mediaTypes;
        this.medias = medias;
        this.specializations = specializations;
        this.workingDayStart = workingDayStart;
        this.workingDayEnd = workingDayEnd;
        this.isOutdated = isOutdated;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Long getContactTypeId() {
        return contactTypeId;
    }

    public void setContactTypeId(Long contactTypeId) {
        this.contactTypeId = contactTypeId;
    }

    public String getOrganizationUnid() {
        return organizationUnid;
    }

    public void setOrganizationUnid(String organizationUnid) {
        this.organizationUnid = organizationUnid;
    }

    public String getContactFullName() {
        return contactFullName;
    }

    public void setContactFullName(String contactFullName) {
        this.contactFullName = contactFullName;
    }

    public String getContactRoleName() {
        return contactRoleName;
    }

    public void setContactRoleName(String contactRoleName) {
        this.contactRoleName = contactRoleName;
    }

    public List<CommunicationWayReindexer> getWorkPhones() {
        return workPhones;
    }

    public void setWorkPhones(List<CommunicationWayReindexer> workPhones) {
        this.workPhones = workPhones;
    }

    public List<CommunicationWayReindexer> getHomePhones() {
        return homePhones;
    }

    public void setHomePhones(List<CommunicationWayReindexer> homePhones) {
        this.homePhones = homePhones;
    }

    public List<CommunicationWayReindexer> getMobilePhones() {
        return mobilePhones;
    }

    public void setMobilePhones(List<CommunicationWayReindexer> mobilePhones) {
        this.mobilePhones = mobilePhones;
    }

    public List<CommunicationWayReindexer> getEmails() {
        return emails;
    }

    public void setEmails(List<CommunicationWayReindexer> emails) {
        this.emails = emails;
    }

    public List<CommunicationWayReindexer> getFaxes() {
        return faxes;
    }

    public void setFaxes(List<CommunicationWayReindexer> faxes) {
        this.faxes = faxes;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getEscalation() {
        return escalation;
    }

    public void setEscalation(String escalation) {
        this.escalation = escalation;
    }

    public String getNps() {
        return nps;
    }

    public void setNps(String nps) {
        this.nps = nps;
    }

    public String getCsi() {
        return csi;
    }

    public void setCsi(String csi) {
        this.csi = csi;
    }

    public String getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(String loyalty) {
        this.loyalty = loyalty;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public List<String> getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(List<String> mediaTypes) {
        this.mediaTypes = mediaTypes;
    }

    public List<SocialMediaReindexer> getMedias() {
        return medias;
    }

    public void setMedias(List<SocialMediaReindexer> medias) {
        this.medias = medias;
    }

    public List<SpecializationReindexer> getSpecializations() {
        return specializations;
    }

    public void setSpecializations(List<SpecializationReindexer> specializations) {
        this.specializations = specializations;
    }

    public Integer getWorkingDayStart() {
        return workingDayStart;
    }

    public void setWorkingDayStart(Integer workingDayStart) {
        this.workingDayStart = workingDayStart;
    }

    public Integer getWorkingDayEnd() {
        return workingDayEnd;
    }

    public void setWorkingDayEnd(Integer workingDayEnd) {
        this.workingDayEnd = workingDayEnd;
    }

    public Boolean getIsOutdated() {
        return isOutdated;
    }

    public void setIsOutdated(Boolean outdated) {
        isOutdated = outdated;
    }
}
