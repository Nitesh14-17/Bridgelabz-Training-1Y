public class EmployeeBonusCalculator {
    
    static int[][] generateSalaryAndYears(int employees) {
        int[][] data = new int[employees][2];
        for (int i = 0; i < employees; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 11);
        }
        return data;
    }
    
    static int[][] calculateBonus(int[][] data) {
        int[][] result = new int[data.length][3];
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            int bonus;
            
            if (years > 5) {
                bonus = (int)(salary * 0.05);
            } else {
                bonus = (int)(salary * 0.02);
            }
            
            result[i][0] = salary;
            result[i][1] = salary + bonus;
            result[i][2] = bonus;
        }
        return result;
    }
    
    static void displayResults(int[][] original, int[][] calculated) {
        System.out.println("\nEmployee Bonus Report");
        System.out.println("Emp#\tOld Salary\tBonus\tNew Salary");
        
        long oldSalarySum = 0;
        long newSalarySum = 0;
        long bonusSum = 0;
        
        for (int i = 0; i < calculated.length; i++) {
            System.out.println((i + 1) + "\t" + calculated[i][0] + "\t" + 
                             calculated[i][2] + "\t" + calculated[i][1]);
            oldSalarySum += calculated[i][0];
            newSalarySum += calculated[i][1];
            bonusSum += calculated[i][2];
        }
        
        System.out.println("\nTotal Old Salary: " + oldSalarySum);
        System.out.println("Total New Salary: " + newSalarySum);
        System.out.println("Total Bonus: " + bonusSum);
    }
    
    public static void main(String[] args) {
        int[][] salaryYears = generateSalaryAndYears(10);
        int[][] bonusData = calculateBonus(salaryYears);
        displayResults(salaryYears, bonusData);
    }
}
