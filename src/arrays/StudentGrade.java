package arrays;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students do you have? ");
        int students = input.nextInt();

        System.out.print("How many subjects do they offer? ");
        int subjects = input.nextInt();

        int[][] scores = new int[students][subjects];
        int[] total = new int[students];
        double[] average = new double[students];
        int[] position = new int[students];

        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                int score;

                do {
                    System.out.println("Entering score for student " + (i + 1));
                    System.out.print("Enter score for subject " + (j + 1) + ": ");
                    score = input.nextInt();

                    if (score < 0 || score > 100) {
                        System.out.println("Invalid score, score must be between 0 and 100");
                    }
                } while (score < 0 || score > 100);

                scores[i][j] = score;
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Saved successfully");
            }
        }

        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < subjects; j++) {
                sum += scores[i][j];
            }
            total[i] = sum;
            average[i] = (double) sum / subjects;
        }

        for (int i = 0; i < students; i++) {
            int pos = 1;
            for (int j = 0; j < students; j++) {
                if (total[j] > total[i]) {
                    pos++;
                }
            }
            position[i] = pos;
        }

        System.out.println();
        System.out.println("==========================================================");
        System.out.print("STUDENT\t\t");

        for (int i = 0; i < subjects; i++) {
            System.out.print("SUB" + (i + 1) + "\t");
        }

        System.out.println("TOT\tAVE\tPOS");
        System.out.println("==========================================================");

        for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + "\t");

            for (int j = 0; j < subjects; j++) {
                System.out.print(scores[i][j] + "\t");
            }

            System.out.printf("%d\t%.2f\t%d%n", total[i], average[i], position[i]);
        }

        System.out.println("==========================================================");
        System.out.println();

        System.out.println("SUBJECT SUMMARY");
        for (int j = 0; j < subjects; j++) {
            int highest = scores[0][j];
            int lowest = scores[0][j];
            int highestStudent = 0;
            int lowestStudent = 0;
            int subjectTotal = 0;
            int passCount = 0;
            int failCount = 0;

            for (int i = 0; i < students; i++) {
                subjectTotal += scores[i][j];

                if (scores[i][j] > highest) {
                    highest = scores[i][j];
                    highestStudent = i;
                }

                if (scores[i][j] < lowest) {
                    lowest = scores[i][j];
                    lowestStudent = i;
                }

                if (scores[i][j] >= 50) {
                    passCount++;
                } else {
                    failCount++;
                }
            }

            double subjectAverage = (double) subjectTotal / students;

            System.out.println("Subject " + (j + 1));
            System.out.println("Highest scoring student is: Student " + (highestStudent + 1) + " scoring " + highest);
            System.out.println("Lowest scoring student is: Student " + (lowestStudent + 1) + " scoring " + lowest);
            System.out.println("Total score is: " + subjectTotal);
            System.out.printf("Average score is: %.2f%n", subjectAverage);
            System.out.println("Number of passes: " + passCount);
            System.out.println("Number of fails: " + failCount);
            System.out.println();
        }

        int hardestSubject = 0;
        int easiestSubject = 0;
        int highestFail = -1;
        int highestPass = -1;

        for (int j = 0; j < subjects; j++) {
            int passCount = 0;
            int failCount = 0;

            for (int i = 0; i < students; i++) {
                if (scores[i][j] >= 50) {
                    passCount++;
                } else {
                    failCount++;
                }
            }

            if (failCount > highestFail) {
                highestFail = failCount;
                hardestSubject = j;
            }

            if (passCount > highestPass) {
                highestPass = passCount;
                easiestSubject = j;
            }
        }

        int overallHighest = scores[0][0];
        int overallLowest = scores[0][0];
        int bestStudent = 0;
        int bestSubject = 0;
        int worstStudent = 0;
        int worstSubject = 0;

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                if (scores[i][j] > overallHighest) {
                    overallHighest = scores[i][j];
                    bestStudent = i;
                    bestSubject = j;
                }

                if (scores[i][j] < overallLowest) {
                    overallLowest = scores[i][j];
                    worstStudent = i;
                    worstSubject = j;
                }
            }
        }

        int bestGraduatingStudent = 0;
        int worstGraduatingStudent = 0;

        for (int i = 1; i < students; i++) {
            if (total[i] > total[bestGraduatingStudent]) {
                bestGraduatingStudent = i;
            }

            if (total[i] < total[worstGraduatingStudent]) {
                worstGraduatingStudent = i;
            }
        }

        int classTotal = 0;
        for (int i = 0; i < students; i++) {
            classTotal += total[i];
        }

        double classAverage = (double) classTotal / students;

        System.out.println("The hardest subject is Subject " + (hardestSubject + 1) + " with " + highestFail + " failures");
        System.out.println("The easiest subject is Subject " + (easiestSubject + 1) + " with " + highestPass + " passes");
        System.out.println("The overall highest score is scored by Student " + (bestStudent + 1) +
                " in Subject " + (bestSubject + 1) + " scoring " + overallHighest);
        System.out.println("The overall lowest score is scored by Student " + (worstStudent + 1) +
                " in Subject " + (worstSubject + 1) + " scoring " + overallLowest);
        System.out.println("==========================================================");
        System.out.println("CLASS SUMMARY");
        System.out.println("==========================================================");
        System.out.println("Best Graduating Student is: Student " + (bestGraduatingStudent + 1) +
                " scoring " + total[bestGraduatingStudent]);
        System.out.println("Worst Graduating Student is: Student " + (worstGraduatingStudent + 1) +
                " scoring " + total[worstGraduatingStudent]);
        System.out.println("==========================================================");
        System.out.println("Class total score is: " + classTotal);
        System.out.printf("Class average score is: %.2f%n", classAverage);
        System.out.println("==========================================================");
    }
}
