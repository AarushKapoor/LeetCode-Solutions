#include <stdlib.h>

int max(int a, int b) {

    return a > b ? a : b;

}

int minTimeToVisitAllPoints(int** points, int pointsSize, int* pointsColSize) {

    int time = 0;

    for (int i = 0; i < pointsSize - 1; i++) {
        time += max(abs(points[i+1][0] - points[i][0]), abs(points[i+1][1] - points[i][1]));
    }

    return time;
    
}
