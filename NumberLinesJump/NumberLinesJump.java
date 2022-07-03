class NumberLinesJump {
    public static void main(String[] args) {
        int[][] lKangaroos = {
            {0, 3, 4, 2},
            {0, 2, 5, 3},
            {21, 6, 47, 3}
        };
        for (int[] lKangaroo: lKangaroos) {
            System.out.println(kangaroo(lKangaroo[0], lKangaroo[1], lKangaroo[2], lKangaroo[3]));
        }
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 == v2) {
            return (x1 == x2) ? "YES" : "NO";
        }
        float timeToMeet = (((float)x2 - x1) / (v1 - v2));
        // return (timeToMeet > 0 && (timeToMeet == (int)timeToMeet)) ? "YES" : "NO";
        return (timeToMeet > 0 && timeToMeet % 1 == 0) ? "YES" : "NO";
    }
}