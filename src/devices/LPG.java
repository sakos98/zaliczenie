package devices;

public class LPG extends Car{
    public LPG(String producer, String model, String yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void refuel(double quantity)
    {
        if (this.resource+quantity > this.capacityOfResource)
        {
            System.out.println("You have reached max resource capacity");
            this.resource = 100.0;
        }
        else this.resource += quantity;
    }
}
