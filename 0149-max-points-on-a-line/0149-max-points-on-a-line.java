class Solution {
    public int maxPoints(int[][] p) {
        if (p.length == 1) return 1;
        int max = 2;
        for (int i = 0; i < p.length - 1; i++) {
            int x1 = p[i][0], y1 = p[i][1];
            for (int j = i + 1; j < p.length; j++) {
                int x2 = p[j][0], y2 = p[j][1];
                int count = 2;
                if (x2 == x1) {
                //if x's are equal then I check x's for other points
                //since only points with equal x's will lie on the same line
                    for (int l = 0; l < p.length; l++) {
                        if (l == i || l == j) continue;
                        int x3 = p[l][0];
                        if (x3 == x1) count++;
                    }
                } else if (y2 == y1) {
                //if y's are equal then I check y's for other points
                //since only points with equal y's will lie on the same 
                    for (int l = 0; l < p.length; l++) {
                        if (l == i || l == j) continue;
                        int y3 = p[l][1];
                        if (y3 == y2) count++;
                    }
                } else {
                //here I use the formula above
                //I find k and b
                //then I round potential y to 4 digits after "."
                //since we are given numbers with limits of 10^4 
                    double k = (y2 * 1.0 - y1) / (x2 - x1);
                    double b = y1 - k * x1;
                    for (int l = 0; l < p.length; l++) {
                        if (l == i || l == j) continue;
                        int x3 = p[l][0], y3 = p[l][1];
                        double yPotential = k * x3 + b;
                        yPotential = Math.round(yPotential * 10000.0) / 10000.0;
                        if (y3 == yPotential) count++;
                    }
                }
                if (max < count) max = count;
            }
        }
        return max;
    }
}