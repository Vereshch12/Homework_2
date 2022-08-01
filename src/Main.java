public class Main {

    public static void main(String[] args) {

        //Задание №1
        byte b = 120;
        short s = -2000;
        int i = 1234567;
        long l = -98765434232l;
        float f = 12.21f;
        double d = 65432.5432;
        char c = 'C';
        boolean bool = s < i;
        System.out.println(b + "\n" +  s + "\n" + i + "\n" + l + "\n" + f + "\n" + d + "\n" + c + "\n" + bool);

        //Задание №2
        float WeightFirst = 78.2f;
        float WeightSecond = 82.7f;
        float TotalWeight = WeightFirst + WeightSecond;
        System.out.println("\nОбщий вес двух боксеров: " + TotalWeight);
        float DifferenceBetweenWeights = WeightSecond - WeightFirst;
        System.out.println("Разница между весами двух боксеров: " + DifferenceBetweenWeights);
    }
}