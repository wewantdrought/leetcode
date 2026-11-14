#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int i = 0;
        int j = 1;
        while (nums[i] + nums[j] != target) {
            ++j;
            if (j == static_cast<int>(nums.size())) {
                ++i;
                j = i + 1;
            }
        }
        return {i, j};
    }
};

int main() {
    Solution solution;
    vector<int> nums = {3, 2, 4};
    int target = 6;
    vector<int> result = solution.twoSum(nums, target);
    cout << "Indices: " << result[0] << ", " << result[1] << endl;
    return 0;
}