package Prac;

class Car{
    String maker;
    String model;
    String color;
    String fuelType;
    Car(){} // 기본 생성자
    Car(String maker, String model, String color, String fuelType){
        this.maker = maker;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
    }
}

class Dealership {
    public static void main(String[] args) {
        // 자동차 객체 생성
        Car tesla = new Car(
                "Tesla", // <- maker
                "Model Y", // <- model
                "StealthGrey", // <- color
                "Electric" // <- fuelType
        );
        Car bmw = new Car(
                "BMW", // <- maker
                "M3", // <- model
                "Black", // <- color
                "Gasoline" // <- fuelType
        );
        Car benz = new Car(
                "Benz", // <- maker
                "E-Class", // <- model
                "Silver", // <- color
                "Diesel" // <- fuelType
        );
        System.out.println("저희 가게에는 다음과 같은 차종이 있습니다.");
        System.out.println("1. " + tesla.maker + " " + tesla.model + " (" + tesla.color + ", " + tesla.fuelType + ")");
        System.out.println("2. " + bmw.maker + " " + bmw.model + " (" + bmw.color + ", " + bmw.fuelType + ")");
        System.out.println("3. " + benz.maker + " " + benz.model + " (" + benz.color + ", " + benz.fuelType + ")");
    }
}
