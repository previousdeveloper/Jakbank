package lib.model;


public class BranchRecord {

    private boolean hasAtm;
    private boolean isOpenOnWeekend;
    private boolean isOpenAtNoon;
    private String latitude;
    private String longitude;
    private String phoneNumber;
    private boolean hasSafeBox;

    public boolean isHasAtm() {
        return hasAtm;
    }

    public void setHasAtm(boolean hasAtm) {
        this.hasAtm = hasAtm;
    }

    public boolean isOpenOnWeekend() {
        return isOpenOnWeekend;
    }

    public void setOpenOnWeekend(boolean openOnWeekend) {
        isOpenOnWeekend = openOnWeekend;
    }

    public boolean isOpenAtNoon() {
        return isOpenAtNoon;
    }

    public void setOpenAtNoon(boolean openAtNoon) {
        isOpenAtNoon = openAtNoon;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isHasSafeBox() {
        return hasSafeBox;
    }

    public void setHasSafeBox(boolean hasSafeBox) {
        this.hasSafeBox = hasSafeBox;
    }

}
