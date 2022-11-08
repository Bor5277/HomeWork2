public class Work3p1 {
    public static void main(String[] args) {
        System.out.println("Задача 8");
        var timeWork = 640;
        var timeWorker = 8;
        var amountWorkers = timeWork / timeWorker;
        System.out.println("Всего работников в компании " + amountWorkers + " человек.");

        var replenishmenWorkers = 94;
        var totalWorkers = amountWorkers + replenishmenWorkers;
        var totalTimeWork = timeWorker * totalWorkers;
        System.out.println("Если в компании работает " + totalWorkers + " человек, то всего " + totalTimeWork + " часов работы может быть поделено между сотрудниками.");


    }

}