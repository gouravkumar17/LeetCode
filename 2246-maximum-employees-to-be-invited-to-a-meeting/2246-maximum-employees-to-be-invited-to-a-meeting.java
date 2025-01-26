class Solution {
    public static int maximumInvitations(int[] preferences) {
        int numPeople = preferences.length;
        int[] indegrees = new int[numPeople];
        int[] queue = new int[numPeople];
        int[] chainLength = new int[numPeople];
        for (int i = 0; i < numPeople; i++) {
            indegrees[preferences[i]]++;
        }
        int left = 0, right = 0;
        for (int i = 0; i < numPeople; i++) {
            if (indegrees[i] == 0) queue[right++] = i;
        }
        while (left < right) {
            int current = queue[left++];
            int nextPerson = preferences[current];
            chainLength[nextPerson] = Math.max(chainLength[nextPerson], chainLength[current] + 1);
            if (--indegrees[nextPerson] == 0) {
                queue[right++] = nextPerson;
            }
        }
        int smallCycle = 0;
        int largeCycle = 0;
        for (int i = 0; i < numPeople; i++) {
            if (indegrees[i] != 0) {
                indegrees[i] = 0;
                int cycleLength = 1;
                for (int j = preferences[i]; j != i; j = preferences[j]) {
                    cycleLength++;
                    indegrees[j] = 0;
                }
                if (cycleLength == 2) {
                    smallCycle += chainLength[i] + chainLength[preferences[i]] + 2;
                } else {
                    largeCycle = Math.max(largeCycle, cycleLength);
                }
            }
        }
        return Math.max(largeCycle, smallCycle);
    }
}