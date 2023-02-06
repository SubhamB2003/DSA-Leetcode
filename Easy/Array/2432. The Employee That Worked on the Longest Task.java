class Solution {
    public int hardestWorker(int n, int[][] logs) {

        int value = logs[0][1];
        int id = logs[0][0];

        for (int i = 1; i < logs.length; i++) {
            if (logs[i][1] - logs[i - 1][1] >= value) {
                if (logs[i][1] - logs[i - 1][1] == value) {
                    if (logs[i][0] < id) {
                        id = logs[i][0];
                        value = logs[i][1] - logs[i - 1][1];
                    }
                } else {
                    id = logs[i][0];
                    value = logs[i][1] - logs[i - 1][1];
                }
            }
        }

        return id;

        // HashMap<Integer, Integer> map = new HashMap<>();
        // ArrayList<Integer> list = new ArrayList<>();

        // int curTime = 0;
        // for(int i = 0; i < logs.length; i++) {
        // map.put(logs[i][0], Math.max(map.getOrDefault(logs[i][0], 0),
        // Math.abs(logs[i][1] - curTime)));
        // curTime = logs[i][1];
        // }

        // int maxTime = Collections.max(map.values());
        // for(int i = 0; i < logs.length; i++) {
        // if(maxTime == map.get(logs[i][0])) {
        // list.add(logs[i][0]);
        // }
        // }

        // int maxTime_takerID = Collections.min(list);

        // return maxTime_takerID;
    }
}
