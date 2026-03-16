// Problem: Job Sequencing with Deadlines

// You are given n jobs, where each job has:

// id → unique job identifier

// deadline → the latest time slot by which the job must be completed

// profit → profit earned if the job is completed before or at its deadline

// Each job takes exactly 1 unit of time to complete.

// Only one job can be executed at a time.

// Goal

// Schedule the jobs such that:

// Each job is completed before its deadline

// Total profit is maximized

// Return the maximum profit achievable by scheduling the jobs.

// Greedy Approach

// Sort jobs by profit in descending order

// Find the maximum deadline

// Create a slot array to track occupied time slots

// For each job:

// Try to place it in the latest available slot before its deadline

// Add profit when a job is successfully scheduled

// Time Complexity:

// O(n log n + n * maxDeadline)

import java.util.*;

class Job {
    int id;
    int deadline;
    int profit;

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencing {

    public static int maxProfit(Job[] jobs) {

        // Step 1: Sort jobs by profit descending
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Step 2: Find maximum deadline
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Step 3: Create slots
      //for 1 indexed array
        int[] slot = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);

        int totalProfit = 0;

        // Step 4: Schedule jobs
        for (Job job : jobs) {

            for (int d = job.deadline; d > 0; d--) {

                if (slot[d] == -1) {
                    slot[d] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        return totalProfit;
    }

    public static void main(String[] args) {

        Job[] jobs = {
            new Job(1,2,100),
            new Job(2,1,19),
            new Job(3,2,27),
            new Job(4,1,25),
            new Job(5,3,15)
        };

        int result = maxProfit(jobs);

        System.out.println("Maximum Profit: " + result);
    }
}
