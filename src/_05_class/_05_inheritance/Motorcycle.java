package _05_class._05_inheritance;

public class Motorcycle extends Vehicle{
    public Motorcycle (String brand, String model, int year) {
        setBrand(brand);
        setModel(model);
        setYear(year);
    }

    private String licenseType;

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public void characteristic () {
        System.out.println("울림통을 합니다.");
    }
}
