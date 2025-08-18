package oops;

public class car {
   public String brand;
   public String model;
   public int year;

   public car(String brand, String model, int year) {
      this.brand = brand;
      this.model = model;
      this.year = year;
   }
   public void displayCarInfo() {
      System.out.println("Car Brand: " + brand);
      System.out.println("Car Model: " + model);
      System.out.println("Car Year: " + year);
   }
}
class manualcar extends car {
   public manualcar(String brand, String model, int year) {
      super(brand, model, year);
   }
   public void displayCarInfo() {
      super.displayCarInfo();
   }
}
 class automaticcar extends car {
   public automaticcar(String brand, String model, int year) {
      super(brand, model, year);
   }
   public void displayCarInfo() {
      super.displayCarInfo();
   }
}
class main {
   public static void main(String[] args) {
      manualcar myManualCar = new manualcar("Toyota", "Corolla", 2020);
      myManualCar.displayCarInfo();

      automaticcar myAutomaticCar = new automaticcar("Honda", "Civic", 2021);
      myAutomaticCar.displayCarInfo();
   }
}
