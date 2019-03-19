

public class Ball extends Bouncer {
    private int bounciness = 50;

    Ball (int bounciness, double height) {
        super(height);
        if(bounciness <100 && bounciness > 0){
        
        this.bounciness = bounciness;}
    }

    Ball (Ball toCopy) {
        super(toCopy);
        if(bounciness <100 && bounciness > 0)
        {this.bounciness = toCopy.bounciness;}
    }

    /**
     * @return the bounciness
     */
    public int getBounciness() {
        return bounciness;
    }

    /**
     * @param bounciness the bounciness to set
     */
    public void setBounciness(int bounciness) {
        if(bounciness <100 && bounciness > 0)
        {this.bounciness = bounciness;}
        else {this.bounciness = 50;}
    }

    public double heightAfterBounces(int numOfBounces) {
        double var = this.getHeight();
        
        double var2 = ((double)bounciness / 100.0);
        //System.out.println(var2);
        for(int i = 0; i < numOfBounces; i++){
            var = var * var2;
            
            
        }
        if (var < 1) {
            return 0;
        }
        return var;
    }

    public String toString() {
        String var = super.toString();
        return "[Ball] " + var + " Bounciness: " + getBounciness() + "%" ;
    }

}