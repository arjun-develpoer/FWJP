class PercentageCalculator {
    public static void main(String[] args) {
        int totalMarks = 500;  // Maximum marks
        int obtainedMarks = 430;  // Marks obtained
        double percentage;

        // Calculate percentage
        percentage = (obtainedMarks * 100.0) / totalMarks;

        // Print the result
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}