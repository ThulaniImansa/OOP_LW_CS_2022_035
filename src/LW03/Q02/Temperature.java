package LW03.Q02;

    public class Temperature {
        double celsius;

        public Temperature(){
            celsius=0.0;
        }
        public Temperature(double celsius){
            this.celsius=celsius;
        }
        public double toCelsius(){
            return celsius;
        }
        public double toFahrenheit() {
            return celsius * 9 / 5 + 32;
        }
        public void setCelsius(double celsius){
            this.celsius=celsius;
        }
        public void setFahrenheit(double fahrenheit) {
            this.celsius = (fahrenheit - 32) * 5 / 9;
        }
    }




