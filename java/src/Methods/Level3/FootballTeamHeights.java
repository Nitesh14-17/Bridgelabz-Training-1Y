public class FootballTeamHeights {
    
    static int sumHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }
    
    static int meanHeight(int[] heights) {
        return sumHeights(heights) / heights.length;
    }
    
    static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }
    
    static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] heights = new int[11];
        
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int)(Math.random() * 101);
        }
        
        int shortest = shortestHeight(heights);
        int tallest = tallestHeight(heights);
        int mean = meanHeight(heights);
        
        System.out.println("Shortest Height: " + shortest + " cms");
        System.out.println("Tallest Height: " + tallest + " cms");
        System.out.println("Mean Height: " + mean + " cms");
    }
}
