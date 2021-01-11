package devices;
import com.company.Human;

public class Phone extends Device{
    public static String defaultAppServer = "google.com.pl";
    public static String defaultAppProtocol = "ALPHA";
    public static Double defaultAppVersion = 1.0;

    public String [] installedApps = new String[5];
    public void clearMobile()
    {
        for (int i=0; i<installedApps.length; i++)
        {
            installedApps[i] = "empty";
        }
    }

    public int installationDestination()
    {
        int i,j;
        for(i=0; i<installedApps.length; i++)
        {
            if(installedApps[i] == "empty")
            {
                break;
            }
        }
        return i;
    }

    public void uninstallApp(int destionation)
    {
        installedApps[destionation] = "empty";
    }


    public Phone(String producer, String model, String yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        clearMobile();
    }

    @Override
    public void turnOn() {
        System.out.println("Device is turned on");
    }

    public void installApp(String appName)
    {
        this.installedApps[installationDestination()] = appName;
    }

    public void installApp(String appName, Double version) {
        this.installedApps[installationDestination()] = appName;
        this.defaultAppVersion = version;
    }

    public void installApp(String appName, Double version, String appServer)
    {
        this.installedApps[installationDestination()] = appName;
        this.defaultAppVersion = version;
        this.defaultAppServer = appServer;
    }

    public void installApp(String appName1, String appName2, String appName3, String appName4, String appName5)
    {
        this.installedApps[installationDestination()] = appName1;
        this.installedApps[installationDestination()] = appName2;
        this.installedApps[installationDestination()] = appName3;
        this.installedApps[installationDestination()] = appName4;
        this.installedApps[installationDestination()] = appName5;
    }

    @Override
    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price)
    {
        if(seller.getPhone() != null)
        {
            if (buyer.getCash() >= price)
            {
                buyer.setCash(-price);
                seller.setCash(price);
                buyer.setPhone(this);
                seller.setPhone(null);
                System.out.println(buyer.toString() + " bought " + this.toString() + " from " + seller.toString() + " for " + price + "$");
            }
            else
            {
                System.out.println(buyer.toString() + " has not enough money");
            }
        }
        else
        {
            System.out.println(seller.toString() + " hasn't got any phone to sell");
        }
    }
}
