public class Work3 {
    public static void main(String[] args){
        System.out.println("Задача 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес бойцов " + totalWeight + " кг.");

        System.out.println("Задача 7");
        var differenceWeight = weightBoxer2 - weightBoxer1;
        System.out.println("Разница между весами бойцов (первый способ): " + differenceWeight + " кг.");

        System.out.println("Разница между весами бойцов (второй способ): " + weightBoxer2 % weightBoxer1 + " кг.");






}
}
