public class StudentMarksCalculator {
    
    static int[][] generateRandomScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10;
            scores[i][1] = (int)(Math.random() * 90) + 10;
            scores[i][2] = (int)(Math.random() * 90) + 10;
        }
        return scores;
    }
    
    static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    
    static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\nStudent Scorecard");
        System.out.println("Stud#\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + 
                             "\t" + scores[i][2] + "\t" + (int)results[i][0] + 
                             "\t" + results[i][1] + "\t" + results[i][2] + "%");
        }
    }
    
    public static void main(String[] args) {
        int[][] scores = generateRandomScores(5);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}
