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
        System.out.println("\nОбщий вес двух боксеров: " + TotalWeight + " кг.");
        float DifferenceBetweenWeights = WeightSecond - WeightFirst;
        System.out.println("Разница между весами двух боксеров: " + DifferenceBetweenWeights + " кг.");

        //Задание №3
        byte Bananas = 5, Icecream = 2, Eggs = 4;
        short Milk =  200;
        float TotalWeightInGramms = Bananas*80 + Icecream*100 + Eggs*70 + (Milk/100)*105;
        System.out.println("\nВес завтрака в граммах: " + TotalWeightInGramms + " гр.");
        float TotalWeightsInKilogramms = (TotalWeightInGramms / 1000);
        System.out.println("Вес завтрака в килограммах: " + TotalWeightsInKilogramms + " кг.");

        //Задание №4
        byte NeedToLoseWeightInKg = 7;
        short MinLoss = 250, MaxLoss = 500;
        int MinDays, MaxDays;
        int NeedYoLoseWeightInGr = NeedToLoseWeightInKg * 1000;
        MaxDays = NeedYoLoseWeightInGr / MinLoss;
        MinDays = NeedYoLoseWeightInGr / MaxLoss;
        System.out.println("\n" + MaxDays + " дней уйдет на похудение, если спортсмен будет терять по 250 гр. в день");
        System.out.println(MinDays + " дней уйдет на похудение, если спортсмен будет терять по 500 гр. в день");
        int AverageLoss = (MaxLoss + MinLoss) / 2;
        int AverageDays = NeedYoLoseWeightInGr / AverageLoss;
        System.out.println(AverageDays + " дней в среднем уйдет на похудение, если спортсмен будет терять от 250 до 500 гр. в день");

        //Задание №5
        int MashaSalary = 67760, DenisSalary = 83690, KristinaSalary = 76230;
        float Procent = 0.1f;
        int NewMashaSalary = (int)((MashaSalary*Procent) + MashaSalary);
        int NewDenisSalary = (int)((DenisSalary*Procent) + DenisSalary);
        int NewKristinaSalary = (int)((KristinaSalary*Procent) + KristinaSalary);
        byte Months = 12;
        int MashaSalaryGroth = (NewMashaSalary - MashaSalary) * Months;
        int DenisSalaryGroth = (NewDenisSalary - DenisSalary) * Months;
        int KristinaSalaryGroth = (NewKristinaSalary - KristinaSalary) * Months;
        System.out.println("\nМаша теперь получает " + NewMashaSalary + " рублей. Годовой доход вырос на " + MashaSalaryGroth + " рублей");
        System.out.println("Денис теперь получает " + NewDenisSalary + " рублей. Годовой доход вырос на " + DenisSalaryGroth + " рублей");
        System.out.println("Кристина теперь получает " + NewKristinaSalary + " рублей. Годовой доход вырос на " + KristinaSalaryGroth + " рублей");

    }
}