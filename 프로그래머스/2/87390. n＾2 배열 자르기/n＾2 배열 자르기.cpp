#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n, long long left, long long right) {
    vector<int> result;
    for (long long i = left; i <= right; i++) {
        int row = i / n;
        int col = i % n;
        result.push_back(max(row, col) + 1);
    }
    return result;
}