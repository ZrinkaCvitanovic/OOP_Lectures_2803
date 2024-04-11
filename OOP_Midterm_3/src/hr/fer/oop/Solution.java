package hr.fer.oop;

public class Solution implements CarManager {

    private int noAETHER;
    private int noNIMBLE;
    private int noZENITH;

    public Solution(){}

    @Override
    public int processDataset(String input) {
         int noOfCars = 0; //set everything to zero at the beginning of every processing of a dataset
         this.noAETHER = 0;
         this.noNIMBLE = 0;
         this.noZENITH = 0;

        String[] lines = input.split("\r\n");

        for (int i = 0; i < lines.length; i++) {
            String line = lines [i];
            if (i == 0) {
                continue;
            }
            try {
                CarDescription cd = processLine(line);
                Brand brand = cd.getBrand();
                switch (brand) {
                    case AETHER:
                        noAETHER++;
                    case NIMBLE:
                        noNIMBLE++;
                    case ZENITH:
                        noZENITH++;
                }
                noOfCars++; //count the overall number of cars for every line, regardless of the brand
            } catch (ParseException pe) {

            }
        }
        return noOfCars;
    }

    @Override
    public CarDescription processLine(String line) throws ParseException { //try to delete the "throws ParseException" and see what happens
        String[] leftPart = line.split("-");
        if (leftPart.length != 2) { //in case there is no dash or there are more dashes in a line
            throw new ParseException("Row length not okay!");
        }
        String[] rightPart = leftPart[1].split(","); //in case there is no comma or there are more commas
        if (rightPart.length != 2) {
            throw new ParseException("Right part not okay!");
        }

        String brandText = leftPart[0]; //nothing can go wrong here because it is just a String
        Brand brand = null; //initialize it as null
        //you have to create a Brand variable because Brand values cannot be assigned to String
        if (brandText.equalsIgnoreCase("nimble")) { //we could also set it to upper/lower case at the beginning and  check equality that way
            brand = Brand.NIMBLE;
        } else if (brandText.equalsIgnoreCase("aether")) {
            brand = Brand.AETHER;
        } else if (brandText.equalsIgnoreCase("zenith"))  {
            brand = Brand.ZENITH;
        } else {
            throw new ParseException("Brand not okay");
        }

        String model = rightPart[0];
        try {
            int year = Integer.parseInt(rightPart[1]);
            if (year <= 1885) {
                throw new ParseException("Too old!");
            }
            return new CarDescription(brand, model, year);
        } catch (ParseException pe) {
            throw new ParseException("Error while parsing integers");
        }



    }

    @Override
    public double averageYear(Brand brand) throws UnsupportedOperationException {
        throw new UnsupportedOperationEception();
    }

    @Override
    public int brandCount(Brand brand) { //you could also process data again, but it would be very inefficient
        switch(brand) {
            case AETHER:
                return this.noAETHER;
            case NIMBLE:
                return this.noNIMBLE;
            case ZENITH:
                return this.noZENITH;
            default:
                return 0;
        }
    }
}
