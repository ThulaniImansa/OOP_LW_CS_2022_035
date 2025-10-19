package LW03.Q01;

public class Temperature {
    private double celsius;

    public Temperature(){
        celsius=0.0;
    }
    public Temperature(double celsius){
        this.celsius=celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    public double getFahrenheit(){
        return celsius * 9 / 5 + 32;

    }
    public void setFahrenheit(double fahrenheit){
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}
