

public abstract class Bouncer {
    private double height = 1;

    Bouncer(double height) {
        if (height > 0)
        {this.height = height;}
    }

    Bouncer(Bouncer toCopy) {
        if (toCopy.height > 0) {
        this.height = toCopy.height;}
    }

    /**
     * @return the height
     */
    protected double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    protected void setHeight(double height) {
        if (height > 0) {
        this.height = height;
        }
        if (height <= 0) {
            this.height = 1;
        }
    }

    public void bounce() {
        double var = heightAfterBounces(1);
        height = var;
    }

    public int numberOfBounces() {
        int count = 1;
        int i = 1;
        if(height == 0) {
            return 0;
        }
        while(heightAfterBounces(i) >= 1) {
            
            count ++;
            i ++; 
                   }
        return count;
    }

    public abstract double heightAfterBounces(int numOfBounces);

    public String toString() {
        return "Height: " + height + " Number of bounces: " + numberOfBounces();
    }        
}