import java.util.Locale;

public class Specifications {
    private String brandName;
    private String model;
    private int frontCameraInMP;
    private int rearCameraInMP;
    private String processor;
    private float screenSizeInInches;
    private int batteryInMAH;
    private boolean fingerPrintSensor;
    private int internalStorageInGB;

    public void setBrandName(String brandName){
        String validBrandName = brandName.toLowerCase();
        if (validBrandName.equals("samsung") || validBrandName.equals("apple")){
            this.brandName=brandName;
        }
        else{
            this.brandName="unknown";
        }
    }
    public String getBrandName(){
//        return this.brandName;
        return this.brandName.toLowerCase();
    }
}
