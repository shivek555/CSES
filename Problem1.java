class Solution {
public:
    int countDays(int days, vector<vector<int>>& meetings) {
        vector<bool> hasMeeting(days + 1, false);
        
        for (const auto& meeting : meetings) {
            for (int i = meeting[0]; i <= meeting[1]; ++i) {
                hasMeeting[i] = true;
            }
        }
        
        return count_if(hasMeeting.begin() + 1, hasMeeting.end(), [](bool b){ return !b; });
    }
};